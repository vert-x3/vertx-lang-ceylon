package io.vertx.ceylon.core.eventbus;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.ceylon.core.MultiMap;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@TypeParameters({
  @TypeParameter(value="T",variance=Variance.NONE)
})
@DocAnnotation$annotation$(description = "todo")
public class Message<T> {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(Message.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.eventbus.Message, Message> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.eventbus.Message, Message>() {
    public Message convert(io.vertx.core.eventbus.Message src) {
      return new Message(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<Message, io.vertx.core.eventbus.Message> TO_JAVA = new io.vertx.lang.ceylon.Converter<Message, io.vertx.core.eventbus.Message>() {
    public io.vertx.core.eventbus.Message convert(Message src) {
      return src.delegate;
    }
  };

  @Ignore private T cached_body;
  @Ignore private final io.vertx.core.eventbus.Message delegate;

  public Message(io.vertx.core.eventbus.Message delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String address() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.address());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap headers() {
    MultiMap ret = io.vertx.ceylon.core.MultiMap.TO_CEYLON.safeConvert(delegate.headers());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("T")
  public T body() {
    if (cached_body != null) {
      return cached_body;
    }
    T ret = io.vertx.lang.ceylon.ToCeylon.object(delegate.body());
     cached_body = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String replyAddress() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.replyAddress());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void reply(
    final @TypeInfo("ceylon.language::Object") @DocAnnotation$annotation$(description = "todo") Object message) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(message);
    delegate.reply(arg_0);
  }

  @TypeParameters({
    @TypeParameter(value="R",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public <R> void reply(
    final @TypeInfo("ceylon.language::Object") @DocAnnotation$annotation$(description = "todo") Object message, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.eventbus::Message<R>)") @DocAnnotation$annotation$(description = "todo") Callable<?> replyHandler) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(message);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<java.lang.Object>>> arg_1 = replyHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.eventbus.Message<java.lang.Object>>(replyHandler) {
      public Object toCeylon(io.vertx.core.eventbus.Message<java.lang.Object> event) {
        return io.vertx.ceylon.core.eventbus.Message.TO_CEYLON.safeConvert(event);
      }
    };
    delegate.reply(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void reply(
    final @TypeInfo("ceylon.language::Object") @DocAnnotation$annotation$(description = "todo") Object message, 
    final @TypeInfo("io.vertx.ceylon.core.eventbus::DeliveryOptions") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.eventbus.DeliveryOptions options) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(message);
    io.vertx.core.eventbus.DeliveryOptions arg_1 = options == null ? null : new io.vertx.core.eventbus.DeliveryOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(options.toJson()));
    delegate.reply(arg_0, arg_1);
  }

  @TypeParameters({
    @TypeParameter(value="R",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public <R> void reply(
    final @TypeInfo("ceylon.language::Object") @DocAnnotation$annotation$(description = "todo") Object message, 
    final @TypeInfo("io.vertx.ceylon.core.eventbus::DeliveryOptions") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.eventbus.DeliveryOptions options, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.eventbus::Message<R>)") @DocAnnotation$annotation$(description = "todo") Callable<?> replyHandler) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(message);
    io.vertx.core.eventbus.DeliveryOptions arg_1 = options == null ? null : new io.vertx.core.eventbus.DeliveryOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(options.toJson()));
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<java.lang.Object>>> arg_2 = replyHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.eventbus.Message<java.lang.Object>>(replyHandler) {
      public Object toCeylon(io.vertx.core.eventbus.Message<java.lang.Object> event) {
        return io.vertx.ceylon.core.eventbus.Message.TO_CEYLON.safeConvert(event);
      }
    };
    delegate.reply(arg_0, arg_1, arg_2);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void fail(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long failureCode, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String message) {
    int arg_0 = (int)failureCode;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(message);
    delegate.fail(arg_0, arg_1);
  }

}
