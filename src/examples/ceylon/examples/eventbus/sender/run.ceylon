import io.vertx.ceylon.core { ... }

shared void run() {

  value vertx = Vertx.clusteredVertx(VertxOptions(), (Vertx|Throwable v) {
    if (is Vertx v) {
      print("Started");
      variable Integer count = 0;
      v.setPeriodic(1000, (Integer id) {
        v.eventBus().send("the_address", "``count++``");
      });
    } else {
      v.printStackTrace();
    }
  });

}
