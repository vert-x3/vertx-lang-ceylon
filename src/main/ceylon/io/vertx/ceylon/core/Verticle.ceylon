import ceylon.json { JsonObject=Object }

shared abstract class Verticle() {

  variable Vertx? _vertx = null;
  variable Context? _context = null;

  shared void init(Vertx vertx, Context context) {
    _vertx = vertx;
    _context = context;
  }

  shared Vertx vertx {
    assert(exists ret = _vertx);
    return ret;
  }

  shared Context context {
    assert(exists ret = _context);
    return ret;
  }

  shared String deploymentID => context.deploymentID();

  shared JsonObject? config => context.config();

  shared List<String> processArgs => context.processArgs();

  shared default void startAsync(Future<Anything> startFuture) {
    start();
    startFuture.complete();
  }

  shared default void start() {
    // Implement start logic here
  }

  shared default void stopAsync(Future<Anything> stopFuture) {
    stop();
    stopFuture.complete();
  }

  shared default void stop() {
    // Implement stop logic here
  }
}