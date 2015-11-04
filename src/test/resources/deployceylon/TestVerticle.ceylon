import io.vertx.ceylon.core { Verticle, Future }

shared class TestVerticle() extends Verticle() {

  shared actual void startAsync(Future<Anything> fut) {
    void handleResult(Throwable|String result) {
      if (is String result) {
        fut.complete();
      } else {
        result.printStackTrace();
        fut.fail("could not deploy");
      }
    }
    vertx.deployVerticle("ceylon:simpleverticle", handleResult);
  }

  shared actual void stop() {
  }
}