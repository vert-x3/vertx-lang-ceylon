package io.vertx.ceylon.core.http;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.ceylon.core.buffer.Buffer;
import io.vertx.ceylon.core.streams.WriteStream;
import io.vertx.core.http.HttpMethod;
import io.vertx.ceylon.core.streams.ReadStream;
import io.vertx.ceylon.core.MultiMap;
import io.vertx.core.Handler;

@DocAnnotation$annotation$(description = "todo")
public class HttpClientRequest implements WriteStream<Buffer>, ReadStream<HttpClientResponse> {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(HttpClientRequest.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.http.HttpClientRequest, HttpClientRequest> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.http.HttpClientRequest, HttpClientRequest>() {
    public HttpClientRequest convert(io.vertx.core.http.HttpClientRequest src) {
      return new HttpClientRequest(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<HttpClientRequest, io.vertx.core.http.HttpClientRequest> TO_JAVA = new io.vertx.lang.ceylon.Converter<HttpClientRequest, io.vertx.core.http.HttpClientRequest>() {
    public io.vertx.core.http.HttpClientRequest convert(HttpClientRequest src) {
      return src.delegate;
    }
  };

  @Ignore
  private final io.vertx.core.http.HttpClientRequest delegate;

  public HttpClientRequest(io.vertx.core.http.HttpClientRequest delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean writeQueueFull() {
    boolean ret = delegate.writeQueueFull();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = new io.vertx.core.Handler<java.lang.Throwable>() { public void handle(java.lang.Throwable event) { handler.$call$((Object)event); } };
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.exceptionHandler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest write(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @DocAnnotation$annotation$(description = "todo") Buffer data) {
    io.vertx.core.buffer.Buffer arg_0 = (io.vertx.core.buffer.Buffer)data.getDelegate();
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.write(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest setWriteQueueMaxSize(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long maxSize) {
    int arg_0 = (int)maxSize;
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.setWriteQueueMaxSize(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest drainHandler(
    final @TypeInfo("ceylon.language::Anything()") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { handler.$call$(); } };
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.drainHandler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_0 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { handler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.handler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest pause() {
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.pause());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest resume() {
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.resume());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest endHandler(
    final @TypeInfo("ceylon.language::Anything()") @DocAnnotation$annotation$(description = "todo") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { endHandler.$call$(); } };
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.endHandler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest setChunked(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean chunked) {
    boolean arg_0 = chunked;
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.setChunked(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isChunked() {
    boolean ret = delegate.isChunked();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String method() {
    ceylon.language.String ret = null;
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String uri() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.convert(delegate.uri());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap headers() {
    MultiMap ret = new io.vertx.ceylon.core.MultiMap(delegate.headers());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest putHeader(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String value) {
    java.lang.String arg_0 = name.toString();
    java.lang.String arg_1 = value.toString();
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.putHeader(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest write(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String chunk) {
    java.lang.String arg_0 = chunk.toString();
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.write(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest write(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String chunk, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String enc) {
    java.lang.String arg_0 = chunk.toString();
    java.lang.String arg_1 = enc.toString();
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.write(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest continueHandler(
    final @TypeInfo("ceylon.language::Anything()") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { handler.$call$(); } };
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.continueHandler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest sendHead() {
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.sendHead());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void end(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String chunk) {
    java.lang.String arg_0 = chunk.toString();
    delegate.end(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void end(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String chunk, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String enc) {
    java.lang.String arg_0 = chunk.toString();
    java.lang.String arg_1 = enc.toString();
    delegate.end(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void end(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @DocAnnotation$annotation$(description = "todo") Buffer chunk) {
    io.vertx.core.buffer.Buffer arg_0 = (io.vertx.core.buffer.Buffer)chunk.getDelegate();
    delegate.end(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void end() {
    delegate.end();
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest setTimeout(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long timeoutMs) {
    long arg_0 = timeoutMs;
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.setTimeout(arg_0));
    return ret;
  }

}
