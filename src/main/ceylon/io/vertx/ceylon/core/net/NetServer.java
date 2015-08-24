package io.vertx.ceylon.core.net;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;
import io.vertx.ceylon.core.metrics.Measured;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

public class NetServer implements Measured {

  private final io.vertx.core.net.NetServer delegate;

  public NetServer(io.vertx.core.net.NetServer delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  @TypeInfo("ceylon.language::Boolean")
  public boolean isMetricsEnabled() {
    boolean ret = delegate.isMetricsEnabled();
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetSocketStream")
  public NetSocketStream connectStream() {
    NetSocketStream ret = new io.vertx.ceylon.core.net.NetSocketStream(delegate.connectStream());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetServer")
  public NetServer connectHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.net::NetSocket)") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.net.NetSocket> arg_0 = new io.vertx.core.Handler<io.vertx.core.net.NetSocket>() { public void handle(io.vertx.core.net.NetSocket event) { handler.$call$((Object)new io.vertx.ceylon.core.net.NetSocket(event)); } };
    NetServer ret = new io.vertx.ceylon.core.net.NetServer(delegate.connectHandler(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetServer")
  public NetServer listen() {
    NetServer ret = new io.vertx.ceylon.core.net.NetServer(delegate.listen());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetServer")
  public NetServer listen(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.net::NetServer)") Callable<?> listenHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.net.NetServer>(listenHandler) { public Object toCeylon(io.vertx.core.net.NetServer event) { return new io.vertx.ceylon.core.net.NetServer(event); } };
    NetServer ret = new io.vertx.ceylon.core.net.NetServer(delegate.listen(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetServer")
  public NetServer listen(
    final @TypeInfo("ceylon.language::Integer") long port, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String host) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    NetServer ret = new io.vertx.ceylon.core.net.NetServer(delegate.listen(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetServer")
  public NetServer listen(
    final @TypeInfo("ceylon.language::Integer") long port, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.net::NetServer)") Callable<?> listenHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> arg_2 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.net.NetServer>(listenHandler) { public Object toCeylon(io.vertx.core.net.NetServer event) { return new io.vertx.ceylon.core.net.NetServer(event); } };
    NetServer ret = new io.vertx.ceylon.core.net.NetServer(delegate.listen(arg_0, arg_1, arg_2));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetServer")
  public NetServer listen(
    final @TypeInfo("ceylon.language::Integer") long port) {
    int arg_0 = (int)port;
    NetServer ret = new io.vertx.ceylon.core.net.NetServer(delegate.listen(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetServer")
  public NetServer listen(
    final @TypeInfo("ceylon.language::Integer") long port, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.net::NetServer)") Callable<?> listenHandler) {
    int arg_0 = (int)port;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.net.NetServer>(listenHandler) { public Object toCeylon(io.vertx.core.net.NetServer event) { return new io.vertx.ceylon.core.net.NetServer(event); } };
    NetServer ret = new io.vertx.ceylon.core.net.NetServer(delegate.listen(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

  @TypeInfo("ceylon.language::Anything")
  public void close(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") Callable<?> completionHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(completionHandler) { public Object toCeylon(java.lang.Void event) { return null; } };
    delegate.close(arg_0);
  }

  @TypeInfo("ceylon.language::Integer")
  public long actualPort() {
    long ret = delegate.actualPort();
    return ret;
  }

}
