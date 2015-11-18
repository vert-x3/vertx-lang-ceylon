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
import io.vertx.ceylon.core.buffer.Buffer;
import io.vertx.ceylon.core.streams.WriteStream;
import io.vertx.ceylon.core.streams.ReadStream;
import io.vertx.ceylon.core.MultiMap;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Represents a client-side HTTP request.\n <p>\n Instances are created by an [HttpClient](../http/HttpClient.type.html) instance, via one of the methods corresponding to the\n specific HTTP methods, or the generic request methods. On creation the request will not have been written to the\n wire.\n <p>\n Once a request has been obtained, headers can be set on it, and data can be written to its body if required. Once\n you are ready to send the request, one of the [end](../http/HttpClientRequest.type.html#end) methods should be called.\n <p>\n Nothing is actually sent until the request has been internally assigned an HTTP connection.\n <p>\n The [HttpClient](../http/HttpClient.type.html) instance will return an instance of this class immediately, even if there are no HTTP\n connections available in the pool. Any requests sent before a connection is assigned will be queued\n internally and actually sent when an HTTP connection becomes available from the pool.\n <p>\n The headers of the request are queued for writing either when the [end](../http/HttpClientRequest.type.html#end) method is called, or, when the first\n part of the body is written, whichever occurs first.\n <p>\n This class supports both chunked and non-chunked HTTP.\n <p>\n It implements [WriteStream](../streams/WriteStream.type.html) so it can be used with\n [Pump](../streams/Pump.type.html) to pump data with flow control.\n <p>\n An example of using this class is as follows:\n <p>\n")
public class HttpClientRequest implements ReifiedType,  WriteStream<Buffer>,  ReadStream<HttpClientResponse> {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.http.HttpClientRequest, HttpClientRequest> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.http.HttpClientRequest, HttpClientRequest>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.http.HttpClientRequest, HttpClientRequest> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.http.HttpClientRequest, HttpClientRequest>() {
        public HttpClientRequest convert(io.vertx.core.http.HttpClientRequest src) {
          return new HttpClientRequest(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<HttpClientRequest, io.vertx.core.http.HttpClientRequest> TO_JAVA = new io.vertx.lang.ceylon.Converter<HttpClientRequest, io.vertx.core.http.HttpClientRequest>() {
    public io.vertx.core.http.HttpClientRequest convert(HttpClientRequest src) {
      return src.delegate;
    }
  };

  @Ignore private MultiMap cached_headers;
  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(HttpClientRequest.class);
  @Ignore private final io.vertx.core.http.HttpClientRequest delegate;

  public HttpClientRequest(io.vertx.core.http.HttpClientRequest delegate) {
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

  @DocAnnotation$annotation$(description = " This will return <code>true</code> if there are more bytes in the write queue than the value set using [setWriteQueueMaxSize](../http/HttpClientRequest.type.html#setWriteQueueMaxSize)\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean writeQueueFull() {
    boolean ret = delegate.writeQueueFull();
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)?") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        handler.$call$((Object)event);
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.exceptionHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " @throws java.lang.IllegalStateException when no response handler is set\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest write(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("data")  Buffer data) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(data);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.write(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest setWriteQueueMaxSize(
    final @TypeInfo("ceylon.language::Integer") @Name("maxSize")  long maxSize) {
    int arg_0 = (int)maxSize;
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.setWriteQueueMaxSize(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest drainHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        handler.$call$();
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.drainHandler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)?") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        handler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.handler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest pause() {
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.pause());
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest resume() {
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.resume());
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest endHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("endHandler")  Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = endHandler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        endHandler.$call$();
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.endHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " If chunked is true then the request will be set into HTTP chunked mode\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest setChunked(
    final @TypeInfo("ceylon.language::Boolean") @Name("chunked") @DocAnnotation$annotation$(description = "true if chunked encoding\n") boolean chunked) {
    boolean arg_0 = chunked;
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.setChunked(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " @return Is the request chunked?\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isChunked() {
    boolean ret = delegate.isChunked();
    return ret;
  }

  @DocAnnotation$annotation$(description = " The HTTP method for the request.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpMethod")
  public io.vertx.ceylon.core.http.HttpMethod method() {
    io.vertx.ceylon.core.http.HttpMethod ret = io.vertx.ceylon.core.http.httpMethod_.get_().getToCeylon().safeConvert(delegate.method());
    return ret;
  }

  @DocAnnotation$annotation$(description = " @return The URI of the request.\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String uri() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.uri());
    return ret;
  }

  @DocAnnotation$annotation$(description = " @return The HTTP headers\n")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap headers() {
    if (cached_headers != null) {
      return cached_headers;
    }
    MultiMap ret = io.vertx.ceylon.core.MultiMap.TO_CEYLON.converter().safeConvert(delegate.headers());
    cached_headers = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = " Put an HTTP header\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest putHeader(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "The header name\n") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::String") @Name("value") @DocAnnotation$annotation$(description = "The header value\n") ceylon.language.String value) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(value);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.putHeader(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Write a `java.lang.String` to the request body, encoded as UTF-8.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest write(
    final @TypeInfo("ceylon.language::String") @Name("chunk")  ceylon.language.String chunk) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(chunk);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.write(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Write a `java.lang.String` to the request body, encoded using the encoding <code>enc</code>.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest write(
    final @TypeInfo("ceylon.language::String") @Name("chunk")  ceylon.language.String chunk, 
    final @TypeInfo("ceylon.language::String") @Name("enc")  ceylon.language.String enc) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(chunk);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(enc);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.write(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " If you send an HTTP request with the header <code>Expect</code> set to the value <code>100-continue</code>\n and the server responds with an interim HTTP response with a status code of <code>100</code> and a continue handler\n has been set using this method, then the <code>handler</code> will be called.\n <p>\n You can then continue to write data to the request body and later end it. This is normally used in conjunction with\n the [sendHead](../http/HttpClientRequest.type.html#sendHead) method to force the request header to be written before the request has ended.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest continueHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("handler")  Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        handler.$call$();
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.continueHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Forces the head of the request to be written before [end](../http/HttpClientRequest.type.html#end) is called on the request or any data is\n written to it.\n <p>\n This is normally used to implement HTTP 100-continue handling, see  for\n more information.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest sendHead() {
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.sendHead());
    return this;
  }

  @DocAnnotation$annotation$(description = " Same as [end](../http/HttpClientRequest.type.html#end) but writes a String in UTF-8 encoding\n")
  @TypeInfo("ceylon.language::Anything")
  public void end(
    final @TypeInfo("ceylon.language::String") @Name("chunk")  ceylon.language.String chunk) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(chunk);
    delegate.end(arg_0);
  }

  @DocAnnotation$annotation$(description = " Same as [end](../http/HttpClientRequest.type.html#end) but writes a String with the specified encoding\n")
  @TypeInfo("ceylon.language::Anything")
  public void end(
    final @TypeInfo("ceylon.language::String") @Name("chunk")  ceylon.language.String chunk, 
    final @TypeInfo("ceylon.language::String") @Name("enc")  ceylon.language.String enc) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(chunk);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(enc);
    delegate.end(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = " Same as [end](../http/HttpClientRequest.type.html#end) but writes some data to the request body before ending. If the request is not chunked and\n no other data has been written then the <code>Content-Length</code> header will be automatically set\n")
  @TypeInfo("ceylon.language::Anything")
  public void end(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("chunk")  Buffer chunk) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(chunk);
    delegate.end(arg_0);
  }

  @DocAnnotation$annotation$(description = " Ends the request. If no data has been written to the request body, and [sendHead](../http/HttpClientRequest.type.html#sendHead) has not been called then\n the actual request won't get written until this method gets called.\n <p>\n Once the request has ended, it cannot be used any more,\n")
  @TypeInfo("ceylon.language::Anything")
  public void end() {
    delegate.end();
  }

  @DocAnnotation$annotation$(description = " Set's the amount of time after which if a response is not received `java.util.concurrent.TimeoutException`\n will be sent to the exception handler of this request.\n <p>\n  Calling this method more than once\n has the effect of canceling any existing timeout and starting the timeout from scratch.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest setTimeout(
    final @TypeInfo("ceylon.language::Integer") @Name("timeoutMs") @DocAnnotation$annotation$(description = "The quantity of time in milliseconds.\n") long timeoutMs) {
    long arg_0 = timeoutMs;
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.setTimeout(arg_0));
    return this;
  }

}
