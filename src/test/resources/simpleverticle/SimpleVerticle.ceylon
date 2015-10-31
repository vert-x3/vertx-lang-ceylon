import io.vertx.ceylon.core {
	Verticle
}

shared class SimpleVerticle() extends Verticle() {

  shared actual void start() {
    print("Starting simple verticle");
  }
}