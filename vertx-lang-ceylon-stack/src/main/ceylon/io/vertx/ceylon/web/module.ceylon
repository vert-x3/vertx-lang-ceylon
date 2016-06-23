native("jvm")
module io.vertx.ceylon.web "3.3.0" {
  native("jvm") import java.base "7";
  shared import ceylon.json "1.2.3";
  shared import io.vertx.ceylon.core "3.3.0";
  shared import "io.vertx.vertx-web" "3.3.0";
  shared optional import io.vertx.ceylon.auth.jwt "3.3.0";
  shared optional import io.vertx.ceylon.auth.oauth2 "3.3.0";
  shared optional import "io.vertx.vertx-web-templ-handlebars" "3.3.0";
  shared optional import "io.vertx.vertx-web-templ-thymeleaf" "3.3.0";
  shared optional import "io.vertx.vertx-web-templ-jade" "3.3.0";
  shared optional import "io.vertx.vertx-web-templ-mvel" "3.3.0";
  shared optional import "io.vertx.vertx-web-templ-pebble" "3.3.0";
  shared optional import "io.vertx.vertx-web-templ-freemarker" "3.3.0";
}
