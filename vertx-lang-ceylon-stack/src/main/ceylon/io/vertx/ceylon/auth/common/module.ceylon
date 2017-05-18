native("jvm")
module io.vertx.ceylon.auth.common "${project.version}" {
  native("jvm") import java.base "7";
  shared import ceylon.json "1.3.2";
  shared import io.vertx.ceylon.core "${project.version}";
  shared import "io.vertx.vertx-auth-common" "${project.version}";
}
