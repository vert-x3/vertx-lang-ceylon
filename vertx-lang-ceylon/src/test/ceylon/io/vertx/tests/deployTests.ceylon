import io.vertx.ceylon.core { Verticle, Vertx, vertx }
import java.util.concurrent { CountDownLatch }
import ceylon.test { test }

shared test void testDeployVerticleInstance() {
  Vertx instance = vertx.vertx();
  try {
    value latch = CountDownLatch(2);
    object verticle extends Verticle() {
      shared actual void start() {
        value v = instance;
        value c = context;
        latch.countDown();
      }
    }
    verticle.deploy(instance, null, (String|Throwable id) => latch.countDown());
    latch.await();
  } finally {
    instance.close();
  }
}
