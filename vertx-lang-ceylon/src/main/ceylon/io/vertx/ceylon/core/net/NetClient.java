package io.vertx.ceylon.core.net;

import com.redhat.ceylon.compiler.java.metadata.Ceylon;
import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.metadata.Name;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import com.redhat.ceylon.compiler.java.runtime.model.ReifiedType;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.ceylon.core.metrics.Measured;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " A TCP client.\n <p>\n Multiple connections to different servers can be made using the same instance.\n <p>\n This client supports a configurable number of connection attempts and a configurable\n delay between attempts.\n")
public class NetClient implements ReifiedType,  Measured {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.net.NetClient, NetClient> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.net.NetClient, NetClient>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.net.NetClient, NetClient> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.net.NetClient, NetClient>() {
        public NetClient convert(io.vertx.core.net.NetClient src) {
          return new NetClient(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<NetClient, io.vertx.core.net.NetClient> TO_JAVA = new io.vertx.lang.ceylon.Converter<NetClient, io.vertx.core.net.NetClient>() {
    public io.vertx.core.net.NetClient convert(NetClient src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(NetClient.class), io.vertx.core.net.NetClient.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.core.net.NetClient delegate;

  public NetClient(io.vertx.core.net.NetClient delegate) {
    this.delegate = delegate;
  }

  @Ignore 
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = " Whether the metrics are enabled for this measured object\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean $isMetricsEnabled() {
    boolean ret = delegate.isMetricsEnabled();
    return ret;
  }

  @DocAnnotation$annotation$(description = " Open a connection to a server at the specific <code>port</code> and <code>host</code>.\n <p>\n <code>host</code> can be a valid host name or IP address. The connect is done asynchronously and on success, a\n [NetSocket](../net/NetSocket.type.html) instance is supplied via the <code>connectHandler</code> instance\n")
  @TypeInfo("io.vertx.ceylon.core.net::NetClient")
  public NetClient connect(
    final @TypeInfo("ceylon.language::Integer") @Name("port")@DocAnnotation$annotation$(description = "the port\n") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host")@DocAnnotation$annotation$(description = "the host\n") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.net::NetSocket)") @Name("connectHandler") Callable<?> connectHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetSocket>> arg_2 = connectHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.core.net.NetSocket>(connectHandler) {
      public Object toCeylon(io.vertx.core.net.NetSocket event) {
        return io.vertx.ceylon.core.net.NetSocket.TO_CEYLON.converter().safeConvert(event);
      }
    };
    NetClient ret = io.vertx.ceylon.core.net.NetClient.TO_CEYLON.converter().safeConvert(delegate.connect(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Open a connection to a server at the specific <code>port</code> and <code>host</code>.\n <p>\n <code>host</code> can be a valid host name or IP address. The connect is done asynchronously and on success, a\n [NetSocket](../net/NetSocket.type.html) instance is supplied via the <code>connectHandler</code> instance\n")
  @TypeInfo("io.vertx.ceylon.core.net::NetClient")
  public NetClient connect(
    final @TypeInfo("ceylon.language::Integer") @Name("port")@DocAnnotation$annotation$(description = "the port\n") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host")@DocAnnotation$annotation$(description = "the host\n") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("serverName")@DocAnnotation$annotation$(description = "the SNI server name\n") ceylon.language.String serverName, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.net::NetSocket)") @Name("connectHandler") Callable<?> connectHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(serverName);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetSocket>> arg_3 = connectHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.core.net.NetSocket>(connectHandler) {
      public Object toCeylon(io.vertx.core.net.NetSocket event) {
        return io.vertx.ceylon.core.net.NetSocket.TO_CEYLON.converter().safeConvert(event);
      }
    };
    NetClient ret = io.vertx.ceylon.core.net.NetClient.TO_CEYLON.converter().safeConvert(delegate.connect(arg_0, arg_1, arg_2, arg_3));
    return this;
  }

  @DocAnnotation$annotation$(description = " Open a connection to a server at the specific <code>remoteAddress</code>.\n <p>\n The connect is done asynchronously and on success, a [NetSocket](../net/NetSocket.type.html) instance is supplied via the <code>connectHandler</code> instance\n")
  @TypeInfo("io.vertx.ceylon.core.net::NetClient")
  public NetClient connect(
    final @TypeInfo("io.vertx.ceylon.core.net::SocketAddress") @Name("remoteAddress")@DocAnnotation$annotation$(description = "the remote address\n") SocketAddress remoteAddress, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.net::NetSocket)") @Name("connectHandler") Callable<?> connectHandler) {
    io.vertx.core.net.SocketAddress arg_0 = io.vertx.ceylon.core.net.SocketAddress.TO_JAVA.safeConvert(remoteAddress);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetSocket>> arg_1 = connectHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.core.net.NetSocket>(connectHandler) {
      public Object toCeylon(io.vertx.core.net.NetSocket event) {
        return io.vertx.ceylon.core.net.NetSocket.TO_CEYLON.converter().safeConvert(event);
      }
    };
    NetClient ret = io.vertx.ceylon.core.net.NetClient.TO_CEYLON.converter().safeConvert(delegate.connect(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Open a connection to a server at the specific <code>remoteAddress</code>.\n <p>\n The connect is done asynchronously and on success, a [NetSocket](../net/NetSocket.type.html) instance is supplied via the <code>connectHandler</code> instance\n")
  @TypeInfo("io.vertx.ceylon.core.net::NetClient")
  public NetClient connect(
    final @TypeInfo("io.vertx.ceylon.core.net::SocketAddress") @Name("remoteAddress")@DocAnnotation$annotation$(description = "the remote address\n") SocketAddress remoteAddress, 
    final @TypeInfo("ceylon.language::String") @Name("serverName")@DocAnnotation$annotation$(description = "the SNI server name\n") ceylon.language.String serverName, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.net::NetSocket)") @Name("connectHandler") Callable<?> connectHandler) {
    io.vertx.core.net.SocketAddress arg_0 = io.vertx.ceylon.core.net.SocketAddress.TO_JAVA.safeConvert(remoteAddress);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(serverName);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetSocket>> arg_2 = connectHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.core.net.NetSocket>(connectHandler) {
      public Object toCeylon(io.vertx.core.net.NetSocket event) {
        return io.vertx.ceylon.core.net.NetSocket.TO_CEYLON.converter().safeConvert(event);
      }
    };
    NetClient ret = io.vertx.ceylon.core.net.NetClient.TO_CEYLON.converter().safeConvert(delegate.connect(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Close the client.\n <p>\n Any sockets which have not been closed manually will be closed here. The close is asynchronous and may not\n complete until some time after the method has returned.\n")
  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

}
