package io.vertx.ceylon.web.handler.sockjs;

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
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.ceylon.core.Future;
import java.util.function.Function;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Represents an event that occurs on the event bus bridge.\n <p>\n Please consult the documentation for a full explanation.\n")
public class BridgeEvent extends Future<ceylon.language.Boolean> implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.sockjs.BridgeEvent, BridgeEvent> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.sockjs.BridgeEvent, BridgeEvent>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.sockjs.BridgeEvent, BridgeEvent> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.sockjs.BridgeEvent, BridgeEvent>() {
        public BridgeEvent convert(io.vertx.ext.web.handler.sockjs.BridgeEvent src) {
          return new BridgeEvent(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<BridgeEvent, io.vertx.ext.web.handler.sockjs.BridgeEvent> TO_JAVA = new io.vertx.lang.ceylon.Converter<BridgeEvent, io.vertx.ext.web.handler.sockjs.BridgeEvent>() {
    public io.vertx.ext.web.handler.sockjs.BridgeEvent convert(BridgeEvent src) {
      return src.delegate;
    }
  };

  @Ignore private Callable<?> cached_completer;
  @Ignore private io.vertx.ceylon.web.handler.sockjs.BridgeEventType cached_type;
  @Ignore private ceylon.json.Object cached_rawMessage;
  @Ignore private SockJSSocket cached_socket;
  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(BridgeEvent.class), io.vertx.ext.web.handler.sockjs.BridgeEvent.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.ext.web.handler.sockjs.BridgeEvent delegate;

  public BridgeEvent(io.vertx.ext.web.handler.sockjs.BridgeEvent delegate) {
    super(TypeDescriptor.klass(java.lang.Boolean.class), delegate);
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

  @TypeInfo("io.vertx.ceylon.core::Future<ceylon.language::Boolean>")
  public Future<ceylon.language.Boolean> setHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Boolean)") @Name("arg0") Callable<?> arg0) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> arg_0 = arg0 == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Boolean>(arg0) {
      public Object toCeylon(java.lang.Boolean event) {
        return io.vertx.lang.ceylon.ToCeylon.Boolean.safeConvert(event);
      }
    };
    Future<ceylon.language.Boolean> ret = io.vertx.ceylon.core.Future.TO_CEYLON.converter(ceylon.language.Boolean.$TypeDescriptor$).safeConvert(delegate.setHandler(arg_0));
    return this;
  }

  @TypeInfo("ceylon.language::Anything")
  public void complete(
    final @TypeInfo("ceylon.language::Boolean") @Name("arg0") ceylon.language.Boolean arg0) {
    java.lang.Boolean arg_0 = io.vertx.lang.ceylon.ToJava.Boolean.safeConvert(arg0);
    delegate.complete(arg_0);
  }

