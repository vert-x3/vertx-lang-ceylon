native("jvm")
module io.vertx.ceylon.auth.jdbc "${project.version}" {
  native("jvm") import java.base "7";
  shared import ceylon.json "1.3.2";
  shared import io.vertx.ceylon.auth.common "${project.version}";
  shared import io.vertx.ceylon.jdbc "${project.version}";
  shared import "io.vertx.vertx-auth-jdbc" "${project.version}";
}
