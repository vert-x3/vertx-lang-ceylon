package io.vertx.ceylon.core;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.ceylon.core.streams.ReadStream;
import io.vertx.core.Handler;

@DocAnnotation$annotation$(description = "todo")
public class TimeoutStream implements ReadStream<ceylon.language.Integer> {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(TimeoutStream.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.TimeoutStream, TimeoutStream> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.TimeoutStream, TimeoutStream>() {
    public TimeoutStream convert(io.vertx.core.TimeoutStream src) {
      return new TimeoutStream(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<TimeoutStream, io.vertx.core.TimeoutStream> TO_JAVA = new io.vertx.lang.ceylon.Converter<TimeoutStream, io.vertx.core.TimeoutStream>() {
    public io.vertx.core.TimeoutStream convert(TimeoutStream src) {
      return src.delegate;
    }
  };

  @Ignore
  private final io.vertx.core.TimeoutStream delegate;

  public TimeoutStream(io.vertx.core.TimeoutStream delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::TimeoutStream")
  public TimeoutStream exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = new io.vertx.core.Handler<java.lang.Throwable>() { public void handle(java.lang.Throwable event) { handler.$call$((Object)event); } };
    TimeoutStream ret = new io.vertx.ceylon.core.TimeoutStream(delegate.exceptionHandler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::TimeoutStream")
  public TimeoutStream handler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Integer)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Long> arg_0 = new io.vertx.core.Handler<java.lang.Long>() { public void handle(java.lang.Long event) { handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Long.convert(event)); } };
    TimeoutStream ret = new io.vertx.ceylon.core.TimeoutStream(delegate.handler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::TimeoutStream")
  public TimeoutStream pause() {
    TimeoutStream ret = new io.vertx.ceylon.core.TimeoutStream(delegate.pause());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::TimeoutStream")
  public TimeoutStream resume() {
    TimeoutStream ret = new io.vertx.ceylon.core.TimeoutStream(delegate.resume());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::TimeoutStream")
  public TimeoutStream endHandler(
    final @TypeInfo("ceylon.language::Anything()") @DocAnnotation$annotation$(description = "todo") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { endHandler.$call$(); } };
    TimeoutStream ret = new io.vertx.ceylon.core.TimeoutStream(delegate.endHandler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void cancel() {
    delegate.cancel();
  }

}
