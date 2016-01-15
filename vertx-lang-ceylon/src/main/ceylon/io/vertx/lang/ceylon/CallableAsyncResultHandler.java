package io.vertx.lang.ceylon;

import io.vertx.core.Handler;
import io.vertx.core.AsyncResult;
import ceylon.language.Callable;
import ceylon.language.Throwable;
import ceylon.language.Exception;

public abstract class CallableAsyncResultHandler<T> implements Handler<AsyncResult<T>> {

  private final Callable<?> callback;

  public CallableAsyncResultHandler(Callable<?> callback) {
    this.callback = callback;
  }

  public void handle(AsyncResult<T> ar) {
    if (ar.succeeded()) {
      Object result = toCeylon(ar.result());
      callback.$call$(result);
    } else {
      callback.$call$(ar.cause());
    }
  }

  public abstract Object toCeylon(T t);

}