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
import io.vertx.core.Handler;
import io.vertx.ceylon.core.net.SocketAddress;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Represents a client-side WebSocket.\n")
public class WebSocket implements ReifiedType,  WebSocketBase {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.http.WebSocket, WebSocket> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.http.WebSocket, WebSocket>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.http.WebSocket, WebSocket> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.http.WebSocket, WebSocket>() {
        public WebSocket convert(io.vertx.core.http.WebSocket src) {
          return new WebSocket(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<WebSocket, io.vertx.core.http.WebSocket> TO_JAVA = new io.vertx.lang.ceylon.Converter<WebSocket, io.vertx.core.http.WebSocket>() {
    public io.vertx.core.http.WebSocket convert(WebSocket src) {
      return src.delegate;
    }
  };

  @Ignore private SocketAddress cached_remoteAddress;
  @Ignore private SocketAddress cached_localAddress;
  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(WebSocket.class);
  @Ignore private final io.vertx.core.http.WebSocket delegate;

  public WebSocket(io.vertx.core.http.WebSocket delegate) {
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
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("t")  Buffer t) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(t);
    delegate.end(arg_0);
  }

  @DocAnnotation$annotation$(description = " This will return <code>true</code> if there are more bytes in the write queue than the value set using [setWriteQueueMaxSize](../http/WebSocket.type.html#setWriteQueueMaxSize)\n")
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

  @TypeInfo("io.vertx.ceylon.core.http::WebSocket")
  public WebSocket exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)?") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        handler.$call$((Object)event);
      }
    };
    WebSocket ret = io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(delegate.exceptionHandler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocket")
  public WebSocket handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)?") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        handler.$call$((Object)io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(event));
      }
    };
    WebSocket ret = io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(delegate.handler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocket")
  public WebSocket pause() {
    WebSocket ret = io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(delegate.pause());
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocket")
  public WebSocket resume() {
    WebSocket ret = io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(delegate.resume());
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocket")
  public WebSocket endHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("endHandler")  Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = endHandler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        endHandler.$call$();
      }
    };
    WebSocket ret = io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(delegate.endHandler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocket")
  public WebSocket write(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("data")  Buffer data) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(data);
    WebSocket ret = io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(delegate.write(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocket")
  public WebSocket setWriteQueueMaxSize(
    final @TypeInfo("ceylon.language::Integer") @Name("maxSize")  long maxSize) {
    int arg_0 = (int)maxSize;
    WebSocket ret = io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(delegate.setWriteQueueMaxSize(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocket")
  public WebSocket drainHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        handler.$call$();
      }
    };
    WebSocket ret = io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(delegate.drainHandler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocket")
  public WebSocket writeFrame(
    final @TypeInfo("io.vertx.ceylon.core.http::WebSocketFrame") @Name("frame")  WebSocketFrame frame) {
    io.vertx.core.http.WebSocketFrame arg_0 = io.vertx.ceylon.core.http.WebSocketFrame.TO_JAVA.safeConvert(frame);
    WebSocket ret = io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(delegate.writeFrame(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocket")
  public WebSocket writeFinalTextFrame(
    final @TypeInfo("ceylon.language::String") @Name("text")  ceylon.language.String text) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(text);
    WebSocket ret = io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(delegate.writeFinalTextFrame(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocket")
  public WebSocket writeFinalBinaryFrame(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("data")  Buffer data) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(data);
    WebSocket ret = io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(delegate.writeFinalBinaryFrame(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocket")
  public WebSocket writeBinaryMessage(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("data")  Buffer data) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(data);
    WebSocket ret = io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(delegate.writeBinaryMessage(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocket")
  public WebSocket closeHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        handler.$call$();
      }
    };
    WebSocket ret = io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(delegate.closeHandler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocket")
  public WebSocket frameHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocketFrame)?") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame>() {
      public void handle(io.vertx.core.http.WebSocketFrame event) {
        handler.$call$((Object)io.vertx.ceylon.core.http.WebSocketFrame.TO_CEYLON.converter().safeConvert(event));
      }
    };
    WebSocket ret = io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.converter().safeConvert(delegate.frameHandler(arg_0));
    return this;
  }

}