  @TypeInfo("ceylon.language::Boolean")
  public ceylon.language.Boolean result() {
    ceylon.language.Boolean ret = io.vertx.lang.ceylon.ToCeylon.Boolean.safeConvert(delegate.result());
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @TypeInfo("io.vertx.ceylon.core::Future<U?>")
  public <U> Future<U> compose(final @Ignore TypeDescriptor $reified$U, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Boolean)") @Name("handler") Callable<?> handler, 
    final @TypeInfo("io.vertx.ceylon.core::Future<U?>") @Name("next") Future<U> next) {
    io.vertx.core.Handler<java.lang.Boolean> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Boolean>() {
      public void handle(java.lang.Boolean event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Boolean.safeConvert(event));
      }
    };
    io.vertx.core.Future<java.lang.Object> arg_1 = io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(next);
    Future<U> ret = io.vertx.ceylon.core.Future.TO_CEYLON.converter(io.vertx.lang.ceylon.VertxTypeDescriptor.nullable($reified$U)).safeConvert(delegate.compose(arg_0, arg_1));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @TypeInfo("io.vertx.ceylon.core::Future<U?>")
  public <U> Future<U> compose(final @Ignore TypeDescriptor $reified$U, 
    final @TypeInfo("io.vertx.ceylon.core::Future<U?>(ceylon.language::Boolean)") @Name("mapper") Callable<?> mapper) {
    java.util.function.Function<java.lang.Boolean,io.vertx.core.Future<java.lang.Object>> arg_0 = mapper == null ? null : new java.util.function.Function<java.lang.Boolean,io.vertx.core.Future<java.lang.Object>>() {
      public io.vertx.core.Future<java.lang.Object> apply(java.lang.Boolean arg) {
        Future<Object> ret = (Future<Object>)mapper.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Boolean.safeConvert(arg));
        return io.vertx.ceylon.core.Future.TO_JAVA.safeConvert(ret);
      }
    };
    Future<U> ret = io.vertx.ceylon.core.Future.TO_CEYLON.converter(io.vertx.lang.ceylon.VertxTypeDescriptor.nullable($reified$U)).safeConvert(delegate.compose(arg_0));
    return ret;
  }

  @TypeParameters({
    @TypeParameter(value="U",variance=Variance.NONE)
  })
  @TypeInfo("io.vertx.ceylon.core::Future<U?>")
  public <U> Future<U> map(final @Ignore TypeDescriptor $reified$U, 
    final @TypeInfo("U?(ceylon.language::Boolean)") @Name("mapper") Callable<?> mapper) {
    java.util.function.Function<java.lang.Boolean,java.lang.Object> arg_0 = mapper == null ? null : new java.util.function.Function<java.lang.Boolean,java.lang.Object>() {
      public java.lang.Object apply(java.lang.Boolean arg) {
        Object ret = (Object)mapper.$call$((Object)io.vertx.lang.ceylon.ToCeylon.Boolean.safeConvert(arg));
        return io.vertx.lang.ceylon.ToJava.object(ret);
      }
    };
    Future<U> ret = io.vertx.ceylon.core.Future.TO_CEYLON.converter(io.vertx.lang.ceylon.VertxTypeDescriptor.nullable($reified$U)).safeConvert(delegate.map(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Boolean)")
  public Callable<?> completer() {
    if (cached_completer != null) {
      return cached_completer;
    }
    Callable<?> ret = new io.vertx.lang.ceylon.AsyncResultHandlerCallable(io.vertx.lang.ceylon.ToJava.Boolean, delegate.completer());
    cached_completer = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("io.vertx.ceylon.web.handler.sockjs::BridgeEventType")
  public io.vertx.ceylon.web.handler.sockjs.BridgeEventType type() {
    if (cached_type != null) {
      return cached_type;
    }
    io.vertx.ceylon.web.handler.sockjs.BridgeEventType ret = io.vertx.ceylon.web.handler.sockjs.bridgeEventType_.get_().getToCeylon().safeConvert(delegate.type());
    cached_type = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = " Use [getRawMessage](../../handler/sockjs/BridgeEvent.type.html#getRawMessage) instead, will be removed in 3.3\n")
  @TypeInfo("ceylon.json::Object")
  public ceylon.json.Object rawMessage() {
    if (cached_rawMessage != null) {
      return cached_rawMessage;
    }
    ceylon.json.Object ret = io.vertx.lang.ceylon.ToCeylon.JsonObject.safeConvert(delegate.rawMessage());
    cached_rawMessage = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = " Get the raw JSON message for the event. This will be null for SOCKET_CREATED or SOCKET_CLOSED events as there is\n no message involved. If the returned message is modified, [setRawMessage](../../handler/sockjs/BridgeEvent.type.html#setRawMessage) should be called with the\n new message.\n")
  @TypeInfo("ceylon.json::Object")
  public ceylon.json.Object $getRawMessage() {
    ceylon.json.Object ret = io.vertx.lang.ceylon.ToCeylon.JsonObject.safeConvert(delegate.getRawMessage());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Get the raw JSON message for the event. This will be null for SOCKET_CREATED or SOCKET_CLOSED events as there is\n no message involved.\n")
  @TypeInfo("io.vertx.ceylon.web.handler.sockjs::BridgeEvent")
  public BridgeEvent setRawMessage(
    final @TypeInfo("ceylon.json::Object") @Name("message")@DocAnnotation$annotation$(description = "the raw message\n") ceylon.json.Object message) {
    io.vertx.core.json.JsonObject arg_0 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(message);
    BridgeEvent ret = io.vertx.ceylon.web.handler.sockjs.BridgeEvent.TO_CEYLON.converter().safeConvert(delegate.setRawMessage(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Get the SockJSSocket instance corresponding to the event\n")
  @TypeInfo("io.vertx.ceylon.web.handler.sockjs::SockJSSocket")
  public SockJSSocket socket() {
    if (cached_socket != null) {
      return cached_socket;
    }
    SockJSSocket ret = io.vertx.ceylon.web.handler.sockjs.SockJSSocket.TO_CEYLON.converter().safeConvert(delegate.socket());
    cached_socket = ret;
    return ret;
  }

}
