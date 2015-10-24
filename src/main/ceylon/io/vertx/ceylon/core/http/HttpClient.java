package io.vertx.ceylon.core.http;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.metadata.Name;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.ceylon.core.metrics.Measured;
import io.vertx.ceylon.core.MultiMap;
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
    final @TypeInfo("io.vertx.ceylon.core.http::HttpMethod") @Name("method") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.HttpMethod method, 
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    io.vertx.core.http.HttpMethod arg_0 = io.vertx.ceylon.core.http.toJavaHttpMethod_.get_().safeConvert(method);
    int arg_1 = (int)port;
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_3 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.request(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest request(
    final @TypeInfo("io.vertx.ceylon.core.http::HttpMethod") @Name("method") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.HttpMethod method, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    io.vertx.core.http.HttpMethod arg_0 = io.vertx.ceylon.core.http.toJavaHttpMethod_.get_().safeConvert(method);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.request(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest request(
    final @TypeInfo("io.vertx.ceylon.core.http::HttpMethod") @Name("method") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.HttpMethod method, 
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    io.vertx.core.http.HttpMethod arg_0 = io.vertx.ceylon.core.http.toJavaHttpMethod_.get_().safeConvert(method);
    int arg_1 = (int)port;
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_3 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_4 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.request(arg_0, arg_1, arg_2, arg_3, arg_4));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest request(
    final @TypeInfo("io.vertx.ceylon.core.http::HttpMethod") @Name("method") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.HttpMethod method, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    io.vertx.core.http.HttpMethod arg_0 = io.vertx.ceylon.core.http.toJavaHttpMethod_.get_().safeConvert(method);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.request(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest request(
    final @TypeInfo("io.vertx.ceylon.core.http::HttpMethod") @Name("method") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.HttpMethod method, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    io.vertx.core.http.HttpMethod arg_0 = io.vertx.ceylon.core.http.toJavaHttpMethod_.get_().safeConvert(method);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.request(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest request(
    final @TypeInfo("io.vertx.ceylon.core.http::HttpMethod") @Name("method") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.HttpMethod method, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    io.vertx.core.http.HttpMethod arg_0 = io.vertx.ceylon.core.http.toJavaHttpMethod_.get_().safeConvert(method);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.request(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest requestAbs(
    final @TypeInfo("io.vertx.ceylon.core.http::HttpMethod") @Name("method") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.HttpMethod method, 
    final @TypeInfo("ceylon.language::String") @Name("absoluteURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI) {
    io.vertx.core.http.HttpMethod arg_0 = io.vertx.ceylon.core.http.toJavaHttpMethod_.get_().safeConvert(method);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(absoluteURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.requestAbs(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest requestAbs(
    final @TypeInfo("io.vertx.ceylon.core.http::HttpMethod") @Name("method") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.HttpMethod method, 
    final @TypeInfo("ceylon.language::String") @Name("absoluteURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    io.vertx.core.http.HttpMethod arg_0 = io.vertx.ceylon.core.http.toJavaHttpMethod_.get_().safeConvert(method);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(absoluteURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.requestAbs(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest get(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.get(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest get(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.get(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest get(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.get(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest get(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.get(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest get(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.get(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest get(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.get(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest getAbs(
    final @TypeInfo("ceylon.language::String") @Name("absoluteURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(absoluteURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.getAbs(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest getAbs(
    final @TypeInfo("ceylon.language::String") @Name("absoluteURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(absoluteURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.getAbs(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient getNow(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.safeConvert(delegate.getNow(arg_0, arg_1, arg_2, arg_3));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient getNow(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.safeConvert(delegate.getNow(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient getNow(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.safeConvert(delegate.getNow(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest post(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.post(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest post(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.post(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest post(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.post(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest post(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.post(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest post(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.post(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest post(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.post(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest postAbs(
    final @TypeInfo("ceylon.language::String") @Name("absoluteURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(absoluteURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.postAbs(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest postAbs(
    final @TypeInfo("ceylon.language::String") @Name("absoluteURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(absoluteURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.postAbs(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest head(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.head(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest head(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.head(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest head(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.head(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest head(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.head(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest head(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.head(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest head(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.head(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest headAbs(
    final @TypeInfo("ceylon.language::String") @Name("absoluteURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(absoluteURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.headAbs(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest headAbs(
    final @TypeInfo("ceylon.language::String") @Name("absoluteURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(absoluteURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.headAbs(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient headNow(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.safeConvert(delegate.headNow(arg_0, arg_1, arg_2, arg_3));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient headNow(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.safeConvert(delegate.headNow(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient headNow(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.safeConvert(delegate.headNow(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest options(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.options(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest options(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.options(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest options(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.options(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest options(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.options(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest options(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.options(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest options(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.options(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest optionsAbs(
    final @TypeInfo("ceylon.language::String") @Name("absoluteURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(absoluteURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.optionsAbs(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest optionsAbs(
    final @TypeInfo("ceylon.language::String") @Name("absoluteURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(absoluteURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.optionsAbs(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient optionsNow(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.safeConvert(delegate.optionsNow(arg_0, arg_1, arg_2, arg_3));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient optionsNow(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.safeConvert(delegate.optionsNow(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient optionsNow(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.safeConvert(delegate.optionsNow(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest put(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.put(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest put(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.put(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest put(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.put(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest put(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.put(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest put(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.put(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest put(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.put(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest putAbs(
    final @TypeInfo("ceylon.language::String") @Name("absoluteURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(absoluteURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.putAbs(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest putAbs(
    final @TypeInfo("ceylon.language::String") @Name("absoluteURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(absoluteURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.putAbs(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest delete(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.delete(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest delete(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.delete(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest delete(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_3 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.delete(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest delete(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_2 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.delete(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest delete(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.delete(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest delete(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.delete(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest deleteAbs(
    final @TypeInfo("ceylon.language::String") @Name("absoluteURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(absoluteURI);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.deleteAbs(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest deleteAbs(
    final @TypeInfo("ceylon.language::String") @Name("absoluteURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String absoluteURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)") @Name("responseHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> responseHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(absoluteURI);
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_1 = responseHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        responseHandler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.safeConvert(delegate.deleteAbs(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_3 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @Name("failureHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> failureHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_3 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.safeConvert(event));
      }
    };
    io.vertx.core.Handler<java.lang.Throwable> arg_4 = failureHandler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        failureHandler.$call$((Object)event);
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_2 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.safeConvert(delegate.websocket(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @Name("failureHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> failureHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_2 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.safeConvert(event));
      }
    };
    io.vertx.core.Handler<java.lang.Throwable> arg_3 = failureHandler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        failureHandler.$call$((Object)event);
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_3 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_4 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @Name("failureHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> failureHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_3 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_4 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.safeConvert(event));
      }
    };
    io.vertx.core.Handler<java.lang.Throwable> arg_5 = failureHandler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        failureHandler.$call$((Object)event);
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_2 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_3 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @Name("failureHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> failureHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_2 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_3 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.safeConvert(event));
      }
    };
    io.vertx.core.Handler<java.lang.Throwable> arg_4 = failureHandler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        failureHandler.$call$((Object)event);
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("io.vertx.ceylon.core.http::WebsocketVersion") @Name("version") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.WebsocketVersion version, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_3 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.http.WebsocketVersion arg_4 = io.vertx.ceylon.core.http.toJavaWebsocketVersion_.get_().safeConvert(version);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_5 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("io.vertx.ceylon.core.http::WebsocketVersion") @Name("version") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.WebsocketVersion version, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @Name("failureHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> failureHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_3 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.http.WebsocketVersion arg_4 = io.vertx.ceylon.core.http.toJavaWebsocketVersion_.get_().safeConvert(version);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_5 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.safeConvert(event));
      }
    };
    io.vertx.core.Handler<java.lang.Throwable> arg_6 = failureHandler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        failureHandler.$call$((Object)event);
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("io.vertx.ceylon.core.http::WebsocketVersion") @Name("version") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.WebsocketVersion version, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_2 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.http.WebsocketVersion arg_3 = io.vertx.ceylon.core.http.toJavaWebsocketVersion_.get_().safeConvert(version);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_4 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("io.vertx.ceylon.core.http::WebsocketVersion") @Name("version") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.WebsocketVersion version, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @Name("failureHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> failureHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_2 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.http.WebsocketVersion arg_3 = io.vertx.ceylon.core.http.toJavaWebsocketVersion_.get_().safeConvert(version);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_4 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.safeConvert(event));
      }
    };
    io.vertx.core.Handler<java.lang.Throwable> arg_5 = failureHandler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        failureHandler.$call$((Object)event);
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("io.vertx.ceylon.core.http::WebsocketVersion") @Name("version") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.WebsocketVersion version, 
    final @TypeInfo("ceylon.language::String") @Name("subProtocols") @DocAnnotation$annotation$(description = "todo") ceylon.language.String subProtocols, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_3 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.http.WebsocketVersion arg_4 = io.vertx.ceylon.core.http.toJavaWebsocketVersion_.get_().safeConvert(version);
    java.lang.String arg_5 = io.vertx.lang.ceylon.ToJava.String.safeConvert(subProtocols);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_6 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("io.vertx.ceylon.core.http::WebsocketVersion") @Name("version") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.WebsocketVersion version, 
    final @TypeInfo("ceylon.language::String") @Name("subProtocols") @DocAnnotation$annotation$(description = "todo") ceylon.language.String subProtocols, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @Name("failureHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> failureHandler) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_3 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.http.WebsocketVersion arg_4 = io.vertx.ceylon.core.http.toJavaWebsocketVersion_.get_().safeConvert(version);
    java.lang.String arg_5 = io.vertx.lang.ceylon.ToJava.String.safeConvert(subProtocols);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_6 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.safeConvert(event));
      }
    };
    io.vertx.core.Handler<java.lang.Throwable> arg_7 = failureHandler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        failureHandler.$call$((Object)event);
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("io.vertx.ceylon.core.http::WebsocketVersion") @Name("version") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.WebsocketVersion version, 
    final @TypeInfo("ceylon.language::String") @Name("subProtocols") @DocAnnotation$annotation$(description = "todo") ceylon.language.String subProtocols, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_2 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.http.WebsocketVersion arg_3 = io.vertx.ceylon.core.http.toJavaWebsocketVersion_.get_().safeConvert(version);
    java.lang.String arg_4 = io.vertx.lang.ceylon.ToJava.String.safeConvert(subProtocols);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_5 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("io.vertx.ceylon.core.http::WebsocketVersion") @Name("version") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.WebsocketVersion version, 
    final @TypeInfo("ceylon.language::String") @Name("subProtocols") @DocAnnotation$annotation$(description = "todo") ceylon.language.String subProtocols, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @Name("failureHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> failureHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_2 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.http.WebsocketVersion arg_3 = io.vertx.ceylon.core.http.toJavaWebsocketVersion_.get_().safeConvert(version);
    java.lang.String arg_4 = io.vertx.lang.ceylon.ToJava.String.safeConvert(subProtocols);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_5 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.safeConvert(event));
      }
    };
    io.vertx.core.Handler<java.lang.Throwable> arg_6 = failureHandler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        failureHandler.$call$((Object)event);
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_1 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.safeConvert(delegate.websocket(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @Name("failureHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> failureHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_1 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.safeConvert(event));
      }
    };
    io.vertx.core.Handler<java.lang.Throwable> arg_2 = failureHandler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        failureHandler.$call$((Object)event);
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.safeConvert(delegate.websocket(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_1 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_2 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.safeConvert(delegate.websocket(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @Name("failureHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> failureHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_1 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_2 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.safeConvert(event));
      }
    };
    io.vertx.core.Handler<java.lang.Throwable> arg_3 = failureHandler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        failureHandler.$call$((Object)event);
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("io.vertx.ceylon.core.http::WebsocketVersion") @Name("version") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.WebsocketVersion version, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_1 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.http.WebsocketVersion arg_2 = io.vertx.ceylon.core.http.toJavaWebsocketVersion_.get_().safeConvert(version);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_3 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("io.vertx.ceylon.core.http::WebsocketVersion") @Name("version") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.WebsocketVersion version, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @Name("failureHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> failureHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_1 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.http.WebsocketVersion arg_2 = io.vertx.ceylon.core.http.toJavaWebsocketVersion_.get_().safeConvert(version);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_3 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.safeConvert(event));
      }
    };
    io.vertx.core.Handler<java.lang.Throwable> arg_4 = failureHandler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        failureHandler.$call$((Object)event);
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("io.vertx.ceylon.core.http::WebsocketVersion") @Name("version") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.WebsocketVersion version, 
    final @TypeInfo("ceylon.language::String") @Name("subProtocols") @DocAnnotation$annotation$(description = "todo") ceylon.language.String subProtocols, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_1 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.http.WebsocketVersion arg_2 = io.vertx.ceylon.core.http.toJavaWebsocketVersion_.get_().safeConvert(version);
    java.lang.String arg_3 = io.vertx.lang.ceylon.ToJava.String.safeConvert(subProtocols);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_4 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClient")
  public HttpClient websocket(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("io.vertx.ceylon.core.http::WebsocketVersion") @Name("version") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.WebsocketVersion version, 
    final @TypeInfo("ceylon.language::String") @Name("subProtocols") @DocAnnotation$annotation$(description = "todo") ceylon.language.String subProtocols, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::WebSocket)") @Name("wsConnect") @DocAnnotation$annotation$(description = "todo") Callable<?> wsConnect, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)") @Name("failureHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> failureHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_1 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.http.WebsocketVersion arg_2 = io.vertx.ceylon.core.http.toJavaWebsocketVersion_.get_().safeConvert(version);
    java.lang.String arg_3 = io.vertx.lang.ceylon.ToJava.String.safeConvert(subProtocols);
    io.vertx.core.Handler<io.vertx.core.http.WebSocket> arg_4 = wsConnect == null ? null : new io.vertx.core.Handler<io.vertx.core.http.WebSocket>() {
      public void handle(io.vertx.core.http.WebSocket event) {
        wsConnect.$call$((Object)io.vertx.ceylon.core.http.WebSocket.TO_CEYLON.safeConvert(event));
      }
    };
    io.vertx.core.Handler<java.lang.Throwable> arg_5 = failureHandler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        failureHandler.$call$((Object)event);
      }
    };
    HttpClient ret = io.vertx.ceylon.core.http.HttpClient.TO_CEYLON.safeConvert(delegate.websocket(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.safeConvert(delegate.websocketStream(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.safeConvert(delegate.websocketStream(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_3 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.safeConvert(delegate.websocketStream(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_2 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.safeConvert(delegate.websocketStream(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("io.vertx.ceylon.core.http::WebsocketVersion") @Name("version") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.WebsocketVersion version) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_3 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.http.WebsocketVersion arg_4 = io.vertx.ceylon.core.http.toJavaWebsocketVersion_.get_().safeConvert(version);
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.safeConvert(delegate.websocketStream(arg_0, arg_1, arg_2, arg_3, arg_4));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("io.vertx.ceylon.core.http::WebsocketVersion") @Name("version") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.WebsocketVersion version) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_2 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.http.WebsocketVersion arg_3 = io.vertx.ceylon.core.http.toJavaWebsocketVersion_.get_().safeConvert(version);
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.safeConvert(delegate.websocketStream(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::Integer") @Name("port") @DocAnnotation$annotation$(description = "todo") long port, 
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("io.vertx.ceylon.core.http::WebsocketVersion") @Name("version") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.WebsocketVersion version, 
    final @TypeInfo("ceylon.language::String") @Name("subProtocols") @DocAnnotation$annotation$(description = "todo") ceylon.language.String subProtocols) {
    int arg_0 = (int)port;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_3 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.http.WebsocketVersion arg_4 = io.vertx.ceylon.core.http.toJavaWebsocketVersion_.get_().safeConvert(version);
    java.lang.String arg_5 = io.vertx.lang.ceylon.ToJava.String.safeConvert(subProtocols);
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.safeConvert(delegate.websocketStream(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::String") @Name("host") @DocAnnotation$annotation$(description = "todo") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("io.vertx.ceylon.core.http::WebsocketVersion") @Name("version") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.WebsocketVersion version, 
    final @TypeInfo("ceylon.language::String") @Name("subProtocols") @DocAnnotation$annotation$(description = "todo") ceylon.language.String subProtocols) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_2 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.http.WebsocketVersion arg_3 = io.vertx.ceylon.core.http.toJavaWebsocketVersion_.get_().safeConvert(version);
    java.lang.String arg_4 = io.vertx.lang.ceylon.ToJava.String.safeConvert(subProtocols);
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.safeConvert(delegate.websocketStream(arg_0, arg_1, arg_2, arg_3, arg_4));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.safeConvert(delegate.websocketStream(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_1 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.safeConvert(delegate.websocketStream(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("io.vertx.ceylon.core.http::WebsocketVersion") @Name("version") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.WebsocketVersion version) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_1 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.http.WebsocketVersion arg_2 = io.vertx.ceylon.core.http.toJavaWebsocketVersion_.get_().safeConvert(version);
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.safeConvert(delegate.websocketStream(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::WebSocketStream")
  public WebSocketStream websocketStream(
    final @TypeInfo("ceylon.language::String") @Name("requestURI") @DocAnnotation$annotation$(description = "todo") ceylon.language.String requestURI, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") @DocAnnotation$annotation$(description = "todo") MultiMap headers, 
    final @TypeInfo("io.vertx.ceylon.core.http::WebsocketVersion") @Name("version") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.core.http.WebsocketVersion version, 
    final @TypeInfo("ceylon.language::String") @Name("subProtocols") @DocAnnotation$annotation$(description = "todo") ceylon.language.String subProtocols) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(requestURI);
    io.vertx.core.MultiMap arg_1 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.http.WebsocketVersion arg_2 = io.vertx.ceylon.core.http.toJavaWebsocketVersion_.get_().safeConvert(version);
    java.lang.String arg_3 = io.vertx.lang.ceylon.ToJava.String.safeConvert(subProtocols);
    WebSocketStream ret = io.vertx.ceylon.core.http.WebSocketStream.TO_CEYLON.safeConvert(delegate.websocketStream(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

}
