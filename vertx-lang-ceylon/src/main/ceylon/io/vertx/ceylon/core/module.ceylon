native("jvm")
module io.vertx.ceylon.core "${project.version}" {
  native("jvm") import java.base "7";
  shared import ceylon.json "1.3.0";
  shared import io.vertx.lang.ceylon "${project.version}";
  shared import maven:"io.vertx:vertx-core" "${project.version}"; // io.vertx.ceylon.core
}
