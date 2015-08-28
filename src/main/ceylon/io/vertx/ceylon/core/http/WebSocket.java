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
import io.vertx.core.Handler;
import io.vertx.ceylon.core.net.SocketAddress;

@DocAnnotation$annotation$(description = "todo")
public class WebSocket implements WebSocketBase {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(WebSocket.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.http.WebSocket, WebSocket> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.http.WebSocket, WebSocket>() {
    public WebSocket convert(io.vertx.core.http.WebSocket src) {
      return new WebSocket(src);
    }
  };

  @Ignore
  private final io.vertx.core.http.WebSocket delegate;

  public WebSocket(io.vertx.core.http.WebSocket delegate) {
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
  @TypeInfo("io.vertx.ceylon.core.http::WebSocket")
  public WebSocket exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = new io.vertx.core.Handler<java.lang.Throwable>() { public void handle(java.lang.Throwable event) { handler.$call$((Object)event); } };
    WebSocket ret = new io.vertx.ceylon.core.http.WebSocket(delegate.exceptionHandler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocket")
  public WebSocket handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_0 = new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() { public void handle(io.vertx.core.buffer.Buffer event) { handler.$call$((Object)new io.vertx.ceylon.core.buffer.Buffer(event)); } };
    WebSocket ret = new io.vertx.ceylon.core.http.WebSocket(delegate.handler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocket")
  public WebSocket pause() {
    WebSocket ret = new io.vertx.ceylon.core.http.WebSocket(delegate.pause());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocket")
  public WebSocket resume() {
    WebSocket ret = new io.vertx.ceylon.core.http.WebSocket(delegate.resume());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocket")
  public WebSocket endHandler(
    final @TypeInfo("ceylon.language::Anything()") @DocAnnotation$annotation$(description = "todo") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { endHandler.$call$((Object)null); } };
    WebSocket ret = new io.vertx.ceylon.core.http.WebSocket(delegate.endHandler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocket")
  public WebSocket write(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @DocAnnotation$annotation$(description = "todo") Buffer data) {
    io.vertx.core.buffer.Buffer arg_0 = (io.vertx.core.buffer.Buffer)data.getDelegate();
    WebSocket ret = new io.vertx.ceylon.core.http.WebSocket(delegate.write(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocket")
  public WebSocket setWriteQueueMaxSize(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long maxSize) {
    int arg_0 = (int)maxSize;
    WebSocket ret = new io.vertx.ceylon.core.http.WebSocket(delegate.setWriteQueueMaxSize(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocket")
  public WebSocket drainHandler(
    final @TypeInfo("ceylon.language::Anything()") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { handler.$call$((Object)null); } };
    WebSocket ret = new io.vertx.ceylon.core.http.WebSocket(delegate.drainHandler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocket")
  public WebSocket writeFrame(
    final @TypeInfo("io.vertx.ceylon.core.http::WebSocketFrame") @DocAnnotation$annotation$(description = "todo") WebSocketFrame frame) {
    io.vertx.core.http.WebSocketFrame arg_0 = (io.vertx.core.http.WebSocketFrame)frame.getDelegate();
    WebSocket ret = new io.vertx.ceylon.core.http.WebSocket(delegate.writeFrame(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocket")
  public WebSocket writeFinalTextFrame(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String text) {
    java.lang.String arg_0 = text.toString();
    WebSocket ret = new io.vertx.ceylon.core.http.WebSocket(delegate.writeFinalTextFrame(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocket")
  public WebSocket writeFinalBinaryFrame(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @DocAnnotation$annotation$(description = "todo") Buffer data) {
    io.vertx.core.buffer.Buffer arg_0 = (io.vertx.core.buffer.Buffer)data.getDelegate();
    WebSocket ret = new io.vertx.ceylon.core.http.WebSocket(delegate.writeFinalBinaryFrame(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocket")
  public WebSocket writeBinaryMessage(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @DocAnnotation$annotation$(description = "todo") Buffer data) {
    io.vertx.core.buffer.Buffer arg_0 = (io.vertx.core.buffer.Buffer)data.getDelegate();
    WebSocket ret = new io.vertx.ceylon.core.http.WebSocket(delegate.writeBinaryMessage(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocket")
  public WebSocket closeHandler(
    final @TypeInfo("ceylon.language::Anything()") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { handler.$call$((Object)null); } };
    WebSocket ret = new io.vertx.ceylon.core.http.WebSocket(delegate.closeHandler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocket")
  public WebSocket frameHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocketFrame)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame> arg_0 = new io.vertx.core.Handler<io.vertx.core.http.WebSocketFrame>() { public void handle(io.vertx.core.http.WebSocketFrame event) { handler.$call$((Object)new io.vertx.ceylon.core.http.WebSocketFrame(event)); } };
    WebSocket ret = new io.vertx.ceylon.core.http.WebSocket(delegate.frameHandler(arg_0));
    return ret;
  }

}
