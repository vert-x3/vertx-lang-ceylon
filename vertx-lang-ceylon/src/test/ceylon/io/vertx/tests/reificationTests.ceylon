import io.vertx.ceylon.core { Vertx, vertx }
import io.vertx.ceylon.core.eventbus { Message }
import java.util.concurrent { CountDownLatch }
import ceylon.test { test }

shared test void testMessageReply() {
  value instance = vertx.vertx();
  try {
    value latch = CountDownLatch(1);
    instance.eventBus().consumer("the_address", (Message<String?> msg) => msg.reply("the_reply"));
    instance.eventBus().send("the_address", "the_message", void (Message<String?>|Throwable reply) {
      switch (reply)
      case (is Message<String?>) {
        latch.countDown();
      } else {
      }
    });
    latch.await();
  } finally {
    instance.close();
  }
}
