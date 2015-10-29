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
import java.util.List;
import io.vertx.ceylon.core.buffer.Buffer;
import io.vertx.ceylon.core.streams.ReadStream;
import io.vertx.ceylon.core.MultiMap;
import io.vertx.core.Handler;
import io.vertx.ceylon.core.net.NetSocket;

@DocAnnotation$annotation$(description = "todo")
public class HttpClientResponse implements ReadStream<Buffer> {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(HttpClientResponse.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.http.HttpClientResponse, HttpClientResponse> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.http.HttpClientResponse, HttpClientResponse>() {
    public HttpClientResponse convert(io.vertx.core.http.HttpClientResponse src) {
      return new HttpClientResponse(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<HttpClientResponse, io.vertx.core.http.HttpClientResponse> TO_JAVA = new io.vertx.lang.ceylon.Converter<HttpClientResponse, io.vertx.core.http.HttpClientResponse>() {
    public io.vertx.core.http.HttpClientResponse convert(HttpClientResponse src) {
      return src.delegate;
    }
  };

  @Ignore private MultiMap cached_headers;
  @Ignore private MultiMap cached_trailers;
  @Ignore private ceylon.language.List<ceylon.language.String> cached_cookies;
  @Ignore private NetSocket cached_netSocket;
  @Ignore private final io.vertx.core.http.HttpClientResponse delegate;

  public HttpClientResponse(io.vertx.core.http.HttpClientResponse delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientResponse")
  public HttpClientResponse resume() {
    HttpClientResponse ret = io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(delegate.resume());
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientResponse")
  public HttpClientResponse exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)?") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        handler.$call$((Object)event);
      }
    };
    HttpClientResponse ret = io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(delegate.exceptionHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientResponse")
  public HttpClientResponse handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)?") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        handler.$call$((Object)io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClientResponse ret = io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(delegate.handler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientResponse")
  public HttpClientResponse pause() {
    HttpClientResponse ret = io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(delegate.pause());
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientResponse")
  public HttpClientResponse endHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("endHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = endHandler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        endHandler.$call$();
      }
    };
    HttpClientResponse ret = io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(delegate.endHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long statusCode() {
    long ret = delegate.statusCode();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String statusMessage() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.statusMessage());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap headers() {
    if (cached_headers != null) {
      return cached_headers;
    }
    MultiMap ret = io.vertx.ceylon.core.MultiMap.TO_CEYLON.safeConvert(delegate.headers());
     cached_headers = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String?")
  public ceylon.language.String getHeader(
    final @TypeInfo("ceylon.language::String") @Name("headerName") @DocAnnotation$annotation$(description = "todo") ceylon.language.String headerName) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(headerName);
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.getHeader(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String?")
  public ceylon.language.String getTrailer(
    final @TypeInfo("ceylon.language::String") @Name("trailerName") @DocAnnotation$annotation$(description = "todo") ceylon.language.String trailerName) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(trailerName);
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.getTrailer(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap trailers() {
    if (cached_trailers != null) {
      return cached_trailers;
    }
    MultiMap ret = io.vertx.ceylon.core.MultiMap.TO_CEYLON.safeConvert(delegate.trailers());
     cached_trailers = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::List<ceylon.language::String>")
  public ceylon.language.List<ceylon.language.String> cookies() {
    if (cached_cookies != null) {
      return cached_cookies;
    }
    ceylon.language.List<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, delegate.cookies(), io.vertx.lang.ceylon.ToCeylon.String);
     cached_cookies = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientResponse")
  public HttpClientResponse bodyHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)") @Name("bodyHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> bodyHandler) {
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_0 = bodyHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        bodyHandler.$call$((Object)io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.safeConvert(event));
      }
    };
    HttpClientResponse ret = io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.safeConvert(delegate.bodyHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.net::NetSocket")
  public NetSocket netSocket() {
    if (cached_netSocket != null) {
      return cached_netSocket;
    }
    NetSocket ret = io.vertx.ceylon.core.net.NetSocket.TO_CEYLON.safeConvert(delegate.netSocket());
     cached_netSocket = ret;
    return ret;
  }

}
