import io.vertx.ceylon.core { ... }
import io.vertx.ceylon.core.http { ... }

shared void run() {

  value vertx = Vertx.vertx();
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
