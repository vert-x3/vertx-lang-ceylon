native("jvm")
module io.vertx.ceylon.jdbc "${project.version}" {
  native("jvm") import java.base "7";
  shared import ceylon.json "1.3.0";
  shared import io.vertx.ceylon.sql "${project.version}";
  shared import maven:"io.vertx:vertx-jdbc-client" "${project.version}";
}
