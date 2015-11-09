import io.vertx.ceylon.core { Verticle }
import java.lang { System }

shared class SimpleVerticle() extends Verticle() {

  shared actual void start() {
    value prop = "ceylon.verticle.``deploymentID``";
    lock.lock();
    try {
      System.setProperty(prop, "``++counter``");
    } finally {
      lock.unlock();
    }
  }

  shared actual void stop() {
    value prop = "ceylon.verticle.``deploymentID``";
    lock.lock();
    try {
      System.setProperty(prop, "``--counter``");
    } finally {
      lock.unlock();
    }
  }
}