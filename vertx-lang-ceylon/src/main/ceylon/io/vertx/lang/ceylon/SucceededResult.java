package io.vertx.lang.ceylon;

import io.vertx.core.AsyncResult;

public class SucceededResult<T> implements AsyncResult<T> {

  private final T result;

  public SucceededResult(T result) {
    this.result = result;
  }

  @Override
  public T result() {
    return result;
  }

  @Override
  public Throwable cause() {
    return null;
  }

  @Override
  public boolean succeeded() {
    return true;
  }

  @Override
  public boolean failed() {
    return false;
  }
}
