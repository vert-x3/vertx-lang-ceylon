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
import io.vertx.ceylon.core.MultiMap;
import io.vertx.ceylon.core.buffer.Buffer;
import io.vertx.ceylon.core.streams.WriteStream;
import io.vertx.ceylon.core.streams.ReadStream;
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
  @Ignore private HttpConnection cached_connection;
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
  public boolean $isChunked() {
    boolean ret = delegate.isChunked();
    return ret;
  }

  @DocAnnotation$annotation$(description = " The HTTP method for the request.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpMethod")
  public io.vertx.ceylon.core.http.HttpMethod method() {
    io.vertx.ceylon.core.http.HttpMethod ret = io.vertx.ceylon.core.http.httpMethod_.get_().getToCeylon().safeConvert(delegate.method());
    return ret;
  }

  @DocAnnotation$annotation$(description = " @return the raw value of the method this request sends\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String $getRawMethod() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.getRawMethod());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Set the value the method to send when the method  is used.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest setRawMethod(
    final @TypeInfo("ceylon.language::String") @Name("method") @DocAnnotation$annotation$(description = "the raw method\n") ceylon.language.String method) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(method);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.setRawMethod(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " @return The URI of the request.\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String uri() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.uri());
    return ret;
  }

  @DocAnnotation$annotation$(description = " @return The path part of the uri. For example /somepath/somemorepath/someresource.foo\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String path() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.path());
    return ret;
  }

  @DocAnnotation$annotation$(description = " @return the query part of the uri. For example someparam=32&amp;someotherparam=x\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String query() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.query());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Set the request host.<p/>\n\n For HTTP2 it sets the  pseudo header otherwise it sets the  header\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest setHost(
    final @TypeInfo("ceylon.language::String") @Name("host")  ceylon.language.String host) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.setHost(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " @return the request host. For HTTP2 it returns the  pseudo header otherwise it returns the  header\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String $getHost() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.getHost());
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

  @DocAnnotation$annotation$(description = " Write a `String` to the request body, encoded as UTF-8.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest write(
    final @TypeInfo("ceylon.language::String") @Name("chunk")  ceylon.language.String chunk) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(chunk);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.write(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Write a `String` to the request body, encoded using the encoding <code>enc</code>.\n")
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

  @DocAnnotation$annotation$(description = " Like [sendHead](../http/HttpClientRequest.type.html#sendHead) but with an handler after headers have been sent. The handler will be called with\n the [HttpVersion](../http/HttpVersion.type.html) if it can be determined or null otherwise.<p>\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest sendHead(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpVersion)") @Name("completionHandler")  Callable<?> completionHandler) {
    io.vertx.core.Handler<io.vertx.core.http.HttpVersion> arg_0 = completionHandler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpVersion>() {
      public void handle(io.vertx.core.http.HttpVersion event) {
        completionHandler.$call$((Object)io.vertx.ceylon.core.http.httpVersion_.get_().getToCeylon().safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.sendHead(arg_0));
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

  @DocAnnotation$annotation$(description = " Set's the amount of time after which if the request does not return any data within the timeout period an\n `java.util.concurrent.TimeoutException` will be passed to the exception handler (if provided) and\n the request will be closed.\n <p>\n Calling this method more than once has the effect of canceling any existing timeout and starting\n the timeout from scratch.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest setTimeout(
    final @TypeInfo("ceylon.language::Integer") @Name("timeoutMs") @DocAnnotation$annotation$(description = "The quantity of time in milliseconds.\n") long timeoutMs) {
    long arg_0 = timeoutMs;
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.setTimeout(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set a push handler for this request.<p/>\n\n The handler is called when the client receives a <i>push promise</i> from the server. The handler can be called\n multiple times, for each push promise.<p/>\n\n The handler is called with a <i>read-only</i> [HttpClientRequest](../http/HttpClientRequest.type.html), the following methods can be called:<p/>\n\n <ul>\n   <li>[method](../http/HttpClientRequest.type.html#method)</li>\n   <li>[uri](../http/HttpClientRequest.type.html#uri)</li>\n   <li>[headers](../http/HttpClientRequest.type.html#headers)</li>\n   <li>[getHost](../http/HttpClientRequest.type.html#getHost)</li>\n </ul>\n\n In addition the handler should call the [handler](../http/HttpClientRequest.type.html#handler) method to set an handler to\n process the response.<p/>\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest pushHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientRequest)") @Name("handler") @DocAnnotation$annotation$(description = "the handler\n") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.http.HttpClientRequest> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientRequest>() {
      public void handle(io.vertx.core.http.HttpClientRequest event) {
        handler.$call$((Object)io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.pushHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Reset this stream with the error code <code>0</code>.\n")
  @TypeInfo("ceylon.language::Anything")
  public void reset() {
    delegate.reset();
  }

  @DocAnnotation$annotation$(description = " Reset this stream with the error <code>code</code>.\n")
  @TypeInfo("ceylon.language::Anything")
  public void reset(
    final @TypeInfo("ceylon.language::Integer") @Name("code") @DocAnnotation$annotation$(description = "the error code\n") long code) {
    long arg_0 = code;
    delegate.reset(arg_0);
  }

  @DocAnnotation$annotation$(description = " @return the [HttpConnection](../http/HttpConnection.type.html) associated with this request when it is an HTTP/2 connection, null otherwise\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpConnection")
  public HttpConnection connection() {
    if (cached_connection != null) {
      return cached_connection;
    }
    HttpConnection ret = io.vertx.ceylon.core.http.HttpConnection.TO_CEYLON.converter().safeConvert(delegate.connection());
    cached_connection = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = " Set a connection handler called when an HTTP/2 connection has been established.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest connectionHandler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpConnection)?") @Name("handler") @DocAnnotation$annotation$(description = "the handler\n") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.http.HttpConnection> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpConnection>() {
      public void handle(io.vertx.core.http.HttpConnection event) {
        handler.$call$((Object)io.vertx.ceylon.core.http.HttpConnection.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.connectionHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Write an HTTP/2 frame to the request, allowing to extend the HTTP/2 protocol.<p>\n\n The frame is sent immediatly and is not subject to flow control.<p>\n\n This method must be called after the request headers have been sent and only for the protocol HTTP/2.\n The [sendHead](../http/HttpClientRequest.type.html#sendHead) should be used for this purpose.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest writeFrame(
    final @TypeInfo("ceylon.language::Integer") @Name("type") @DocAnnotation$annotation$(description = "the 8-bit frame type\n") long type, 
    final @TypeInfo("ceylon.language::Integer") @Name("flags") @DocAnnotation$annotation$(description = "the 8-bit frame flags\n") long flags, 
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("payload") @DocAnnotation$annotation$(description = "the frame payload\n") Buffer payload) {
    int arg_0 = (int)type;
    int arg_1 = (int)flags;
    io.vertx.core.buffer.Buffer arg_2 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(payload);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.writeFrame(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " @return the id of the stream of this response,  when it is not yet determined, i.e\n         the request has not been yet sent or it is not supported HTTP/1.x\n")
  @TypeInfo("ceylon.language::Integer")
  public long streamId() {
    long ret = delegate.streamId();
    return ret;
  }

  @DocAnnotation$annotation$(description = " Like [writeFrame](../http/HttpClientRequest.type.html#writeFrame) but with an [HttpFrame](../http/HttpFrame.type.html).\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest writeFrame(
    final @TypeInfo("io.vertx.ceylon.core.http::HttpFrame") @Name("frame") @DocAnnotation$annotation$(description = "the frame to write\n") HttpFrame frame) {
    io.vertx.core.http.HttpFrame arg_0 = io.vertx.ceylon.core.http.HttpFrame.TO_JAVA.safeConvert(frame);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.writeFrame(arg_0));
    return this;
  }

}
