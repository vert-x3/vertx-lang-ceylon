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
import io.vertx.ceylon.core.Future;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Represents an event that occurs on the event bus bridge.\n <p>\n Please consult the documentation for a full explanation.\n")
public class BridgeEvent extends io.vertx.ceylon.core.Future<java.lang.Boolean> implements ReifiedType {

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

  @Ignore private io.vertx.ceylon.web.handler.sockjs.BridgeEventType cached_type;
  @Ignore private ceylon.json.Object cached_rawMessage;
  @Ignore private SockJSSocket cached_socket;
  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(BridgeEvent.class);
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

  @DocAnnotation$annotation$(description = " @return  the type of the event\n")
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
    final @TypeInfo("ceylon.json::Object") @Name("message") @DocAnnotation$annotation$(description = "the raw message\n") ceylon.json.Object message) {
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
