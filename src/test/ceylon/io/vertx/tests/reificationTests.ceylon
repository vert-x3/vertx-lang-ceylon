import io.vertx.ceylon.core { Vertx }
import io.vertx.ceylon.core.eventbus { Message }
import java.util.concurrent { CountDownLatch }
import ceylon.test { test }

shared test void testMessageReply() {
  value vertx = Vertx.vertx();
  try {
    value latch = CountDownLatch(1); // Use completable future instead
    vertx.eventBus().consumer("the_address", (Message msg) => msg.reply("the_reply"));
    vertx.eventBus().send("the_address", "the_message", void (Message|Throwable reply) {
      switch (reply)
      case (is Message) {
        if (is String body = reply.body()) {
          latch.countDown();
        } else {
          // ????
        }
      } else {
        // ????
      }
    });
    latch.await();
  } finally {
    vertx.close();
  }
}
