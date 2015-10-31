package io.vertx.lang.ceylon;

import io.vertx.core.Vertx;
import io.vertx.ext.unit.TestContext;
import io.vertx.ext.unit.junit.VertxUnitRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
@RunWith(VertxUnitRunner.class)
public class VerticleTest {

  @Test
  public void testFoo(TestContext context) {
    Vertx vertx = Vertx.vertx();
    vertx.deployVerticle("ceylon:simpleverticle", context.asyncAssertSuccess());
  }
}
