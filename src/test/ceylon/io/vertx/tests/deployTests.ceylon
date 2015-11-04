import io.vertx.ceylon.core { Verticle, Vertx }
import java.util.concurrent { CountDownLatch }
import ceylon.test { test }

shared test void testDeployVerticleInstance() {
  value vertx = Vertx.vertx();
  try {
    value latch = CountDownLatch(2);
    object verticle extends Verticle() {
      shared actual void start() {
        latch.countDown();
      }
    }
    verticle.deploy(vertx, null, (String|Throwable id) => latch.countDown());
    latch.await();
  } finally {
    vertx.close();
  }
}
