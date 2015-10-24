package io.vertx.ceylon.core.http;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.metadata.Name;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.ceylon.core.buffer.Buffer;
import io.vertx.ceylon.core.MultiMap;
import io.vertx.core.Handler;
import io.vertx.ceylon.core.net.SocketAddress;

@DocAnnotation$annotation$(description = "todo")
public class ServerWebSocket implements WebSocketBase {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(ServerWebSocket.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.http.ServerWebSocket, ServerWebSocket> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.http.ServerWebSocket, ServerWebSocket>() {
    public ServerWebSocket convert(io.vertx.core.http.ServerWebSocket src) {
      return new ServerWebSocket(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<ServerWebSocket, io.vertx.core.http.ServerWebSocket> TO_JAVA = new io.vertx.lang.ceylon.Converter<ServerWebSocket, io.vertx.core.http.ServerWebSocket>() {
    public io.vertx.core.http.ServerWebSocket convert(ServerWebSocket src) {
      return src.delegate;
    }
  };

  @Ignore private SocketAddress cached_remoteAddress;
  @Ignore private SocketAddress cached_localAddress;
  @Ignore private MultiMap cached_headers;
  @Ignore private final io.vertx.core.http.ServerWebSocket delegate;

  public ServerWebSocket(io.vertx.core.http.ServerWebSocket delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean writeQueueFull() {
    boolean ret = delegate.writeQueueFull();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String binaryHandlerID() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.binaryHandlerID());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String textHandlerID() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.textHandlerID());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.net::SocketAddress")
  public SocketAddress remoteAddress() {
    if (cached_remoteAddress != null) {
      return cached_remoteAddress;
    }
    SocketAddress ret = io.vertx.ceylon.core.net.SocketAddress.TO_CEYLON.safeConvert(delegate.remoteAddress());
     cached_remoteAddress = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.net::SocketAddress")
  public SocketAddress localAddress() {
    if (cached_localAddress != null) {
      return cached_localAddress;
    }
    SocketAddress ret = io.vertx.ceylon.core.net.SocketAddress.TO_CEYLON.safeConvert(delegate.localAddress());
     cached_localAddress = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        handler.$call$((Object)event);
      }
    };
    ServerWebSocket ret = io.vertx.ceylon.core.http.ServerWebSocket.TO_CEYLON.safeConvert(delegate.exceptionHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        handler.$call$((Object)io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.safeConvert(event));
      }
    };
    ServerWebSocket ret = io.vertx.ceylon.core.http.ServerWebSocket.TO_CEYLON.safeConvert(delegate.handler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket pause() {
    ServerWebSocket ret = io.vertx.ceylon.core.http.ServerWebSocket.TO_CEYLON.safeConvert(delegate.pause());
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket resume() {
    ServerWebSocket ret = io.vertx.ceylon.core.http.ServerWebSocket.TO_CEYLON.safeConvert(delegate.resume());
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket endHandler(
    final @TypeInfo("ceylon.language::Anything()") @Name("endHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = endHandler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        endHandler.$call$();
      }
    };
    ServerWebSocket ret = io.vertx.ceylon.core.http.ServerWebSocket.TO_CEYLON.safeConvert(delegate.endHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket write(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("data") @DocAnnotation$annotation$(description = "todo") Buffer data) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(data);
    ServerWebSocket ret = io.vertx.ceylon.core.http.ServerWebSocket.TO_CEYLON.safeConvert(delegate.write(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket setWriteQueueMaxSize(
    final @TypeInfo("ceylon.language::Integer") @Name("maxSize") @DocAnnotation$annotation$(description = "todo") long maxSize) {
    int arg_0 = (int)maxSize;
    ServerWebSocket ret = io.vertx.ceylon.core.http.ServerWebSocket.TO_CEYLON.safeConvert(delegate.setWriteQueueMaxSize(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket drainHandler(
    final @TypeInfo("ceylon.language::Anything()") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        handler.$call$();
      }
    };
    ServerWebSocket ret = io.vertx.ceylon.core.http.ServerWebSocket.TO_CEYLON.safeConvert(delegate.drainHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket writeFrame(
    final @TypeInfo("io.vertx.ceylon.core.http::WebSocketFrame") @Name("frame") @DocAnnotation$annotation$(description = "todo") WebSocketFrame frame) {
    io.vertx.core.http.WebSocketFrame arg_0 = io.vertx.ceylon.core.http.WebSocketFrame.TO_JAVA.safeConvert(frame);
    ServerWebSocket ret = io.vertx.ceylon.core.http.ServerWebSocket.TO_CEYLON.safeConvert(delegate.writeFrame(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket writeFinalTextFrame(
    final @TypeInfo("ceylon.language::String") @Name("text") @DocAnnotation$annotation$(description = "todo") ceylon.language.String text) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(text);
    ServerWebSocket ret = io.vertx.ceylon.core.http.ServerWebSocket.TO_CEYLON.safeConvert(delegate.writeFinalTextFrame(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket writeFinalBinaryFrame(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("data") @DocAnnotation$annotation$(description = "todo") Buffer data) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(data);
    ServerWebSocket ret = io.vertx.ceylon.core.http.ServerWebSocket.TO_CEYLON.safeConvert(delegate.writeFinalBinaryFrame(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket writeBinaryMessage(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("data") @DocAnnotation$annotation$(description = "todo") Buffer data) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(data);
    ServerWebSocket ret = io.vertx.ceylon.core.http.ServerWebSocket.TO_CEYLON.safeConvert(delegate.writeBinaryMessage(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket closeHandler(
    final @TypeInfo("ceylon.language::Anything()") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        handler.$call$();
      }
    };
    ServerWebSocket ret = io.vertx.ceylon.core.http.ServerWebSocket.TO_CEYLON.safeConvert(delegate.closeHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket frameHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocketFrame)") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame>() {
      public void handle(io.vertx.core.http.WebSocketFrame event) {
        handler.$call$((Object)io.vertx.ceylon.core.http.WebSocketFrame.TO_CEYLON.safeConvert(event));
      }
    };
    ServerWebSocket ret = io.vertx.ceylon.core.http.ServerWebSocket.TO_CEYLON.safeConvert(delegate.frameHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String uri() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.uri());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String path() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.path());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String query() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.query());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap headers() {
    if (cached_headers != null) {
      return cached_headers;
    }
    MultiMap ret = io.vertx.ceylon.core.MultiMap.TO_CEYLON.safeConvert(delegate.headers());
     cached_headers = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void reject() {
    delegate.reject();
  }

}
