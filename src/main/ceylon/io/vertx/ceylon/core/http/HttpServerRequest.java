package io.vertx.ceylon.core.http;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.ceylon.core.MultiMap;
import io.vertx.ceylon.core.buffer.Buffer;
import io.vertx.core.http.HttpVersion;
import io.vertx.core.http.HttpMethod;
import io.vertx.ceylon.core.streams.ReadStream;
import io.vertx.core.Handler;
import io.vertx.ceylon.core.net.SocketAddress;
import io.vertx.ceylon.core.net.NetSocket;

@DocAnnotation$annotation$(description = "todo")
public class HttpServerRequest implements ReadStream<Buffer> {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(HttpServerRequest.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.http.HttpServerRequest, HttpServerRequest> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.http.HttpServerRequest, HttpServerRequest>() {
    public HttpServerRequest convert(io.vertx.core.http.HttpServerRequest src) {
      return new HttpServerRequest(src);
    }
  };

  @Ignore
  private final io.vertx.core.http.HttpServerRequest delegate;

  public HttpServerRequest(io.vertx.core.http.HttpServerRequest delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequest")
  public HttpServerRequest exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = new io.vertx.core.Handler<java.lang.Throwable>() { public void handle(java.lang.Throwable event) { handler.$call$((Object)event); } };
    HttpServerRequest ret = new io.vertx.ceylon.core.http.HttpServerRequest(delegate.exceptionHandler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequest")
  public HttpServerRequest handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_0 = new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() { public void handle(io.vertx.core.buffer.Buffer event) { handler.$call$((Object)new io.vertx.ceylon.core.buffer.Buffer(event)); } };
    HttpServerRequest ret = new io.vertx.ceylon.core.http.HttpServerRequest(delegate.handler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequest")
  public HttpServerRequest pause() {
    HttpServerRequest ret = new io.vertx.ceylon.core.http.HttpServerRequest(delegate.pause());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequest")
  public HttpServerRequest resume() {
    HttpServerRequest ret = new io.vertx.ceylon.core.http.HttpServerRequest(delegate.resume());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequest")
  public HttpServerRequest endHandler(
    final @TypeInfo("ceylon.language::Anything()") @DocAnnotation$annotation$(description = "todo") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { endHandler.$call$(); } };
    HttpServerRequest ret = new io.vertx.ceylon.core.http.HttpServerRequest(delegate.endHandler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String version() {
    ceylon.language.String ret = null;
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
    ceylon.language.String ret = new ceylon.language.String(delegate.uri());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String path() {
    ceylon.language.String ret = new ceylon.language.String(delegate.path());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String query() {
    ceylon.language.String ret = new ceylon.language.String(delegate.query());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse response() {
    HttpServerResponse ret = new io.vertx.ceylon.core.http.HttpServerResponse(delegate.response());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap headers() {
    MultiMap ret = new io.vertx.ceylon.core.MultiMap(delegate.headers());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String getHeader(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String headerName) {
    java.lang.String arg_0 = headerName.toString();
    ceylon.language.String ret = new ceylon.language.String(delegate.getHeader(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap params() {
    MultiMap ret = new io.vertx.ceylon.core.MultiMap(delegate.params());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String getParam(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String paramName) {
    java.lang.String arg_0 = paramName.toString();
    ceylon.language.String ret = new ceylon.language.String(delegate.getParam(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.net::SocketAddress")
  public SocketAddress remoteAddress() {
    SocketAddress ret = new io.vertx.ceylon.core.net.SocketAddress(delegate.remoteAddress());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.net::SocketAddress")
  public SocketAddress localAddress() {
    SocketAddress ret = new io.vertx.ceylon.core.net.SocketAddress(delegate.localAddress());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String absoluteURI() {
    ceylon.language.String ret = new ceylon.language.String(delegate.absoluteURI());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequest")
  public HttpServerRequest bodyHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)") @DocAnnotation$annotation$(description = "todo") Callable<?> bodyHandler) {
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_0 = new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() { public void handle(io.vertx.core.buffer.Buffer event) { bodyHandler.$call$((Object)new io.vertx.ceylon.core.buffer.Buffer(event)); } };
    HttpServerRequest ret = new io.vertx.ceylon.core.http.HttpServerRequest(delegate.bodyHandler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.net::NetSocket")
  public NetSocket netSocket() {
    NetSocket ret = new io.vertx.ceylon.core.net.NetSocket(delegate.netSocket());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequest")
  public HttpServerRequest setExpectMultipart(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expect) {
    boolean arg_0 = expect;
    HttpServerRequest ret = new io.vertx.ceylon.core.http.HttpServerRequest(delegate.setExpectMultipart(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isExpectMultipart() {
    boolean ret = delegate.isExpectMultipart();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequest")
  public HttpServerRequest uploadHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpServerFileUpload)") @DocAnnotation$annotation$(description = "todo") Callable<?> uploadHandler) {
    io.vertx.core.Handler<io.vertx.core.http.HttpServerFileUpload> arg_0 = new io.vertx.core.Handler<io.vertx.core.http.HttpServerFileUpload>() { public void handle(io.vertx.core.http.HttpServerFileUpload event) { uploadHandler.$call$((Object)new io.vertx.ceylon.core.http.HttpServerFileUpload(event)); } };
    HttpServerRequest ret = new io.vertx.ceylon.core.http.HttpServerRequest(delegate.uploadHandler(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap formAttributes() {
    MultiMap ret = new io.vertx.ceylon.core.MultiMap(delegate.formAttributes());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String getFormAttribute(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String attributeName) {
    java.lang.String arg_0 = attributeName.toString();
    ceylon.language.String ret = new ceylon.language.String(delegate.getFormAttribute(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket upgrade() {
    ServerWebSocket ret = new io.vertx.ceylon.core.http.ServerWebSocket(delegate.upgrade());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isEnded() {
    boolean ret = delegate.isEnded();
    return ret;
  }

}
