package io.vertx.ceylon.core.eventbus;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.ceylon.core.streams.WriteStream;
import io.vertx.core.Handler;

@TypeParameters({
  @TypeParameter(value="T",variance=Variance.NONE)
})
@DocAnnotation$annotation$(description = "todo")
public class MessageProducer<T> implements WriteStream<T> {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(MessageProducer.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.eventbus.MessageProducer, MessageProducer> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.eventbus.MessageProducer, MessageProducer>() {
    public MessageProducer convert(io.vertx.core.eventbus.MessageProducer src) {
      return new MessageProducer(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<MessageProducer, io.vertx.core.eventbus.MessageProducer> TO_JAVA = new io.vertx.lang.ceylon.Converter<MessageProducer, io.vertx.core.eventbus.MessageProducer>() {
    public io.vertx.core.eventbus.MessageProducer convert(MessageProducer src) {
      return src.delegate;
    }
  };

  @Ignore private final io.vertx.core.eventbus.MessageProducer delegate;

  public MessageProducer(io.vertx.core.eventbus.MessageProducer delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean writeQueueFull() {
    boolean ret = delegate.writeQueueFull();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageProducer<T>")
  public MessageProducer<T> exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)?") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        handler.$call$((Object)event);
      }
    };
    MessageProducer<T> ret = io.vertx.ceylon.core.eventbus.MessageProducer.TO_CEYLON.safeConvert(delegate.exceptionHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageProducer<T>")
  public MessageProducer<T> write(
    final @TypeInfo("T?") @DocAnnotation$annotation$(description = "todo") T data) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(data);
    MessageProducer<T> ret = io.vertx.ceylon.core.eventbus.MessageProducer.TO_CEYLON.safeConvert(delegate.write(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageProducer<T>")
  public MessageProducer<T> setWriteQueueMaxSize(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long maxSize) {
    int arg_0 = (int)maxSize;
    MessageProducer<T> ret = io.vertx.ceylon.core.eventbus.MessageProducer.TO_CEYLON.safeConvert(delegate.setWriteQueueMaxSize(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageProducer<T>")
  public MessageProducer<T> drainHandler(
    final @TypeInfo("ceylon.language::Anything()?") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        handler.$call$();
      }
    };
    MessageProducer<T> ret = io.vertx.ceylon.core.eventbus.MessageProducer.TO_CEYLON.safeConvert(delegate.drainHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageProducer<T>")
  public MessageProducer<T> deliveryOptions(
    final @TypeInfo("io.vertx.ceylon.core.eventbus::DeliveryOptions") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.eventbus.DeliveryOptions options) {
    io.vertx.core.eventbus.DeliveryOptions arg_0 = options == null ? null : new io.vertx.core.eventbus.DeliveryOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(options.toJson()));
    MessageProducer<T> ret = io.vertx.ceylon.core.eventbus.MessageProducer.TO_CEYLON.safeConvert(delegate.deliveryOptions(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String address() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.address());
    return ret;
  }

}
