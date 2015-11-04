import io.vertx.ceylon.core { ... }
import io.vertx.ceylon.core.eventbus { ... }

shared class ReceiverVerticle() extends Verticle() {

  shared actual void start() {
    vertx.eventBus().consumer("the_address", (Message<String> msg) {
      assert(exists body = msg.body());
      print("Got message ``body``");
    });
  }

}