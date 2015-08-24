package io.vertx.ceylon.core;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@TypeParameters({
  @TypeParameter(value="T",variance=Variance.NONE)
})
public class Future<T> {

  private final io.vertx.core.Future delegate;

  public Future(io.vertx.core.Future delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @TypeInfo("io.vertx.ceylon.core::Future<T>")
  public static <T> Future<T> future() {
    Future<T> ret = new io.vertx.ceylon.core.Future(io.vertx.core.Future.future());
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @TypeInfo("io.vertx.ceylon.core::Future<T>")
  public static <T> Future<T> succeededFuture() {
    Future<T> ret = new io.vertx.ceylon.core.Future(io.vertx.core.Future.succeededFuture());
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @TypeInfo("io.vertx.ceylon.core::Future<T>")
  public static <T> Future<T> succeededFuture(
    final @TypeInfo("T") T result) {
    java.lang.Object arg_0 = null;
    Future<T> ret = new io.vertx.ceylon.core.Future(io.vertx.core.Future.succeededFuture(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @TypeInfo("io.vertx.ceylon.core::Future<T>")
  public static <T> Future<T> failedFuture(
    final @TypeInfo("ceylon.language::String") ceylon.language.String failureMessage) {
    java.lang.String arg_0 = failureMessage.toString();
    Future<T> ret = new io.vertx.ceylon.core.Future(io.vertx.core.Future.failedFuture(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::Boolean")
  public boolean isComplete() {
    boolean ret = delegate.isComplete();
    return ret;
  }

  @TypeInfo("ceylon.language::Anything")
  public void setHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|T)") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Object>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Object>(handler) { public Object toCeylon(java.lang.Object event) { return null; } };
    delegate.setHandler(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void complete(
    final @TypeInfo("T") T result) {
    java.lang.Object arg_0 = null;
    delegate.complete(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void complete() {
    delegate.complete();
  }

  @TypeInfo("ceylon.language::Anything")
  public void fail(
    final @TypeInfo("ceylon.language::String") ceylon.language.String failureMessage) {
    java.lang.String arg_0 = failureMessage.toString();
    delegate.fail(arg_0);
  }

}
