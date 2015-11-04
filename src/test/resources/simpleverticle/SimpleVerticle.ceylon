import io.vertx.ceylon.core { Verticle }
import java.lang { System }

shared class SimpleVerticle() extends Verticle() {

  shared actual void start() {
    System.setProperty("ceylon.verticle", deploymentID);
  }

  shared actual void stop() {
    System.clearProperty("ceylon.verticle");
  }
}