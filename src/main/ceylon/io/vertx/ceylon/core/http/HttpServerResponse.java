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
import io.vertx.ceylon.core.MultiMap;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.ceylon.core.Future;

@DocAnnotation$annotation$(description = "todo")
public class HttpServerResponse implements WriteStream<Buffer> {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(HttpServerResponse.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.http.HttpServerResponse, HttpServerResponse> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.http.HttpServerResponse, HttpServerResponse>() {
    public HttpServerResponse convert(io.vertx.core.http.HttpServerResponse src) {
      return new HttpServerResponse(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<HttpServerResponse, io.vertx.core.http.HttpServerResponse> TO_JAVA = new io.vertx.lang.ceylon.Converter<HttpServerResponse, io.vertx.core.http.HttpServerResponse>() {
    public io.vertx.core.http.HttpServerResponse convert(HttpServerResponse src) {
      return src.delegate;
    }
  };

  @Ignore
  private final io.vertx.core.http.HttpServerResponse delegate;

  public HttpServerResponse(io.vertx.core.http.HttpServerResponse delegate) {
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
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = new io.vertx.core.Handler<java.lang.Throwable>() { public void handle(java.lang.Throwable event) { handler.$call$((Object)event); } };
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.convert(delegate.exceptionHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse write(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @DocAnnotation$annotation$(description = "todo") Buffer data) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.convert(data);
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.convert(delegate.write(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse setWriteQueueMaxSize(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long maxSize) {
    int arg_0 = (int)maxSize;
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.convert(delegate.setWriteQueueMaxSize(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse drainHandler(
    final @TypeInfo("ceylon.language::Anything()") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { handler.$call$(); } };
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.convert(delegate.drainHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long getStatusCode() {
    long ret = delegate.getStatusCode();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse setStatusCode(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long statusCode) {
    int arg_0 = (int)statusCode;
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.convert(delegate.setStatusCode(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String getStatusMessage() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.convert(delegate.getStatusMessage());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse setStatusMessage(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String statusMessage) {
    java.lang.String arg_0 = statusMessage.toString();
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.convert(delegate.setStatusMessage(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse setChunked(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean chunked) {
    boolean arg_0 = chunked;
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.convert(delegate.setChunked(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isChunked() {
    boolean ret = delegate.isChunked();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap headers() {
    MultiMap ret = io.vertx.ceylon.core.MultiMap.TO_CEYLON.convert(delegate.headers());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse putHeader(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String value) {
    java.lang.String arg_0 = name.toString();
    java.lang.String arg_1 = value.toString();
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.convert(delegate.putHeader(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap trailers() {
    MultiMap ret = io.vertx.ceylon.core.MultiMap.TO_CEYLON.convert(delegate.trailers());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse putTrailer(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String value) {
    java.lang.String arg_0 = name.toString();
    java.lang.String arg_1 = value.toString();
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.convert(delegate.putTrailer(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse closeHandler(
    final @TypeInfo("ceylon.language::Anything()") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { handler.$call$(); } };
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.convert(delegate.closeHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse write(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String chunk, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String enc) {
    java.lang.String arg_0 = chunk.toString();
    java.lang.String arg_1 = enc.toString();
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.convert(delegate.write(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse write(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String chunk) {
    java.lang.String arg_0 = chunk.toString();
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.convert(delegate.write(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse writeContinue() {
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.convert(delegate.writeContinue());
    return this;
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
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.convert(chunk);
    delegate.end(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void end() {
    delegate.end();
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse sendFile(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String filename, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long offset, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long length) {
    java.lang.String arg_0 = filename.toString();
    long arg_1 = offset;
    long arg_2 = length;
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.convert(delegate.sendFile(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse sendFile(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String filename, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long offset, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long length, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    java.lang.String arg_0 = filename.toString();
    long arg_1 = offset;
    long arg_2 = length;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_3 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(resultHandler) { public Object toCeylon(java.lang.Void event) { return null; } };
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.convert(delegate.sendFile(arg_0, arg_1, arg_2, arg_3));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean ended() {
    boolean ret = delegate.ended();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean closed() {
    boolean ret = delegate.closed();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean headWritten() {
    boolean ret = delegate.headWritten();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse headersEndHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core::Future<ceylon.language::Anything>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.Future<java.lang.Void>> arg_0 = new io.vertx.core.Handler<io.vertx.core.Future<java.lang.Void>>() { public void handle(io.vertx.core.Future<java.lang.Void> event) { handler.$call$((Object)io.vertx.ceylon.core.Future.TO_CEYLON.convert(event)); } };
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.convert(delegate.headersEndHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse bodyEndHandler(
    final @TypeInfo("ceylon.language::Anything()") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { handler.$call$(); } };
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.convert(delegate.bodyEndHandler(arg_0));
    return this;
  }

}
