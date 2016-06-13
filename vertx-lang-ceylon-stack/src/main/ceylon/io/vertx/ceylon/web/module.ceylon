native("jvm")
module io.vertx.ceylon.web "3.3.0.CR2" {
  native("jvm") import java.base "7";
  shared import ceylon.json "1.2.2";
  shared import io.vertx.ceylon.core "3.3.0.CR2";
  shared import "io.vertx.vertx-web" "3.3.0.CR2";
  shared optional import io.vertx.ceylon.auth.jwt "3.3.0.CR2";
  shared optional import io.vertx.ceylon.auth.oauth2 "3.3.0.CR2";
  shared optional import "io.vertx.vertx-web-templ-handlebars" "3.3.0.CR2";
  shared optional import "io.vertx.vertx-web-templ-thymeleaf" "3.3.0.CR2";
  shared optional import "io.vertx.vertx-web-templ-jade" "3.3.0.CR2";
  shared optional import "io.vertx.vertx-web-templ-mvel" "3.3.0.CR2";
}
