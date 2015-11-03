package io.vertx.lang.ceylon;

import io.vertx.core.DeploymentOptions;
import io.vertx.core.Future;
import io.vertx.core.Verticle;
import io.vertx.core.spi.VerticleFactory;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class CeylonVerticleFactory implements VerticleFactory {

  @Override
  public String prefix() {
    return "ceylon";
  }

  @Override
  public Verticle createVerticle(String verticleName, ClassLoader classLoader) throws Exception {
    return new CeylonVerticle(classLoader, VerticleFactory.removePrefix(verticleName));
  }
}
