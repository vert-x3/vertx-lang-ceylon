package io.vertx.lang.ceylon;

import com.redhat.ceylon.compiler.java.runtime.metamodel.Metamodel;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.ext.unit.TestContext;
import io.vertx.ext.unit.junit.VertxUnitRunner;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.HashSet;

/**
 * @author <a href="mailto:julien@julienviet.com">Julien Viet</a>
 */
@RunWith(VertxUnitRunner.class)
public class VerticleTest {

  @Before
  public void before() {
    Metamodel.resetModuleManager();
    new HashSet<>(System.getProperties().keySet()).stream().
        map(Object::toString).
        filter(key -> key.startsWith("ceylon.")).
        forEach(System::clearProperty
        );
  }

  @Test
  public void testDeployVerticle(TestContext context) {
    Vertx vertx = Vertx.vertx();
    System.clearProperty("ceylon.verticle");
    vertx.deployVerticle("ceylon:verticles/simple", context.asyncAssertSuccess(id -> {
      context.assertEquals("1", System.getProperty("ceylon.verticle." + id));
      vertx.undeploy(id, context.asyncAssertSuccess(v -> {
        context.assertEquals("0", System.getProperty("ceylon.verticle." + id));
      }));
    }));
  }

  @Test
  public void testDeployCompiledVerticle(TestContext context) {
    Vertx vertx = Vertx.vertx();
    System.clearProperty("ceylon.verticle");
    vertx.deployVerticle("ceylon:verticles.simple/1.0.0", context.asyncAssertSuccess(id -> {
      context.assertEquals("1", System.getProperty("ceylon.verticle." + id));
      vertx.undeploy(id, context.asyncAssertSuccess(v -> {
        context.assertEquals("0", System.getProperty("ceylon.verticle." + id));
      }));
    }));
  }

  @Test
  public void testVerticleDeployingCeylonVerticle(TestContext context) {
    Vertx vertx = Vertx.vertx();
    System.clearProperty("ceylon.verticle");
    DeploymentOptions options = new DeploymentOptions().setConfig(new JsonObject().put("verticleName", "ceylon:verticles/simple"));
    vertx.deployVerticle("ceylon:verticles/deployer", options, context.asyncAssertSuccess(id -> {
//      context.assertEquals("1", System.getProperty("ceylon.verticle." + id));
      vertx.undeploy(id, context.asyncAssertSuccess(v -> {
//        context.assertEquals("0", System.getProperty("ceylon.verticle." + id));
      }));
    }));
  }

  @Test
  public void testVerticleDeployingCompiledCeylonVerticle(TestContext context) {
    Vertx vertx = Vertx.vertx();
    System.clearProperty("ceylon.verticle");
    DeploymentOptions options = new DeploymentOptions().setConfig(new JsonObject().put("verticleName", "ceylon:verticles.simple/1.0.0"));
    vertx.deployVerticle("ceylon:verticles/deployer", options, context.asyncAssertSuccess(id -> {
//      context.assertEquals("1", System.getProperty("ceylon.verticle." + id));
      vertx.undeploy(id, context.asyncAssertSuccess(v -> {
//        context.assertEquals("0", System.getProperty("ceylon.verticle." + id));
      }));
    }));
  }

  @Test
  public void testDeployVerticleInstances(TestContext context) {
    Vertx vertx = Vertx.vertx();
    vertx.deployVerticle("ceylon:verticles/simple", new DeploymentOptions().setInstances(4), context.asyncAssertSuccess(id -> {
      context.assertEquals("4", System.getProperty("ceylon.verticle." + id));
      vertx.undeploy(id, context.asyncAssertSuccess(v -> {
        context.assertEquals("0", System.getProperty("ceylon.verticle." + id));
      }));
    }));
  }
}
