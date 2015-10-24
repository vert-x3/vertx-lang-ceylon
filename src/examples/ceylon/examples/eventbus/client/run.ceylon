import io.vertx.ceylon.core { ... }

shared void run() {

  value vertx = Vertx.clusteredVertx(VertxOptions(), (Vertx|Throwable v) {
    if (is Vertx v) {
      print("Started");
    } else {
      v.printStackTrace();
    }
  });

}
