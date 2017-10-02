package io.vertx.ceylon.core.http;

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
import io.vertx.ceylon.core.buffer.Buffer;
import io.vertx.ceylon.core.MultiMap;
import io.vertx.core.Handler;
import io.vertx.ceylon.core.net.SocketAddress;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Represents a server side WebSocket.\n <p>\n Instances of this class are passed into a [websocketHandler](../http/HttpServer.type.html#websocketHandler) or provided\n when a WebSocket handshake is manually [upgrade](../http/HttpServerRequest.type.html#upgrade)ed.\n")
public class ServerWebSocket implements ReifiedType,  WebSocketBase {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.http.ServerWebSocket, ServerWebSocket> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.http.ServerWebSocket, ServerWebSocket>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.http.ServerWebSocket, ServerWebSocket> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.http.ServerWebSocket, ServerWebSocket>() {
        public ServerWebSocket convert(io.vertx.core.http.ServerWebSocket src) {
          return new ServerWebSocket(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<ServerWebSocket, io.vertx.core.http.ServerWebSocket> TO_JAVA = new io.vertx.lang.ceylon.Converter<ServerWebSocket, io.vertx.core.http.ServerWebSocket>() {
    public io.vertx.core.http.ServerWebSocket convert(ServerWebSocket src) {
      return src.delegate;
    }
  };

  @Ignore private SocketAddress cached_remoteAddress;
  @Ignore private SocketAddress cached_localAddress;
  @Ignore private MultiMap cached_headers;
  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(ServerWebSocket.class), io.vertx.core.http.ServerWebSocket.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.core.http.ServerWebSocket delegate;

  public ServerWebSocket(io.vertx.core.http.ServerWebSocket delegate) {
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

  @DocAnnotation$annotation$(description = " Same as [end](../http/WebSocketBase.type.html#end) but writes some data to the stream before ending.\n")
  @TypeInfo("ceylon.language::Anything")
  public void end(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("t") Buffer t) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(t);
    delegate.end(arg_0);
  }

  @DocAnnotation$annotation$(description = " This will return <code>true</code> if there are more bytes in the write queue than the value set using [setWriteQueueMaxSize](../http/ServerWebSocket.type.html#setWriteQueueMaxSize)\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean writeQueueFull() {
    boolean ret = delegate.writeQueueFull();
    return ret;
  }

  @DocAnnotation$annotation$(description = " When a <code>Websocket</code> is created it automatically registers an event handler with the event bus - the ID of that\n handler is given by this method.\n <p>\n Given this ID, a different event loop can send a binary frame to that event handler using the event bus and\n that buffer will be received by this instance in its own event loop and written to the underlying connection. This\n allows you to write data to other WebSockets which are owned by different event loops.\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String binaryHandlerID() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.binaryHandlerID());
    return ret;
  }

  @DocAnnotation$annotation$(description = " When a <code>Websocket</code> is created it automatically registers an event handler with the eventbus, the ID of that\n handler is given by <code>textHandlerID</code>.\n <p>\n Given this ID, a different event loop can send a text frame to that event handler using the event bus and\n that buffer will be received by this instance in its own event loop and written to the underlying connection. This\n allows you to write data to other WebSockets which are owned by different event loops.\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String textHandlerID() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.textHandlerID());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Returns the websocket sub protocol selected by the websocket handshake.\n <p/>\n On the server, the value will be <code>null</code> when the handler receives the websocket callback as the\n handshake will not be completed yet.\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String subProtocol() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.subProtocol());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Writes a (potentially large) piece of text data to the connection. This data might be written as multiple frames\n if it exceeds the maximum WebSocket frame size.\n")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  public WebSocketBase writeTextMessage(
    final @TypeInfo("ceylon.language::String") @Name("text")@DocAnnotation$annotation$(description = "the data to write\n") ceylon.language.String text) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(text);
    WebSocketBase ret = io.vertx.ceylon.core.http.WebSocketBase.TO_CEYLON.converter().safeConvert(delegate.writeTextMessage(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Writes a ping to the connection. This will be written in a single frame. Ping frames may be at most 125 bytes (octets).\n <p>\n This method should not be used to write application data and should only be used for implementing a keep alive or\n to ensure the client is still responsive, see RFC 6455 Section 5.5.2.\n <p>\n There is no pingHandler because RFC 6455 section 5.5.2 clearly states that the only response to a ping is a pong\n with identical contents.\n")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  public WebSocketBase writePing(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("data")@DocAnnotation$annotation$(description = "the data to write, may be at most 125 bytes\n") Buffer data) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(data);
    WebSocketBase ret = io.vertx.ceylon.core.http.WebSocketBase.TO_CEYLON.converter().safeConvert(delegate.writePing(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Writes a pong to the connection. This will be written in a single frame. Pong frames may be at most 125 bytes (octets).\n <p>\n This method should not be used to write application data and should only be used for implementing a keep alive or\n to ensure the client is still responsive, see RFC 6455 Section 5.5.2.\n <p>\n There is no need to manually write a Pong, as the server and client both handle responding to a ping with a pong\n automatically and this is exposed to users.RFC 6455 Section 5.5.3 states that pongs may be sent unsolicited in order\n to implement a one way heartbeat.\n")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  public WebSocketBase writePong(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("data")@DocAnnotation$annotation$(description = "the data to write, may be at most 125 bytes\n") Buffer data) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(data);
    WebSocketBase ret = io.vertx.ceylon.core.http.WebSocketBase.TO_CEYLON.converter().safeConvert(delegate.writePong(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set a text message handler on the connection. This handler will be called similar to the\n , but the buffer will be converted to a String first\n")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  public WebSocketBase textMessageHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::String)?") @Name("handler")@DocAnnotation$annotation$(description = "the handler\n") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.String> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.String>() {
      public void handle(java.lang.String event) {
        handler.$call$((Object)io.vertx.lang.ceylon.ToCeylon.String.safeConvert(event));
      }
    };
    WebSocketBase ret = io.vertx.ceylon.core.http.WebSocketBase.TO_CEYLON.converter().safeConvert(delegate.textMessageHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set a binary message handler on the connection. This handler serves a similar purpose to [handler](../http/ServerWebSocket.type.html#handler)\n except that if a message comes into the socket in multiple frames, the data from the frames will be aggregated\n into a single buffer before calling the handler (using [isFinal](../http/WebSocketFrame.type.html#isFinal) to find the boundaries).\n")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  public WebSocketBase binaryMessageHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)?") @Name("handler")@DocAnnotation$annotation$(description = "the handler\n") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        handler.$call$((Object)io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(event));
      }
    };
    WebSocketBase ret = io.vertx.ceylon.core.http.WebSocketBase.TO_CEYLON.converter().safeConvert(delegate.binaryMessageHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set a pong message handler on the connection.  This handler will be invoked every time a pong message is received\n on the server, and can be used by both clients and servers since the RFC 6455 Sections 5.5.2 and 5.5.3 do not\n specify whether the client or server sends a ping.\n <p>\n Pong frames may be at most 125 bytes (octets).\n <p>\n There is no ping handler since pings should immediately be responded to with a pong with identical content\n <p>\n Pong frames may be received unsolicited.\n")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  public WebSocketBase pongHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)?") @Name("handler")@DocAnnotation$annotation$(description = "the handler\n") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        handler.$call$((Object)io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(event));
      }
    };
    WebSocketBase ret = io.vertx.ceylon.core.http.WebSocketBase.TO_CEYLON.converter().safeConvert(delegate.pongHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Calls [close](../http/WebSocketBase.type.html#close)\n")
  @TypeInfo("ceylon.language::Anything")
  public void end() {
    delegate.end();
  }

  @DocAnnotation$annotation$(description = " Close the WebSocket.\n")
  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("io.vertx.ceylon.core.net::SocketAddress")
  public SocketAddress remoteAddress() {
    if (cached_remoteAddress != null) {
      return cached_remoteAddress;
    }
    SocketAddress ret = io.vertx.ceylon.core.net.SocketAddress.TO_CEYLON.converter().safeConvert(delegate.remoteAddress());
    cached_remoteAddress = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("io.vertx.ceylon.core.net::SocketAddress")
  public SocketAddress localAddress() {
    if (cached_localAddress != null) {
      return cached_localAddress;
    }
    SocketAddress ret = io.vertx.ceylon.core.net.SocketAddress.TO_CEYLON.converter().safeConvert(delegate.localAddress());
    cached_localAddress = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::Boolean")
  public boolean $isSsl() {
    boolean ret = delegate.isSsl();
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)?") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        handler.$call$((Object)event);
      }
    };
    ServerWebSocket ret = io.vertx.ceylon.core.http.ServerWebSocket.TO_CEYLON.converter().safeConvert(delegate.exceptionHandler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)?") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        handler.$call$((Object)io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(event));
      }
    };
    ServerWebSocket ret = io.vertx.ceylon.core.http.ServerWebSocket.TO_CEYLON.converter().safeConvert(delegate.handler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket pause() {
    ServerWebSocket ret = io.vertx.ceylon.core.http.ServerWebSocket.TO_CEYLON.converter().safeConvert(delegate.pause());
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket resume() {
    ServerWebSocket ret = io.vertx.ceylon.core.http.ServerWebSocket.TO_CEYLON.converter().safeConvert(delegate.resume());
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket endHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("endHandler") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = endHandler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        endHandler.$call$();
      }
    };
    ServerWebSocket ret = io.vertx.ceylon.core.http.ServerWebSocket.TO_CEYLON.converter().safeConvert(delegate.endHandler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket write(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("data") Buffer data) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(data);
    ServerWebSocket ret = io.vertx.ceylon.core.http.ServerWebSocket.TO_CEYLON.converter().safeConvert(delegate.write(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket setWriteQueueMaxSize(
    final @TypeInfo("ceylon.language::Integer") @Name("maxSize") long maxSize) {
    int arg_0 = (int)maxSize;
    ServerWebSocket ret = io.vertx.ceylon.core.http.ServerWebSocket.TO_CEYLON.converter().safeConvert(delegate.setWriteQueueMaxSize(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket drainHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        handler.$call$();
      }
    };
    ServerWebSocket ret = io.vertx.ceylon.core.http.ServerWebSocket.TO_CEYLON.converter().safeConvert(delegate.drainHandler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket writeFrame(
    final @TypeInfo("io.vertx.ceylon.core.http::WebSocketFrame") @Name("frame") WebSocketFrame frame) {
    io.vertx.core.http.WebSocketFrame arg_0 = io.vertx.ceylon.core.http.WebSocketFrame.TO_JAVA.safeConvert(frame);
    ServerWebSocket ret = io.vertx.ceylon.core.http.ServerWebSocket.TO_CEYLON.converter().safeConvert(delegate.writeFrame(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket writeFinalTextFrame(
    final @TypeInfo("ceylon.language::String") @Name("text") ceylon.language.String text) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(text);
    ServerWebSocket ret = io.vertx.ceylon.core.http.ServerWebSocket.TO_CEYLON.converter().safeConvert(delegate.writeFinalTextFrame(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket writeFinalBinaryFrame(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("data") Buffer data) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(data);
    ServerWebSocket ret = io.vertx.ceylon.core.http.ServerWebSocket.TO_CEYLON.converter().safeConvert(delegate.writeFinalBinaryFrame(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket writeBinaryMessage(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("data") Buffer data) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(data);
    ServerWebSocket ret = io.vertx.ceylon.core.http.ServerWebSocket.TO_CEYLON.converter().safeConvert(delegate.writeBinaryMessage(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket closeHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        handler.$call$();
      }
    };
    ServerWebSocket ret = io.vertx.ceylon.core.http.ServerWebSocket.TO_CEYLON.converter().safeConvert(delegate.closeHandler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket frameHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocketFrame)?") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame>() {
      public void handle(io.vertx.core.http.WebSocketFrame event) {
        handler.$call$((Object)io.vertx.ceylon.core.http.WebSocketFrame.TO_CEYLON.converter().safeConvert(event));
      }
    };
    ServerWebSocket ret = io.vertx.ceylon.core.http.ServerWebSocket.TO_CEYLON.converter().safeConvert(delegate.frameHandler(arg_0));
    return this;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String uri() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.uri());
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String path() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.path());
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::String?")
  public ceylon.language.String query() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.query());
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap headers() {
    if (cached_headers != null) {
      return cached_headers;
    }
    MultiMap ret = io.vertx.ceylon.core.MultiMap.TO_CEYLON.converter().safeConvert(delegate.headers());
    cached_headers = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = " Accept the WebSocket and terminate the WebSocket handshake.\n <p/>\n This method should be called from the websocket handler to explicitely accept the websocker and\n terminate the WebSocket handshake.\n")
  @TypeInfo("ceylon.language::Anything")
  public void accept() {
    delegate.accept();
  }

  @DocAnnotation$annotation$(description = " Reject the WebSocket.\n <p>\n Calling this method from the websocket handler when it is first passed to you gives you the opportunity to reject\n the websocket, which will cause the websocket handshake to fail by returning\n a  response code.\n <p>\n You might use this method, if for example you only want to accept WebSockets with a particular path.\n")
  @TypeInfo("ceylon.language::Anything")
  public void reject() {
    delegate.reject();
  }

  @DocAnnotation$annotation$(description = " Like [reject](../http/ServerWebSocket.type.html#reject) but with a <code>status</code>.\n")
  @TypeInfo("ceylon.language::Anything")
  public void reject(
    final @TypeInfo("ceylon.language::Integer") @Name("status") long status) {
    int arg_0 = (int)status;
    delegate.reject(arg_0);
  }

}
