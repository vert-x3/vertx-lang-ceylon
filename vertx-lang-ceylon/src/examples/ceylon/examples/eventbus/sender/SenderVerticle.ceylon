import io.vertx.ceylon.core { ... }

shared class SenderVerticle() extends Verticle() {

  shared actual void start() {
    variable Integer count = 0;
    vertx.setPeriodic(1000, (Integer id) {
      vertx.eventBus().send("the_address", "``count++``");
    });
  }

}