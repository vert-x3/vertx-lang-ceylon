package io.vertx.ceylon.core.streams;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.core.Handler;

@TypeParameters({
  @TypeParameter(value="T",variance=Variance.NONE)
})
@DocAnnotation$annotation$(description = "todo")
public interface ReadStream<T> extends StreamBase {

  @Ignore
  Object getDelegate();

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<T>")
  ReadStream<T> exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler);

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<T>")
  ReadStream<T> handler(
    final @TypeInfo("ceylon.language::Anything(T)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler);

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<T>")
  ReadStream<T> pause();

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<T>")
  ReadStream<T> resume();

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<T>")
  ReadStream<T> endHandler(
    final @TypeInfo("ceylon.language::Anything()") @DocAnnotation$annotation$(description = "todo") Callable<?> endHandler);

  @Ignore
  public class Impl<T> implements ReadStream<T> {
    @Ignore
    private final io.vertx.core.streams.ReadStream delegate;

    public Impl(io.vertx.core.streams.ReadStream delegate) {
      this.delegate = delegate;
    }

    @Ignore
    public Object getDelegate() {
      return delegate;
    }

    @Override
    public ReadStream<T> exceptionHandler(final Callable<?> handler) {
      io.vertx.core.Handler<java.lang.Throwable> arg_0 = new io.vertx.core.Handler<java.lang.Throwable>() { public void handle(java.lang.Throwable event) { handler.$call$((Object)event); } };
      ReadStream<T> ret = new io.vertx.ceylon.core.streams.ReadStream.Impl(delegate.exceptionHandler(arg_0));
      return ret;
    }

    @Override
    public ReadStream<T> handler(final Callable<?> handler) {
      io.vertx.core.Handler<java.lang.Object> arg_0 = new io.vertx.core.Handler<java.lang.Object>() { public void handle(java.lang.Object event) { handler.$call$((Object)null); } };
      ReadStream<T> ret = new io.vertx.ceylon.core.streams.ReadStream.Impl(delegate.handler(arg_0));
      return ret;
    }

    @Override
    public ReadStream<T> pause() {
      ReadStream<T> ret = new io.vertx.ceylon.core.streams.ReadStream.Impl(delegate.pause());
      return ret;
    }

    @Override
    public ReadStream<T> resume() {
      ReadStream<T> ret = new io.vertx.ceylon.core.streams.ReadStream.Impl(delegate.resume());
      return ret;
    }

    @Override
    public ReadStream<T> endHandler(final Callable<?> endHandler) {
      io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { endHandler.$call$((Object)null); } };
      ReadStream<T> ret = new io.vertx.ceylon.core.streams.ReadStream.Impl(delegate.endHandler(arg_0));
      return ret;
    }
  }

}
