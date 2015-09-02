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
public class NetClient implements Measured {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(NetClient.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.net.NetClient, NetClient> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.net.NetClient, NetClient>() {
    public NetClient convert(io.vertx.core.net.NetClient src) {
      return new NetClient(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<NetClient, io.vertx.core.net.NetClient> TO_JAVA = new io.vertx.lang.ceylon.Converter<NetClient, io.vertx.core.net.NetClient>() {
    public io.vertx.core.net.NetClient convert(NetClient src) {
      return src.delegate;
    }
  };

  @Ignore private final io.vertx.core.net.NetClient delegate;

  public NetClient(io.vertx.core.net.NetClient delegate) {
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
  @TypeInfo("io.vertx.ceylon.core.net::NetClient")
  public NetClient connect(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.net::NetSocket)") @DocAnnotation$annotation$(description = "todo") Callable<?> connectHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetSocket>> arg_2 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.net.NetSocket>(connectHandler) { public Object toCeylon(io.vertx.core.net.NetSocket event) { return io.vertx.ceylon.core.net.NetSocket.TO_CEYLON.convert(event); } };
    NetClient ret = io.vertx.ceylon.core.net.NetClient.TO_CEYLON.convert(delegate.connect(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

}
