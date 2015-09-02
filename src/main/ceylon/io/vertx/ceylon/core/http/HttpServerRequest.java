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

  public static final io.vertx.lang.ceylon.Converter<HttpServerRequest, io.vertx.core.http.HttpServerRequest> TO_JAVA = new io.vertx.lang.ceylon.Converter<HttpServerRequest, io.vertx.core.http.HttpServerRequest>() {
    public io.vertx.core.http.HttpServerRequest convert(HttpServerRequest src) {
      return src.delegate;
    }
  };

  @Ignore private HttpServerResponse cached_response;
  @Ignore private MultiMap cached_headers;
  @Ignore private MultiMap cached_params;
  @Ignore private SocketAddress cached_remoteAddress;
  @Ignore private SocketAddress cached_localAddress;
  @Ignore private NetSocket cached_netSocket;
  @Ignore private MultiMap cached_formAttributes;
  @Ignore private final io.vertx.core.http.HttpServerRequest delegate;

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
    HttpServerRequest ret = io.vertx.ceylon.core.http.HttpServerRequest.TO_CEYLON.convert(delegate.exceptionHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequest")
  public HttpServerRequest handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_0 = new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() { public void handle(io.vertx.core.buffer.Buffer event) { handler.$call$((Object)io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(event)); } };
    HttpServerRequest ret = io.vertx.ceylon.core.http.HttpServerRequest.TO_CEYLON.convert(delegate.handler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequest")
  public HttpServerRequest pause() {
    HttpServerRequest ret = io.vertx.ceylon.core.http.HttpServerRequest.TO_CEYLON.convert(delegate.pause());
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequest")
  public HttpServerRequest resume() {
    HttpServerRequest ret = io.vertx.ceylon.core.http.HttpServerRequest.TO_CEYLON.convert(delegate.resume());
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequest")
  public HttpServerRequest endHandler(
    final @TypeInfo("ceylon.language::Anything()") @DocAnnotation$annotation$(description = "todo") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = new io.vertx.core.Handler<java.lang.Void>() { public void handle(java.lang.Void event) { endHandler.$call$(); } };
    HttpServerRequest ret = io.vertx.ceylon.core.http.HttpServerRequest.TO_CEYLON.convert(delegate.endHandler(arg_0));
    return this;
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
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.convert(delegate.uri());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String path() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.convert(delegate.path());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String query() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.convert(delegate.query());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse response() {
    if (cached_response != null) {
      return cached_response;
    }
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.convert(delegate.response());
     cached_response = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap headers() {
    if (cached_headers != null) {
      return cached_headers;
    }
    MultiMap ret = io.vertx.ceylon.core.MultiMap.TO_CEYLON.convert(delegate.headers());
     cached_headers = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String getHeader(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String headerName) {
    java.lang.String arg_0 = headerName.toString();
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.convert(delegate.getHeader(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap params() {
    if (cached_params != null) {
      return cached_params;
    }
    MultiMap ret = io.vertx.ceylon.core.MultiMap.TO_CEYLON.convert(delegate.params());
     cached_params = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String getParam(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String paramName) {
    java.lang.String arg_0 = paramName.toString();
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.convert(delegate.getParam(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.net::SocketAddress")
  public SocketAddress remoteAddress() {
    if (cached_remoteAddress != null) {
      return cached_remoteAddress;
    }
    SocketAddress ret = io.vertx.ceylon.core.net.SocketAddress.TO_CEYLON.convert(delegate.remoteAddress());
     cached_remoteAddress = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.net::SocketAddress")
  public SocketAddress localAddress() {
    if (cached_localAddress != null) {
      return cached_localAddress;
    }
    SocketAddress ret = io.vertx.ceylon.core.net.SocketAddress.TO_CEYLON.convert(delegate.localAddress());
     cached_localAddress = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String absoluteURI() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.convert(delegate.absoluteURI());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequest")
  public HttpServerRequest bodyHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)") @DocAnnotation$annotation$(description = "todo") Callable<?> bodyHandler) {
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_0 = new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() { public void handle(io.vertx.core.buffer.Buffer event) { bodyHandler.$call$((Object)io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(event)); } };
    HttpServerRequest ret = io.vertx.ceylon.core.http.HttpServerRequest.TO_CEYLON.convert(delegate.bodyHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.net::NetSocket")
  public NetSocket netSocket() {
    if (cached_netSocket != null) {
      return cached_netSocket;
    }
    NetSocket ret = io.vertx.ceylon.core.net.NetSocket.TO_CEYLON.convert(delegate.netSocket());
     cached_netSocket = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequest")
  public HttpServerRequest setExpectMultipart(
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean expect) {
    boolean arg_0 = expect;
    HttpServerRequest ret = io.vertx.ceylon.core.http.HttpServerRequest.TO_CEYLON.convert(delegate.setExpectMultipart(arg_0));
    return this;
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
    io.vertx.core.Handler<io.vertx.core.http.HttpServerFileUpload> arg_0 = new io.vertx.core.Handler<io.vertx.core.http.HttpServerFileUpload>() { public void handle(io.vertx.core.http.HttpServerFileUpload event) { uploadHandler.$call$((Object)io.vertx.ceylon.core.http.HttpServerFileUpload.TO_CEYLON.convert(event)); } };
    HttpServerRequest ret = io.vertx.ceylon.core.http.HttpServerRequest.TO_CEYLON.convert(delegate.uploadHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap formAttributes() {
    if (cached_formAttributes != null) {
      return cached_formAttributes;
    }
    MultiMap ret = io.vertx.ceylon.core.MultiMap.TO_CEYLON.convert(delegate.formAttributes());
     cached_formAttributes = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String getFormAttribute(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String attributeName) {
    java.lang.String arg_0 = attributeName.toString();
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.convert(delegate.getFormAttribute(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::ServerWebSocket")
  public ServerWebSocket upgrade() {
    ServerWebSocket ret = io.vertx.ceylon.core.http.ServerWebSocket.TO_CEYLON.convert(delegate.upgrade());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isEnded() {
    boolean ret = delegate.isEnded();
    return ret;
  }

}
