package io.vertx.lang.ceylon;

import io.vertx.core.Verticle;
import io.vertx.core.spi.VerticleFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
public class CeylonVerticleFactory implements VerticleFactory {

  final Map<String, ModuleDeployment> modules = new HashMap<>();

  @Override
  public String prefix() {
    return "ceylon";
  }

  public CeylonVerticleFactory() {
    System.out.println("");
  }

  @Override
  public boolean blockingCreate() {
    return true;
  }

  @Override
  public Verticle createVerticle(String verticleName, ClassLoader classLoader) throws Exception {
    return new CeylonVerticle(this, classLoader, VerticleFactory.removePrefix(verticleName));
  }
}
