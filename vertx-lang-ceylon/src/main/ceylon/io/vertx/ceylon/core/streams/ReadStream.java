package io.vertx.ceylon.core.streams;

import com.redhat.ceylon.compiler.java.metadata.Ceylon;
import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.metadata.Name;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import com.redhat.ceylon.compiler.java.runtime.model.ReifiedType;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.core.Handler;

@TypeParameters({
  @TypeParameter(value="T",variance=Variance.NONE)
})
@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Represents a stream of items that can be read from.\n <p>\n Any class that implements this interface can be used by a [Pump](../streams/Pump.type.html) to pump data from it\n to a [WriteStream](../streams/WriteStream.type.html).\n")
public interface ReadStream<T> extends StreamBase {

  @Ignore
  io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.streams.ReadStream, ReadStream> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.streams.ReadStream, ReadStream>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.streams.ReadStream, ReadStream> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.streams.ReadStream, ReadStream>() {
        public ReadStream convert(io.vertx.core.streams.ReadStream src) {
          return new ReadStream.Impl(descriptors[0], src);
        }
      };
    }
  };

  @Ignore
  io.vertx.lang.ceylon.Converter<ReadStream, io.vertx.core.streams.ReadStream> TO_JAVA = new io.vertx.lang.ceylon.Converter<ReadStream, io.vertx.core.streams.ReadStream>() {
    public io.vertx.core.streams.ReadStream convert(ReadStream src) {
      return (io.vertx.core.streams.ReadStream)src.getDelegate();
    }
  };

  @Ignore
  TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(ReadStream.class);
  @Ignore
  Object getDelegate();

  @DocAnnotation$annotation$(description = " Set an exception handler on the read stream.\n")
  @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<T>")
  public ReadStream<T> exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)?") @Name("handler")@DocAnnotation$annotation$(description = "the exception handler\n") Callable<?> handler);

  @DocAnnotation$annotation$(description = " Set a data handler. As data is read, the handler will be called with the data.\n")
  @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<T>")
  public ReadStream<T> handler(
    final @TypeInfo("ceylon.language::Anything(T)?") @Name("handler") Callable<?> handler);

  @DocAnnotation$annotation$(description = " Pause the <code>ReadSupport</code>. While it's paused, no data will be sent to the <code>dataHandler</code>\n")
  @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<T>")
  public ReadStream<T> pause();

  @DocAnnotation$annotation$(description = " Resume reading. If the <code>ReadSupport</code> has been paused, reading will recommence on it.\n")
  @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<T>")
  public ReadStream<T> resume();

  @DocAnnotation$annotation$(description = " Set an end handler. Once the stream has ended, and there is no more data to be read, this handler will be called.\n")
  @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<T>")
  public ReadStream<T> endHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("endHandler") Callable<?> endHandler);

  @Ignore
  public class Impl<T> implements ReadStream<T> {
    @Ignore private final TypeDescriptor $TypeDescriptor$;
    @Ignore private final TypeDescriptor $reified$T;
    @Ignore private final io.vertx.core.streams.ReadStream delegate;

    public Impl(@Ignore TypeDescriptor $reified$T, io.vertx.core.streams.ReadStream delegate) {
      this.$TypeDescriptor$ = TypeDescriptor.klass(ReadStream.class, $reified$T);
      this.$reified$T = $reified$T;
      this.delegate = delegate;
    }

    @Ignore 
    public TypeDescriptor $getType$() {
      return $TypeDescriptor$;
    }

    @Ignore
    public Object getDelegate() {
      return delegate;
    }

  @DocAnnotation$annotation$(description = " Set an exception handler on the read stream.\n")
  @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<T>")
  public ReadStream<T> exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)?") @Name("handler")@DocAnnotation$annotation$(description = "the exception handler\n") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        handler.$call$((Object)event);
      }
    };
    ReadStream<T> ret = io.vertx.ceylon.core.streams.ReadStream.TO_CEYLON.converter($reified$T).safeConvert(delegate.exceptionHandler(arg_0));
      return this;
    }

  @DocAnnotation$annotation$(description = " Set a data handler. As data is read, the handler will be called with the data.\n")
  @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<T>")
  public ReadStream<T> handler(
    final @TypeInfo("ceylon.language::Anything(T)?") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Object> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Object>() {
      public void handle(java.lang.Object event) {
        handler.$call$((Object)(T)io.vertx.lang.ceylon.VertxTypeDescriptor.getToCeylon($reified$T).convert(event));
      }
    };
    ReadStream<T> ret = io.vertx.ceylon.core.streams.ReadStream.TO_CEYLON.converter($reified$T).safeConvert(delegate.handler(arg_0));
      return this;
    }

  @DocAnnotation$annotation$(description = " Pause the <code>ReadSupport</code>. While it's paused, no data will be sent to the <code>dataHandler</code>\n")
  @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<T>")
  public ReadStream<T> pause() {
    ReadStream<T> ret = io.vertx.ceylon.core.streams.ReadStream.TO_CEYLON.converter($reified$T).safeConvert(delegate.pause());
      return this;
    }

  @DocAnnotation$annotation$(description = " Resume reading. If the <code>ReadSupport</code> has been paused, reading will recommence on it.\n")
  @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<T>")
  public ReadStream<T> resume() {
    ReadStream<T> ret = io.vertx.ceylon.core.streams.ReadStream.TO_CEYLON.converter($reified$T).safeConvert(delegate.resume());
      return this;
    }

  @DocAnnotation$annotation$(description = " Set an end handler. Once the stream has ended, and there is no more data to be read, this handler will be called.\n")
  @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<T>")
  public ReadStream<T> endHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("endHandler") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = endHandler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        endHandler.$call$();
      }
    };
    ReadStream<T> ret = io.vertx.ceylon.core.streams.ReadStream.TO_CEYLON.converter($reified$T).safeConvert(delegate.endHandler(arg_0));
      return this;
    }
  }

}
