package io.vertx.ceylon.core.http;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;
import io.vertx.ceylon.core.streams.ReadStream;
import io.vertx.core.Handler;

public class ServerWebSocketStream implements ReadStream<ServerWebSocket> {

  private final io.vertx.core.http.ServerWebSocketStream delegate;

  public ServerWebSocketStream(io.vertx.core.http.ServerWebSocketStream delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocketStream")
  public ServerWebSocketStream exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = new io.vertx.core.Handler<java.lang.Throwable>() { public void handle(java.lang.Throwable event) { handler.$call$((Object)event); } };
    ServerWebSocketStream ret = new io.vertx.ceylon.core.http.ServerWebSocketStream(delegate.exceptionHandler(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocketStream")
  public ServerWebSocketStream handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::ServerWebSocket)") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket> arg_0 = new io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket>() { public void handle(io.vertx.core.http.ServerWebSocket event) { handler.$call$((Object)new io.vertx.ceylon.core.http.ServerWebSocket(event)); } };
    ServerWebSocketStream ret = new io.vertx.ceylon.core.http.ServerWebSocketStream(delegate.handler(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocketStream")
  public ServerWebSocketStream pause() {
    ServerWebSocketStream ret = new io.vertx.ceylon.core.http.ServerWebSocketStream(delegate.pause());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocketStream")
  public ServerWebSocketStream resume() {
    ServerWebSocketStream ret = new io.vertx.ceylon.core.http.ServerWebSocketStream(delegate.resume());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocketStream")
  public ServerWebSocketStream endHandler(
    final @TypeInfo("ceylon.language::Anything()") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { endHandler.$call$((Object)null); } };
    ServerWebSocketStream ret = new io.vertx.ceylon.core.http.ServerWebSocketStream(delegate.endHandler(arg_0));
    return ret;
  }

}
