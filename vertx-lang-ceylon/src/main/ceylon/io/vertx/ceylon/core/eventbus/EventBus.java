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
import io.vertx.ceylon.core.metrics.Measured;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " A Vert.x event-bus is a light-weight distributed messaging system which allows different parts of your application,\n or different applications and services to communicate with each in a loosely coupled way.\n <p>\n An event-bus supports publish-subscribe messaging, point-to-point messaging and request-response messaging.\n <p>\n Message delivery is best-effort and messages can be lost if failure of all or part of the event bus occurs.\n <p>\n Please refer to the documentation for more information on the event bus.\n")
public class EventBus implements ReifiedType,  Measured {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.eventbus.EventBus, EventBus> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.eventbus.EventBus, EventBus>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.eventbus.EventBus, EventBus> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.eventbus.EventBus, EventBus>() {
        public EventBus convert(io.vertx.core.eventbus.EventBus src) {
          return new EventBus(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<EventBus, io.vertx.core.eventbus.EventBus> TO_JAVA = new io.vertx.lang.ceylon.Converter<EventBus, io.vertx.core.eventbus.EventBus>() {
    public io.vertx.core.eventbus.EventBus convert(EventBus src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(EventBus.class);
  @Ignore private final io.vertx.core.eventbus.EventBus delegate;

  public EventBus(io.vertx.core.eventbus.EventBus delegate) {
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

  @DocAnnotation$annotation$(description = " Whether the metrics are enabled for this measured object\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isMetricsEnabled() {
    boolean ret = delegate.isMetricsEnabled();
    return ret;
  }

  @DocAnnotation$annotation$(description = " Sends a message.\n <p>\n The message will be delivered to at most one of the handlers registered to the address.\n")
  @TypeInfo("io.vertx.ceylon.core.eventbus::EventBus")
  public EventBus send(
    final @TypeInfo("ceylon.language::String") @Name("address") @DocAnnotation$annotation$(description = "todo") ceylon.language.String address, 
    final @TypeInfo("ceylon.language::Object?") @Name("message") @DocAnnotation$annotation$(description = "todo") Object message) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(address);
    java.lang.Object arg_1 = io.vertx.lang.ceylon.ToJava.object(message);
    EventBus ret = io.vertx.ceylon.core.eventbus.EventBus.TO_CEYLON.converter().safeConvert(delegate.send(arg_0, arg_1));
    return this;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Like [EventBus](../eventbus/EventBus.type.html) but specifying a <code>replyHandler</code> that will be called if the recipient\n subsequently replies to the message.\n")
  @TypeInfo("io.vertx.ceylon.core.eventbus::EventBus")
  public <T> EventBus send(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("ceylon.language::String") @Name("address") @DocAnnotation$annotation$(description = "todo") ceylon.language.String address, 
    final @TypeInfo("ceylon.language::Object?") @Name("message") @DocAnnotation$annotation$(description = "todo") Object message, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.eventbus::Message<T>)") @Name("replyHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> replyHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(address);
    java.lang.Object arg_1 = io.vertx.lang.ceylon.ToJava.object(message);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<java.lang.Object>>> arg_2 = replyHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.eventbus.Message<java.lang.Object>>(replyHandler) {
      public Object toCeylon(io.vertx.core.eventbus.Message<java.lang.Object> event) {
        return io.vertx.ceylon.core.eventbus.Message.TO_CEYLON.converter($reified$T).safeConvert(event);
      }
    };
    EventBus ret = io.vertx.ceylon.core.eventbus.EventBus.TO_CEYLON.converter().safeConvert(delegate.send(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Like [EventBus](../eventbus/EventBus.type.html) but specifying <code>options</code> that can be used to configure the delivery.\n")
  @TypeInfo("io.vertx.ceylon.core.eventbus::EventBus")
  public EventBus send(
    final @TypeInfo("ceylon.language::String") @Name("address") @DocAnnotation$annotation$(description = "todo") ceylon.language.String address, 
    final @TypeInfo("ceylon.language::Object?") @Name("message") @DocAnnotation$annotation$(description = "todo") Object message, 
    final @TypeInfo("io.vertx.ceylon.core.eventbus::DeliveryOptions") @Name("options") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.eventbus.DeliveryOptions options) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(address);
    java.lang.Object arg_1 = io.vertx.lang.ceylon.ToJava.object(message);
    io.vertx.core.eventbus.DeliveryOptions arg_2 = options == null ? null : new io.vertx.core.eventbus.DeliveryOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(options.toJson()));
    EventBus ret = io.vertx.ceylon.core.eventbus.EventBus.TO_CEYLON.converter().safeConvert(delegate.send(arg_0, arg_1, arg_2));
    return this;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Like [EventBus](../eventbus/EventBus.type.html) but specifying a <code>replyHandler</code> that will be called if the recipient\n subsequently replies to the message.\n")
  @TypeInfo("io.vertx.ceylon.core.eventbus::EventBus")
  public <T> EventBus send(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("ceylon.language::String") @Name("address") @DocAnnotation$annotation$(description = "todo") ceylon.language.String address, 
    final @TypeInfo("ceylon.language::Object?") @Name("message") @DocAnnotation$annotation$(description = "todo") Object message, 
    final @TypeInfo("io.vertx.ceylon.core.eventbus::DeliveryOptions") @Name("options") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.eventbus.DeliveryOptions options, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.eventbus::Message<T>)") @Name("replyHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> replyHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(address);
    java.lang.Object arg_1 = io.vertx.lang.ceylon.ToJava.object(message);
    io.vertx.core.eventbus.DeliveryOptions arg_2 = options == null ? null : new io.vertx.core.eventbus.DeliveryOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(options.toJson()));
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<java.lang.Object>>> arg_3 = replyHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.eventbus.Message<java.lang.Object>>(replyHandler) {
      public Object toCeylon(io.vertx.core.eventbus.Message<java.lang.Object> event) {
        return io.vertx.ceylon.core.eventbus.Message.TO_CEYLON.converter($reified$T).safeConvert(event);
      }
    };
    EventBus ret = io.vertx.ceylon.core.eventbus.EventBus.TO_CEYLON.converter().safeConvert(delegate.send(arg_0, arg_1, arg_2, arg_3));
    return this;
  }

  @DocAnnotation$annotation$(description = " Publish a message.<p>\n The message will be delivered to all handlers registered to the address.\n")
  @TypeInfo("io.vertx.ceylon.core.eventbus::EventBus")
  public EventBus publish(
    final @TypeInfo("ceylon.language::String") @Name("address") @DocAnnotation$annotation$(description = "todo") ceylon.language.String address, 
    final @TypeInfo("ceylon.language::Object?") @Name("message") @DocAnnotation$annotation$(description = "todo") Object message) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(address);
    java.lang.Object arg_1 = io.vertx.lang.ceylon.ToJava.object(message);
    EventBus ret = io.vertx.ceylon.core.eventbus.EventBus.TO_CEYLON.converter().safeConvert(delegate.publish(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Like [EventBus](../eventbus/EventBus.type.html) but specifying <code>options</code> that can be used to configure the delivery.\n")
  @TypeInfo("io.vertx.ceylon.core.eventbus::EventBus")
  public EventBus publish(
    final @TypeInfo("ceylon.language::String") @Name("address") @DocAnnotation$annotation$(description = "todo") ceylon.language.String address, 
    final @TypeInfo("ceylon.language::Object?") @Name("message") @DocAnnotation$annotation$(description = "todo") Object message, 
    final @TypeInfo("io.vertx.ceylon.core.eventbus::DeliveryOptions") @Name("options") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.eventbus.DeliveryOptions options) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(address);
    java.lang.Object arg_1 = io.vertx.lang.ceylon.ToJava.object(message);
    io.vertx.core.eventbus.DeliveryOptions arg_2 = options == null ? null : new io.vertx.core.eventbus.DeliveryOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(options.toJson()));
    EventBus ret = io.vertx.ceylon.core.eventbus.EventBus.TO_CEYLON.converter().safeConvert(delegate.publish(arg_0, arg_1, arg_2));
    return this;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Create a message consumer against the specified address.\n <p>\n The returned consumer is not yet registered\n at the address, registration will be effective when [MessageConsumer](../eventbus/MessageConsumer.type.html)\n is called.\n")
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageConsumer<T>")
  public <T> MessageConsumer<T> consumer(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("ceylon.language::String") @Name("address") @DocAnnotation$annotation$(description = "todo") ceylon.language.String address) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(address);
    MessageConsumer<T> ret = io.vertx.ceylon.core.eventbus.MessageConsumer.TO_CEYLON.converter($reified$T).safeConvert(delegate.consumer(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Create a consumer and register it against the specified address.\n")
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageConsumer<T>")
  public <T> MessageConsumer<T> consumer(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("ceylon.language::String") @Name("address") @DocAnnotation$annotation$(description = "todo") ceylon.language.String address, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.eventbus::Message<T>)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(address);
    io.vertx.core.Handler<io.vertx.core.eventbus.Message<java.lang.Object>> arg_1 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.eventbus.Message<java.lang.Object>>() {
      public void handle(io.vertx.core.eventbus.Message<java.lang.Object> event) {
        handler.$call$((Object)io.vertx.ceylon.core.eventbus.Message.TO_CEYLON.converter($reified$T).safeConvert(event));
      }
    };
    MessageConsumer<T> ret = io.vertx.ceylon.core.eventbus.MessageConsumer.TO_CEYLON.converter($reified$T).safeConvert(delegate.consumer(arg_0, arg_1));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Like [EventBus](../eventbus/EventBus.type.html) but the address won't be propagated across the cluster.\n")
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageConsumer<T>")
  public <T> MessageConsumer<T> localConsumer(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("ceylon.language::String") @Name("address") @DocAnnotation$annotation$(description = "todo") ceylon.language.String address) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(address);
    MessageConsumer<T> ret = io.vertx.ceylon.core.eventbus.MessageConsumer.TO_CEYLON.converter($reified$T).safeConvert(delegate.localConsumer(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Like [EventBus](../eventbus/EventBus.type.html) but the address won't be propagated across the cluster.\n")
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageConsumer<T>")
  public <T> MessageConsumer<T> localConsumer(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("ceylon.language::String") @Name("address") @DocAnnotation$annotation$(description = "todo") ceylon.language.String address, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.eventbus::Message<T>)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(address);
    io.vertx.core.Handler<io.vertx.core.eventbus.Message<java.lang.Object>> arg_1 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.eventbus.Message<java.lang.Object>>() {
      public void handle(io.vertx.core.eventbus.Message<java.lang.Object> event) {
        handler.$call$((Object)io.vertx.ceylon.core.eventbus.Message.TO_CEYLON.converter($reified$T).safeConvert(event));
      }
    };
    MessageConsumer<T> ret = io.vertx.ceylon.core.eventbus.MessageConsumer.TO_CEYLON.converter($reified$T).safeConvert(delegate.localConsumer(arg_0, arg_1));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Create a message sender against the specified address.\n <p>\n The returned sender will invoke the [EventBus](../eventbus/EventBus.type.html)\n method when the stream [WriteStream](../streams/WriteStream.type.html) method is called with the sender\n address and the provided data.\n")
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageProducer<T>")
  public <T> MessageProducer<T> sender(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("ceylon.language::String") @Name("address") @DocAnnotation$annotation$(description = "todo") ceylon.language.String address) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(address);
    MessageProducer<T> ret = io.vertx.ceylon.core.eventbus.MessageProducer.TO_CEYLON.converter($reified$T).safeConvert(delegate.sender(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Like [EventBus](../eventbus/EventBus.type.html) but specifying delivery options that will be used for configuring the delivery of\n the message.\n")
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageProducer<T>")
  public <T> MessageProducer<T> sender(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("ceylon.language::String") @Name("address") @DocAnnotation$annotation$(description = "todo") ceylon.language.String address, 
    final @TypeInfo("io.vertx.ceylon.core.eventbus::DeliveryOptions") @Name("options") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.eventbus.DeliveryOptions options) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(address);
    io.vertx.core.eventbus.DeliveryOptions arg_1 = options == null ? null : new io.vertx.core.eventbus.DeliveryOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(options.toJson()));
    MessageProducer<T> ret = io.vertx.ceylon.core.eventbus.MessageProducer.TO_CEYLON.converter($reified$T).safeConvert(delegate.sender(arg_0, arg_1));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Create a message publisher against the specified address.\n <p>\n The returned publisher will invoke the [EventBus](../eventbus/EventBus.type.html)\n method when the stream [WriteStream](../streams/WriteStream.type.html) method is called with the publisher\n address and the provided data.\n")
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageProducer<T>")
  public <T> MessageProducer<T> publisher(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("ceylon.language::String") @Name("address") @DocAnnotation$annotation$(description = "todo") ceylon.language.String address) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(address);
    MessageProducer<T> ret = io.vertx.ceylon.core.eventbus.MessageProducer.TO_CEYLON.converter($reified$T).safeConvert(delegate.publisher(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="T",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " Like [EventBus](../eventbus/EventBus.type.html) but specifying delivery options that will be used for configuring the delivery of\n the message.\n")
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageProducer<T>")
  public <T> MessageProducer<T> publisher(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("ceylon.language::String") @Name("address") @DocAnnotation$annotation$(description = "todo") ceylon.language.String address, 
    final @TypeInfo("io.vertx.ceylon.core.eventbus::DeliveryOptions") @Name("options") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.eventbus.DeliveryOptions options) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(address);
    io.vertx.core.eventbus.DeliveryOptions arg_1 = options == null ? null : new io.vertx.core.eventbus.DeliveryOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(options.toJson()));
    MessageProducer<T> ret = io.vertx.ceylon.core.eventbus.MessageProducer.TO_CEYLON.converter($reified$T).safeConvert(delegate.publisher(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Add an interceptor that will be called whenever a message is sent from Vert.x\n")
  @TypeInfo("io.vertx.ceylon.core.eventbus::EventBus")
  public EventBus addInterceptor(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.eventbus::SendContext)") @Name("interceptor") @DocAnnotation$annotation$(description = "todo") Callable<?> interceptor) {
    io.vertx.core.Handler<io.vertx.core.eventbus.SendContext> arg_0 = interceptor == null ? null : new io.vertx.core.Handler<io.vertx.core.eventbus.SendContext>() {
      public void handle(io.vertx.core.eventbus.SendContext event) {
        interceptor.$call$((Object)io.vertx.ceylon.core.eventbus.SendContext.TO_CEYLON.converter().safeConvert(event));
      }
    };
    EventBus ret = io.vertx.ceylon.core.eventbus.EventBus.TO_CEYLON.converter().safeConvert(delegate.addInterceptor(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Remove an interceptor\n")
  @TypeInfo("io.vertx.ceylon.core.eventbus::EventBus")
  public EventBus removeInterceptor(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.eventbus::SendContext)") @Name("interceptor") @DocAnnotation$annotation$(description = "todo") Callable<?> interceptor) {
    io.vertx.core.Handler<io.vertx.core.eventbus.SendContext> arg_0 = interceptor == null ? null : new io.vertx.core.Handler<io.vertx.core.eventbus.SendContext>() {
      public void handle(io.vertx.core.eventbus.SendContext event) {
        interceptor.$call$((Object)io.vertx.ceylon.core.eventbus.SendContext.TO_CEYLON.converter().safeConvert(event));
      }
    };
    EventBus ret = io.vertx.ceylon.core.eventbus.EventBus.TO_CEYLON.converter().safeConvert(delegate.removeInterceptor(arg_0));
    return ret;
  }

}
