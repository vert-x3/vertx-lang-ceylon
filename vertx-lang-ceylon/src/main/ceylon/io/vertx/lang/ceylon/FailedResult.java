package io.vertx.lang.ceylon;

import io.vertx.core.AsyncResult;

public class FailedResult<T> implements AsyncResult<T> {

  private final Throwable cause;

  public FailedResult(Throwable cause) {
    this.cause = cause;
  }

  @Override
  public T result() {
    return null;
  }

  @Override
  public Throwable cause() {
    return cause;
  }

  @Override
  public boolean succeeded() {
    return false;
  }

  @Override
  public boolean failed() {
    return true;
  }
}
