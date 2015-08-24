package io.vertx.ceylon.core.datagram;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;
import io.vertx.ceylon.core.buffer.Buffer;
import io.vertx.ceylon.core.metrics.Measured;
import io.vertx.ceylon.core.streams.ReadStream;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.ceylon.core.net.SocketAddress;

public class DatagramSocket implements ReadStream<DatagramPacket>, Measured {

  private final io.vertx.core.datagram.DatagramSocket delegate;

  public DatagramSocket(io.vertx.core.datagram.DatagramSocket delegate) {
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

  @TypeInfo("io.vertx.ceylon.core.datagram::DatagramSocket")
  public DatagramSocket send(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") Buffer packet, 
    final @TypeInfo("ceylon.language::Integer") long port, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.datagram::DatagramSocket)") Callable<?> handler) {
    io.vertx.core.buffer.Buffer arg_0 = (io.vertx.core.buffer.Buffer)packet.getDelegate();
    int arg_1 = (int)port;
    java.lang.String arg_2 = host.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> arg_3 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.datagram.DatagramSocket>(handler) { public Object toCeylon(io.vertx.core.datagram.DatagramSocket event) { return new io.vertx.ceylon.core.datagram.DatagramSocket(event); } };
    DatagramSocket ret = new io.vertx.ceylon.core.datagram.DatagramSocket(delegate.send(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.datagram::PacketWritestream")
  public PacketWritestream sender(
    final @TypeInfo("ceylon.language::Integer") long port, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String host) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    PacketWritestream ret = new io.vertx.ceylon.core.datagram.PacketWritestream(delegate.sender(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.datagram::DatagramSocket")
  public DatagramSocket send(
    final @TypeInfo("ceylon.language::String") ceylon.language.String str, 
    final @TypeInfo("ceylon.language::Integer") long port, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.datagram::DatagramSocket)") Callable<?> handler) {
    java.lang.String arg_0 = str.toString();
    int arg_1 = (int)port;
    java.lang.String arg_2 = host.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> arg_3 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.datagram.DatagramSocket>(handler) { public Object toCeylon(io.vertx.core.datagram.DatagramSocket event) { return new io.vertx.ceylon.core.datagram.DatagramSocket(event); } };
    DatagramSocket ret = new io.vertx.ceylon.core.datagram.DatagramSocket(delegate.send(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.datagram::DatagramSocket")
  public DatagramSocket send(
    final @TypeInfo("ceylon.language::String") ceylon.language.String str, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String enc, 
    final @TypeInfo("ceylon.language::Integer") long port, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.datagram::DatagramSocket)") Callable<?> handler) {
    java.lang.String arg_0 = str.toString();
    java.lang.String arg_1 = enc.toString();
    int arg_2 = (int)port;
    java.lang.String arg_3 = host.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> arg_4 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.datagram.DatagramSocket>(handler) { public Object toCeylon(io.vertx.core.datagram.DatagramSocket event) { return new io.vertx.ceylon.core.datagram.DatagramSocket(event); } };
    DatagramSocket ret = new io.vertx.ceylon.core.datagram.DatagramSocket(delegate.send(arg_0, arg_1, arg_2, arg_3, arg_4));
    return ret;
  }

  @TypeInfo("ceylon.language::Anything")
  public void close(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(handler) { public Object toCeylon(java.lang.Void event) { return null; } };
    delegate.close(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

  @TypeInfo("io.vertx.ceylon.core.net::SocketAddress")
  public SocketAddress localAddress() {
    SocketAddress ret = new io.vertx.ceylon.core.net.SocketAddress(delegate.localAddress());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.datagram::DatagramSocket")
  public DatagramSocket listenMulticastGroup(
    final @TypeInfo("ceylon.language::String") ceylon.language.String multicastAddress, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.datagram::DatagramSocket)") Callable<?> handler) {
    java.lang.String arg_0 = multicastAddress.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.datagram.DatagramSocket>(handler) { public Object toCeylon(io.vertx.core.datagram.DatagramSocket event) { return new io.vertx.ceylon.core.datagram.DatagramSocket(event); } };
    DatagramSocket ret = new io.vertx.ceylon.core.datagram.DatagramSocket(delegate.listenMulticastGroup(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.datagram::DatagramSocket")
  public DatagramSocket listenMulticastGroup(
    final @TypeInfo("ceylon.language::String") ceylon.language.String multicastAddress, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String networkInterface, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String source, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.datagram::DatagramSocket)") Callable<?> handler) {
    java.lang.String arg_0 = multicastAddress.toString();
    java.lang.String arg_1 = networkInterface.toString();
    java.lang.String arg_2 = source.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> arg_3 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.datagram.DatagramSocket>(handler) { public Object toCeylon(io.vertx.core.datagram.DatagramSocket event) { return new io.vertx.ceylon.core.datagram.DatagramSocket(event); } };
    DatagramSocket ret = new io.vertx.ceylon.core.datagram.DatagramSocket(delegate.listenMulticastGroup(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.datagram::DatagramSocket")
  public DatagramSocket unlistenMulticastGroup(
    final @TypeInfo("ceylon.language::String") ceylon.language.String multicastAddress, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.datagram::DatagramSocket)") Callable<?> handler) {
    java.lang.String arg_0 = multicastAddress.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.datagram.DatagramSocket>(handler) { public Object toCeylon(io.vertx.core.datagram.DatagramSocket event) { return new io.vertx.ceylon.core.datagram.DatagramSocket(event); } };
    DatagramSocket ret = new io.vertx.ceylon.core.datagram.DatagramSocket(delegate.unlistenMulticastGroup(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.datagram::DatagramSocket")
  public DatagramSocket unlistenMulticastGroup(
    final @TypeInfo("ceylon.language::String") ceylon.language.String multicastAddress, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String networkInterface, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String source, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.datagram::DatagramSocket)") Callable<?> handler) {
    java.lang.String arg_0 = multicastAddress.toString();
    java.lang.String arg_1 = networkInterface.toString();
    java.lang.String arg_2 = source.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> arg_3 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.datagram.DatagramSocket>(handler) { public Object toCeylon(io.vertx.core.datagram.DatagramSocket event) { return new io.vertx.ceylon.core.datagram.DatagramSocket(event); } };
    DatagramSocket ret = new io.vertx.ceylon.core.datagram.DatagramSocket(delegate.unlistenMulticastGroup(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.datagram::DatagramSocket")
  public DatagramSocket blockMulticastGroup(
    final @TypeInfo("ceylon.language::String") ceylon.language.String multicastAddress, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String sourceToBlock, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.datagram::DatagramSocket)") Callable<?> handler) {
    java.lang.String arg_0 = multicastAddress.toString();
    java.lang.String arg_1 = sourceToBlock.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> arg_2 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.datagram.DatagramSocket>(handler) { public Object toCeylon(io.vertx.core.datagram.DatagramSocket event) { return new io.vertx.ceylon.core.datagram.DatagramSocket(event); } };
    DatagramSocket ret = new io.vertx.ceylon.core.datagram.DatagramSocket(delegate.blockMulticastGroup(arg_0, arg_1, arg_2));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.datagram::DatagramSocket")
  public DatagramSocket blockMulticastGroup(
    final @TypeInfo("ceylon.language::String") ceylon.language.String multicastAddress, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String networkInterface, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String sourceToBlock, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.datagram::DatagramSocket)") Callable<?> handler) {
    java.lang.String arg_0 = multicastAddress.toString();
    java.lang.String arg_1 = networkInterface.toString();
    java.lang.String arg_2 = sourceToBlock.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> arg_3 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.datagram.DatagramSocket>(handler) { public Object toCeylon(io.vertx.core.datagram.DatagramSocket event) { return new io.vertx.ceylon.core.datagram.DatagramSocket(event); } };
    DatagramSocket ret = new io.vertx.ceylon.core.datagram.DatagramSocket(delegate.blockMulticastGroup(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.datagram::DatagramSocket")
  public DatagramSocket listen(
    final @TypeInfo("ceylon.language::Integer") long port, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.datagram::DatagramSocket)") Callable<?> handler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.datagram.DatagramSocket>> arg_2 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.datagram.DatagramSocket>(handler) { public Object toCeylon(io.vertx.core.datagram.DatagramSocket event) { return new io.vertx.ceylon.core.datagram.DatagramSocket(event); } };
    DatagramSocket ret = new io.vertx.ceylon.core.datagram.DatagramSocket(delegate.listen(arg_0, arg_1, arg_2));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.datagram::DatagramSocket")
  public DatagramSocket pause() {
    DatagramSocket ret = new io.vertx.ceylon.core.datagram.DatagramSocket(delegate.pause());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.datagram::DatagramSocket")
  public DatagramSocket resume() {
    DatagramSocket ret = new io.vertx.ceylon.core.datagram.DatagramSocket(delegate.resume());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.datagram::DatagramSocket")
  public DatagramSocket endHandler(
    final @TypeInfo("ceylon.language::Anything()") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { endHandler.$call$((Object)null); } };
    DatagramSocket ret = new io.vertx.ceylon.core.datagram.DatagramSocket(delegate.endHandler(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.datagram::DatagramSocket")
  public DatagramSocket handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.datagram::DatagramPacket)") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.datagram.DatagramPacket> arg_0 = new io.vertx.core.Handler<io.vertx.core.datagram.DatagramPacket>() { public void handle(io.vertx.core.datagram.DatagramPacket event) { handler.$call$((Object)new io.vertx.ceylon.core.datagram.DatagramPacket(event)); } };
    DatagramSocket ret = new io.vertx.ceylon.core.datagram.DatagramSocket(delegate.handler(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.datagram::DatagramSocket")
  public DatagramSocket exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = new io.vertx.core.Handler<java.lang.Throwable>() { public void handle(java.lang.Throwable event) { handler.$call$((Object)event); } };
    DatagramSocket ret = new io.vertx.ceylon.core.datagram.DatagramSocket(delegate.exceptionHandler(arg_0));
    return ret;
  }

}
