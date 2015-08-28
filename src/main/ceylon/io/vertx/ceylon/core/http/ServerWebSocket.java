package io.vertx.ceylon.core.http;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
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

  @Ignore
  private final io.vertx.core.http.ServerWebSocket delegate;

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
    ceylon.language.String ret = new ceylon.language.String(delegate.binaryHandlerID());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String textHandlerID() {
    ceylon.language.String ret = new ceylon.language.String(delegate.textHandlerID());
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
    SocketAddress ret = new io.vertx.ceylon.core.net.SocketAddress(delegate.remoteAddress());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.net::SocketAddress")
  public SocketAddress localAddress() {
    SocketAddress ret = new io.vertx.ceylon.core.net.SocketAddress(delegate.localAddress());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = new io.vertx.core.Handler<java.lang.Throwable>() { public void handle(java.lang.Throwable event) { handler.$call$((Object)event); } };
    ServerWebSocket ret = new io.vertx.ceylon.core.http.ServerWebSocket(delegate.exceptionHandler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_0 = new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() { public void handle(io.vertx.core.buffer.Buffer event) { handler.$call$((Object)new io.vertx.ceylon.core.buffer.Buffer(event)); } };
    ServerWebSocket ret = new io.vertx.ceylon.core.http.ServerWebSocket(delegate.handler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket pause() {
    ServerWebSocket ret = new io.vertx.ceylon.core.http.ServerWebSocket(delegate.pause());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket resume() {
    ServerWebSocket ret = new io.vertx.ceylon.core.http.ServerWebSocket(delegate.resume());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket endHandler(
    final @TypeInfo("ceylon.language::Anything()") @DocAnnotation$annotation$(description = "todo") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { endHandler.$call$((Object)null); } };
    ServerWebSocket ret = new io.vertx.ceylon.core.http.ServerWebSocket(delegate.endHandler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket write(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @DocAnnotation$annotation$(description = "todo") Buffer data) {
    io.vertx.core.buffer.Buffer arg_0 = (io.vertx.core.buffer.Buffer)data.getDelegate();
    ServerWebSocket ret = new io.vertx.ceylon.core.http.ServerWebSocket(delegate.write(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket setWriteQueueMaxSize(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long maxSize) {
    int arg_0 = (int)maxSize;
    ServerWebSocket ret = new io.vertx.ceylon.core.http.ServerWebSocket(delegate.setWriteQueueMaxSize(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket drainHandler(
    final @TypeInfo("ceylon.language::Anything()") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { handler.$call$((Object)null); } };
    ServerWebSocket ret = new io.vertx.ceylon.core.http.ServerWebSocket(delegate.drainHandler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket writeFrame(
    final @TypeInfo("io.vertx.ceylon.core.http::WebSocketFrame") @DocAnnotation$annotation$(description = "todo") WebSocketFrame frame) {
    io.vertx.core.http.WebSocketFrame arg_0 = (io.vertx.core.http.WebSocketFrame)frame.getDelegate();
    ServerWebSocket ret = new io.vertx.ceylon.core.http.ServerWebSocket(delegate.writeFrame(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket writeFinalTextFrame(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String text) {
    java.lang.String arg_0 = text.toString();
    ServerWebSocket ret = new io.vertx.ceylon.core.http.ServerWebSocket(delegate.writeFinalTextFrame(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket writeFinalBinaryFrame(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @DocAnnotation$annotation$(description = "todo") Buffer data) {
    io.vertx.core.buffer.Buffer arg_0 = (io.vertx.core.buffer.Buffer)data.getDelegate();
    ServerWebSocket ret = new io.vertx.ceylon.core.http.ServerWebSocket(delegate.writeFinalBinaryFrame(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket writeBinaryMessage(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @DocAnnotation$annotation$(description = "todo") Buffer data) {
    io.vertx.core.buffer.Buffer arg_0 = (io.vertx.core.buffer.Buffer)data.getDelegate();
    ServerWebSocket ret = new io.vertx.ceylon.core.http.ServerWebSocket(delegate.writeBinaryMessage(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket closeHandler(
    final @TypeInfo("ceylon.language::Anything()") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { handler.$call$((Object)null); } };
    ServerWebSocket ret = new io.vertx.ceylon.core.http.ServerWebSocket(delegate.closeHandler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket frameHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocketFrame)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> arg_0 = new io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame>() { public void handle(io.vertx.core.http.WebSocketFrame event) { handler.$call$((Object)new io.vertx.ceylon.core.http.WebSocketFrame(event)); } };
    ServerWebSocket ret = new io.vertx.ceylon.core.http.ServerWebSocket(delegate.frameHandler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String uri() {
    ceylon.language.String ret = new ceylon.language.String(delegate.uri());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String path() {
    ceylon.language.String ret = new ceylon.language.String(delegate.path());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String query() {
    ceylon.language.String ret = new ceylon.language.String(delegate.query());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap headers() {
    MultiMap ret = new io.vertx.ceylon.core.MultiMap(delegate.headers());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void reject() {
    delegate.reject();
  }

}
