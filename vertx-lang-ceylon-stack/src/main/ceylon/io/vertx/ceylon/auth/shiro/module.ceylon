native("jvm")
module io.vertx.ceylon.auth.shiro "${project.version}" {
  native("jvm") import java.base "7";
  shared import ceylon.json "1.3.0";
  shared import io.vertx.ceylon.auth.common "${project.version}";
  shared import maven:"io.vertx:vertx-auth-shiro" "${project.version}";
}
