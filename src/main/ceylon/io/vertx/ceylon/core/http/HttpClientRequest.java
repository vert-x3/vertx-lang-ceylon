package io.vertx.ceylon.core.http;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;
import io.vertx.ceylon.core.buffer.Buffer;
import io.vertx.ceylon.core.streams.WriteStream;
import io.vertx.core.http.HttpMethod;
import io.vertx.ceylon.core.streams.ReadStream;
import io.vertx.ceylon.core.MultiMap;
import io.vertx.core.Handler;

public class HttpClientRequest implements WriteStream<Buffer>, ReadStream<HttpClientResponse> {

  private final io.vertx.core.http.HttpClientRequest delegate;

  public HttpClientRequest(io.vertx.core.http.HttpClientRequest delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  @TypeInfo("ceylon.language::Boolean")
  public boolean writeQueueFull() {
    boolean ret = delegate.writeQueueFull();
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = new io.vertx.core.Handler<java.lang.Throwable>() { public void handle(java.lang.Throwable event) { handler.$call$((Object)event); } };
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.exceptionHandler(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest write(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") Buffer data) {
    io.vertx.core.buffer.Buffer arg_0 = (io.vertx.core.buffer.Buffer)data.getDelegate();
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.write(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest setWriteQueueMaxSize(
    final @TypeInfo("ceylon.language::Integer") long maxSize) {
    int arg_0 = (int)maxSize;
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.setWriteQueueMaxSize(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest drainHandler(
    final @TypeInfo("ceylon.language::Anything()") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { handler.$call$((Object)null); } };
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.drainHandler(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_0 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { handler.$call$((Object)new io.vertx.ceylon.core.http.HttpClientResponse(event)); } };
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.handler(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest pause() {
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.pause());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest resume() {
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.resume());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest endHandler(
    final @TypeInfo("ceylon.language::Anything()") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { endHandler.$call$((Object)null); } };
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.endHandler(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest setChunked(
    final @TypeInfo("ceylon.language::Boolean") boolean chunked) {
    boolean arg_0 = chunked;
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.setChunked(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::Boolean")
  public boolean isChunked() {
    boolean ret = delegate.isChunked();
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String method() {
    ceylon.language.String ret = null;
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String uri() {
    ceylon.language.String ret = new ceylon.language.String(delegate.uri());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap headers() {
    MultiMap ret = new io.vertx.ceylon.core.MultiMap(delegate.headers());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest putHeader(
    final @TypeInfo("ceylon.language::String") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String value) {
    java.lang.String arg_0 = name.toString();
    java.lang.String arg_1 = value.toString();
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.putHeader(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest write(
    final @TypeInfo("ceylon.language::String") ceylon.language.String chunk) {
    java.lang.String arg_0 = chunk.toString();
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.write(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest write(
    final @TypeInfo("ceylon.language::String") ceylon.language.String chunk, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String enc) {
    java.lang.String arg_0 = chunk.toString();
    java.lang.String arg_1 = enc.toString();
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.write(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest continueHandler(
    final @TypeInfo("ceylon.language::Anything()") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { handler.$call$((Object)null); } };
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.continueHandler(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest sendHead() {
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.sendHead());
    return ret;
  }

  @TypeInfo("ceylon.language::Anything")
  public void end(
    final @TypeInfo("ceylon.language::String") ceylon.language.String chunk) {
    java.lang.String arg_0 = chunk.toString();
    delegate.end(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void end(
    final @TypeInfo("ceylon.language::String") ceylon.language.String chunk, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String enc) {
    java.lang.String arg_0 = chunk.toString();
    java.lang.String arg_1 = enc.toString();
    delegate.end(arg_0, arg_1);
  }

  @TypeInfo("ceylon.language::Anything")
  public void end(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") Buffer chunk) {
    io.vertx.core.buffer.Buffer arg_0 = (io.vertx.core.buffer.Buffer)chunk.getDelegate();
    delegate.end(arg_0);
  }

  @TypeInfo("ceylon.language::Anything")
  public void end() {
    delegate.end();
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest setTimeout(
    final @TypeInfo("ceylon.language::Integer") long timeoutMs) {
    long arg_0 = timeoutMs;
    HttpClientRequest ret = new io.vertx.ceylon.core.http.HttpClientRequest(delegate.setTimeout(arg_0));
    return ret;
  }

}
