package io.vertx.ceylon.core.streams;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.metadata.Name;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.core.Handler;

@TypeParameters({
  @TypeParameter(value="T",variance=Variance.NONE)
})
@DocAnnotation$annotation$(description = "todo")
public interface ReadStream<T> extends StreamBase {

  TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(ReadStream.class);

  io.vertx.lang.ceylon.Converter<io.vertx.core.streams.ReadStream, ReadStream> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.streams.ReadStream, ReadStream>() {
    public ReadStream convert(io.vertx.core.streams.ReadStream src) {
      return new ReadStream.Impl(src);
    }
  };

  io.vertx.lang.ceylon.Converter<ReadStream, io.vertx.core.streams.ReadStream> TO_JAVA = new io.vertx.lang.ceylon.Converter<ReadStream, io.vertx.core.streams.ReadStream>() {
    public io.vertx.core.streams.ReadStream convert(ReadStream src) {
      return (io.vertx.core.streams.ReadStream)src.getDelegate();
    }
  };

  @Ignore
  Object getDelegate();

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<T>")
  public ReadStream<T> exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)?") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler);

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<T>")
  public ReadStream<T> handler(
    final @TypeInfo("ceylon.language::Anything(T?)?") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler);

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<T>")
  public ReadStream<T> pause();

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<T>")
  public ReadStream<T> resume();

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<T>")
  public ReadStream<T> endHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("endHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> endHandler);

  @Ignore
  public class Impl<T> implements ReadStream<T> {
    @Ignore private final io.vertx.core.streams.ReadStream delegate;

    public Impl(io.vertx.core.streams.ReadStream delegate) {
      this.delegate = delegate;
    }

    @Ignore
    public Object getDelegate() {
      return delegate;
    }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<T>")
  public ReadStream<T> exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)?") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        handler.$call$((Object)event);
      }
    };
    ReadStream<T> ret = io.vertx.ceylon.core.streams.ReadStream.TO_CEYLON.safeConvert(delegate.exceptionHandler(arg_0));
      return this;
    }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<T>")
  public ReadStream<T> handler(
    final @TypeInfo("ceylon.language::Anything(T?)?") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Object> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Object>() {
      public void handle(java.lang.Object event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.object(event));
      }
    };
    ReadStream<T> ret = io.vertx.ceylon.core.streams.ReadStream.TO_CEYLON.safeConvert(delegate.handler(arg_0));
      return this;
    }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<T>")
  public ReadStream<T> pause() {
    ReadStream<T> ret = io.vertx.ceylon.core.streams.ReadStream.TO_CEYLON.safeConvert(delegate.pause());
      return this;
    }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<T>")
  public ReadStream<T> resume() {
    ReadStream<T> ret = io.vertx.ceylon.core.streams.ReadStream.TO_CEYLON.safeConvert(delegate.resume());
      return this;
    }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<T>")
  public ReadStream<T> endHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("endHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = endHandler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        endHandler.$call$();
      }
    };
    ReadStream<T> ret = io.vertx.ceylon.core.streams.ReadStream.TO_CEYLON.safeConvert(delegate.endHandler(arg_0));
      return this;
    }
  }

}
