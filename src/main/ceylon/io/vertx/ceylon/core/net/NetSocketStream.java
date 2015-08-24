package io.vertx.ceylon.core.net;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;
import io.vertx.ceylon.core.streams.ReadStream;
import io.vertx.core.Handler;

public class NetSocketStream implements ReadStream<NetSocket> {

  private final io.vertx.core.net.NetSocketStream delegate;

  public NetSocketStream(io.vertx.core.net.NetSocketStream delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetSocketStream")
  public NetSocketStream exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = new io.vertx.core.Handler<java.lang.Throwable>() { public void handle(java.lang.Throwable event) { handler.$call$((Object)event); } };
    NetSocketStream ret = new io.vertx.ceylon.core.net.NetSocketStream(delegate.exceptionHandler(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetSocketStream")
  public NetSocketStream handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.net::NetSocket)") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.net.NetSocket> arg_0 = new io.vertx.core.Handler<io.vertx.core.net.NetSocket>() { public void handle(io.vertx.core.net.NetSocket event) { handler.$call$((Object)new io.vertx.ceylon.core.net.NetSocket(event)); } };
    NetSocketStream ret = new io.vertx.ceylon.core.net.NetSocketStream(delegate.handler(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetSocketStream")
  public NetSocketStream pause() {
    NetSocketStream ret = new io.vertx.ceylon.core.net.NetSocketStream(delegate.pause());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetSocketStream")
  public NetSocketStream resume() {
    NetSocketStream ret = new io.vertx.ceylon.core.net.NetSocketStream(delegate.resume());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetSocketStream")
  public NetSocketStream endHandler(
    final @TypeInfo("ceylon.language::Anything()") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { endHandler.$call$((Object)null); } };
    NetSocketStream ret = new io.vertx.ceylon.core.net.NetSocketStream(delegate.endHandler(arg_0));
    return ret;
  }

}
