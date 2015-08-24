package io.vertx.ceylon.core.eventbus;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;
import io.vertx.ceylon.core.streams.WriteStream;
import io.vertx.core.Handler;

@TypeParameters({
  @TypeParameter(value="T",variance=Variance.NONE)
})
public class MessageProducer<T> implements WriteStream<T> {

  private final io.vertx.core.eventbus.MessageProducer delegate;

  public MessageProducer(io.vertx.core.eventbus.MessageProducer delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  @TypeInfo("ceylon.language::Boolean")
  public boolean writeQueueFull() {
    boolean ret = delegate.writeQueueFull();
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageProducer<T>")
  public MessageProducer<T> exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = new io.vertx.core.Handler<java.lang.Throwable>() { public void handle(java.lang.Throwable event) { handler.$call$((Object)event); } };
    MessageProducer<T> ret = new io.vertx.ceylon.core.eventbus.MessageProducer(delegate.exceptionHandler(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageProducer<T>")
  public MessageProducer<T> write(
    final @TypeInfo("T") T data) {
    java.lang.Object arg_0 = null;
    MessageProducer<T> ret = new io.vertx.ceylon.core.eventbus.MessageProducer(delegate.write(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageProducer<T>")
  public MessageProducer<T> setWriteQueueMaxSize(
    final @TypeInfo("ceylon.language::Integer") long maxSize) {
    int arg_0 = (int)maxSize;
    MessageProducer<T> ret = new io.vertx.ceylon.core.eventbus.MessageProducer(delegate.setWriteQueueMaxSize(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageProducer<T>")
  public MessageProducer<T> drainHandler(
    final @TypeInfo("ceylon.language::Anything()") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { handler.$call$((Object)null); } };
    MessageProducer<T> ret = new io.vertx.ceylon.core.eventbus.MessageProducer(delegate.drainHandler(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageProducer<T>")
  public MessageProducer<T> deliveryOptions(
    final @TypeInfo("ceylon.language::Object") Object options) {
    io.vertx.core.eventbus.DeliveryOptions arg_0 = null;
    MessageProducer<T> ret = new io.vertx.ceylon.core.eventbus.MessageProducer(delegate.deliveryOptions(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String address() {
    ceylon.language.String ret = new ceylon.language.String(delegate.address());
    return ret;
  }

}
