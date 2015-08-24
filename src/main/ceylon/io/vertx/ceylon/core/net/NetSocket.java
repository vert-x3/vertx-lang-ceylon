package io.vertx.ceylon.core.net;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;
import io.vertx.ceylon.core.buffer.Buffer;
import io.vertx.ceylon.core.streams.WriteStream;
import io.vertx.ceylon.core.streams.ReadStream;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

public class NetSocket implements ReadStream<Buffer>, WriteStream<Buffer> {

  private final io.vertx.core.net.NetSocket delegate;

  public NetSocket(io.vertx.core.net.NetSocket delegate) {
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

  @TypeInfo("io.vertx.ceylon.core.net::NetSocket")
  public NetSocket exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = new io.vertx.core.Handler<java.lang.Throwable>() { public void handle(java.lang.Throwable event) { handler.$call$((Object)event); } };
    NetSocket ret = new io.vertx.ceylon.core.net.NetSocket(delegate.exceptionHandler(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetSocket")
  public NetSocket handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_0 = new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() { public void handle(io.vertx.core.buffer.Buffer event) { handler.$call$((Object)new io.vertx.ceylon.core.buffer.Buffer(event)); } };
    NetSocket ret = new io.vertx.ceylon.core.net.NetSocket(delegate.handler(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetSocket")
  public NetSocket pause() {
    NetSocket ret = new io.vertx.ceylon.core.net.NetSocket(delegate.pause());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetSocket")
  public NetSocket resume() {
    NetSocket ret = new io.vertx.ceylon.core.net.NetSocket(delegate.resume());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetSocket")
  public NetSocket endHandler(
    final @TypeInfo("ceylon.language::Anything()") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { endHandler.$call$((Object)null); } };
    NetSocket ret = new io.vertx.ceylon.core.net.NetSocket(delegate.endHandler(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetSocket")
  public NetSocket write(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") Buffer data) {
    io.vertx.core.buffer.Buffer arg_0 = (io.vertx.core.buffer.Buffer)data.getDelegate();
    NetSocket ret = new io.vertx.ceylon.core.net.NetSocket(delegate.write(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetSocket")
  public NetSocket setWriteQueueMaxSize(
    final @TypeInfo("ceylon.language::Integer") long maxSize) {
    int arg_0 = (int)maxSize;
    NetSocket ret = new io.vertx.ceylon.core.net.NetSocket(delegate.setWriteQueueMaxSize(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetSocket")
  public NetSocket drainHandler(
    final @TypeInfo("ceylon.language::Anything()") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { handler.$call$((Object)null); } };
    NetSocket ret = new io.vertx.ceylon.core.net.NetSocket(delegate.drainHandler(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String writeHandlerID() {
    ceylon.language.String ret = new ceylon.language.String(delegate.writeHandlerID());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetSocket")
  public NetSocket write(
    final @TypeInfo("ceylon.language::String") ceylon.language.String str) {
    java.lang.String arg_0 = str.toString();
    NetSocket ret = new io.vertx.ceylon.core.net.NetSocket(delegate.write(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetSocket")
  public NetSocket write(
    final @TypeInfo("ceylon.language::String") ceylon.language.String str, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String enc) {
    java.lang.String arg_0 = str.toString();
    java.lang.String arg_1 = enc.toString();
    NetSocket ret = new io.vertx.ceylon.core.net.NetSocket(delegate.write(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetSocket")
  public NetSocket sendFile(
    final @TypeInfo("ceylon.language::String") ceylon.language.String filename, 
    final @TypeInfo("ceylon.language::Integer") long offset, 
    final @TypeInfo("ceylon.language::Integer") long length) {
    java.lang.String arg_0 = filename.toString();
    long arg_1 = offset;
    long arg_2 = length;
    NetSocket ret = new io.vertx.ceylon.core.net.NetSocket(delegate.sendFile(arg_0, arg_1, arg_2));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetSocket")
  public NetSocket sendFile(
    final @TypeInfo("ceylon.language::String") ceylon.language.String filename, 
    final @TypeInfo("ceylon.language::Integer") long offset, 
    final @TypeInfo("ceylon.language::Integer") long length, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") Callable<?> resultHandler) {
    java.lang.String arg_0 = filename.toString();
    long arg_1 = offset;
    long arg_2 = length;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_3 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(resultHandler) { public Object toCeylon(java.lang.Void event) { return null; } };
    NetSocket ret = new io.vertx.ceylon.core.net.NetSocket(delegate.sendFile(arg_0, arg_1, arg_2, arg_3));
    return ret;
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

  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetSocket")
  public NetSocket closeHandler(
    final @TypeInfo("ceylon.language::Anything()") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { handler.$call$((Object)null); } };
    NetSocket ret = new io.vertx.ceylon.core.net.NetSocket(delegate.closeHandler(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.net::NetSocket")
  public NetSocket upgradeToSsl(
    final @TypeInfo("ceylon.language::Anything()") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { handler.$call$((Object)null); } };
    NetSocket ret = new io.vertx.ceylon.core.net.NetSocket(delegate.upgradeToSsl(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::Boolean")
  public boolean isSsl() {
    boolean ret = delegate.isSsl();
    return ret;
  }

}
