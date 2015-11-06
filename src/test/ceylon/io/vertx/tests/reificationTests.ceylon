import io.vertx.ceylon.core { Vertx }
import io.vertx.ceylon.core.eventbus { Message }
import java.util.concurrent { CountDownLatch }
import ceylon.test { test }

shared test void testMessageReply() {
  value vertx = Vertx.vertx();
  try {
    /* fails
    value latch = CountDownLatch(1);
    vertx.eventBus().consumer("the_address", (Message<String> msg) => msg.reply("the_reply"));
    vertx.eventBus().send("the_address", "the_message", void (Message<String>|Throwable reply) {
      switch (reply)
      case (is Message<String>) {
        latch.countDown();
      } else {

      }
    });
    latch.await();
    */
  } finally {
    vertx.close();
  }
}
