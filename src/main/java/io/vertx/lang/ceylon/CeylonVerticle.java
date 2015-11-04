package io.vertx.lang.ceylon;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Context;
import io.vertx.core.Future;
import io.vertx.core.Vertx;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.Callable;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class CeylonVerticle extends AbstractVerticle {

  private final CeylonVerticleFactory.Module module;
  private Object verticle;

  public CeylonVerticle(CeylonVerticleFactory.Module module) {
    this.module = module;
  }

  @Override
  public void start(Future<Void> startFuture) throws Exception {
    ClassLoader loader = module.runner.getModuleClassLoader();
    Method introspector = loader.loadClass("io.vertx.ceylon.core.impl.resolveVerticles_").getDeclaredMethod("resolveVerticles", String.class, String.class);
    Map<String, Callable<?>> moduleFactories = (Map<String, Callable<?>>) introspector.invoke(null, module.name, null);

    // Wrap objects
    Class<?> vertxClass = loader.loadClass("io.vertx.ceylon.core.Vertx");
    Object wrappedVertx = vertxClass.getConstructor(Vertx.class).newInstance(vertx);
    Class<?> contextClass = loader.loadClass("io.vertx.ceylon.core.Context");
    Object wrapperContext = contextClass.getConstructor(Context.class).newInstance(context);
    Class<?> futureClass = loader.loadClass("io.vertx.ceylon.core.Future");
    Object wrappedStartFuture = futureClass.getConstructor(Future.class).newInstance(startFuture);

    // Create, init, start
    Callable<?> factory = moduleFactories.values().iterator().next();
    verticle = factory.call();
    Method init = verticle.getClass().getMethod("init", vertxClass, contextClass);
    init.invoke(verticle, wrappedVertx, wrapperContext);
    Method startAsync = verticle.getClass().getMethod("startAsync", futureClass);
    startAsync.invoke(verticle, wrappedStartFuture);
  }

  @Override
  public void stop(Future<Void> stopFuture) throws Exception {
    try {
      Class<?> futureClass = module.runner.getModuleClassLoader().loadClass("io.vertx.ceylon.core.Future");
      Object wrappedStopFuture = futureClass.getConstructor(Future.class).newInstance(stopFuture);
      Method stopAsync = verticle.getClass().getMethod("stopAsync", futureClass);
      stopAsync.invoke(verticle, wrappedStopFuture);
    } finally {
      module.removeInstance();
    }
  }
}
