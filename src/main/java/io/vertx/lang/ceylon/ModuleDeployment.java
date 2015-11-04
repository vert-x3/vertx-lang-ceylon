package io.vertx.lang.ceylon;

import com.redhat.ceylon.compiler.java.runtime.tools.JavaRunner;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
class ModuleDeployment {

  final String name;
  final String version;
  final JavaRunner runner;
  int instances;

  public ModuleDeployment(String name, String version, JavaRunner runner) {
    this.name = name;
    this.version = version;
    this.runner = runner;
    this.instances = 0;
  }
}
