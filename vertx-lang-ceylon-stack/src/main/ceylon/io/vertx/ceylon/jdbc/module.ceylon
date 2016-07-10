native("jvm")
module io.vertx.ceylon.jdbc "${project.version}" {
  native("jvm") import java.base "7";
  shared import ceylon.json "1.2.2";
  shared import io.vertx.ceylon.sql "${project.version}";
  shared import "io.vertx.vertx-jdbc-client" "${project.version}";
}
