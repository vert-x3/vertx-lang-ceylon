package io.vertx.ceylon.core.streams;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;
import io.vertx.core.Handler;

@TypeParameters({
  @TypeParameter(value="T",variance=Variance.NONE)
})
public interface WriteStream<T> extends StreamBase {

  Object getDelegate();

  @TypeInfo("io.vertx.ceylon.core.streams::WriteStream<T>")
  WriteStream<T> exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") Callable<?> handler);

  @TypeInfo("io.vertx.ceylon.core.streams::WriteStream<T>")
  WriteStream<T> write(
    final @TypeInfo("T") T data);

  @TypeInfo("io.vertx.ceylon.core.streams::WriteStream<T>")
  WriteStream<T> setWriteQueueMaxSize(
    final @TypeInfo("ceylon.language::Integer") long maxSize);

  @TypeInfo("ceylon.language::Boolean")
  boolean writeQueueFull();

  @TypeInfo("io.vertx.ceylon.core.streams::WriteStream<T>")
  WriteStream<T> drainHandler(
    final @TypeInfo("ceylon.language::Anything()") Callable<?> handler);

  public class Impl<T> implements WriteStream<T> {
    private final io.vertx.core.streams.WriteStream delegate;

    public Impl(io.vertx.core.streams.WriteStream delegate) {
      this.delegate = delegate;
    }

    public Object getDelegate() {
      return delegate;
    }

    @Override
    public WriteStream<T> exceptionHandler(final Callable<?> handler) {
      io.vertx.core.Handler<java.lang.Throwable> arg_0 = new io.vertx.core.Handler<java.lang.Throwable>() { public void handle(java.lang.Throwable event) { handler.$call$((Object)event); } };
      WriteStream<T> ret = new io.vertx.ceylon.core.streams.WriteStream.Impl(delegate.exceptionHandler(arg_0));
      return ret;
    }

    @Override
    public WriteStream<T> write(final T data) {
      java.lang.Object arg_0 = null;
      WriteStream<T> ret = new io.vertx.ceylon.core.streams.WriteStream.Impl(delegate.write(arg_0));
      return ret;
    }

    @Override
    public WriteStream<T> setWriteQueueMaxSize(final long maxSize) {
      int arg_0 = (int)maxSize;
      WriteStream<T> ret = new io.vertx.ceylon.core.streams.WriteStream.Impl(delegate.setWriteQueueMaxSize(arg_0));
      return ret;
    }

    @Override
    public boolean writeQueueFull() {
      boolean ret = delegate.writeQueueFull();
      return ret;
    }

    @Override
    public WriteStream<T> drainHandler(final Callable<?> handler) {
      io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { handler.$call$((Object)null); } };
      WriteStream<T> ret = new io.vertx.ceylon.core.streams.WriteStream.Impl(delegate.drainHandler(arg_0));
      return ret;
    }
  }

}
