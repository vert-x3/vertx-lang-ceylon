package io.vertx.ceylon.core.net;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;
import io.vertx.ceylon.core.metrics.Measured;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

public class NetClient implements Measured {

  private final io.vertx.core.net.NetClient delegate;

  public NetClient(io.vertx.core.net.NetClient delegate) {
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

  @TypeInfo("io.vertx.ceylon.core.net::NetClient")
  public NetClient connect(
    final @TypeInfo("ceylon.language::Integer") long port, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.net::NetSocket)") Callable<?> connectHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetSocket>> arg_2 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.net.NetSocket>(connectHandler) { public Object toCeylon(io.vertx.core.net.NetSocket event) { return new io.vertx.ceylon.core.net.NetSocket(event); } };
    NetClient ret = new io.vertx.ceylon.core.net.NetClient(delegate.connect(arg_0, arg_1, arg_2));
    return ret;
  }

  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

}
