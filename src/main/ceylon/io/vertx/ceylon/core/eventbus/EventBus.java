package io.vertx.ceylon.core.eventbus;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.ceylon.core.metrics.Measured;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@DocAnnotation$annotation$(description = "todo")
public class EventBus implements Measured {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(EventBus.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.eventbus.EventBus, EventBus> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.eventbus.EventBus, EventBus>() {
    public EventBus convert(io.vertx.core.eventbus.EventBus src) {
      return new EventBus(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<EventBus, io.vertx.core.eventbus.EventBus> TO_JAVA = new io.vertx.lang.ceylon.Converter<EventBus, io.vertx.core.eventbus.EventBus>() {
    public io.vertx.core.eventbus.EventBus convert(EventBus src) {
      return src.delegate;
    }
  };

  @Ignore
  private final io.vertx.core.eventbus.EventBus delegate;

  public EventBus(io.vertx.core.eventbus.EventBus delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isMetricsEnabled() {
    boolean ret = delegate.isMetricsEnabled();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.eventbus::EventBus")
  public EventBus send(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String address, 
    final @TypeInfo("ceylon.language::Object") @DocAnnotation$annotation$(description = "todo") Object message) {
    java.lang.String arg_0 = address.toString();
    java.lang.Object arg_1 = io.vertx.lang.ceylon.Helper.toJavaObject(message);
    EventBus ret = io.vertx.ceylon.core.eventbus.EventBus.TO_CEYLON.convert(delegate.send(arg_0, arg_1));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.eventbus::EventBus")
  public <T> EventBus send(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String address, 
    final @TypeInfo("ceylon.language::Object") @DocAnnotation$annotation$(description = "todo") Object message, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.eventbus::Message<T>)") @DocAnnotation$annotation$(description = "todo") Callable<?> replyHandler) {
    java.lang.String arg_0 = address.toString();
    java.lang.Object arg_1 = io.vertx.lang.ceylon.Helper.toJavaObject(message);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<java.lang.Object>>> arg_2 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.eventbus.Message<java.lang.Object>>(replyHandler) { public Object toCeylon(io.vertx.core.eventbus.Message<java.lang.Object> event) { return io.vertx.ceylon.core.eventbus.Message.TO_CEYLON.convert(event); } };
    EventBus ret = io.vertx.ceylon.core.eventbus.EventBus.TO_CEYLON.convert(delegate.send(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.eventbus::EventBus")
  public EventBus send(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String address, 
    final @TypeInfo("ceylon.language::Object") @DocAnnotation$annotation$(description = "todo") Object message, 
    final @TypeInfo("io.vertx.ceylon.core.eventbus::DeliveryOptions") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.eventbus.DeliveryOptions options) {
    java.lang.String arg_0 = address.toString();
    java.lang.Object arg_1 = io.vertx.lang.ceylon.Helper.toJavaObject(message);
    io.vertx.core.eventbus.DeliveryOptions arg_2 = options == null ? null : new io.vertx.core.eventbus.DeliveryOptions(io.vertx.lang.ceylon.Helper.toJsonObject(options.toJson()));
    EventBus ret = io.vertx.ceylon.core.eventbus.EventBus.TO_CEYLON.convert(delegate.send(arg_0, arg_1, arg_2));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.eventbus::EventBus")
  public <T> EventBus send(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String address, 
    final @TypeInfo("ceylon.language::Object") @DocAnnotation$annotation$(description = "todo") Object message, 
    final @TypeInfo("io.vertx.ceylon.core.eventbus::DeliveryOptions") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.eventbus.DeliveryOptions options, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.eventbus::Message<T>)") @DocAnnotation$annotation$(description = "todo") Callable<?> replyHandler) {
    java.lang.String arg_0 = address.toString();
    java.lang.Object arg_1 = io.vertx.lang.ceylon.Helper.toJavaObject(message);
    io.vertx.core.eventbus.DeliveryOptions arg_2 = options == null ? null : new io.vertx.core.eventbus.DeliveryOptions(io.vertx.lang.ceylon.Helper.toJsonObject(options.toJson()));
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<java.lang.Object>>> arg_3 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.eventbus.Message<java.lang.Object>>(replyHandler) { public Object toCeylon(io.vertx.core.eventbus.Message<java.lang.Object> event) { return io.vertx.ceylon.core.eventbus.Message.TO_CEYLON.convert(event); } };
    EventBus ret = io.vertx.ceylon.core.eventbus.EventBus.TO_CEYLON.convert(delegate.send(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.eventbus::EventBus")
  public EventBus publish(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String address, 
    final @TypeInfo("ceylon.language::Object") @DocAnnotation$annotation$(description = "todo") Object message) {
    java.lang.String arg_0 = address.toString();
    java.lang.Object arg_1 = io.vertx.lang.ceylon.Helper.toJavaObject(message);
    EventBus ret = io.vertx.ceylon.core.eventbus.EventBus.TO_CEYLON.convert(delegate.publish(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.eventbus::EventBus")
  public EventBus publish(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String address, 
    final @TypeInfo("ceylon.language::Object") @DocAnnotation$annotation$(description = "todo") Object message, 
    final @TypeInfo("io.vertx.ceylon.core.eventbus::DeliveryOptions") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.eventbus.DeliveryOptions options) {
    java.lang.String arg_0 = address.toString();
    java.lang.Object arg_1 = io.vertx.lang.ceylon.Helper.toJavaObject(message);
    io.vertx.core.eventbus.DeliveryOptions arg_2 = options == null ? null : new io.vertx.core.eventbus.DeliveryOptions(io.vertx.lang.ceylon.Helper.toJsonObject(options.toJson()));
    EventBus ret = io.vertx.ceylon.core.eventbus.EventBus.TO_CEYLON.convert(delegate.publish(arg_0, arg_1, arg_2));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageConsumer<T>")
  public <T> MessageConsumer<T> consumer(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String address) {
    java.lang.String arg_0 = address.toString();
    MessageConsumer<T> ret = io.vertx.ceylon.core.eventbus.MessageConsumer.TO_CEYLON.convert(delegate.consumer(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageConsumer<T>")
  public <T> MessageConsumer<T> consumer(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String address, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.eventbus::Message<T>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = address.toString();
    io.vertx.core.Handler<io.vertx.core.eventbus.Message<java.lang.Object>> arg_1 = new io.vertx.core.Handler<io.vertx.core.eventbus.Message<java.lang.Object>>() { public void handle(io.vertx.core.eventbus.Message<java.lang.Object> event) { handler.$call$((Object)io.vertx.ceylon.core.eventbus.Message.TO_CEYLON.convert(event)); } };
    MessageConsumer<T> ret = io.vertx.ceylon.core.eventbus.MessageConsumer.TO_CEYLON.convert(delegate.consumer(arg_0, arg_1));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageConsumer<T>")
  public <T> MessageConsumer<T> localConsumer(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String address) {
    java.lang.String arg_0 = address.toString();
    MessageConsumer<T> ret = io.vertx.ceylon.core.eventbus.MessageConsumer.TO_CEYLON.convert(delegate.localConsumer(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageConsumer<T>")
  public <T> MessageConsumer<T> localConsumer(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String address, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.eventbus::Message<T>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = address.toString();
    io.vertx.core.Handler<io.vertx.core.eventbus.Message<java.lang.Object>> arg_1 = new io.vertx.core.Handler<io.vertx.core.eventbus.Message<java.lang.Object>>() { public void handle(io.vertx.core.eventbus.Message<java.lang.Object> event) { handler.$call$((Object)io.vertx.ceylon.core.eventbus.Message.TO_CEYLON.convert(event)); } };
    MessageConsumer<T> ret = io.vertx.ceylon.core.eventbus.MessageConsumer.TO_CEYLON.convert(delegate.localConsumer(arg_0, arg_1));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageProducer<T>")
  public <T> MessageProducer<T> sender(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String address) {
    java.lang.String arg_0 = address.toString();
    MessageProducer<T> ret = io.vertx.ceylon.core.eventbus.MessageProducer.TO_CEYLON.convert(delegate.sender(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageProducer<T>")
  public <T> MessageProducer<T> sender(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String address, 
    final @TypeInfo("io.vertx.ceylon.core.eventbus::DeliveryOptions") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.eventbus.DeliveryOptions options) {
    java.lang.String arg_0 = address.toString();
    io.vertx.core.eventbus.DeliveryOptions arg_1 = options == null ? null : new io.vertx.core.eventbus.DeliveryOptions(io.vertx.lang.ceylon.Helper.toJsonObject(options.toJson()));
    MessageProducer<T> ret = io.vertx.ceylon.core.eventbus.MessageProducer.TO_CEYLON.convert(delegate.sender(arg_0, arg_1));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageProducer<T>")
  public <T> MessageProducer<T> publisher(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String address) {
    java.lang.String arg_0 = address.toString();
    MessageProducer<T> ret = io.vertx.ceylon.core.eventbus.MessageProducer.TO_CEYLON.convert(delegate.publisher(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageProducer<T>")
  public <T> MessageProducer<T> publisher(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String address, 
    final @TypeInfo("io.vertx.ceylon.core.eventbus::DeliveryOptions") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.eventbus.DeliveryOptions options) {
    java.lang.String arg_0 = address.toString();
    io.vertx.core.eventbus.DeliveryOptions arg_1 = options == null ? null : new io.vertx.core.eventbus.DeliveryOptions(io.vertx.lang.ceylon.Helper.toJsonObject(options.toJson()));
    MessageProducer<T> ret = io.vertx.ceylon.core.eventbus.MessageProducer.TO_CEYLON.convert(delegate.publisher(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void close(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @DocAnnotation$annotation$(description = "todo") Callable<?> completionHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(completionHandler) { public Object toCeylon(java.lang.Void event) { return null; } };
    delegate.close(arg_0);
  }

}
