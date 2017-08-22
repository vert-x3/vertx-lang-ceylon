native("jvm")
module io.vertx.tests "${project.version}" {
  native("jvm") import java.base "7";
  shared import io.vertx.ceylon.testmodel "${project.version}";
  import ceylon.test "1.3.3";
  import io.vertx.ceylon.core "${project.version}";
}