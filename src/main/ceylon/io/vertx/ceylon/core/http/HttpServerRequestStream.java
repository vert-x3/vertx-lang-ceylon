package io.vertx.ceylon.core.http;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.ceylon.core.streams.ReadStream;
import io.vertx.core.Handler;

@DocAnnotation$annotation$(description = "todo")
public class HttpServerRequestStream implements ReadStream<HttpServerRequest> {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(HttpServerRequestStream.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.http.HttpServerRequestStream, HttpServerRequestStream> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.http.HttpServerRequestStream, HttpServerRequestStream>() {
    public HttpServerRequestStream convert(io.vertx.core.http.HttpServerRequestStream src) {
      return new HttpServerRequestStream(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<HttpServerRequestStream, io.vertx.core.http.HttpServerRequestStream> TO_JAVA = new io.vertx.lang.ceylon.Converter<HttpServerRequestStream, io.vertx.core.http.HttpServerRequestStream>() {
    public io.vertx.core.http.HttpServerRequestStream convert(HttpServerRequestStream src) {
      return src.delegate;
    }
  };

  @Ignore
  private final io.vertx.core.http.HttpServerRequestStream delegate;

  public HttpServerRequestStream(io.vertx.core.http.HttpServerRequestStream delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequestStream")
  public HttpServerRequestStream exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = new io.vertx.core.Handler<java.lang.Throwable>() { public void handle(java.lang.Throwable event) { handler.$call$((Object)event); } };
    HttpServerRequestStream ret = new io.vertx.ceylon.core.http.HttpServerRequestStream(delegate.exceptionHandler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequestStream")
  public HttpServerRequestStream handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpServerRequest)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest> arg_0 = new io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest>() { public void handle(io.vertx.core.http.HttpServerRequest event) { handler.$call$((Object)new io.vertx.ceylon.core.http.HttpServerRequest(event)); } };
    HttpServerRequestStream ret = new io.vertx.ceylon.core.http.HttpServerRequestStream(delegate.handler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequestStream")
  public HttpServerRequestStream pause() {
    HttpServerRequestStream ret = new io.vertx.ceylon.core.http.HttpServerRequestStream(delegate.pause());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequestStream")
  public HttpServerRequestStream resume() {
    HttpServerRequestStream ret = new io.vertx.ceylon.core.http.HttpServerRequestStream(delegate.resume());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequestStream")
  public HttpServerRequestStream endHandler(
    final @TypeInfo("ceylon.language::Anything()") @DocAnnotation$annotation$(description = "todo") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { endHandler.$call$(); } };
    HttpServerRequestStream ret = new io.vertx.ceylon.core.http.HttpServerRequestStream(delegate.endHandler(arg_0));
    return ret;
  }

}
