package io.vertx.ceylon.core.http;

import com.redhat.ceylon.compiler.java.metadata.Ceylon;
import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.metadata.Name;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import com.redhat.ceylon.compiler.java.runtime.model.ReifiedType;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import java.util.List;
import io.vertx.ceylon.core.buffer.Buffer;
import io.vertx.ceylon.core.streams.ReadStream;
import io.vertx.ceylon.core.MultiMap;
import io.vertx.core.Handler;
import io.vertx.ceylon.core.net.NetSocket;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Represents a client-side HTTP response.\n <p>\n Vert.x provides you with one of these via the handler that was provided when creating the [HttpClientRequest](../http/HttpClientRequest.type.html)\n or that was set on the [HttpClientRequest](../http/HttpClientRequest.type.html) instance.\n <p>\n It implements [ReadStream](../streams/ReadStream.type.html) so it can be used with\n [Pump](../streams/Pump.type.html) to pump data with flow control.\n")
public class HttpClientResponse implements ReifiedType,  ReadStream<Buffer> {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.http.HttpClientResponse, HttpClientResponse> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.http.HttpClientResponse, HttpClientResponse>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.http.HttpClientResponse, HttpClientResponse> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.http.HttpClientResponse, HttpClientResponse>() {
        public HttpClientResponse convert(io.vertx.core.http.HttpClientResponse src) {
          return new HttpClientResponse(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<HttpClientResponse, io.vertx.core.http.HttpClientResponse> TO_JAVA = new io.vertx.lang.ceylon.Converter<HttpClientResponse, io.vertx.core.http.HttpClientResponse>() {
    public io.vertx.core.http.HttpClientResponse convert(HttpClientResponse src) {
      return src.delegate;
    }
  };

  @Ignore private MultiMap cached_headers;
  @Ignore private MultiMap cached_trailers;
  @Ignore private ceylon.language.List<ceylon.language.String> cached_cookies;
  @Ignore private NetSocket cached_netSocket;
  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(HttpClientResponse.class);
  @Ignore private final io.vertx.core.http.HttpClientResponse delegate;

  public HttpClientResponse(io.vertx.core.http.HttpClientResponse delegate) {
    this.delegate = delegate;
  }

  @Ignore 
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientResponse")
  public HttpClientResponse resume() {
    HttpClientResponse ret = io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(delegate.resume());
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientResponse")
  public HttpClientResponse exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)?") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        handler.$call$((Object)event);
      }
    };
    HttpClientResponse ret = io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(delegate.exceptionHandler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientResponse")
  public HttpClientResponse handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)?") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        handler.$call$((Object)io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClientResponse ret = io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(delegate.handler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientResponse")
  public HttpClientResponse pause() {
    HttpClientResponse ret = io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(delegate.pause());
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientResponse")
  public HttpClientResponse endHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("endHandler")  Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = endHandler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        endHandler.$call$();
      }
    };
    HttpClientResponse ret = io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(delegate.endHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " @return the status code of the response\n")
  @TypeInfo("ceylon.language::Integer")
  public long statusCode() {
    long ret = delegate.statusCode();
    return ret;
  }

  @DocAnnotation$annotation$(description = " @return the status message of the response\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String statusMessage() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.statusMessage());
    return ret;
  }

  @DocAnnotation$annotation$(description = " @return the headers\n")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap headers() {
    if (cached_headers != null) {
      return cached_headers;
    }
    MultiMap ret = io.vertx.ceylon.core.MultiMap.TO_CEYLON.converter().safeConvert(delegate.headers());
    cached_headers = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = " Return the first header value with the specified name\n")
  @TypeInfo("ceylon.language::String?")
  public ceylon.language.String getHeader(
    final @TypeInfo("ceylon.language::String") @Name("headerName") @DocAnnotation$annotation$(description = "the header name\n") ceylon.language.String headerName) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(headerName);
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.getHeader(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Return the first trailer value with the specified name\n")
  @TypeInfo("ceylon.language::String?")
  public ceylon.language.String getTrailer(
    final @TypeInfo("ceylon.language::String") @Name("trailerName") @DocAnnotation$annotation$(description = "the trailer name\n") ceylon.language.String trailerName) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(trailerName);
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.getTrailer(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " @return the trailers\n")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap trailers() {
    if (cached_trailers != null) {
      return cached_trailers;
    }
    MultiMap ret = io.vertx.ceylon.core.MultiMap.TO_CEYLON.converter().safeConvert(delegate.trailers());
    cached_trailers = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = " @return the Set-Cookie headers (including trailers)\n")
  @TypeInfo("ceylon.language::List<ceylon.language::String>")
  public ceylon.language.List<ceylon.language.String> cookies() {
    if (cached_cookies != null) {
      return cached_cookies;
    }
    ceylon.language.List<ceylon.language.String> ret = io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, delegate.cookies(), io.vertx.lang.ceylon.ToCeylon.String);
    cached_cookies = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = " Convenience method for receiving the entire request body in one piece.\n <p>\n This saves you having to manually set a dataHandler and an endHandler and append the chunks of the body until\n the whole body received. Don't use this if your request body is large - you could potentially run out of RAM.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientResponse")
  public HttpClientResponse bodyHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)") @Name("bodyHandler") @DocAnnotation$annotation$(description = "This handler will be called after all the body has been received\n") Callable<?> bodyHandler) {
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_0 = bodyHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        bodyHandler.$call$((Object)io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClientResponse ret = io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(delegate.bodyHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Get a net socket for the underlying connection of this request.\n <p>\n USE THIS WITH CAUTION! Writing to the socket directly if you don't know what you're doing can easily break the HTTP protocol\n <p>\n One valid use-case for calling this is to receive the [NetSocket](../net/NetSocket.type.html) after a HTTP CONNECT was issued to the\n remote peer and it responded with a status code of 200.\n")
  @TypeInfo("io.vertx.ceylon.core.net::NetSocket")
  public NetSocket netSocket() {
    if (cached_netSocket != null) {
      return cached_netSocket;
    }
    NetSocket ret = io.vertx.ceylon.core.net.NetSocket.TO_CEYLON.converter().safeConvert(delegate.netSocket());
    cached_netSocket = ret;
    return ret;
  }

}
