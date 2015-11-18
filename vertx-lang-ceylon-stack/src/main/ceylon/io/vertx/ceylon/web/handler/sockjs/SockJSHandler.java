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
import io.vertx.ceylon.core.Vertx;
import io.vertx.ceylon.web.Router;
import io.vertx.ceylon.web.RoutingContext;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = "\n A handler that allows you to handle SockJS connections from clients.\n <p>\n We currently support version 0.3.3 of the SockJS protocol, which can be found in\n <a href=\"https://github.com/sockjs/sockjs-protocol/tree/v0.3.3\">this tag:</a>\n")
public class SockJSHandler implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.sockjs.SockJSHandler, SockJSHandler> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.sockjs.SockJSHandler, SockJSHandler>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.sockjs.SockJSHandler, SockJSHandler> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.sockjs.SockJSHandler, SockJSHandler>() {
        public SockJSHandler convert(io.vertx.ext.web.handler.sockjs.SockJSHandler src) {
          return new SockJSHandler(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<SockJSHandler, io.vertx.ext.web.handler.sockjs.SockJSHandler> TO_JAVA = new io.vertx.lang.ceylon.Converter<SockJSHandler, io.vertx.ext.web.handler.sockjs.SockJSHandler>() {
    public io.vertx.ext.web.handler.sockjs.SockJSHandler convert(SockJSHandler src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(SockJSHandler.class);
  @Ignore private final io.vertx.ext.web.handler.sockjs.SockJSHandler delegate;

  public SockJSHandler(io.vertx.ext.web.handler.sockjs.SockJSHandler delegate) {
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

  @TypeInfo("ceylon.language::Anything")
  public void handle(
    final @TypeInfo("io.vertx.ceylon.web::RoutingContext") @Name("arg0") @DocAnnotation$annotation$(description = "todo") RoutingContext arg0) {
    io.vertx.ext.web.RoutingContext arg_0 = io.vertx.ceylon.web.RoutingContext.TO_JAVA.safeConvert(arg0);
    delegate.handle(arg_0);
  }

  @DocAnnotation$annotation$(description = " Set a SockJS socket handler. This handler will be called with a SockJS socket whenever a SockJS connection\n is made from a client\n")
  @TypeInfo("io.vertx.ceylon.web.handler.sockjs::SockJSHandler")
  public SockJSHandler socketHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.web.handler.sockjs::SockJSSocket)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.ext.web.handler.sockjs.SockJSSocket> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.ext.web.handler.sockjs.SockJSSocket>() {
      public void handle(io.vertx.ext.web.handler.sockjs.SockJSSocket event) {
        handler.$call$((Object)io.vertx.ceylon.web.handler.sockjs.SockJSSocket.TO_CEYLON.converter().safeConvert(event));
      }
    };
    SockJSHandler ret = io.vertx.ceylon.web.handler.sockjs.SockJSHandler.TO_CEYLON.converter().safeConvert(delegate.socketHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Bridge the SockJS handler to the Vert.x event bus. This basically installs a built-in SockJS socket handler\n which takes SockJS traffic and bridges it to the event bus, thus allowing you to extend the server-side\n Vert.x event bus to browsers\n")
  @TypeInfo("io.vertx.ceylon.web.handler.sockjs::SockJSHandler")
  public SockJSHandler bridge(
    final @TypeInfo("io.vertx.ceylon.web.handler.sockjs::BridgeOptions") @Name("bridgeOptions") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.web.handler.sockjs.BridgeOptions bridgeOptions) {
    io.vertx.ext.web.handler.sockjs.BridgeOptions arg_0 = bridgeOptions == null ? null : new io.vertx.ext.web.handler.sockjs.BridgeOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(bridgeOptions.toJson()));
    SockJSHandler ret = io.vertx.ceylon.web.handler.sockjs.SockJSHandler.TO_CEYLON.converter().safeConvert(delegate.bridge(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Like [bridge](../../handler/sockjs/SockJSHandler.type.html#bridge) but specifying a handler\n that will receive bridge events.\n")
  @TypeInfo("io.vertx.ceylon.web.handler.sockjs::SockJSHandler")
  public SockJSHandler bridge(
    final @TypeInfo("io.vertx.ceylon.web.handler.sockjs::BridgeOptions") @Name("bridgeOptions") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.web.handler.sockjs.BridgeOptions bridgeOptions, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.web.handler.sockjs::BridgeEvent)") @Name("bridgeEventHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> bridgeEventHandler) {
    io.vertx.ext.web.handler.sockjs.BridgeOptions arg_0 = bridgeOptions == null ? null : new io.vertx.ext.web.handler.sockjs.BridgeOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(bridgeOptions.toJson()));
    io.vertx.core.Handler<io.vertx.ext.web.handler.sockjs.BridgeEvent> arg_1 = bridgeEventHandler == null ? null : new io.vertx.core.Handler<io.vertx.ext.web.handler.sockjs.BridgeEvent>() {
      public void handle(io.vertx.ext.web.handler.sockjs.BridgeEvent event) {
        bridgeEventHandler.$call$((Object)io.vertx.ceylon.web.handler.sockjs.BridgeEvent.TO_CEYLON.converter().safeConvert(event));
      }
    };
    SockJSHandler ret = io.vertx.ceylon.web.handler.sockjs.SockJSHandler.TO_CEYLON.converter().safeConvert(delegate.bridge(arg_0, arg_1));
    return this;
  }

}
