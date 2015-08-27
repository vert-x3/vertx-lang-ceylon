package io.vertx.ceylon.core.eventbus;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;
import io.vertx.ceylon.core.metrics.Measured;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

public class EventBus implements Measured {

  private final io.vertx.core.eventbus.EventBus delegate;

  public EventBus(io.vertx.core.eventbus.EventBus delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  @TypeInfo("ceylon.language::Boolean")
  public boolean isMetricsEnabled() {
    boolean ret = delegate.isMetricsEnabled();
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.eventbus::EventBus")
  public EventBus send(
    final @TypeInfo("ceylon.language::String") ceylon.language.String address, 
    final @TypeInfo("ceylon.language::Object") Object message) {
    java.lang.String arg_0 = address.toString();
    java.lang.Object arg_1 = io.vertx.lang.ceylon.Helper.toJavaObject(message);
    EventBus ret = new io.vertx.ceylon.core.eventbus.EventBus(delegate.send(arg_0, arg_1));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @TypeInfo("io.vertx.ceylon.core.eventbus::EventBus")
  public <T> EventBus send(
    final @TypeInfo("ceylon.language::String") ceylon.language.String address, 
    final @TypeInfo("ceylon.language::Object") Object message, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.eventbus::Message<T>)") Callable<?> replyHandler) {
    java.lang.String arg_0 = address.toString();
    java.lang.Object arg_1 = io.vertx.lang.ceylon.Helper.toJavaObject(message);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<java.lang.Object>>> arg_2 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.eventbus.Message<java.lang.Object>>(replyHandler) { public Object toCeylon(io.vertx.core.eventbus.Message<java.lang.Object> event) { return new io.vertx.ceylon.core.eventbus.Message(event); } };
    EventBus ret = new io.vertx.ceylon.core.eventbus.EventBus(delegate.send(arg_0, arg_1, arg_2));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.eventbus::EventBus")
  public EventBus send(
    final @TypeInfo("ceylon.language::String") ceylon.language.String address, 
    final @TypeInfo("ceylon.language::Object") Object message, 
    final @TypeInfo("io.vertx.ceylon.core.eventbus::DeliveryOptions") io.vertx.ceylon.core.eventbus.DeliveryOptions options) {
    java.lang.String arg_0 = address.toString();
    java.lang.Object arg_1 = io.vertx.lang.ceylon.Helper.toJavaObject(message);
    io.vertx.core.eventbus.DeliveryOptions arg_2 = options == null ? null : new io.vertx.core.eventbus.DeliveryOptions(io.vertx.lang.ceylon.Helper.toJsonObject(options.toJson()));
    EventBus ret = new io.vertx.ceylon.core.eventbus.EventBus(delegate.send(arg_0, arg_1, arg_2));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @TypeInfo("io.vertx.ceylon.core.eventbus::EventBus")
  public <T> EventBus send(
    final @TypeInfo("ceylon.language::String") ceylon.language.String address, 
    final @TypeInfo("ceylon.language::Object") Object message, 
    final @TypeInfo("io.vertx.ceylon.core.eventbus::DeliveryOptions") io.vertx.ceylon.core.eventbus.DeliveryOptions options, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.eventbus::Message<T>)") Callable<?> replyHandler) {
    java.lang.String arg_0 = address.toString();
    java.lang.Object arg_1 = io.vertx.lang.ceylon.Helper.toJavaObject(message);
    io.vertx.core.eventbus.DeliveryOptions arg_2 = options == null ? null : new io.vertx.core.eventbus.DeliveryOptions(io.vertx.lang.ceylon.Helper.toJsonObject(options.toJson()));
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<java.lang.Object>>> arg_3 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.eventbus.Message<java.lang.Object>>(replyHandler) { public Object toCeylon(io.vertx.core.eventbus.Message<java.lang.Object> event) { return new io.vertx.ceylon.core.eventbus.Message(event); } };
    EventBus ret = new io.vertx.ceylon.core.eventbus.EventBus(delegate.send(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.eventbus::EventBus")
  public EventBus publish(
    final @TypeInfo("ceylon.language::String") ceylon.language.String address, 
    final @TypeInfo("ceylon.language::Object") Object message) {
    java.lang.String arg_0 = address.toString();
    java.lang.Object arg_1 = io.vertx.lang.ceylon.Helper.toJavaObject(message);
    EventBus ret = new io.vertx.ceylon.core.eventbus.EventBus(delegate.publish(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.eventbus::EventBus")
  public EventBus publish(
    final @TypeInfo("ceylon.language::String") ceylon.language.String address, 
    final @TypeInfo("ceylon.language::Object") Object message, 
    final @TypeInfo("io.vertx.ceylon.core.eventbus::DeliveryOptions") io.vertx.ceylon.core.eventbus.DeliveryOptions options) {
    java.lang.String arg_0 = address.toString();
    java.lang.Object arg_1 = io.vertx.lang.ceylon.Helper.toJavaObject(message);
    io.vertx.core.eventbus.DeliveryOptions arg_2 = options == null ? null : new io.vertx.core.eventbus.DeliveryOptions(io.vertx.lang.ceylon.Helper.toJsonObject(options.toJson()));
    EventBus ret = new io.vertx.ceylon.core.eventbus.EventBus(delegate.publish(arg_0, arg_1, arg_2));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageConsumer<T>")
  public <T> MessageConsumer<T> consumer(
    final @TypeInfo("ceylon.language::String") ceylon.language.String address) {
    java.lang.String arg_0 = address.toString();
    MessageConsumer<T> ret = new io.vertx.ceylon.core.eventbus.MessageConsumer(delegate.consumer(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageConsumer<T>")
  public <T> MessageConsumer<T> consumer(
    final @TypeInfo("ceylon.language::String") ceylon.language.String address, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.eventbus::Message<T>)") Callable<?> handler) {
    java.lang.String arg_0 = address.toString();
    io.vertx.core.Handler<io.vertx.core.eventbus.Message<java.lang.Object>> arg_1 = new io.vertx.core.Handler<io.vertx.core.eventbus.Message<java.lang.Object>>() { public void handle(io.vertx.core.eventbus.Message<java.lang.Object> event) { handler.$call$((Object)new io.vertx.ceylon.core.eventbus.Message(event)); } };
    MessageConsumer<T> ret = new io.vertx.ceylon.core.eventbus.MessageConsumer(delegate.consumer(arg_0, arg_1));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageConsumer<T>")
  public <T> MessageConsumer<T> localConsumer(
    final @TypeInfo("ceylon.language::String") ceylon.language.String address) {
    java.lang.String arg_0 = address.toString();
    MessageConsumer<T> ret = new io.vertx.ceylon.core.eventbus.MessageConsumer(delegate.localConsumer(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageConsumer<T>")
  public <T> MessageConsumer<T> localConsumer(
    final @TypeInfo("ceylon.language::String") ceylon.language.String address, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.eventbus::Message<T>)") Callable<?> handler) {
    java.lang.String arg_0 = address.toString();
    io.vertx.core.Handler<io.vertx.core.eventbus.Message<java.lang.Object>> arg_1 = new io.vertx.core.Handler<io.vertx.core.eventbus.Message<java.lang.Object>>() { public void handle(io.vertx.core.eventbus.Message<java.lang.Object> event) { handler.$call$((Object)new io.vertx.ceylon.core.eventbus.Message(event)); } };
    MessageConsumer<T> ret = new io.vertx.ceylon.core.eventbus.MessageConsumer(delegate.localConsumer(arg_0, arg_1));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageProducer<T>")
  public <T> MessageProducer<T> sender(
    final @TypeInfo("ceylon.language::String") ceylon.language.String address) {
    java.lang.String arg_0 = address.toString();
    MessageProducer<T> ret = new io.vertx.ceylon.core.eventbus.MessageProducer(delegate.sender(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageProducer<T>")
  public <T> MessageProducer<T> sender(
    final @TypeInfo("ceylon.language::String") ceylon.language.String address, 
    final @TypeInfo("io.vertx.ceylon.core.eventbus::DeliveryOptions") io.vertx.ceylon.core.eventbus.DeliveryOptions options) {
    java.lang.String arg_0 = address.toString();
    io.vertx.core.eventbus.DeliveryOptions arg_1 = options == null ? null : new io.vertx.core.eventbus.DeliveryOptions(io.vertx.lang.ceylon.Helper.toJsonObject(options.toJson()));
    MessageProducer<T> ret = new io.vertx.ceylon.core.eventbus.MessageProducer(delegate.sender(arg_0, arg_1));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageProducer<T>")
  public <T> MessageProducer<T> publisher(
    final @TypeInfo("ceylon.language::String") ceylon.language.String address) {
    java.lang.String arg_0 = address.toString();
    MessageProducer<T> ret = new io.vertx.ceylon.core.eventbus.MessageProducer(delegate.publisher(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageProducer<T>")
  public <T> MessageProducer<T> publisher(
    final @TypeInfo("ceylon.language::String") ceylon.language.String address, 
    final @TypeInfo("io.vertx.ceylon.core.eventbus::DeliveryOptions") io.vertx.ceylon.core.eventbus.DeliveryOptions options) {
    java.lang.String arg_0 = address.toString();
    io.vertx.core.eventbus.DeliveryOptions arg_1 = options == null ? null : new io.vertx.core.eventbus.DeliveryOptions(io.vertx.lang.ceylon.Helper.toJsonObject(options.toJson()));
    MessageProducer<T> ret = new io.vertx.ceylon.core.eventbus.MessageProducer(delegate.publisher(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("ceylon.language::Anything")
  public void close(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") Callable<?> completionHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(completionHandler) { public Object toCeylon(java.lang.Void event) { return null; } };
    delegate.close(arg_0);
  }

}
