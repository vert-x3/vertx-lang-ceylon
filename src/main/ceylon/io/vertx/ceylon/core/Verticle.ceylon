

shared abstract class Verticle() {

  shared default void startAsync(Future<Anything> startFuture) {
    start();
    startFuture.complete();
  }

  shared default void start() {
    // Implement start logic here
  }

}