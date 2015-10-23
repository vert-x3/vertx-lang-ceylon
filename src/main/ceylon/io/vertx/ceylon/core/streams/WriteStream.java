package io.vertx.ceylon.core.streams;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.core.Handler;

@TypeParameters({
  @TypeParameter(value="T",variance=Variance.NONE)
})
@DocAnnotation$annotation$(description = "todo")
public interface WriteStream<T> extends StreamBase {

  TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(WriteStream.class);

  io.vertx.lang.ceylon.Converter<io.vertx.core.streams.WriteStream, WriteStream> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.streams.WriteStream, WriteStream>() {
    public WriteStream convert(io.vertx.core.streams.WriteStream src) {
      return new WriteStream.Impl(src);
    }
  };

  io.vertx.lang.ceylon.Converter<WriteStream, io.vertx.core.streams.WriteStream> TO_JAVA = new io.vertx.lang.ceylon.Converter<WriteStream, io.vertx.core.streams.WriteStream>() {
    public io.vertx.core.streams.WriteStream convert(WriteStream src) {
      return (io.vertx.core.streams.WriteStream)src.getDelegate();
    }
  };

  @Ignore
  Object getDelegate();

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.streams::WriteStream<T>")
  WriteStream<T> exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler);

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.streams::WriteStream<T>")
  WriteStream<T> write(
    final @TypeInfo("T") @DocAnnotation$annotation$(description = "todo") T data);

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.streams::WriteStream<T>")
  WriteStream<T> setWriteQueueMaxSize(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long maxSize);

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  boolean writeQueueFull();

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.streams::WriteStream<T>")
  WriteStream<T> drainHandler(
    final @TypeInfo("ceylon.language::Anything()") @DocAnnotation$annotation$(description = "todo") Callable<?> handler);

  @Ignore
  public class Impl<T> implements WriteStream<T> {
    @Ignore private final io.vertx.core.streams.WriteStream delegate;

    public Impl(io.vertx.core.streams.WriteStream delegate) {
      this.delegate = delegate;
    }

    @Ignore
    public Object getDelegate() {
      return delegate;
    }

    @Override
    public WriteStream<T> exceptionHandler(final Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        handler.$call$((Object)event);
      }
    };
    WriteStream<T> ret = io.vertx.ceylon.core.streams.WriteStream.TO_CEYLON.safeConvert(delegate.exceptionHandler(arg_0));
      return this;
    }

    @Override
    public WriteStream<T> write(final T data) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(data);
    WriteStream<T> ret = io.vertx.ceylon.core.streams.WriteStream.TO_CEYLON.safeConvert(delegate.write(arg_0));
      return this;
    }

    @Override
    public WriteStream<T> setWriteQueueMaxSize(final long maxSize) {
    int arg_0 = (int)maxSize;
    WriteStream<T> ret = io.vertx.ceylon.core.streams.WriteStream.TO_CEYLON.safeConvert(delegate.setWriteQueueMaxSize(arg_0));
      return this;
    }

    @Override
    public boolean writeQueueFull() {
    boolean ret = delegate.writeQueueFull();
      return ret;
    }

    @Override
    public WriteStream<T> drainHandler(final Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        handler.$call$();
      }
    };
    WriteStream<T> ret = io.vertx.ceylon.core.streams.WriteStream.TO_CEYLON.safeConvert(delegate.drainHandler(arg_0));
      return this;
    }
  }

}
