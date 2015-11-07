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
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = "todo")
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

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(HttpServer.class);
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

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isMetricsEnabled() {
    boolean ret = delegate.isMetricsEnabled();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequestStream")
  public HttpServerRequestStream requestStream() {
    HttpServerRequestStream ret = io.vertx.ceylon.core.http.HttpServerRequestStream.TO_CEYLON.converter().safeConvert(delegate.requestStream());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServer")
  public HttpServer requestHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpServerRequest)?") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest>() {
      public void handle(io.vertx.core.http.HttpServerRequest event) {
        handler.$call$((Object)io.vertx.ceylon.core.http.HttpServerRequest.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpServer ret = io.vertx.ceylon.core.http.HttpServer.TO_CEYLON.converter().safeConvert(delegate.requestHandler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocketStream")
  public ServerWebSocketStream websocketStream() {
    ServerWebSocketStream ret = io.vertx.ceylon.core.http.ServerWebSocketStream.TO_CEYLON.converter().safeConvert(delegate.websocketStream());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServer")
  public HttpServer websocketHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::ServerWebSocket)?") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket>() {
      public void handle(io.vertx.core.http.ServerWebSocket event) {
        handler.$call$((Object)io.vertx.ceylon.core.http.ServerWebSocket.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpServer ret = io.vertx.ceylon.core.http.HttpServer.TO_CEYLON.converter().safeConvert(delegate.websocketHandler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServer")
  public HttpServer listen() {
    HttpServer ret = io.vertx.ceylon.core.http.HttpServer.TO_CEYLON.converter().safeConvert(delegate.listen());
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServer")
  public HttpServer listen(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    HttpServer ret = io.vertx.ceylon.core.http.HttpServer.TO_CEYLON.converter().safeConvert(delegate.listen(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServer")
  public HttpServer listen(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.http::HttpServer)") @Name("listenHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> listenHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> arg_2 = listenHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.http.HttpServer>(listenHandler) {
      public Object toCeylon(io.vertx.core.http.HttpServer event) {
        return io.vertx.ceylon.core.http.HttpServer.TO_CEYLON.converter().safeConvert(event);
      }
    };
    HttpServer ret = io.vertx.ceylon.core.http.HttpServer.TO_CEYLON.converter().safeConvert(delegate.listen(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServer")
  public HttpServer listen(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port) {
    int arg_0 = (int)port;
    HttpServer ret = io.vertx.ceylon.core.http.HttpServer.TO_CEYLON.converter().safeConvert(delegate.listen(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServer")
  public HttpServer listen(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.http::HttpServer)") @Name("listenHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> listenHandler) {
    int arg_0 = (int)port;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> arg_1 = listenHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.http.HttpServer>(listenHandler) {
      public Object toCeylon(io.vertx.core.http.HttpServer event) {
        return io.vertx.ceylon.core.http.HttpServer.TO_CEYLON.converter().safeConvert(event);
      }
    };
    HttpServer ret = io.vertx.ceylon.core.http.HttpServer.TO_CEYLON.converter().safeConvert(delegate.listen(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServer")
  public HttpServer listen(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.http::HttpServer)") @Name("listenHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> listenHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> arg_0 = listenHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.http.HttpServer>(listenHandler) {
      public Object toCeylon(io.vertx.core.http.HttpServer event) {
        return io.vertx.ceylon.core.http.HttpServer.TO_CEYLON.converter().safeConvert(event);
      }
    };
    HttpServer ret = io.vertx.ceylon.core.http.HttpServer.TO_CEYLON.converter().safeConvert(delegate.listen(arg_0));
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
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("completionHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> completionHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_0 = completionHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(completionHandler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    delegate.close(arg_0);
  }

}
