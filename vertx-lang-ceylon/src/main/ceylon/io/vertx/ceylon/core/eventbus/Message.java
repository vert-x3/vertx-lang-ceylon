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
import io.vertx.ceylon.core.MultiMap;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@TypeParameters({
  @TypeParameter(value="T",variance=Variance.NONE)
})
@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Represents a message that is received from the event bus in a handler.\n <p>\n Messages have a [body](../eventbus/Message.type.html#body), which can be null, and also [headers](../eventbus/Message.type.html#headers), which can be empty.\n <p>\n If the message was sent specifying a reply handler, it can be replied to using [reply](../eventbus/Message.type.html#reply).\n <p>\n If you want to notify the sender that processing failed, then [fail](../eventbus/Message.type.html#fail) can be called.\n")
public class Message<T> implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.eventbus.Message, Message> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.eventbus.Message, Message>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.eventbus.Message, Message> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.eventbus.Message, Message>() {
        public Message convert(io.vertx.core.eventbus.Message src) {
          return new Message(descriptors[0], src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<Message, io.vertx.core.eventbus.Message> TO_JAVA = new io.vertx.lang.ceylon.Converter<Message, io.vertx.core.eventbus.Message>() {
    public io.vertx.core.eventbus.Message convert(Message src) {
      return src.delegate;
    }
  };

  @Ignore private T cached_body;
  @Ignore private final TypeDescriptor $TypeDescriptor$;
  @Ignore private final TypeDescriptor $reified$T;
  @Ignore private final io.vertx.core.eventbus.Message delegate;

  public Message(@Ignore TypeDescriptor $reified$T, io.vertx.core.eventbus.Message delegate) {
    this.$TypeDescriptor$ = TypeDescriptor.klass(Message.class, $reified$T);
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

  @DocAnnotation$annotation$(description = " The address the message was sent to\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String address() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.address());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Multi-map of message headers. Can be empty\n")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap headers() {
    MultiMap ret = io.vertx.ceylon.core.MultiMap.TO_CEYLON.converter().safeConvert(delegate.headers());
    return ret;
  }

  @DocAnnotation$annotation$(description = " The body of the message. Can be null.\n")
  @TypeInfo("T")
  public T body() {
    if (cached_body != null) {
      return cached_body;
    }
    T ret = (T)io.vertx.lang.ceylon.VertxTypeDescriptor.getToCeylon($reified$T).convert(delegate.body());
    cached_body = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = " The reply address. Can be null.\n")
  @TypeInfo("ceylon.language::String?")
  public ceylon.language.String replyAddress() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.replyAddress());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Signals if this message represents a send or publish event.\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean $isSend() {
    boolean ret = delegate.isSend();
    return ret;
  }

  @DocAnnotation$annotation$(description = " Reply to this message.\n <p>\n If the message was sent specifying a reply handler, that handler will be\n called when it has received a reply. If the message wasn't sent specifying a receipt handler\n this method does nothing.\n")
  @TypeInfo("ceylon.language::Anything")
  public void reply(
    final @TypeInfo("ceylon.language::Object?") @Name("message")@DocAnnotation$annotation$(description = "the message to reply with.\n") Object message) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(message);
    delegate.reply(arg_0);
  }

  @TypeParameters({
    @TypeParameter(value="R",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " The same as <code>reply(R message)</code> but you can specify handler for the reply - i.e.\n to receive the reply to the reply.\n")
  @TypeInfo("ceylon.language::Anything")
  public <R> void reply(final @Ignore TypeDescriptor $reified$R, 
    final @TypeInfo("ceylon.language::Object?") @Name("message")@DocAnnotation$annotation$(description = "the message to reply with.\n") Object message, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.eventbus::Message<R?>)") @Name("replyHandler")@DocAnnotation$annotation$(description = "the reply handler for the reply.\n") Callable<?> replyHandler) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(message);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<java.lang.Object>>> arg_1 = replyHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.core.eventbus.Message<java.lang.Object>>(replyHandler) {
      public Object toCeylon(io.vertx.core.eventbus.Message<java.lang.Object> event) {
        return io.vertx.ceylon.core.eventbus.Message.TO_CEYLON.converter(io.vertx.lang.ceylon.VertxTypeDescriptor.nullable($reified$R)).safeConvert(event);
      }
    };
    delegate.reply(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = " Link [reply](../eventbus/Message.type.html#reply) but allows you to specify delivery options for the reply.\n")
  @TypeInfo("ceylon.language::Anything")
  public void reply(
    final @TypeInfo("ceylon.language::Object?") @Name("message")@DocAnnotation$annotation$(description = "the reply message\n") Object message, 
    final @TypeInfo("io.vertx.ceylon.core.eventbus::DeliveryOptions") @Name("options")@DocAnnotation$annotation$(description = "the delivery options\n") io.vertx.ceylon.core.eventbus.DeliveryOptions options) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(message);
    io.vertx.core.eventbus.DeliveryOptions arg_1 = options == null ? null : new io.vertx.core.eventbus.DeliveryOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(options.toJson()));
    delegate.reply(arg_0, arg_1);
  }

  @TypeParameters({
    @TypeParameter(value="R",variance=Variance.NONE)
  })
  @DocAnnotation$annotation$(description = " The same as <code>reply(R message, DeliveryOptions)</code> but you can specify handler for the reply - i.e.\n to receive the reply to the reply.\n")
  @TypeInfo("ceylon.language::Anything")
  public <R> void reply(final @Ignore TypeDescriptor $reified$R, 
    final @TypeInfo("ceylon.language::Object?") @Name("message")@DocAnnotation$annotation$(description = "the reply message\n") Object message, 
    final @TypeInfo("io.vertx.ceylon.core.eventbus::DeliveryOptions") @Name("options")@DocAnnotation$annotation$(description = "the delivery options\n") io.vertx.ceylon.core.eventbus.DeliveryOptions options, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.eventbus::Message<R?>)") @Name("replyHandler")@DocAnnotation$annotation$(description = "the reply handler for the reply.\n") Callable<?> replyHandler) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(message);
    io.vertx.core.eventbus.DeliveryOptions arg_1 = options == null ? null : new io.vertx.core.eventbus.DeliveryOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(options.toJson()));
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.eventbus.Message<java.lang.Object>>> arg_2 = replyHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.core.eventbus.Message<java.lang.Object>>(replyHandler) {
      public Object toCeylon(io.vertx.core.eventbus.Message<java.lang.Object> event) {
        return io.vertx.ceylon.core.eventbus.Message.TO_CEYLON.converter(io.vertx.lang.ceylon.VertxTypeDescriptor.nullable($reified$R)).safeConvert(event);
      }
    };
    delegate.reply(arg_0, arg_1, arg_2);
  }

  @DocAnnotation$annotation$(description = " Signal to the sender that processing of this message failed.\n <p>\n If the message was sent specifying a result handler\n the handler will be called with a failure corresponding to the failure code and message specified here.\n")
  @TypeInfo("ceylon.language::Anything")
  public void fail(
    final @TypeInfo("ceylon.language::Integer") @Name("failureCode")@DocAnnotation$annotation$(description = "A failure code to pass back to the sender\n") long failureCode, 
    final @TypeInfo("ceylon.language::String") @Name("message")@DocAnnotation$annotation$(description = "A message to pass back to the sender\n") ceylon.language.String message) {
    int arg_0 = (int)failureCode;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(message);
    delegate.fail(arg_0, arg_1);
  }

}
