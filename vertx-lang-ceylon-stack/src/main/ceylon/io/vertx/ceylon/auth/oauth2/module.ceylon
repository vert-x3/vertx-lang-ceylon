native("jvm")
module io.vertx.ceylon.auth.oauth2 "${project.version}" {
  native("jvm") import java.base "7";
  shared import ceylon.json "1.3.3";
  shared import io.vertx.ceylon.auth.common "${project.version}";
  shared import "io.vertx.vertx-auth-oauth2" "${project.version}";
}
