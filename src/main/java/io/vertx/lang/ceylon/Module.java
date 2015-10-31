package io.vertx.lang.ceylon;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
class Module {

  final String name;
  final String version;

  public Module(String name, String version) {
    this.name = name;
    this.version = version;
  }
}
