import io.vertx.ceylon.core { ... }
import io.vertx.ceylon.core.eventbus { ... }

shared void run() {

  value vertx = Vertx.clusteredVertx(VertxOptions(), (Vertx|Throwable v) {
    if (is Vertx v) {
      print("Started");
      v.eventBus().consumer("the_address", (Message<String> msg) {
        assert(exists body = msg.body());
        print("Got message ``body``");
      });
    } else {
      v.printStackTrace();
    }
  });

}
