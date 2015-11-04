package io.vertx.ceylon.core;

import java.lang.reflect.Method;

import io.vertx.core.AsyncResult;
import io.vertx.core.DeploymentOptions;
import io.vertx.core.Handler;
import io.vertx.core.Verticle;
import io.vertx.core.Vertx;

class Helper {
  static void deployVerticle(Object vertx, Verticle verticle, DeploymentOptions options, Handler<AsyncResult<String>> completionHandler) throws Exception {
    Method m = vertx.getClass().getMethod("getDelegate");
    Vertx delegate = (Vertx)m.invoke(vertx);
    delegate.deployVerticle(verticle, options, completionHandler);
  }
}