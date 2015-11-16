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
@DocAnnotation$annotation$(description = "todo")
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

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isMetricsEnabled() {
    boolean ret = delegate.isMetricsEnabled();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
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
  @DocAnnotation$annotation$(description = "todo")
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

  @DocAnnotation$annotation$(description = "todo")
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
  @DocAnnotation$annotation$(description = "todo")
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

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.eventbus::EventBus")
  public EventBus publish(
    final @TypeInfo("ceylon.language::String") @Name("address") @DocAnnotation$annotation$(description = "todo") ceylon.language.String address, 
    final @TypeInfo("ceylon.language::Object?") @Name("message") @DocAnnotation$annotation$(description = "todo") Object message) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(address);
    java.lang.Object arg_1 = io.vertx.lang.ceylon.ToJava.object(message);
    EventBus ret = io.vertx.ceylon.core.eventbus.EventBus.TO_CEYLON.converter().safeConvert(delegate.publish(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
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
  @DocAnnotation$annotation$(description = "todo")
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
  @DocAnnotation$annotation$(description = "todo")
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
  @DocAnnotation$annotation$(description = "todo")
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
  @DocAnnotation$annotation$(description = "todo")
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
  @DocAnnotation$annotation$(description = "todo")
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
  @DocAnnotation$annotation$(description = "todo")
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
  @DocAnnotation$annotation$(description = "todo")
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
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.eventbus::MessageProducer<T>")
  public <T> MessageProducer<T> publisher(final @Ignore TypeDescriptor $reified$T, 
    final @TypeInfo("ceylon.language::String") @Name("address") @DocAnnotation$annotation$(description = "todo") ceylon.language.String address, 
    final @TypeInfo("io.vertx.ceylon.core.eventbus::DeliveryOptions") @Name("options") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.eventbus.DeliveryOptions options) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(address);
    io.vertx.core.eventbus.DeliveryOptions arg_1 = options == null ? null : new io.vertx.core.eventbus.DeliveryOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(options.toJson()));
    MessageProducer<T> ret = io.vertx.ceylon.core.eventbus.MessageProducer.TO_CEYLON.converter($reified$T).safeConvert(delegate.publisher(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
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

  @DocAnnotation$annotation$(description = "todo")
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
