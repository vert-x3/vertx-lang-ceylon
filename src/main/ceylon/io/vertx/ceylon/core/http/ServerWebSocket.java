package io.vertx.ceylon.core.http;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;
import io.vertx.ceylon.core.buffer.Buffer;
import io.vertx.ceylon.core.MultiMap;
import io.vertx.core.Handler;
import io.vertx.ceylon.core.net.SocketAddress;

public class ServerWebSocket implements WebSocketBase {

  private final io.vertx.core.http.ServerWebSocket delegate;

  public ServerWebSocket(io.vertx.core.http.ServerWebSocket delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  @TypeInfo("ceylon.language::Boolean")
  public boolean writeQueueFull() {
    boolean ret = delegate.writeQueueFull();
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String binaryHandlerID() {
    ceylon.language.String ret = new ceylon.language.String(delegate.binaryHandlerID());
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String textHandlerID() {
    ceylon.language.String ret = new ceylon.language.String(delegate.textHandlerID());
    return ret;
  }

  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

  @TypeInfo("io.vertx.ceylon.core.net::SocketAddress")
  public SocketAddress remoteAddress() {
    SocketAddress ret = new io.vertx.ceylon.core.net.SocketAddress(delegate.remoteAddress());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.net::SocketAddress")
  public SocketAddress localAddress() {
    SocketAddress ret = new io.vertx.ceylon.core.net.SocketAddress(delegate.localAddress());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = new io.vertx.core.Handler<java.lang.Throwable>() { public void handle(java.lang.Throwable event) { handler.$call$((Object)event); } };
    ServerWebSocket ret = new io.vertx.ceylon.core.http.ServerWebSocket(delegate.exceptionHandler(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_0 = new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() { public void handle(io.vertx.core.buffer.Buffer event) { handler.$call$((Object)new io.vertx.ceylon.core.buffer.Buffer(event)); } };
    ServerWebSocket ret = new io.vertx.ceylon.core.http.ServerWebSocket(delegate.handler(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket pause() {
    ServerWebSocket ret = new io.vertx.ceylon.core.http.ServerWebSocket(delegate.pause());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket resume() {
    ServerWebSocket ret = new io.vertx.ceylon.core.http.ServerWebSocket(delegate.resume());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket endHandler(
    final @TypeInfo("ceylon.language::Anything()") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { endHandler.$call$((Object)null); } };
    ServerWebSocket ret = new io.vertx.ceylon.core.http.ServerWebSocket(delegate.endHandler(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket write(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") Buffer data) {
    io.vertx.core.buffer.Buffer arg_0 = (io.vertx.core.buffer.Buffer)data.getDelegate();
    ServerWebSocket ret = new io.vertx.ceylon.core.http.ServerWebSocket(delegate.write(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket setWriteQueueMaxSize(
    final @TypeInfo("ceylon.language::Integer") long maxSize) {
    int arg_0 = (int)maxSize;
    ServerWebSocket ret = new io.vertx.ceylon.core.http.ServerWebSocket(delegate.setWriteQueueMaxSize(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket drainHandler(
    final @TypeInfo("ceylon.language::Anything()") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { handler.$call$((Object)null); } };
    ServerWebSocket ret = new io.vertx.ceylon.core.http.ServerWebSocket(delegate.drainHandler(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket writeFrame(
    final @TypeInfo("io.vertx.ceylon.core.http::WebSocketFrame") WebSocketFrame frame) {
    io.vertx.core.http.WebSocketFrame arg_0 = (io.vertx.core.http.WebSocketFrame)frame.getDelegate();
    ServerWebSocket ret = new io.vertx.ceylon.core.http.ServerWebSocket(delegate.writeFrame(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket writeFinalTextFrame(
    final @TypeInfo("ceylon.language::String") ceylon.language.String text) {
    java.lang.String arg_0 = text.toString();
    ServerWebSocket ret = new io.vertx.ceylon.core.http.ServerWebSocket(delegate.writeFinalTextFrame(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket writeFinalBinaryFrame(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") Buffer data) {
    io.vertx.core.buffer.Buffer arg_0 = (io.vertx.core.buffer.Buffer)data.getDelegate();
    ServerWebSocket ret = new io.vertx.ceylon.core.http.ServerWebSocket(delegate.writeFinalBinaryFrame(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket writeBinaryMessage(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") Buffer data) {
    io.vertx.core.buffer.Buffer arg_0 = (io.vertx.core.buffer.Buffer)data.getDelegate();
    ServerWebSocket ret = new io.vertx.ceylon.core.http.ServerWebSocket(delegate.writeBinaryMessage(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket closeHandler(
    final @TypeInfo("ceylon.language::Anything()") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { handler.$call$((Object)null); } };
    ServerWebSocket ret = new io.vertx.ceylon.core.http.ServerWebSocket(delegate.closeHandler(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket frameHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocketFrame)") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> arg_0 = new io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame>() { public void handle(io.vertx.core.http.WebSocketFrame event) { handler.$call$((Object)new io.vertx.ceylon.core.http.WebSocketFrame(event)); } };
    ServerWebSocket ret = new io.vertx.ceylon.core.http.ServerWebSocket(delegate.frameHandler(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String uri() {
    ceylon.language.String ret = new ceylon.language.String(delegate.uri());
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String path() {
    ceylon.language.String ret = new ceylon.language.String(delegate.path());
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String query() {
    ceylon.language.String ret = new ceylon.language.String(delegate.query());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap headers() {
    MultiMap ret = new io.vertx.ceylon.core.MultiMap(delegate.headers());
    return ret;
  }

  @TypeInfo("ceylon.language::Anything")
  public void reject() {
    delegate.reject();
  }

}
