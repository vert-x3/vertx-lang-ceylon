import io.vertx.ceylon.core { Verticle, Future }

shared class TestVerticle() extends Verticle() {

  shared actual void startAsync(Future<Anything> fut) {
    assert(exists cfg = config);
    assert(is String verticleName = cfg["verticleName"]);
    void handleResult(Throwable|String result) {
      if (is String result) {
        fut.complete();
      } else {
        result.printStackTrace();
        fut.fail("could not deploy ``verticleName``");
      }
    }
    vertx.deployVerticle(verticleName, handleResult);
  }

  shared actual void stop() {
  }
}