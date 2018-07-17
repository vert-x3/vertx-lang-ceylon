native("jvm")
module io.vertx.ceylon.core "${project.version}" {
  native("jvm") import java.base "7";
  shared import ceylon.json "1.3.3";
  shared import ceylon.time "1.3.3";
  shared import io.vertx.lang.ceylon "${project.version}";
  shared import "io.vertx.vertx-core" "${project.version}"; // io.vertx.ceylon.core
}
