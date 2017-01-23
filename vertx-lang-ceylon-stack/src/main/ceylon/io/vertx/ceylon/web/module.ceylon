native("jvm")
module io.vertx.ceylon.web "${project.version}" {
  native("jvm") import java.base "7";
  shared import ceylon.json "1.3.0";
  shared import io.vertx.ceylon.core "${project.version}";
  shared import "io.vertx.vertx-web" "${project.version}";
  shared optional import io.vertx.ceylon.auth.jwt "${project.version}";
  shared optional import io.vertx.ceylon.auth.oauth2 "${project.version}";
  shared optional import io.vertx.ceylon.auth.htdigest "${project.version}";
  shared optional import "io.vertx.vertx-web-templ-handlebars" "${project.version}";
  shared optional import "io.vertx.vertx-web-templ-thymeleaf" "${project.version}";
  shared optional import "io.vertx.vertx-web-templ-jade" "${project.version}";
  shared optional import "io.vertx.vertx-web-templ-mvel" "${project.version}";
  shared optional import "io.vertx.vertx-web-templ-pebble" "${project.version}";
  shared optional import "io.vertx.vertx-web-templ-freemarker" "${project.version}";
}
