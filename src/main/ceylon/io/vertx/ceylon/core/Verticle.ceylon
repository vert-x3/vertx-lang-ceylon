import ceylon.json { JsonObject=Object }
import io.vertx.core { AbstractVerticle_=AbstractVerticle, Future_=Future, Vertx_=Vertx, Handler_=Handler, DeploymentOptions_=DeploymentOptions, AsyncResult_=AsyncResult }
import java.lang { Void_=Void, String_=String }

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

  "Deploy a verticle instance to Vert.x"
  shared void deploy(Vertx vertx, DeploymentOptions? options = null, Anything(String|Throwable)? completionHandler = null) {

    if (exists tmp = _vertx) {
      throw Exception("Already deployed to a Vert.x instance");
    }

    object verticle_ extends AbstractVerticle_() {
      shared actual void start(Future_<Void_> handler) {
        startAsync(Future<Anything>(handler));
      }
      shared actual void stop(Future_<Void_> handler) {
        stopAsync(Future<Anything>(handler));
      }
    }

    DeploymentOptions_ options_;
    if (exists options) {
      options_ = toJavaDeploymentOptions.convert(options);
    } else {
      options_ = DeploymentOptions_();
    }

    object completionHandler_ satisfies Handler_<AsyncResult_<String_>> {
      shared actual void handle(AsyncResult_<String_> ar) {
        if (exists completionHandler) {
          if (ar.succeeded()) {
            completionHandler(ar.result().string);
          } else {
            completionHandler(ar.cause());
          }
        }
      }
    }

    Helper.deployVerticle(vertx, verticle_, options_, completionHandler_);
  }
}