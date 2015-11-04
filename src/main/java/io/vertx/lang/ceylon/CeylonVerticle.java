package io.vertx.lang.ceylon;

import com.redhat.ceylon.compiler.java.runtime.tools.*;
import com.redhat.ceylon.compiler.java.runtime.tools.Compiler;
import io.vertx.core.AbstractVerticle;
import io.vertx.core.Context;
import io.vertx.core.Future;
import io.vertx.core.Vertx;
import io.vertx.lang.ceylon.compiler.ExtendedCompilerOptions;
import io.vertx.lang.ceylon.compiler.JavaCompilerImpl;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class CeylonVerticle extends AbstractVerticle {

  private final ClassLoader classLoader;
  private final String name;
  private JavaRunner runner;
  private Object verticle;

  public CeylonVerticle(ClassLoader classLoader, String name) {
    this.classLoader = classLoader;
    this.name = name;
  }

  @Override
  public void start(Future<Void> startFuture) throws Exception {

    if (name.endsWith(".ceylon")) {
      startFuture.fail("todo " + name);
    } else {

      // Try a module to compile
      URL moduleURL = classLoader.getResource(name + "/module.ceylon");
      if (moduleURL == null) {
        throw new Exception("Not found " + name);
      }
      ArrayList<File> sources = new ArrayList<>();
      File moduleSource = new File(moduleURL.toURI());
      File moduleRoot = moduleSource.getParentFile();
      if (!moduleRoot.isDirectory()) {
        throw new Exception(moduleURL + " must point to a module directory");
      }
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
      String pkg = matcher.group(1).trim();
      File sourcePath = moduleRoot;
      for (int i = pkg.split("\\.").length;i > 0;i--) {
        sourcePath = sourcePath.getParentFile();
      }
      scan(sources, moduleRoot);
      List<Module> compiledModules = compileModules(sourcePath, sources);
      Module compiledModule = compiledModules.get(0);

      // Run it now
      final JavaRunnerOptions runnerOptions = new JavaRunnerOptions();

      // For now hardcode this repository
      runnerOptions.addUserRepository("target/modules");

      //
      runnerOptions.addExtraModule(compiledModule.name, compiledModule.version);

      // compiledModule.name, compiledModule.version
      runner = (JavaRunner) CeylonToolProvider.getRunner(Backend.Java, runnerOptions, "io.vertx.ceylon.core", "1.0.0");
      ClassLoader loader = runner.getModuleClassLoader();
      Method introspector = loader.loadClass("io.vertx.ceylon.core.impl.resolveVerticles_").getDeclaredMethod("resolveVerticles", String.class, String.class);
      Map<String, Callable<?>> moduleFactories = (Map<String, Callable<?>>) introspector.invoke(null, compiledModule.name, null);

      // Wrap objects
      Class<?> vertxClass = loader.loadClass("io.vertx.ceylon.core.Vertx");
      Object wrappedVertx = vertxClass.getConstructor(Vertx.class).newInstance(vertx);
      Class<?> contextClass = loader.loadClass("io.vertx.ceylon.core.Context");
      Object wrapperContext = contextClass.getConstructor(Context.class).newInstance(context);
      Class<?> futureClass = loader.loadClass("io.vertx.ceylon.core.Future");
      Object wrappedStartFuture = futureClass.getConstructor(Future.class).newInstance(startFuture);

      // Create, init, start
      Callable<?> factory = moduleFactories.values().iterator().next();
      verticle = factory.call();
      Method init = verticle.getClass().getMethod("init", vertxClass, contextClass);
      init.invoke(verticle, wrappedVertx, wrapperContext);
      Method startAsync = verticle.getClass().getMethod("startAsync", futureClass);
      startAsync.invoke(verticle, wrappedStartFuture);
    }
  }

  @Override
  public void stop(Future<Void> stopFuture) throws Exception {

    // Wrap objects
    Class<?> futureClass = runner.getModuleClassLoader().loadClass("io.vertx.ceylon.core.Future");
    Object wrappedStopFuture = futureClass.getConstructor(Future.class).newInstance(stopFuture);

    // Stop, cleanup
    Method stopAsync = verticle.getClass().getMethod("stopAsync", futureClass);
    stopAsync.invoke(verticle, wrappedStopFuture);
    runner.cleanup();
  }

  private List<Module> compileModules(File sourcePath, List<File> sources) throws Exception {
    ExtendedCompilerOptions options = new ExtendedCompilerOptions();
    options.setSourcePath(Collections.singletonList(sourcePath));

    // For now hardcode this repository
    options.addUserRepository("target/modules");

//    options.setOutputRepository(targetModulesDirectory.getAbsolutePath());
    options.setTarget("8");
    options.setVerbose(false);
    options.setFiles(sources);

    List<Module> modules = new ArrayList<>();
    Compiler compiler = new JavaCompilerImpl();
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
        modules.add(new Module(module, version));
      }
    });
    if (!compiled) {
      throw new Exception("Could not compile");
    }
    return modules;
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
}
