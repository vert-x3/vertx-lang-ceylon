package io.vertx.lang.ceylon;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.Verticle;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.Callable;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class CeylonVerticle extends AbstractVerticle {

  private final CeylonVerticleFactory.Module module;
  private Verticle verticle;

  public CeylonVerticle(CeylonVerticleFactory.Module module) {
    this.module = module;
  }

  @Override
  public void start(Future<Void> startFuture) throws Exception {
    ClassLoader loader = module.runner.getModuleClassLoader();
    Method introspector = loader.loadClass("io.vertx.ceylon.core.impl.resolveVerticles_").getDeclaredMethod("resolveVerticles", String.class, String.class);
    Map<String, Callable<?>> moduleFactories = (Map<String, Callable<?>>) introspector.invoke(null, module.name, null);

    Callable<?> factory = moduleFactories.values().iterator().next();
    verticle = (Verticle) factory.call();
    verticle.init(vertx, context);
    verticle.start(startFuture);
  }

  @Override
  public void stop(Future<Void> stopFuture) throws Exception {
    try {
      verticle.stop(stopFuture);
    } finally {
      module.removeInstance();
    }
  }
}
