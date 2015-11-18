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
import io.vertx.ceylon.core.streams.WriteStream;
import io.vertx.ceylon.core.streams.ReadStream;
import io.vertx.core.Handler;
import io.vertx.ceylon.core.net.SocketAddress;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Base WebSocket implementation.\n <p>\n It implements both  and  so it can be used with\n [Pump](../streams/Pump.type.html) to pump data with flow control.\n")
public interface WebSocketBase extends ReadStream<Buffer>,  WriteStream<Buffer> {

  @Ignore
  io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.http.WebSocketBase, WebSocketBase> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.http.WebSocketBase, WebSocketBase>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.http.WebSocketBase, WebSocketBase> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.http.WebSocketBase, WebSocketBase>() {
        public WebSocketBase convert(io.vertx.core.http.WebSocketBase src) {
          return new WebSocketBase.Impl(src);
        }
      };
    }
  };

  @Ignore
  io.vertx.lang.ceylon.Converter<WebSocketBase, io.vertx.core.http.WebSocketBase> TO_JAVA = new io.vertx.lang.ceylon.Converter<WebSocketBase, io.vertx.core.http.WebSocketBase>() {
    public io.vertx.core.http.WebSocketBase convert(WebSocketBase src) {
      return (io.vertx.core.http.WebSocketBase)src.getDelegate();
    }
  };

  @Ignore
  TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(WebSocketBase.class);
  @Ignore
  Object getDelegate();

  @DocAnnotation$annotation$(description = " This will return <code>true</code> if there are more bytes in the write queue than the value set using [setWriteQueueMaxSize](../http/WebSocketBase.type.html#setWriteQueueMaxSize)\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean writeQueueFull();

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  public WebSocketBase exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)?") @Name("handler")  Callable<?> handler);

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  public WebSocketBase handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)?") @Name("handler")  Callable<?> handler);

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  public WebSocketBase pause();

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  public WebSocketBase resume();

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  public WebSocketBase endHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("endHandler")  Callable<?> endHandler);

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  public WebSocketBase write(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("data")  Buffer data);

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  public WebSocketBase setWriteQueueMaxSize(
    final @TypeInfo("ceylon.language::Integer") @Name("maxSize")  long maxSize);

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  public WebSocketBase drainHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("handler")  Callable<?> handler);

  @DocAnnotation$annotation$(description = " When a <code>Websocket</code> is created it automatically registers an event handler with the event bus - the ID of that\n handler is given by this method.\n <p>\n Given this ID, a different event loop can send a binary frame to that event handler using the event bus and\n that buffer will be received by this instance in its own event loop and written to the underlying connection. This\n allows you to write data to other WebSockets which are owned by different event loops.\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String binaryHandlerID();

  @DocAnnotation$annotation$(description = " When a <code>Websocket</code> is created it automatically registers an event handler with the eventbus, the ID of that\n handler is given by <code>textHandlerID</code>.\n <p>\n Given this ID, a different event loop can send a text frame to that event handler using the event bus and\n that buffer will be received by this instance in its own event loop and written to the underlying connection. This\n allows you to write data to other WebSockets which are owned by different event loops.\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String textHandlerID();

  @DocAnnotation$annotation$(description = " Write a WebSocket frame to the connection\n")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  public WebSocketBase writeFrame(
    final @TypeInfo("io.vertx.ceylon.core.http::WebSocketFrame") @Name("frame") @DocAnnotation$annotation$(description = "the frame to write\n") WebSocketFrame frame);

  @DocAnnotation$annotation$(description = " Write a final WebSocket text frame to the connection\n")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  public WebSocketBase writeFinalTextFrame(
    final @TypeInfo("ceylon.language::String") @Name("text") @DocAnnotation$annotation$(description = "The text to write\n") ceylon.language.String text);

  @DocAnnotation$annotation$(description = " Write a final WebSocket binary frame to the connection\n")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  public WebSocketBase writeFinalBinaryFrame(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("data") @DocAnnotation$annotation$(description = "The data to write\n") Buffer data);

  @DocAnnotation$annotation$(description = " Writes a (potentially large) piece of binary data to the connection. This data might be written as multiple frames\n if it exceeds the maximum WebSocket frame size.\n")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  public WebSocketBase writeBinaryMessage(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("data") @DocAnnotation$annotation$(description = "the data to write\n") Buffer data);

  @DocAnnotation$annotation$(description = " Set a close handler. This will be called when the WebSocket is closed.\n")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  public WebSocketBase closeHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("handler") @DocAnnotation$annotation$(description = "the handler\n") Callable<?> handler);

  @DocAnnotation$annotation$(description = " Set a frame handler on the connection. This handler will be called when frames are read on the connection.\n")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  public WebSocketBase frameHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocketFrame)?") @Name("handler") @DocAnnotation$annotation$(description = "the handler\n") Callable<?> handler);

  @DocAnnotation$annotation$(description = " Close the WebSocket.\n")
  @TypeInfo("ceylon.language::Anything")
  public void close();

  @DocAnnotation$annotation$(description = " @return the remote address for this socket\n")
  @TypeInfo("io.vertx.ceylon.core.net::SocketAddress")
  public SocketAddress remoteAddress();

  @DocAnnotation$annotation$(description = " @return the local address for this socket\n")
  @TypeInfo("io.vertx.ceylon.core.net::SocketAddress")
  public SocketAddress localAddress();

  @Ignore
  public class Impl implements WebSocketBase {
    @Ignore private SocketAddress cached_remoteAddress;
    @Ignore private SocketAddress cached_localAddress;
    @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(WebSocketBase.class);
    @Ignore private final io.vertx.core.http.WebSocketBase delegate;

    public Impl(io.vertx.core.http.WebSocketBase delegate) {
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

  @DocAnnotation$annotation$(description = " This will return <code>true</code> if there are more bytes in the write queue than the value set using [setWriteQueueMaxSize](../http/WebSocketBase.type.html#setWriteQueueMaxSize)\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean writeQueueFull() {
    boolean ret = delegate.writeQueueFull();
      return ret;
    }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  public WebSocketBase exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)?") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        handler.$call$((Object)event);
      }
    };
    WebSocketBase ret = io.vertx.ceylon.core.http.WebSocketBase.TO_CEYLON.converter().safeConvert(delegate.exceptionHandler(arg_0));
      return this;
    }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  public WebSocketBase handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)?") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        handler.$call$((Object)io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(event));
      }
    };
    WebSocketBase ret = io.vertx.ceylon.core.http.WebSocketBase.TO_CEYLON.converter().safeConvert(delegate.handler(arg_0));
      return this;
    }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  public WebSocketBase pause() {
    WebSocketBase ret = io.vertx.ceylon.core.http.WebSocketBase.TO_CEYLON.converter().safeConvert(delegate.pause());
      return this;
    }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  public WebSocketBase resume() {
    WebSocketBase ret = io.vertx.ceylon.core.http.WebSocketBase.TO_CEYLON.converter().safeConvert(delegate.resume());
      return this;
    }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  public WebSocketBase endHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("endHandler")  Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = endHandler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        endHandler.$call$();
      }
    };
    WebSocketBase ret = io.vertx.ceylon.core.http.WebSocketBase.TO_CEYLON.converter().safeConvert(delegate.endHandler(arg_0));
      return this;
    }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  public WebSocketBase write(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("data")  Buffer data) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(data);
    WebSocketBase ret = io.vertx.ceylon.core.http.WebSocketBase.TO_CEYLON.converter().safeConvert(delegate.write(arg_0));
      return this;
    }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  public WebSocketBase setWriteQueueMaxSize(
    final @TypeInfo("ceylon.language::Integer") @Name("maxSize")  long maxSize) {
    int arg_0 = (int)maxSize;
    WebSocketBase ret = io.vertx.ceylon.core.http.WebSocketBase.TO_CEYLON.converter().safeConvert(delegate.setWriteQueueMaxSize(arg_0));
      return this;
    }

  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  public WebSocketBase drainHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        handler.$call$();
      }
    };
    WebSocketBase ret = io.vertx.ceylon.core.http.WebSocketBase.TO_CEYLON.converter().safeConvert(delegate.drainHandler(arg_0));
      return this;
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

  @DocAnnotation$annotation$(description = " Write a WebSocket frame to the connection\n")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  public WebSocketBase writeFrame(
    final @TypeInfo("io.vertx.ceylon.core.http::WebSocketFrame") @Name("frame") @DocAnnotation$annotation$(description = "the frame to write\n") WebSocketFrame frame) {
    io.vertx.core.http.WebSocketFrame arg_0 = io.vertx.ceylon.core.http.WebSocketFrame.TO_JAVA.safeConvert(frame);
    WebSocketBase ret = io.vertx.ceylon.core.http.WebSocketBase.TO_CEYLON.converter().safeConvert(delegate.writeFrame(arg_0));
      return this;
    }

  @DocAnnotation$annotation$(description = " Write a final WebSocket text frame to the connection\n")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  public WebSocketBase writeFinalTextFrame(
    final @TypeInfo("ceylon.language::String") @Name("text") @DocAnnotation$annotation$(description = "The text to write\n") ceylon.language.String text) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(text);
    WebSocketBase ret = io.vertx.ceylon.core.http.WebSocketBase.TO_CEYLON.converter().safeConvert(delegate.writeFinalTextFrame(arg_0));
      return this;
    }

  @DocAnnotation$annotation$(description = " Write a final WebSocket binary frame to the connection\n")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  public WebSocketBase writeFinalBinaryFrame(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("data") @DocAnnotation$annotation$(description = "The data to write\n") Buffer data) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(data);
    WebSocketBase ret = io.vertx.ceylon.core.http.WebSocketBase.TO_CEYLON.converter().safeConvert(delegate.writeFinalBinaryFrame(arg_0));
      return this;
    }

  @DocAnnotation$annotation$(description = " Writes a (potentially large) piece of binary data to the connection. This data might be written as multiple frames\n if it exceeds the maximum WebSocket frame size.\n")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  public WebSocketBase writeBinaryMessage(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("data") @DocAnnotation$annotation$(description = "the data to write\n") Buffer data) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(data);
    WebSocketBase ret = io.vertx.ceylon.core.http.WebSocketBase.TO_CEYLON.converter().safeConvert(delegate.writeBinaryMessage(arg_0));
      return this;
    }

  @DocAnnotation$annotation$(description = " Set a close handler. This will be called when the WebSocket is closed.\n")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  public WebSocketBase closeHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("handler") @DocAnnotation$annotation$(description = "the handler\n") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        handler.$call$();
      }
    };
    WebSocketBase ret = io.vertx.ceylon.core.http.WebSocketBase.TO_CEYLON.converter().safeConvert(delegate.closeHandler(arg_0));
      return this;
    }

  @DocAnnotation$annotation$(description = " Set a frame handler on the connection. This handler will be called when frames are read on the connection.\n")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketBase")
  public WebSocketBase frameHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocketFrame)?") @Name("handler") @DocAnnotation$annotation$(description = "the handler\n") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame>() {
      public void handle(io.vertx.core.http.WebSocketFrame event) {
        handler.$call$((Object)io.vertx.ceylon.core.http.WebSocketFrame.TO_CEYLON.converter().safeConvert(event));
      }
    };
    WebSocketBase ret = io.vertx.ceylon.core.http.WebSocketBase.TO_CEYLON.converter().safeConvert(delegate.frameHandler(arg_0));
      return this;
    }

  @DocAnnotation$annotation$(description = " Close the WebSocket.\n")
  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
    }

  @DocAnnotation$annotation$(description = " @return the remote address for this socket\n")
  @TypeInfo("io.vertx.ceylon.core.net::SocketAddress")
  public SocketAddress remoteAddress() {
      if (cached_remoteAddress != null) {
        return cached_remoteAddress;
      }
    SocketAddress ret = io.vertx.ceylon.core.net.SocketAddress.TO_CEYLON.converter().safeConvert(delegate.remoteAddress());
      cached_remoteAddress = ret;
      return ret;
    }

  @DocAnnotation$annotation$(description = " @return the local address for this socket\n")
  @TypeInfo("io.vertx.ceylon.core.net::SocketAddress")
  public SocketAddress localAddress() {
      if (cached_localAddress != null) {
        return cached_localAddress;
      }
    SocketAddress ret = io.vertx.ceylon.core.net.SocketAddress.TO_CEYLON.converter().safeConvert(delegate.localAddress());
      cached_localAddress = ret;
      return ret;
    }
  }

}
