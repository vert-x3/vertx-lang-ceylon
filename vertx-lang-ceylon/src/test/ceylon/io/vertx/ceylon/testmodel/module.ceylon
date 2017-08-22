native("jvm")
module io.vertx.ceylon.testmodel "${project.version}" {
  native("jvm") import java.base "7";
  shared import ceylon.json "1.3.3";
  shared import io.vertx.lang.ceylon "${project.version}";
  shared import "io.vertx.vertx-codegen-tck" "${project.version}"; // io.vertx.ceylon.codegen.testmodel
}
