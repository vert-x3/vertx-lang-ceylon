package io.vertx.lang.ceylon;

import com.redhat.ceylon.compiler.java.launcher.Main.ExitState;
import com.redhat.ceylon.compiler.java.launcher.Main.ExitState.CeylonState;
import com.redhat.ceylon.compiler.java.runtime.tools.CompilationListener;
import com.redhat.ceylon.compiler.java.runtime.tools.Compiler;
import com.redhat.ceylon.compiler.java.runtime.tools.CompilerOptions;
import com.redhat.ceylon.compiler.java.runtime.tools.JavaCompilerOptions;
import com.redhat.ceylon.compiler.java.runtime.tools.impl.NullWriter;
import com.redhat.ceylon.compiler.java.tools.CeyloncTaskImpl;
import com.redhat.ceylon.compiler.java.tools.CeyloncTool;
import com.sun.tools.javac.file.JavacFileManager;

import javax.tools.JavaFileObject;
import java.io.File;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/**
 * fork of : https://github.com/ceylon/ceylon.language/blob/master/runtime/com/redhat/ceylon/compiler/java/runtime/tools/impl/JavaCompilerImpl.java
 *
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class JavaCompilerImpl implements Compiler {

  @SuppressWarnings("deprecation")
  public boolean compile(CompilerOptions options,
                         CompilationListener listener) {
    CeyloncTool compiler = new CeyloncTool();
    com.redhat.ceylon.compiler.java.runtime.tools.impl.JavaCompilerImpl.CompilationListenerAdapter diagnosticListener = new com.redhat.ceylon.compiler.java.runtime.tools.impl.JavaCompilerImpl.CompilationListenerAdapter(listener);
    Writer writer = null;
    // FIXME: allow the user to capture stdout
    if(!options.isVerbose()){
      // make the tool shut the hell up
      writer = new NullWriter();
    }

    JavacFileManager fileManager = compiler.getStandardFileManager(writer, diagnosticListener, null, null);


    Iterable<? extends JavaFileObject> compilationUnits = fileManager.getJavaFileObjectsFromFiles(options.getFiles());

    CeyloncTaskImpl compilerTask = compiler.getTask(null, fileManager, diagnosticListener,
        translateOptions(options), options.getModules(), compilationUnits);
    compilerTask.setTaskListener(diagnosticListener);
    ExitState state = compilerTask.call2();
    // print any helpful info if required
    if(options.isVerbose() && state.abortingException != null)
      state.abortingException.printStackTrace();
    return state.ceylonState == CeylonState.OK;
  }

  private List<String> translateOptions(CompilerOptions options) {
    List<String> translatedOptions = new ArrayList<String>();
    // FIXME: translate every option
    if(options.isVerbose())
      translatedOptions.add("-verbose");
    for(File sourcePath : options.getSourcePath()){
      translatedOptions.add("-src");
      translatedOptions.add(sourcePath.getPath());
    }
    for(String rep : options.getUserRepositories()){
      translatedOptions.add("-rep");
      translatedOptions.add(rep);
    }
    if(options.getOutputRepository() != null){
      translatedOptions.add("-out");
      translatedOptions.add(options.getOutputRepository());
    }
    if(options.getSystemRepository() != null){
      translatedOptions.add("-sysrep");
      translatedOptions.add(options.getSystemRepository());
    }
    if(options.getOverrides() != null){
      translatedOptions.add("-overrides");
      translatedOptions.add(options.getOverrides());
    }
    if(options instanceof JavaCompilerOptions){
      JavaCompilerOptions javaOptions = (JavaCompilerOptions) options;
      if(javaOptions.isFlatClasspath())
        translatedOptions.add("-flat-classpath");
      if(javaOptions.isAutoExportMavenDependencies())
        translatedOptions.add("-auto-export-maven-dependencies");
    }

    // Specific options
    ExtendedCompilerOptions extOptions = (ExtendedCompilerOptions) options;
    if (extOptions.getTarget() != null) {
      translatedOptions.add("-target");
      translatedOptions.add(extOptions.getTarget());
    }

    return translatedOptions;
  }

}