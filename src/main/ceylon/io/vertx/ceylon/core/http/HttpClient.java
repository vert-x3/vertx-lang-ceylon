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
import io.vertx.core.http.HttpMethod;
import io.vertx.ceylon.core.MultiMap;
import io.vertx.core.http.WebsocketVersion;
import io.vertx.core.Handler;

@DocAnnotation$annotation$(description = "todo")
public class HttpClient implements Measured {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(HttpClient.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.http.HttpClient, HttpClient> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.http.HttpClient, HttpClient>() {
    public HttpClient convert(io.vertx.core.http.HttpClient src) {
      return new HttpClient(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<HttpClient, io.vertx.core.http.HttpClient> TO_JAVA = new io.vertx.lang.ceylon.Converter<HttpClient, io.vertx.core.http.HttpClient>() {
    public io.vertx.core.http.HttpClient convert(HttpClient src) {
      return src.delegate;
    }
  };

  @Ignore private final io.vertx.core.http.HttpClient delegate;

  public HttpClient(io.vertx.core.http.HttpClient delegate) {
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
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest request(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String method, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    io.vertx.core.http.HttpMethod arg_0 = null;
    int arg_1 = (int)port;
    java.lang.String arg_2 = host.toString();
    java.lang.String arg_3 = requestURI.toString();
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.request(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest request(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String method, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    io.vertx.core.http.HttpMethod arg_0 = null;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.request(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest request(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String method, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    io.vertx.core.http.HttpMethod arg_0 = null;
    int arg_1 = (int)port;
    java.lang.String arg_2 = host.toString();
    java.lang.String arg_3 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_4 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.convert(event)); } };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.request(arg_0, arg_1, arg_2, arg_3, arg_4));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest request(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String method, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    io.vertx.core.http.HttpMethod arg_0 = null;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.convert(event)); } };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.request(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest request(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String method, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    io.vertx.core.http.HttpMethod arg_0 = null;
    java.lang.String arg_1 = requestURI.toString();
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.request(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest request(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String method, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    io.vertx.core.http.HttpMethod arg_0 = null;
    java.lang.String arg_1 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.convert(event)); } };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.request(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest requestAbs(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String method, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI) {
    io.vertx.core.http.HttpMethod arg_0 = null;
    java.lang.String arg_1 = absoluteURI.toString();
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.requestAbs(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest requestAbs(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String method, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    io.vertx.core.http.HttpMethod arg_0 = null;
    java.lang.String arg_1 = absoluteURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.convert(event)); } };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.requestAbs(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest get(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.get(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest get(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.get(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest get(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.convert(event)); } };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.get(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest get(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.convert(event)); } };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.get(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest get(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = requestURI.toString();
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.get(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest get(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.convert(event)); } };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.get(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest getAbs(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI) {
    java.lang.String arg_0 = absoluteURI.toString();
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.getAbs(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest getAbs(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = absoluteURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.convert(event)); } };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.getAbs(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient getNow(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.convert(event)); } };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.convert(delegate.getNow(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient getNow(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.convert(event)); } };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.convert(delegate.getNow(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient getNow(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.convert(event)); } };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.convert(delegate.getNow(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest post(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.post(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest post(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.post(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest post(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.convert(event)); } };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.post(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest post(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.convert(event)); } };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.post(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest post(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = requestURI.toString();
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.post(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest post(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.convert(event)); } };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.post(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest postAbs(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI) {
    java.lang.String arg_0 = absoluteURI.toString();
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.postAbs(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest postAbs(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = absoluteURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.convert(event)); } };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.postAbs(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest head(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.head(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest head(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.head(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest head(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.convert(event)); } };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.head(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest head(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.convert(event)); } };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.head(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest head(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = requestURI.toString();
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.head(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest head(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.convert(event)); } };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.head(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest headAbs(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI) {
    java.lang.String arg_0 = absoluteURI.toString();
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.headAbs(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest headAbs(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = absoluteURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.convert(event)); } };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.headAbs(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient headNow(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.convert(event)); } };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.convert(delegate.headNow(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient headNow(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.convert(event)); } };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.convert(delegate.headNow(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient headNow(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.convert(event)); } };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.convert(delegate.headNow(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest options(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.options(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest options(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.options(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest options(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.convert(event)); } };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.options(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest options(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.convert(event)); } };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.options(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest options(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = requestURI.toString();
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.options(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest options(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.convert(event)); } };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.options(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest optionsAbs(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI) {
    java.lang.String arg_0 = absoluteURI.toString();
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.optionsAbs(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest optionsAbs(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = absoluteURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.convert(event)); } };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.optionsAbs(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient optionsNow(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.convert(event)); } };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.convert(delegate.optionsNow(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient optionsNow(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.convert(event)); } };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.convert(delegate.optionsNow(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient optionsNow(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.convert(event)); } };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.convert(delegate.optionsNow(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest put(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.put(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest put(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.put(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest put(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.convert(event)); } };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.put(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest put(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.convert(event)); } };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.put(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest put(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = requestURI.toString();
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.put(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest put(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.convert(event)); } };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.put(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest putAbs(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI) {
    java.lang.String arg_0 = absoluteURI.toString();
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.putAbs(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest putAbs(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = absoluteURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.convert(event)); } };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.putAbs(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest delete(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.delete(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest delete(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.delete(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest delete(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.convert(event)); } };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.delete(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest delete(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.convert(event)); } };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.delete(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest delete(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = requestURI.toString();
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.delete(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest delete(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.convert(event)); } };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.delete(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest deleteAbs(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI) {
    java.lang.String arg_0 = absoluteURI.toString();
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.deleteAbs(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest deleteAbs(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = absoluteURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() { public void handle(io.vertx.core.http.HttpClientResponse event) { responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.convert(event)); } };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.convert(delegate.deleteAbs(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_3 = new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() { public void handle(io.vertx.core.http.WebSocket event) { wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.convert(event)); } };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.convert(delegate.websocket(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_2 = new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() { public void handle(io.vertx.core.http.WebSocket event) { wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.convert(event)); } };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.convert(delegate.websocket(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    io.vertx.core.MultiMap arg_3 = io.vertx.ceylon.core.MultiMap.TO_JAVA.convert(headers);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_4 = new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() { public void handle(io.vertx.core.http.WebSocket event) { wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.convert(event)); } };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.convert(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    io.vertx.core.MultiMap arg_2 = io.vertx.ceylon.core.MultiMap.TO_JAVA.convert(headers);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_3 = new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() { public void handle(io.vertx.core.http.WebSocket event) { wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.convert(event)); } };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.convert(delegate.websocket(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String version, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    io.vertx.core.MultiMap arg_3 = io.vertx.ceylon.core.MultiMap.TO_JAVA.convert(headers);
    io.vertx.core.http.WebsocketVersion arg_4 = null;
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_5 = new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() { public void handle(io.vertx.core.http.WebSocket event) { wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.convert(event)); } };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.convert(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String version, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    io.vertx.core.MultiMap arg_2 = io.vertx.ceylon.core.MultiMap.TO_JAVA.convert(headers);
    io.vertx.core.http.WebsocketVersion arg_3 = null;
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_4 = new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() { public void handle(io.vertx.core.http.WebSocket event) { wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.convert(event)); } };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.convert(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String version, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String subProtocols, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    io.vertx.core.MultiMap arg_3 = io.vertx.ceylon.core.MultiMap.TO_JAVA.convert(headers);
    io.vertx.core.http.WebsocketVersion arg_4 = null;
    java.lang.String arg_5 = subProtocols.toString();
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_6 = new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() { public void handle(io.vertx.core.http.WebSocket event) { wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.convert(event)); } };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.convert(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String version, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String subProtocols, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    io.vertx.core.MultiMap arg_2 = io.vertx.ceylon.core.MultiMap.TO_JAVA.convert(headers);
    io.vertx.core.http.WebsocketVersion arg_3 = null;
    java.lang.String arg_4 = subProtocols.toString();
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_5 = new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() { public void handle(io.vertx.core.http.WebSocket event) { wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.convert(event)); } };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.convert(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect) {
    java.lang.String arg_0 = requestURI.toString();
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_1 = new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() { public void handle(io.vertx.core.http.WebSocket event) { wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.convert(event)); } };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.convert(delegate.websocket(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect) {
    java.lang.String arg_0 = requestURI.toString();
    io.vertx.core.MultiMap arg_1 = io.vertx.ceylon.core.MultiMap.TO_JAVA.convert(headers);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_2 = new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() { public void handle(io.vertx.core.http.WebSocket event) { wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.convert(event)); } };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.convert(delegate.websocket(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String version, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect) {
    java.lang.String arg_0 = requestURI.toString();
    io.vertx.core.MultiMap arg_1 = io.vertx.ceylon.core.MultiMap.TO_JAVA.convert(headers);
    io.vertx.core.http.WebsocketVersion arg_2 = null;
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_3 = new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() { public void handle(io.vertx.core.http.WebSocket event) { wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.convert(event)); } };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.convert(delegate.websocket(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String version, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String subProtocols, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect) {
    java.lang.String arg_0 = requestURI.toString();
    io.vertx.core.MultiMap arg_1 = io.vertx.ceylon.core.MultiMap.TO_JAVA.convert(headers);
    io.vertx.core.http.WebsocketVersion arg_2 = null;
    java.lang.String arg_3 = subProtocols.toString();
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_4 = new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() { public void handle(io.vertx.core.http.WebSocket event) { wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.convert(event)); } };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.convert(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.convert(delegate.websocketStream(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.convert(delegate.websocketStream(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @DocAnnotation$annotation$(description = "todo") MultiMap headers) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    io.vertx.core.MultiMap arg_3 = io.vertx.ceylon.core.MultiMap.TO_JAVA.convert(headers);
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.convert(delegate.websocketStream(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @DocAnnotation$annotation$(description = "todo") MultiMap headers) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    io.vertx.core.MultiMap arg_2 = io.vertx.ceylon.core.MultiMap.TO_JAVA.convert(headers);
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.convert(delegate.websocketStream(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String version) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    io.vertx.core.MultiMap arg_3 = io.vertx.ceylon.core.MultiMap.TO_JAVA.convert(headers);
    io.vertx.core.http.WebsocketVersion arg_4 = null;
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.convert(delegate.websocketStream(arg_0, arg_1, arg_2, arg_3, arg_4));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String version) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    io.vertx.core.MultiMap arg_2 = io.vertx.ceylon.core.MultiMap.TO_JAVA.convert(headers);
    io.vertx.core.http.WebsocketVersion arg_3 = null;
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.convert(delegate.websocketStream(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String version, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String subProtocols) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = host.toString();
    java.lang.String arg_2 = requestURI.toString();
    io.vertx.core.MultiMap arg_3 = io.vertx.ceylon.core.MultiMap.TO_JAVA.convert(headers);
    io.vertx.core.http.WebsocketVersion arg_4 = null;
    java.lang.String arg_5 = subProtocols.toString();
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.convert(delegate.websocketStream(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String version, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String subProtocols) {
    java.lang.String arg_0 = host.toString();
    java.lang.String arg_1 = requestURI.toString();
    io.vertx.core.MultiMap arg_2 = io.vertx.ceylon.core.MultiMap.TO_JAVA.convert(headers);
    io.vertx.core.http.WebsocketVersion arg_3 = null;
    java.lang.String arg_4 = subProtocols.toString();
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.convert(delegate.websocketStream(arg_0, arg_1, arg_2, arg_3, arg_4));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = requestURI.toString();
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.convert(delegate.websocketStream(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @DocAnnotation$annotation$(description = "todo") MultiMap headers) {
    java.lang.String arg_0 = requestURI.toString();
    io.vertx.core.MultiMap arg_1 = io.vertx.ceylon.core.MultiMap.TO_JAVA.convert(headers);
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.convert(delegate.websocketStream(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String version) {
    java.lang.String arg_0 = requestURI.toString();
    io.vertx.core.MultiMap arg_1 = io.vertx.ceylon.core.MultiMap.TO_JAVA.convert(headers);
    io.vertx.core.http.WebsocketVersion arg_2 = null;
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.convert(delegate.websocketStream(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String version, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String subProtocols) {
    java.lang.String arg_0 = requestURI.toString();
    io.vertx.core.MultiMap arg_1 = io.vertx.ceylon.core.MultiMap.TO_JAVA.convert(headers);
    io.vertx.core.http.WebsocketVersion arg_2 = null;
    java.lang.String arg_3 = subProtocols.toString();
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.convert(delegate.websocketStream(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

}
