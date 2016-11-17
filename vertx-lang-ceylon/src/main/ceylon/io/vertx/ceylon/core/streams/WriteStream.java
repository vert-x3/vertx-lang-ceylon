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
@DocAnnotation$annotation$(description = "\n Represents a stream of data that can be written to.\n <p>\n Any class that implements this interface can be used by a [Pump](../streams/Pump.type.html) to pump data from a <code>ReadStream</code>\n to it.\n")
public interface WriteStream<T> extends StreamBase {

  @Ignore
  io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.streams.WriteStream, WriteStream> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.streams.WriteStream, WriteStream>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.streams.WriteStream, WriteStream> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.streams.WriteStream, WriteStream>() {
        public WriteStream convert(io.vertx.core.streams.WriteStream src) {
          return new WriteStream.Impl(descriptors[0], src);
        }
      };
    }
  };

  @Ignore
  io.vertx.lang.ceylon.Converter<WriteStream, io.vertx.core.streams.WriteStream> TO_JAVA = new io.vertx.lang.ceylon.Converter<WriteStream, io.vertx.core.streams.WriteStream>() {
    public io.vertx.core.streams.WriteStream convert(WriteStream src) {
      return (io.vertx.core.streams.WriteStream)src.getDelegate();
    }
  };

  @Ignore
  TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(WriteStream.class);
  @Ignore
  Object getDelegate();

  @DocAnnotation$annotation$(description = " Set an exception handler on the write stream.\n")
  @TypeInfo("io.vertx.ceylon.core.streams::WriteStream<T>")
  public WriteStream<T> exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)?") @Name("handler")@DocAnnotation$annotation$(description = "the exception handler\n") Callable<?> handler);

  @DocAnnotation$annotation$(description = " Write some data to the stream. The data is put on an internal write queue, and the write actually happens\n asynchronously. To avoid running out of memory by putting too much on the write queue,\n check the [writeQueueFull](../streams/WriteStream.type.html#writeQueueFull) method before writing. This is done automatically if using a [Pump](../streams/Pump.type.html).\n")
  @TypeInfo("io.vertx.ceylon.core.streams::WriteStream<T>")
  public WriteStream<T> write(
    final @TypeInfo("T") @Name("data")@DocAnnotation$annotation$(description = "the data to write\n") T data);

  @DocAnnotation$annotation$(description = " Ends the stream.\n <p>\n Once the stream has ended, it cannot be used any more.\n")
  @TypeInfo("ceylon.language::Anything")
  public void end();

  @DocAnnotation$annotation$(description = " Same as [end](../streams/WriteStream.type.html#end) but writes some data to the stream before ending.\n")
  @TypeInfo("ceylon.language::Anything")
  public void end(
    final @TypeInfo("T") @Name("t") T t);

  @DocAnnotation$annotation$(description = " Set the maximum size of the write queue to <code>maxSize</code>. You will still be able to write to the stream even\n if there is more than <code>maxSize</code> items in the write queue. This is used as an indicator by classes such as\n <code>Pump</code> to provide flow control.\n <p/>\n The value is defined by the implementation of the stream, e.g in bytes for a\n [NetSocket](../net/NetSocket.type.html), the number of [Message](../eventbus/Message.type.html) for a\n [MessageProducer](../eventbus/MessageProducer.type.html), etc...\n")
  @TypeInfo("io.vertx.ceylon.core.streams::WriteStream<T>")
  public WriteStream<T> setWriteQueueMaxSize(
    final @TypeInfo("ceylon.language::Integer") @Name("maxSize")@DocAnnotation$annotation$(description = "the max size of the write stream\n") long maxSize);

  @DocAnnotation$annotation$(description = " This will return <code>true</code> if there are more bytes in the write queue than the value set using [setWriteQueueMaxSize](../streams/WriteStream.type.html#setWriteQueueMaxSize)\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean writeQueueFull();

  @DocAnnotation$annotation$(description = " Set a drain handler on the stream. If the write queue is full, then the handler will be called when the write\n queue is ready to accept buffers again. See [Pump](../streams/Pump.type.html) for an example of this being used.\n <p/>\n The stream implementation defines when the drain handler, for example it could be when the queue size has been\n reduced to <code>maxSize / 2</code>.\n")
  @TypeInfo("io.vertx.ceylon.core.streams::WriteStream<T>")
  public WriteStream<T> drainHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("handler")@DocAnnotation$annotation$(description = "the handler\n") Callable<?> handler);

  @Ignore
  public class Impl<T> implements WriteStream<T> {
    @Ignore private final TypeDescriptor $TypeDescriptor$;
    @Ignore private final TypeDescriptor $reified$T;
    @Ignore private final io.vertx.core.streams.WriteStream delegate;

    public Impl(@Ignore TypeDescriptor $reified$T, io.vertx.core.streams.WriteStream delegate) {
      this.$TypeDescriptor$ = TypeDescriptor.klass(WriteStream.class, $reified$T);
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

  @DocAnnotation$annotation$(description = " Set an exception handler on the write stream.\n")
  @TypeInfo("io.vertx.ceylon.core.streams::WriteStream<T>")
  public WriteStream<T> exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)?") @Name("handler")@DocAnnotation$annotation$(description = "the exception handler\n") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        handler.$call$((Object)event);
      }
    };
    WriteStream<T> ret = io.vertx.ceylon.core.streams.WriteStream.TO_CEYLON.converter($reified$T).safeConvert(delegate.exceptionHandler(arg_0));
      return this;
    }

  @DocAnnotation$annotation$(description = " Write some data to the stream. The data is put on an internal write queue, and the write actually happens\n asynchronously. To avoid running out of memory by putting too much on the write queue,\n check the [writeQueueFull](../streams/WriteStream.type.html#writeQueueFull) method before writing. This is done automatically if using a [Pump](../streams/Pump.type.html).\n")
  @TypeInfo("io.vertx.ceylon.core.streams::WriteStream<T>")
  public WriteStream<T> write(
    final @TypeInfo("T") @Name("data")@DocAnnotation$annotation$(description = "the data to write\n") T data) {
    java.lang.Object arg_0 = (T)io.vertx.lang.ceylon.VertxTypeDescriptor.getToJava($reified$T).convert(data);
    WriteStream<T> ret = io.vertx.ceylon.core.streams.WriteStream.TO_CEYLON.converter($reified$T).safeConvert(delegate.write(arg_0));
      return this;
    }

  @DocAnnotation$annotation$(description = " Ends the stream.\n <p>\n Once the stream has ended, it cannot be used any more.\n")
  @TypeInfo("ceylon.language::Anything")
  public void end() {
    delegate.end();
    }

  @DocAnnotation$annotation$(description = " Same as [end](../streams/WriteStream.type.html#end) but writes some data to the stream before ending.\n")
  @TypeInfo("ceylon.language::Anything")
  public void end(
    final @TypeInfo("T") @Name("t") T t) {
    java.lang.Object arg_0 = (T)io.vertx.lang.ceylon.VertxTypeDescriptor.getToJava($reified$T).convert(t);
    delegate.end(arg_0);
    }

  @DocAnnotation$annotation$(description = " Set the maximum size of the write queue to <code>maxSize</code>. You will still be able to write to the stream even\n if there is more than <code>maxSize</code> items in the write queue. This is used as an indicator by classes such as\n <code>Pump</code> to provide flow control.\n <p/>\n The value is defined by the implementation of the stream, e.g in bytes for a\n [NetSocket](../net/NetSocket.type.html), the number of [Message](../eventbus/Message.type.html) for a\n [MessageProducer](../eventbus/MessageProducer.type.html), etc...\n")
  @TypeInfo("io.vertx.ceylon.core.streams::WriteStream<T>")
  public WriteStream<T> setWriteQueueMaxSize(
    final @TypeInfo("ceylon.language::Integer") @Name("maxSize")@DocAnnotation$annotation$(description = "the max size of the write stream\n") long maxSize) {
    int arg_0 = (int)maxSize;
    WriteStream<T> ret = io.vertx.ceylon.core.streams.WriteStream.TO_CEYLON.converter($reified$T).safeConvert(delegate.setWriteQueueMaxSize(arg_0));
      return this;
    }

  @DocAnnotation$annotation$(description = " This will return <code>true</code> if there are more bytes in the write queue than the value set using [setWriteQueueMaxSize](../streams/WriteStream.type.html#setWriteQueueMaxSize)\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean writeQueueFull() {
    boolean ret = delegate.writeQueueFull();
      return ret;
    }

  @DocAnnotation$annotation$(description = " Set a drain handler on the stream. If the write queue is full, then the handler will be called when the write\n queue is ready to accept buffers again. See [Pump](../streams/Pump.type.html) for an example of this being used.\n <p/>\n The stream implementation defines when the drain handler, for example it could be when the queue size has been\n reduced to <code>maxSize / 2</code>.\n")
  @TypeInfo("io.vertx.ceylon.core.streams::WriteStream<T>")
  public WriteStream<T> drainHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("handler")@DocAnnotation$annotation$(description = "the handler\n") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        handler.$call$();
      }
    };
    WriteStream<T> ret = io.vertx.ceylon.core.streams.WriteStream.TO_CEYLON.converter($reified$T).safeConvert(delegate.drainHandler(arg_0));
      return this;
    }
  }

}
