package io.vertx.lang.ceylon;

import com.redhat.ceylon.compiler.java.runtime.metamodel.Metamodel;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.Vertx;
import io.vertx.ext.unit.TestContext;
import io.vertx.ext.unit.junit.VertxUnitRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
@RunWith(VertxUnitRunner.class)
public class VerticleTest {

  @Before
  public void before() {
    Metamodel.resetModuleManager();
  }

  @Test
  public void testVerticleLifecycle(TestContext context) {
    Vertx vertx = Vertx.vertx();
    System.clearProperty("ceylon.verticle");
    vertx.deployVerticle("ceylon:simpleverticle", context.asyncAssertSuccess(id -> {
      context.assertEquals(id, System.getProperty("ceylon.verticle"));
      vertx.undeploy(id, context.asyncAssertSuccess(v -> {
        context.assertNull(System.getProperty("ceylon.verticle"));
      }));
    }));
  }

  @Test
  public void testCompiledVerticleLifecycle(TestContext context) {
    Vertx vertx = Vertx.vertx();
    System.clearProperty("ceylon.verticle");
    vertx.deployVerticle("ceylon:verticles.simple/1.0.0", context.asyncAssertSuccess(id -> {
      context.assertEquals(id, System.getProperty("ceylon.verticle"));
      vertx.undeploy(id, context.asyncAssertSuccess(v -> {
        context.assertNull(System.getProperty("ceylon.verticle"));
      }));
    }));
  }

  @Test
  public void testDeployCeylon(TestContext context) {
    Vertx vertx = Vertx.vertx();
    System.clearProperty("ceylon.verticle");
    vertx.deployVerticle("ceylon:deployceylon", context.asyncAssertSuccess(id -> {
      context.assertNotNull(System.getProperty("ceylon.verticle"));
      vertx.undeploy(id, context.asyncAssertSuccess(v -> {
        context.assertNull(System.getProperty("ceylon.verticle"));
      }));
    }));
  }
}
