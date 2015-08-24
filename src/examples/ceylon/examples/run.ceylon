import io.vertx.ceylon.core {
  Vertx, Future
}
import io.vertx.ceylon.core.eventbus {
  Message
}

shared void run() {


  void done(Integer i) {
    print("fired");
  }

  value vertx = Vertx.vertx();
  print(vertx);
  value id = vertx.setTimer(100, done);
  print(id);

  value bus = vertx.eventBus();
  void onMessage(Message<Integer> msg) {
    try {
      value val = msg.body();
      print("got message ``val``");
    } catch(Throwable e) {
      print("Something bad happened");
      e.printStackTrace();
    }
  }
  bus.consumer("the_address", onMessage);
  bus.send("the_address", 3);

}

void foo() {
  /*

  void onReply(Throwable|Message<String> msg) {

  }

  void done(Throwable|Vertx result) {
    if (is Vertx result) {
      value eb = result.eventBus();
      eb.send("the_address", "the_msg", onReply);
    }
  }
  value options = "whatever";
  Vertx.clusteredVertx(options, done);

  value fut = Future.future<String>();
  */
}