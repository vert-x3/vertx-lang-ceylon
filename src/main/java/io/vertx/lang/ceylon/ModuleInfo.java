package io.vertx.lang.ceylon;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
class ModuleInfo {

  final String name;
  final String version;

  public ModuleInfo(String name, String version) {
    this.name = name;
    this.version = version;
  }
}
