package io.vertx.lang.ceylon;

import com.redhat.ceylon.common.ModuleSpec;
import com.redhat.ceylon.compiler.java.runtime.tools.*;
import io.vertx.core.Verticle;
import io.vertx.core.spi.VerticleFactory;

import java.io.File;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class CeylonVerticleFactory implements VerticleFactory {

  public static final String CEYLON_VERBOSE_PROP = "ceylon.verbose";
  public static final String CEYLON_REP_PROP = "ceylon.rep";

  static void applySystemConfig(Options options) {
    String verbose = System.getProperty(CEYLON_VERBOSE_PROP);
    if (verbose != null) {
      options.setVerboseCategory(verbose);
    }
    String rep = System.getProperty(CEYLON_REP_PROP);
    if (rep != null) {
      List<String> userRepositories = Arrays.asList(rep.split("\\s*,\\s*"));
      options.setUserRepositories(userRepositories);
    }
  }

  private final Map<String, Module> modules = new HashMap<>();

  @Override
  public String prefix() {
    return "ceylon";
  }

  public CeylonVerticleFactory() {
  }

  @Override
  public boolean blockingCreate() {
    return true;
  }

  @Override
  public Verticle createVerticle(String verticleName, ClassLoader classLoader) throws Exception {
    verticleName = VerticleFactory.removePrefix(verticleName);
    if (verticleName.endsWith(".ceylon")) {
      throw new Exception("todo " + verticleName);
    } else {

      JavaRunnerOptions runnerOptions = new JavaRunnerOptions();
      runnerOptions.setDelegateClassLoader(classLoader);

      // Try a module to compile
      String moduleName;
      Module module;
      File moduleRoot = null;
      URL moduleURL = classLoader.getResource(verticleName + "/module.ceylon");
      if (moduleURL != null) {
        File moduleSource = new File(moduleURL.toURI());
        moduleRoot = moduleSource.getParentFile();
        if (!moduleRoot.isDirectory()) {
          throw new Exception(moduleURL + " must point to a module directory");
        }
      } else {
        File moduleFile = new File(new File(verticleName), "module.ceylon");
        if (moduleFile.exists() && moduleFile.isFile()) {
          moduleRoot = moduleFile.getParentFile();
        }
      }
      if (moduleRoot != null) {
        ArrayList<File> sources = new ArrayList<>();
        File pkgRoot = new File(moduleRoot, "package.ceylon");
        if (!pkgRoot.exists() || !pkgRoot.isFile()) {
          throw new Exception("No package.ceylon");
        }
        String pkgContent = new String(Files.readAllBytes(pkgRoot.toPath()), StandardCharsets.UTF_8);
        Pattern p = Pattern.compile("shared package ([^;]*);"); // Will do for now
        Matcher matcher = p.matcher(pkgContent);
        if (!matcher.find()) {
          throw new Exception("Invalid");
        }
        moduleName = matcher.group(1).trim();
        synchronized (modules) {
          module = modules.get(moduleName);
          if (module == null) {
            File sourcePath = moduleRoot;
            for (int i = moduleName.split("\\.").length;i > 0;i--) {
              sourcePath = sourcePath.getParentFile();
            }
            scan(sources, moduleRoot);
            List<ModuleInfo> compiledModules = compileModules(sourcePath, sources);
            ModuleInfo compiledModule = compiledModules.get(0);
            applySystemConfig(runnerOptions);
            runnerOptions.addExtraModule(compiledModule.name, compiledModule.version);
            JavaRunner runner = (JavaRunner) CeylonToolProvider.getRunner(Backend.Java, runnerOptions, "io.vertx.ceylon.core", "3.3.0");
            modules.put(moduleName, module = new Module(compiledModule.name, compiledModule.version, runner));
          } else {
            module.instances++;
          }
        }
      } else {
        ModuleSpec moduleSpec = ModuleSpec.parse(verticleName);
        synchronized (modules) {
          moduleName = moduleSpec.getName();
          module = modules.get(moduleName);
          if (module == null) {
            String moduleVersion = moduleSpec.getVersion();
            runnerOptions.addExtraModule(moduleName, moduleVersion);
            applySystemConfig(runnerOptions);
            JavaRunner runner = (JavaRunner) CeylonToolProvider.getRunner(Backend.Java, runnerOptions, "io.vertx.ceylon.core", "3.3.0");
            modules.put(moduleName, module = new Module(moduleName, moduleVersion, runner));
          } else {
            module.instances++;
          }
        }
      }
      return new CeylonVerticle(module);
    }
  }

  private void scan(List<File> sources, File file) {
    if (file.exists()) {
      if (file.isDirectory()) {
        File[] children = file.listFiles();
        if (children != null) {
          for (File child : children) {
            scan(sources, child);
          }
        }
      } else if (file.isFile() && (file.getName().endsWith(".ceylon") || file.getName().endsWith(".java"))) {
        sources.add(file);
      }
    }
  }

  private List<ModuleInfo> compileModules(File sourcePath, List<File> sources) throws Exception {
    ExtendedCompilerOptions options = new ExtendedCompilerOptions();
    options.setSourcePath(Collections.singletonList(sourcePath));

    options.setTarget("8");
    options.setFiles(sources);

    applySystemConfig(options);

    final List<ModuleInfo> modules = new ArrayList<>();
    com.redhat.ceylon.compiler.java.runtime.tools.Compiler compiler = new JavaCompilerImpl();
    boolean compiled = compiler.compile(options, new CompilationListener() {

      public void error(File file, long line, long column, String message) {
        String msg;
        if (file != null) {
          msg = "Compilation error at (" + line + "," + column + ") in " +
              file.getAbsolutePath() + ":" + message;
        } else {
          msg = "Compilation error:" + message;
        }
        System.out.println(msg);
      }

      public void warning(File file, long line, long column, String message) {
        String msg;
        if (file != null) {
          msg = "Compilation warning at (" + line + "," + column + ") in " +
              file.getAbsolutePath() + ":" + message;
        } else {
          msg = "Compilation warning:" + message;
        }
        System.out.println(msg);
      }

      public void moduleCompiled(String module, String version) {
        modules.add(new ModuleInfo(module, version));
      }
    });
    if (!compiled) {
      throw new Exception("Could not compile");
    }
    return modules;
  }

  class Module {

    final String name;
    final String version;
    final JavaRunner runner;
    int instances;

    public Module(String name, String version, JavaRunner runner) {
      this.name = name;
      this.version = version;
      this.runner = runner;
      this.instances = 0;
    }

    void removeInstance() {
      boolean cleanup;
      synchronized (modules) {
        cleanup = --instances == 0;
        if (cleanup) {
          modules.remove(name);
        }
      }
      if (cleanup) {
        runner.cleanup();
      }
    }
  }

  private static class ModuleInfo {
    final String name;
    final String version;
    private ModuleInfo(String name, String version) {
      this.name = name;
      this.version = version;
    }
  }
}
