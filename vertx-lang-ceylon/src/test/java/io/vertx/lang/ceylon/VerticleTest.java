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

import java.io.File;
import java.net.URL;
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
  public void testDeployVerticleFromClassPath(TestContext context) {
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
  public void testDeployVerticleFromFileSystem(TestContext context) throws Exception {
    URL url = Thread.currentThread().getContextClassLoader().getResource("verticles/simple/module.ceylon");
    context.assertNotNull(url);
    File file = new File(url.toURI()).getParentFile();
    Vertx vertx = Vertx.vertx();
    System.clearProperty("ceylon.verticle");
    vertx.deployVerticle("ceylon:" + file.getAbsolutePath(), context.asyncAssertSuccess(id -> {
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
    vertx.deployVerticle("ceylon:verticles.simple/3.2.2", context.asyncAssertSuccess(id -> {
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
    DeploymentOptions options = new DeploymentOptions().setConfig(new JsonObject().put("verticleName", "ceylon:verticles.simple/3.2.2"));
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
