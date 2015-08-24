package io.vertx.ceylon.core;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;
import io.vertx.ceylon.core.streams.ReadStream;
import io.vertx.core.Handler;

public class TimeoutStream implements ReadStream<ceylon.language.Integer> {

  private final io.vertx.core.TimeoutStream delegate;

  public TimeoutStream(io.vertx.core.TimeoutStream delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  @TypeInfo("io.vertx.ceylon.core::TimeoutStream")
  public TimeoutStream exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = new io.vertx.core.Handler<java.lang.Throwable>() { public void handle(java.lang.Throwable event) { handler.$call$((Object)event); } };
    TimeoutStream ret = new io.vertx.ceylon.core.TimeoutStream(delegate.exceptionHandler(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core::TimeoutStream")
  public TimeoutStream handler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Integer)") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Long> arg_0 = new io.vertx.core.Handler<java.lang.Long>() { public void handle(java.lang.Long event) { handler.$call$((Object)ceylon.language.Integer.instance(event)); } };
    TimeoutStream ret = new io.vertx.ceylon.core.TimeoutStream(delegate.handler(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core::TimeoutStream")
  public TimeoutStream pause() {
    TimeoutStream ret = new io.vertx.ceylon.core.TimeoutStream(delegate.pause());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core::TimeoutStream")
  public TimeoutStream resume() {
    TimeoutStream ret = new io.vertx.ceylon.core.TimeoutStream(delegate.resume());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core::TimeoutStream")
  public TimeoutStream endHandler(
    final @TypeInfo("ceylon.language::Anything()") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { endHandler.$call$((Object)null); } };
    TimeoutStream ret = new io.vertx.ceylon.core.TimeoutStream(delegate.endHandler(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::Anything")
  public void cancel() {
    delegate.cancel();
  }

}
