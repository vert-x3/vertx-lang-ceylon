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
@DocAnnotation$annotation$(description = " Represents a TCP server\n")
public class NetServer implements ReifiedType,  Measured {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.net.NetServer, NetServer> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.net.NetServer, NetServer>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.net.NetServer, NetServer> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.net.NetServer, NetServer>() {
        public NetServer convert(io.vertx.core.net.NetServer src) {
          return new NetServer(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<NetServer, io.vertx.core.net.NetServer> TO_JAVA = new io.vertx.lang.ceylon.Converter<NetServer, io.vertx.core.net.NetServer>() {
    public io.vertx.core.net.NetServer convert(NetServer src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(NetServer.class), io.vertx.core.net.NetServer.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.core.net.NetServer delegate;

  public NetServer(io.vertx.core.net.NetServer delegate) {
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

  @DocAnnotation$annotation$(description = " Return the connect stream for this server. The server can only have at most one handler at any one time.\n As the server accepts TCP or SSL connections it creates an instance of [NetSocket](../net/NetSocket.type.html) and passes it to the\n connect stream .\n")
  @TypeInfo("io.vertx.ceylon.core.net::NetSocketStream")
  public NetSocketStream connectStream() {
    NetSocketStream ret = io.vertx.ceylon.core.net.NetSocketStream.TO_CEYLON.converter().safeConvert(delegate.connectStream());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Supply a connect handler for this server. The server can only have at most one connect handler at any one time.\n As the server accepts TCP or SSL connections it creates an instance of [NetSocket](../net/NetSocket.type.html) and passes it to the\n connect handler.\n")
  @TypeInfo("io.vertx.ceylon.core.net::NetServer")
  public NetServer connectHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.net::NetSocket)?") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.net.NetSocket> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.net.NetSocket>() {
      public void handle(io.vertx.core.net.NetSocket event) {
        handler.$call$((Object)io.vertx.ceylon.core.net.NetSocket.TO_CEYLON.converter().safeConvert(event));
      }
    };
    NetServer ret = io.vertx.ceylon.core.net.NetServer.TO_CEYLON.converter().safeConvert(delegate.connectHandler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Start listening on the port and host as configured in the [NetServerOptions](../net/NetServerOptions.type.html) used when\n creating the server.\n <p>\n The server may not be listening until some time after the call to listen has returned.\n")
  @TypeInfo("io.vertx.ceylon.core.net::NetServer")
  public NetServer listen() {
    NetServer ret = io.vertx.ceylon.core.net.NetServer.TO_CEYLON.converter().safeConvert(delegate.listen());
    return this;
  }

  @DocAnnotation$annotation$(description = " Like [listen](../net/NetServer.type.html#listen) but providing a handler that will be notified when the server is listening, or fails.\n")
  @TypeInfo("io.vertx.ceylon.core.net::NetServer")
  public NetServer listen(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.net::NetServer)") @Name("listenHandler")@DocAnnotation$annotation$(description = "handler that will be notified when listening or failed\n") Callable<?> listenHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> arg_0 = listenHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.core.net.NetServer>(listenHandler) {
      public Object toCeylon(io.vertx.core.net.NetServer event) {
        return io.vertx.ceylon.core.net.NetServer.TO_CEYLON.converter().safeConvert(event);
      }
    };
    NetServer ret = io.vertx.ceylon.core.net.NetServer.TO_CEYLON.converter().safeConvert(delegate.listen(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Start listening on the specified port and host, ignoring post and host configured in the [NetServerOptions](../net/NetServerOptions.type.html) used when\n creating the server.\n <p>\n Port <code>0</code> can be specified meaning \"choose an random port\".\n <p>\n Host <code>0.0.0.0</code> can be specified meaning \"listen on all available interfaces\".\n <p>\n The server may not be listening until some time after the call to listen has returned.\n")
  @TypeInfo("io.vertx.ceylon.core.net::NetServer")
  public NetServer listen(
    final @TypeInfo("ceylon.language::Integer") @Name("port") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") ceylon.language.String host) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    NetServer ret = io.vertx.ceylon.core.net.NetServer.TO_CEYLON.converter().safeConvert(delegate.listen(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Like [listen](../net/NetServer.type.html#listen) but providing a handler that will be notified when the server is listening, or fails.\n")
  @TypeInfo("io.vertx.ceylon.core.net::NetServer")
  public NetServer listen(
    final @TypeInfo("ceylon.language::Integer") @Name("port")@DocAnnotation$annotation$(description = "the port to listen on\n") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host")@DocAnnotation$annotation$(description = "the host to listen on\n") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.net::NetServer)") @Name("listenHandler")@DocAnnotation$annotation$(description = "handler that will be notified when listening or failed\n") Callable<?> listenHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> arg_2 = listenHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.core.net.NetServer>(listenHandler) {
      public Object toCeylon(io.vertx.core.net.NetServer event) {
        return io.vertx.ceylon.core.net.NetServer.TO_CEYLON.converter().safeConvert(event);
      }
    };
    NetServer ret = io.vertx.ceylon.core.net.NetServer.TO_CEYLON.converter().safeConvert(delegate.listen(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Start listening on the specified port and host \"0.0.0.0\", ignoring post and host configured in the\n [NetServerOptions](../net/NetServerOptions.type.html) used when creating the server.\n <p>\n Port <code>0</code> can be specified meaning \"choose an random port\".\n <p>\n The server may not be listening until some time after the call to listen has returned.\n")
  @TypeInfo("io.vertx.ceylon.core.net::NetServer")
  public NetServer listen(
    final @TypeInfo("ceylon.language::Integer") @Name("port") long port) {
    int arg_0 = (int)port;
    NetServer ret = io.vertx.ceylon.core.net.NetServer.TO_CEYLON.converter().safeConvert(delegate.listen(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Like [listen](../net/NetServer.type.html#listen) but providing a handler that will be notified when the server is listening, or fails.\n")
  @TypeInfo("io.vertx.ceylon.core.net::NetServer")
  public NetServer listen(
    final @TypeInfo("ceylon.language::Integer") @Name("port")@DocAnnotation$annotation$(description = "the port to listen on\n") long port, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.net::NetServer)") @Name("listenHandler")@DocAnnotation$annotation$(description = "handler that will be notified when listening or failed\n") Callable<?> listenHandler) {
    int arg_0 = (int)port;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.net.NetServer>> arg_1 = listenHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.core.net.NetServer>(listenHandler) {
      public Object toCeylon(io.vertx.core.net.NetServer event) {
        return io.vertx.ceylon.core.net.NetServer.TO_CEYLON.converter().safeConvert(event);
      }
    };
    NetServer ret = io.vertx.ceylon.core.net.NetServer.TO_CEYLON.converter().safeConvert(delegate.listen(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Close the server. This will close any currently open connections. The close may not complete until after this\n method has returned.\n")
  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

  @DocAnnotation$annotation$(description = " Like [close](../net/NetServer.type.html#close) but supplying a handler that will be notified when close is complete.\n")
  @TypeInfo("ceylon.language::Anything")
  public void close(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("completionHandler")@DocAnnotation$annotation$(description = "the handler\n") Callable<?> completionHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_0 = completionHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(completionHandler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    delegate.close(arg_0);
  }

  @DocAnnotation$annotation$(description = " The actual port the server is listening on. This is useful if you bound the server specifying 0 as port number\n signifying an ephemeral port\n")
  @TypeInfo("ceylon.language::Integer")
  public long actualPort() {
    long ret = delegate.actualPort();
    return ret;
  }

}
