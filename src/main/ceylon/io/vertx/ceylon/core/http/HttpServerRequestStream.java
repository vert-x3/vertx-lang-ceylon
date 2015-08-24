package io.vertx.ceylon.core.http;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;
import io.vertx.ceylon.core.streams.ReadStream;
import io.vertx.core.Handler;

public class HttpServerRequestStream implements ReadStream<HttpServerRequest> {

  private final io.vertx.core.http.HttpServerRequestStream delegate;

  public HttpServerRequestStream(io.vertx.core.http.HttpServerRequestStream delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequestStream")
  public HttpServerRequestStream exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = new io.vertx.core.Handler<java.lang.Throwable>() { public void handle(java.lang.Throwable event) { handler.$call$((Object)event); } };
    HttpServerRequestStream ret = new io.vertx.ceylon.core.http.HttpServerRequestStream(delegate.exceptionHandler(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequestStream")
  public HttpServerRequestStream handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpServerRequest)") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest> arg_0 = new io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest>() { public void handle(io.vertx.core.http.HttpServerRequest event) { handler.$call$((Object)new io.vertx.ceylon.core.http.HttpServerRequest(event)); } };
    HttpServerRequestStream ret = new io.vertx.ceylon.core.http.HttpServerRequestStream(delegate.handler(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequestStream")
  public HttpServerRequestStream pause() {
    HttpServerRequestStream ret = new io.vertx.ceylon.core.http.HttpServerRequestStream(delegate.pause());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequestStream")
  public HttpServerRequestStream resume() {
    HttpServerRequestStream ret = new io.vertx.ceylon.core.http.HttpServerRequestStream(delegate.resume());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequestStream")
  public HttpServerRequestStream endHandler(
    final @TypeInfo("ceylon.language::Anything()") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { endHandler.$call$((Object)null); } };
    HttpServerRequestStream ret = new io.vertx.ceylon.core.http.HttpServerRequestStream(delegate.endHandler(arg_0));
    return ret;
  }

}
