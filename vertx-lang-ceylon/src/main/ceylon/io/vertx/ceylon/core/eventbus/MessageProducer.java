package io.vertx.ceylon.core.eventbus;

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
import io.vertx.ceylon.core.streams.WriteStream;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@TypeParameters({
  @TypeParameter(value="T",variance=Variance.NONE)
})
@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Represents a stream of message that can be written to.\n <p>\n")
public class MessageProducer<T> implements ReifiedType,  WriteStream<T> {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.eventbus.MessageProducer, MessageProducer> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.eventbus.MessageProducer, MessageProducer>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.eventbus.MessageProducer, MessageProducer> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.eventbus.MessageProducer, MessageProducer>() {
        public MessageProducer convert(io.vertx.core.eventbus.MessageProducer src) {
          return new MessageProducer(descriptors[0], src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<MessageProducer, io.vertx.core.eventbus.MessageProducer> TO_JAVA = new io.vertx.lang.ceylon.Converter<MessageProducer, io.vertx.core.eventbus.MessageProducer>() {
    public io.vertx.core.eventbus.MessageProducer convert(MessageProducer src) {
      return src.delegate;
    }
  };

  @Ignore private final TypeDescriptor $TypeDescriptor$;
  @Ignore private final TypeDescriptor $reified$T;
  @Ignore private final io.vertx.core.eventbus.MessageProducer delegate;

  public MessageProducer(@Ignore TypeDescriptor $reified$T, io.vertx.core.eventbus.MessageProducer delegate) {
    this.$TypeDescriptor$ = TypeDescriptor.klass(MessageProducer.class, $reified$T);
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

  @DocAnnotation$annotation$(description = " Same as [end](../eventbus/MessageProducer.type.html#end) but writes some data to the stream before ending.\n")
  @TypeInfo("ceylon.language::Anything")
  public void end(
    final @TypeInfo("T?") @Name("t")  T t) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(t);
    delegate.end(arg_0);
  }

  @DocAnnotation$annotation$(description = " This will return <code>true</code> if there are more bytes in the write queue than the value set using [setWriteQueueMaxSize](../eventbus/MessageProducer.type.html#setWriteQueueMaxSize)\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean writeQueueFull() {
    boolean ret = delegate.writeQueueFull();
    return ret;
  }

  @DocAnnotation$annotation$(description = " Synonym for [write](../eventbus/MessageProducer.type.html#write).\n")
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageProducer<T>")
  public MessageProducer<T> send(
    final @TypeInfo("T?") @Name("message") @DocAnnotation$annotation$(description = "the message to send\n") T message) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(message);
    MessageProducer<T> ret = io.vertx.ceylon.core.eventbus.MessageProducer.TO_CEYLON.converter($reified$T).safeConvert(delegate.send(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="R",variance=Variance.NONE)
  })
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageProducer<T>")
  public <R> MessageProducer<T> send(final @Ignore TypeDescriptor $reified$R, 
    final @TypeInfo("T?") @Name("message")  T message, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.eventbus::Message<R>)") @Name("replyHandler")  Callable<?> replyHandler) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(message);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<java.lang.Object>>> arg_1 = replyHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.core.eventbus.Message<java.lang.Object>>(replyHandler) {
      public Object toCeylon(io.vertx.core.eventbus.Message<java.lang.Object> event) {
        return io.vertx.ceylon.core.eventbus.Message.TO_CEYLON.converter($reified$R).safeConvert(event);
      }
    };
    MessageProducer<T> ret = io.vertx.ceylon.core.eventbus.MessageProducer.TO_CEYLON.converter($reified$T).safeConvert(delegate.send(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageProducer<T>")
  public MessageProducer<T> exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)?") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        handler.$call$((Object)event);
      }
    };
    MessageProducer<T> ret = io.vertx.ceylon.core.eventbus.MessageProducer.TO_CEYLON.converter($reified$T).safeConvert(delegate.exceptionHandler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageProducer<T>")
  public MessageProducer<T> write(
    final @TypeInfo("T?") @Name("data")  T data) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(data);
    MessageProducer<T> ret = io.vertx.ceylon.core.eventbus.MessageProducer.TO_CEYLON.converter($reified$T).safeConvert(delegate.write(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageProducer<T>")
  public MessageProducer<T> setWriteQueueMaxSize(
    final @TypeInfo("ceylon.language::Integer") @Name("maxSize")  long maxSize) {
    int arg_0 = (int)maxSize;
    MessageProducer<T> ret = io.vertx.ceylon.core.eventbus.MessageProducer.TO_CEYLON.converter($reified$T).safeConvert(delegate.setWriteQueueMaxSize(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageProducer<T>")
  public MessageProducer<T> drainHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        handler.$call$();
      }
    };
    MessageProducer<T> ret = io.vertx.ceylon.core.eventbus.MessageProducer.TO_CEYLON.converter($reified$T).safeConvert(delegate.drainHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Update the delivery options of this producer.\n")
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageProducer<T>")
  public MessageProducer<T> deliveryOptions(
    final @TypeInfo("io.vertx.ceylon.core.eventbus::DeliveryOptions") @Name("options") @DocAnnotation$annotation$(description = "the new options\n") io.vertx.ceylon.core.eventbus.DeliveryOptions options) {
    io.vertx.core.eventbus.DeliveryOptions arg_0 = options == null ? null : new io.vertx.core.eventbus.DeliveryOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(options.toJson()));
    MessageProducer<T> ret = io.vertx.ceylon.core.eventbus.MessageProducer.TO_CEYLON.converter($reified$T).safeConvert(delegate.deliveryOptions(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " @return The address to which the producer produces messages.\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String address() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.address());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Closes the producer, calls [close](../eventbus/MessageProducer.type.html#close)\n")
  @TypeInfo("ceylon.language::Anything")
  public void end() {
    delegate.end();
  }

  @DocAnnotation$annotation$(description = " Closes the producer, this method should be called when the message producer is not used anymore.\n")
  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

}
