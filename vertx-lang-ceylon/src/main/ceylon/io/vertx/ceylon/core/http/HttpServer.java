package io.vertx.ceylon.core.http;

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
import io.vertx.ceylon.core.streams.ReadStream;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " An HTTP and WebSockets server.\n <p>\n You receive HTTP requests by providing a [requestHandler](../http/HttpServer.type.html#requestHandler). As requests arrive on the server the handler\n will be called with the requests.\n <p>\n You receive WebSockets by providing a [websocketHandler](../http/HttpServer.type.html#websocketHandler). As WebSocket connections arrive on the server, the\n WebSocket is passed to the handler.\n")
public class HttpServer implements ReifiedType,  Measured {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.http.HttpServer, HttpServer> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.http.HttpServer, HttpServer>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.http.HttpServer, HttpServer> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.http.HttpServer, HttpServer>() {
        public HttpServer convert(io.vertx.core.http.HttpServer src) {
          return new HttpServer(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<HttpServer, io.vertx.core.http.HttpServer> TO_JAVA = new io.vertx.lang.ceylon.Converter<HttpServer, io.vertx.core.http.HttpServer>() {
    public io.vertx.core.http.HttpServer convert(HttpServer src) {
      return src.delegate;
    }
  };

  @Ignore private ReadStream<HttpServerRequest> cached_requestStream;
  @Ignore private ReadStream<ServerWebSocket> cached_websocketStream;
  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(HttpServer.class), io.vertx.core.http.HttpServer.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.core.http.HttpServer delegate;

  public HttpServer(io.vertx.core.http.HttpServer delegate) {
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

  @DocAnnotation$annotation$(description = " Return the request stream for the server. As HTTP requests are received by the server,\n instances of [HttpServerRequest](../http/HttpServerRequest.type.html) will be created and passed to the stream .\n")
  @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<io.vertx.ceylon.core.http::HttpServerRequest>")
  public ReadStream<HttpServerRequest> requestStream() {
    if (cached_requestStream != null) {
      return cached_requestStream;
    }
    ReadStream<HttpServerRequest> ret = io.vertx.ceylon.core.streams.ReadStream.TO_CEYLON.converter(HttpServerRequest.$TypeDescriptor$).safeConvert(delegate.requestStream());
    cached_requestStream = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = " Set the request handler for the server to <code>requestHandler</code>. As HTTP requests are received by the server,\n instances of [HttpServerRequest](../http/HttpServerRequest.type.html) will be created and passed to this handler.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServer")
  public HttpServer requestHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpServerRequest)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest>() {
      public void handle(io.vertx.core.http.HttpServerRequest event) {
        handler.$call$((Object)io.vertx.ceylon.core.http.HttpServerRequest.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpServer ret = io.vertx.ceylon.core.http.HttpServer.TO_CEYLON.converter().safeConvert(delegate.requestHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set a connection handler for the server.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServer")
  public HttpServer connectionHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpConnection)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.http.HttpConnection> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpConnection>() {
      public void handle(io.vertx.core.http.HttpConnection event) {
        handler.$call$((Object)io.vertx.ceylon.core.http.HttpConnection.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpServer ret = io.vertx.ceylon.core.http.HttpServer.TO_CEYLON.converter().safeConvert(delegate.connectionHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Return the websocket stream for the server. If a websocket connect handshake is successful a\n new [ServerWebSocket](../http/ServerWebSocket.type.html) instance will be created and passed to the stream .\n")
  @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<io.vertx.ceylon.core.http::ServerWebSocket>")
  public ReadStream<ServerWebSocket> websocketStream() {
    if (cached_websocketStream != null) {
      return cached_websocketStream;
    }
    ReadStream<ServerWebSocket> ret = io.vertx.ceylon.core.streams.ReadStream.TO_CEYLON.converter(ServerWebSocket.$TypeDescriptor$).safeConvert(delegate.websocketStream());
    cached_websocketStream = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = " Set the websocket handler for the server to <code>wsHandler</code>. If a websocket connect handshake is successful a\n new [ServerWebSocket](../http/ServerWebSocket.type.html) instance will be created and passed to the handler.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServer")
  public HttpServer websocketHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::ServerWebSocket)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket>() {
      public void handle(io.vertx.core.http.ServerWebSocket event) {
        handler.$call$((Object)io.vertx.ceylon.core.http.ServerWebSocket.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpServer ret = io.vertx.ceylon.core.http.HttpServer.TO_CEYLON.converter().safeConvert(delegate.websocketHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Tell the server to start listening. The server will listen on the port and host specified in the\n [HttpServerOptions](../http/HttpServerOptions.type.html) that was used when creating the server.\n <p>\n The listen happens asynchronously and the server may not be listening until some time after the call has returned.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServer")
  public HttpServer listen() {
    HttpServer ret = io.vertx.ceylon.core.http.HttpServer.TO_CEYLON.converter().safeConvert(delegate.listen());
    return this;
  }

  @DocAnnotation$annotation$(description = " Tell the server to start listening. The server will listen on the port and host specified here,\n ignoring any value set in the [HttpServerOptions](../http/HttpServerOptions.type.html) that was used when creating the server.\n <p>\n The listen happens asynchronously and the server may not be listening until some time after the call has returned.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServer")
  public HttpServer listen(
    final @TypeInfo("ceylon.language::Integer") @Name("port")@DocAnnotation$annotation$(description = "the port to listen on\n") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host")@DocAnnotation$annotation$(description = "the host to listen on\n") ceylon.language.String host) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    HttpServer ret = io.vertx.ceylon.core.http.HttpServer.TO_CEYLON.converter().safeConvert(delegate.listen(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Like [listen](../http/HttpServer.type.html#listen) but supplying a handler that will be called when the server is actually\n listening (or has failed).\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServer")
  public HttpServer listen(
    final @TypeInfo("ceylon.language::Integer") @Name("port")@DocAnnotation$annotation$(description = "the port to listen on\n") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host")@DocAnnotation$annotation$(description = "the host to listen on\n") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.http::HttpServer)") @Name("listenHandler")@DocAnnotation$annotation$(description = "the listen handler\n") Callable<?> listenHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> arg_2 = listenHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.core.http.HttpServer>(listenHandler) {
      public Object toCeylon(io.vertx.core.http.HttpServer event) {
        return io.vertx.ceylon.core.http.HttpServer.TO_CEYLON.converter().safeConvert(event);
      }
    };
    HttpServer ret = io.vertx.ceylon.core.http.HttpServer.TO_CEYLON.converter().safeConvert(delegate.listen(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Like [listen](../http/HttpServer.type.html#listen) but the server will listen on host \"0.0.0.0\" and port specified here ignoring\n any value in the [HttpServerOptions](../http/HttpServerOptions.type.html) that was used when creating the server.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServer")
  public HttpServer listen(
    final @TypeInfo("ceylon.language::Integer") @Name("port")@DocAnnotation$annotation$(description = "the port to listen on\n") long port) {
    int arg_0 = (int)port;
    HttpServer ret = io.vertx.ceylon.core.http.HttpServer.TO_CEYLON.converter().safeConvert(delegate.listen(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Like [listen](../http/HttpServer.type.html#listen) but supplying a handler that will be called when the server is actually listening (or has failed).\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServer")
  public HttpServer listen(
    final @TypeInfo("ceylon.language::Integer") @Name("port")@DocAnnotation$annotation$(description = "the port to listen on\n") long port, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.http::HttpServer)") @Name("listenHandler")@DocAnnotation$annotation$(description = "the listen handler\n") Callable<?> listenHandler) {
    int arg_0 = (int)port;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> arg_1 = listenHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.core.http.HttpServer>(listenHandler) {
      public Object toCeylon(io.vertx.core.http.HttpServer event) {
        return io.vertx.ceylon.core.http.HttpServer.TO_CEYLON.converter().safeConvert(event);
      }
    };
    HttpServer ret = io.vertx.ceylon.core.http.HttpServer.TO_CEYLON.converter().safeConvert(delegate.listen(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Like [listen](../http/HttpServer.type.html#listen) but supplying a handler that will be called when the server is actually listening (or has failed).\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServer")
  public HttpServer listen(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.http::HttpServer)") @Name("listenHandler")@DocAnnotation$annotation$(description = "the listen handler\n") Callable<?> listenHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> arg_0 = listenHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.core.http.HttpServer>(listenHandler) {
      public Object toCeylon(io.vertx.core.http.HttpServer event) {
        return io.vertx.ceylon.core.http.HttpServer.TO_CEYLON.converter().safeConvert(event);
      }
    };
    HttpServer ret = io.vertx.ceylon.core.http.HttpServer.TO_CEYLON.converter().safeConvert(delegate.listen(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Close the server. Any open HTTP connections will be closed.\n <p>\n The close happens asynchronously and the server may not be closed until some time after the call has returned.\n")
  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

  @DocAnnotation$annotation$(description = " Like [close](../http/HttpServer.type.html#close) but supplying a handler that will be called when the server is actually closed (or has failed).\n")
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
