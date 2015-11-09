import io.vertx.ceylon.core { ... }
import io.vertx.ceylon.core.http { ... }

shared class ServerVerticle() extends Verticle() {

  shared actual void start() {
    value server = vertx.createHttpServer();
    server.requestHandler((HttpServerRequest req) => req.response().end("hello world"));
    server.listen(8080, (HttpServer|Throwable ret) {
      if (is HttpServer ret) {
        print("server started");
      } else {
        ret.printStackTrace();
      }
    });
  }

}