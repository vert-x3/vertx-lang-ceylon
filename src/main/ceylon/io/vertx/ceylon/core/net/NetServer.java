package io.vertx.ceylon.core.net;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.ceylon.core.metrics.Measured;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@DocAnnotation$annotation$(description = "todo")
public class NetServer implements Measured {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(NetServer.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.net.NetServer, NetServer> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.net.NetServer, NetServer>() {
    public NetServer convert(io.vertx.core.net.NetServer src) {
      return new NetServer(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<NetServer, io.vertx.core.net.NetServer> TO_JAVA = new io.vertx.lang.ceylon.Converter<NetServer, io.vertx.core.net.NetServer>() {
    public io.vertx.core.net.NetServer convert(NetServer src) {
      return src.delegate;
    }
  };

  @Ignore
  private final io.vertx.core.net.NetServer delegate;

  public NetServer(io.vertx.core.net.NetServer delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isMetricsEnabled() {
    boolean ret = delegate.isMetricsEnabled();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.net::NetSocketStream")
  public NetSocketStream connectStream() {
    NetSocketStream ret = io.vertx.ceylon.core.net.NetSocketStream.TO_CEYLON.convert(delegate.connectStream());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.net::NetServer")
  public NetServer connectHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.net::NetSocket)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.net.NetSocket> arg_0 = new io.vertx.core.Handler<io.vertx.core.net.NetSocket>() { public void handle(io.vertx.core.net.NetSocket event) { handler.$call$((Object)io.vertx.ceylon.core.net.NetSocket.TO_CEYLON.convert(event)); } };
    NetServer ret = io.vertx.ceylon.core.net.NetServer.TO_CEYLON.convert(delegate.connectHandler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.net::NetServer")
  public NetServer listen() {
    NetServer ret = io.vertx.ceylon.core.net.NetServer.TO_CEYLON.convert(delegate.listen());
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.net::NetServer")
  public NetServer listen(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.net::NetServer)") @DocAnnotation$annotation$(description = "todo") Callable<?> listenHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.net.NetServer>(listenHandler) { public Object toCeylon(io.vertx.core.net.NetServer event) { return io.vertx.ceylon.core.net.NetServer.TO_CEYLON.convert(event); } };
    NetServer ret = io.vertx.ceylon.core.net.NetServer.TO_CEYLON.convert(delegate.listen(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.net::NetServer")
  public NetServer listen(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    NetServer ret = io.vertx.ceylon.core.net.NetServer.TO_CEYLON.convert(delegate.listen(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.net::NetServer")
  public NetServer listen(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.net::NetServer)") @DocAnnotation$annotation$(description = "todo") Callable<?> listenHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> arg_2 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.net.NetServer>(listenHandler) { public Object toCeylon(io.vertx.core.net.NetServer event) { return io.vertx.ceylon.core.net.NetServer.TO_CEYLON.convert(event); } };
    NetServer ret = io.vertx.ceylon.core.net.NetServer.TO_CEYLON.convert(delegate.listen(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.net::NetServer")
  public NetServer listen(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port) {
    int arg_0 = (int)port;
    NetServer ret = io.vertx.ceylon.core.net.NetServer.TO_CEYLON.convert(delegate.listen(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.net::NetServer")
  public NetServer listen(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.net::NetServer)") @DocAnnotation$annotation$(description = "todo") Callable<?> listenHandler) {
    int arg_0 = (int)port;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.net.NetServer>(listenHandler) { public Object toCeylon(io.vertx.core.net.NetServer event) { return io.vertx.ceylon.core.net.NetServer.TO_CEYLON.convert(event); } };
    NetServer ret = io.vertx.ceylon.core.net.NetServer.TO_CEYLON.convert(delegate.listen(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void close(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @DocAnnotation$annotation$(description = "todo") Callable<?> completionHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(completionHandler) { public Object toCeylon(java.lang.Void event) { return null; } };
    delegate.close(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long actualPort() {
    long ret = delegate.actualPort();
    return ret;
  }

}
