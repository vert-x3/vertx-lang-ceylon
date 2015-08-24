package io.vertx.ceylon.core.http;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;
import io.vertx.ceylon.core.buffer.Buffer;
import io.vertx.ceylon.core.streams.ReadStream;
import io.vertx.core.Handler;

public class HttpServerFileUpload implements ReadStream<Buffer> {

  private final io.vertx.core.http.HttpServerFileUpload delegate;

  public HttpServerFileUpload(io.vertx.core.http.HttpServerFileUpload delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpServerFileUpload")
  public HttpServerFileUpload exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = new io.vertx.core.Handler<java.lang.Throwable>() { public void handle(java.lang.Throwable event) { handler.$call$((Object)event); } };
    HttpServerFileUpload ret = new io.vertx.ceylon.core.http.HttpServerFileUpload(delegate.exceptionHandler(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpServerFileUpload")
  public HttpServerFileUpload handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_0 = new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() { public void handle(io.vertx.core.buffer.Buffer event) { handler.$call$((Object)new io.vertx.ceylon.core.buffer.Buffer(event)); } };
    HttpServerFileUpload ret = new io.vertx.ceylon.core.http.HttpServerFileUpload(delegate.handler(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpServerFileUpload")
  public HttpServerFileUpload endHandler(
    final @TypeInfo("ceylon.language::Anything()") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { endHandler.$call$((Object)null); } };
    HttpServerFileUpload ret = new io.vertx.ceylon.core.http.HttpServerFileUpload(delegate.endHandler(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpServerFileUpload")
  public HttpServerFileUpload pause() {
    HttpServerFileUpload ret = new io.vertx.ceylon.core.http.HttpServerFileUpload(delegate.pause());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpServerFileUpload")
  public HttpServerFileUpload resume() {
    HttpServerFileUpload ret = new io.vertx.ceylon.core.http.HttpServerFileUpload(delegate.resume());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpServerFileUpload")
  public HttpServerFileUpload streamToFileSystem(
    final @TypeInfo("ceylon.language::String") ceylon.language.String filename) {
    java.lang.String arg_0 = filename.toString();
    HttpServerFileUpload ret = new io.vertx.ceylon.core.http.HttpServerFileUpload(delegate.streamToFileSystem(arg_0));
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String filename() {
    ceylon.language.String ret = new ceylon.language.String(delegate.filename());
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String name() {
    ceylon.language.String ret = new ceylon.language.String(delegate.name());
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String contentType() {
    ceylon.language.String ret = new ceylon.language.String(delegate.contentType());
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String contentTransferEncoding() {
    ceylon.language.String ret = new ceylon.language.String(delegate.contentTransferEncoding());
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String charset() {
    ceylon.language.String ret = new ceylon.language.String(delegate.charset());
    return ret;
  }

  @TypeInfo("ceylon.language::Integer")
  public long size() {
    long ret = delegate.size();
    return ret;
  }

  @TypeInfo("ceylon.language::Boolean")
  public boolean isSizeAvailable() {
    boolean ret = delegate.isSizeAvailable();
    return ret;
  }

}
