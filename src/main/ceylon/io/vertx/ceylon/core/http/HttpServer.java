package io.vertx.ceylon.core.http;

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
public class HttpServer implements Measured {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(HttpServer.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.http.HttpServer, HttpServer> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.http.HttpServer, HttpServer>() {
    public HttpServer convert(io.vertx.core.http.HttpServer src) {
      return new HttpServer(src);
    }
  };

  @Ignore
  private final io.vertx.core.http.HttpServer delegate;

  public HttpServer(io.vertx.core.http.HttpServer delegate) {
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
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequestStream")
  public HttpServerRequestStream requestStream() {
    HttpServerRequestStream ret = new io.vertx.ceylon.core.http.HttpServerRequestStream(delegate.requestStream());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServer")
  public HttpServer requestHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpServerRequest)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest> arg_0 = new io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest>() { public void handle(io.vertx.core.http.HttpServerRequest event) { handler.$call$((Object)new io.vertx.ceylon.core.http.HttpServerRequest(event)); } };
    HttpServer ret = new io.vertx.ceylon.core.http.HttpServer(delegate.requestHandler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocketStream")
  public ServerWebSocketStream websocketStream() {
    ServerWebSocketStream ret = new io.vertx.ceylon.core.http.ServerWebSocketStream(delegate.websocketStream());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServer")
  public HttpServer websocketHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::ServerWebSocket)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket> arg_0 = new io.vertx.core.Handler<io.vertx.core.http.ServerWebSocket>() { public void handle(io.vertx.core.http.ServerWebSocket event) { handler.$call$((Object)new io.vertx.ceylon.core.http.ServerWebSocket(event)); } };
    HttpServer ret = new io.vertx.ceylon.core.http.HttpServer(delegate.websocketHandler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServer")
  public HttpServer listen() {
    HttpServer ret = new io.vertx.ceylon.core.http.HttpServer(delegate.listen());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServer")
  public HttpServer listen(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    HttpServer ret = new io.vertx.ceylon.core.http.HttpServer(delegate.listen(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServer")
  public HttpServer listen(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.http::HttpServer)") @DocAnnotation$annotation$(description = "todo") Callable<?> listenHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> arg_2 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.http.HttpServer>(listenHandler) { public Object toCeylon(io.vertx.core.http.HttpServer event) { return new io.vertx.ceylon.core.http.HttpServer(event); } };
    HttpServer ret = new io.vertx.ceylon.core.http.HttpServer(delegate.listen(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServer")
  public HttpServer listen(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port) {
    int arg_0 = (int)port;
    HttpServer ret = new io.vertx.ceylon.core.http.HttpServer(delegate.listen(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServer")
  public HttpServer listen(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.http::HttpServer)") @DocAnnotation$annotation$(description = "todo") Callable<?> listenHandler) {
    int arg_0 = (int)port;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.http.HttpServer>(listenHandler) { public Object toCeylon(io.vertx.core.http.HttpServer event) { return new io.vertx.ceylon.core.http.HttpServer(event); } };
    HttpServer ret = new io.vertx.ceylon.core.http.HttpServer(delegate.listen(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServer")
  public HttpServer listen(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.http::HttpServer)") @DocAnnotation$annotation$(description = "todo") Callable<?> listenHandler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServer>> arg_0 = new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.core.http.HttpServer>(listenHandler) { public Object toCeylon(io.vertx.core.http.HttpServer event) { return new io.vertx.ceylon.core.http.HttpServer(event); } };
    HttpServer ret = new io.vertx.ceylon.core.http.HttpServer(delegate.listen(arg_0));
    return ret;
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

}
