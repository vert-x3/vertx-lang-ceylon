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
import io.vertx.ceylon.core.MultiMap;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Represents a server-side HTTP response.\n <p>\n An instance of this is created and associated to every instance of\n [HttpServerRequest](../http/HttpServerRequest.type.html) that.\n <p>\n It allows the developer to control the HTTP response that is sent back to the\n client for a particular HTTP request.\n <p>\n It contains methods that allow HTTP headers and trailers to be set, and for a body to be written out to the response.\n <p>\n It also allows files to be streamed by the kernel directly from disk to the\n outgoing HTTP connection, bypassing user space altogether (where supported by\n the underlying operating system). This is a very efficient way of\n serving files from the server since buffers do not have to be read one by one\n from the file and written to the outgoing socket.\n <p>\n It implements [WriteStream](../streams/WriteStream.type.html) so it can be used with\n [Pump](../streams/Pump.type.html) to pump data with flow control.\n")
public class HttpServerResponse implements ReifiedType,  WriteStream<Buffer> {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.http.HttpServerResponse, HttpServerResponse> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.http.HttpServerResponse, HttpServerResponse>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.http.HttpServerResponse, HttpServerResponse> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.http.HttpServerResponse, HttpServerResponse>() {
        public HttpServerResponse convert(io.vertx.core.http.HttpServerResponse src) {
          return new HttpServerResponse(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<HttpServerResponse, io.vertx.core.http.HttpServerResponse> TO_JAVA = new io.vertx.lang.ceylon.Converter<HttpServerResponse, io.vertx.core.http.HttpServerResponse>() {
    public io.vertx.core.http.HttpServerResponse convert(HttpServerResponse src) {
      return src.delegate;
    }
  };

  @Ignore private MultiMap cached_headers;
  @Ignore private MultiMap cached_trailers;
  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(HttpServerResponse.class), io.vertx.core.http.HttpServerResponse.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.core.http.HttpServerResponse delegate;

  public HttpServerResponse(io.vertx.core.http.HttpServerResponse delegate) {
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

  @DocAnnotation$annotation$(description = " This will return <code>true</code> if there are more bytes in the write queue than the value set using [setWriteQueueMaxSize](../http/HttpServerResponse.type.html#setWriteQueueMaxSize)\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean writeQueueFull() {
    boolean ret = delegate.writeQueueFull();
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)?") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        handler.$call$((Object)event);
      }
    };
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.converter().safeConvert(delegate.exceptionHandler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse write(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("data") Buffer data) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(data);
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.converter().safeConvert(delegate.write(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse setWriteQueueMaxSize(
    final @TypeInfo("ceylon.language::Integer") @Name("maxSize") long maxSize) {
    int arg_0 = (int)maxSize;
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.converter().safeConvert(delegate.setWriteQueueMaxSize(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse drainHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        handler.$call$();
      }
    };
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.converter().safeConvert(delegate.drainHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::Integer")
  public long $getStatusCode() {
    long ret = delegate.getStatusCode();
    return ret;
  }

  @DocAnnotation$annotation$(description = " Set the status code. If the status message hasn't been explicitly set, a default status message corresponding\n to the code will be looked-up and used.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse setStatusCode(
    final @TypeInfo("ceylon.language::Integer") @Name("statusCode") long statusCode) {
    int arg_0 = (int)statusCode;
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.converter().safeConvert(delegate.setStatusCode(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String $getStatusMessage() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.getStatusMessage());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Set the status message\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse setStatusMessage(
    final @TypeInfo("ceylon.language::String") @Name("statusMessage") ceylon.language.String statusMessage) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(statusMessage);
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.converter().safeConvert(delegate.setStatusMessage(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " If <code>chunked</code> is <code>true</code>, this response will use HTTP chunked encoding, and each call to write to the body\n will correspond to a new HTTP chunk sent on the wire.\n <p>\n If chunked encoding is used the HTTP header <code>Transfer-Encoding</code> with a value of <code>Chunked</code> will be\n automatically inserted in the response.\n <p>\n If <code>chunked</code> is <code>false</code>, this response will not use HTTP chunked encoding, and therefore the total size\n of any data that is written in the respone body must be set in the <code>Content-Length</code> header <b>before</b> any\n data is written out.\n <p>\n An HTTP chunked response is typically used when you do not know the total size of the request body up front.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse setChunked(
    final @TypeInfo("ceylon.language::Boolean") @Name("chunked") boolean chunked) {
    boolean arg_0 = chunked;
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.converter().safeConvert(delegate.setChunked(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::Boolean")
  public boolean $isChunked() {
    boolean ret = delegate.isChunked();
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
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
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse putHeader(
    final @TypeInfo("ceylon.language::String") @Name("name")@DocAnnotation$annotation$(description = "the header name\n") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::String") @Name("value")@DocAnnotation$annotation$(description = "the header value.\n") ceylon.language.String value) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(value);
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.converter().safeConvert(delegate.putHeader(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap trailers() {
    if (cached_trailers != null) {
      return cached_trailers;
    }
    MultiMap ret = io.vertx.ceylon.core.MultiMap.TO_CEYLON.converter().safeConvert(delegate.trailers());
    cached_trailers = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = " Put an HTTP trailer\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse putTrailer(
    final @TypeInfo("ceylon.language::String") @Name("name")@DocAnnotation$annotation$(description = "the trailer name\n") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::String") @Name("value")@DocAnnotation$annotation$(description = "the trailer value\n") ceylon.language.String value) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(value);
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.converter().safeConvert(delegate.putTrailer(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set a close handler for the response, this is called when the underlying connection is closed and the response\n was still using the connection.\n <p>\n For HTTP/1.x it is called when the connection is closed before <code>end()</code> is called, therefore it is not\n guaranteed to be called.\n <p>\n For HTTP/2 it is called when the related stream is closed, and therefore it will be always be called.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse closeHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("handler")@DocAnnotation$annotation$(description = "the handler\n") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        handler.$call$();
      }
    };
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.converter().safeConvert(delegate.closeHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set an end handler for the response. This will be called when the response is disposed to allow consistent cleanup\n of the response.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse endHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("handler")@DocAnnotation$annotation$(description = "the handler\n") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        handler.$call$();
      }
    };
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.converter().safeConvert(delegate.endHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Write a `String` to the response body, encoded using the encoding <code>enc</code>.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse write(
    final @TypeInfo("ceylon.language::String") @Name("chunk")@DocAnnotation$annotation$(description = "the string to write\n") ceylon.language.String chunk, 
    final @TypeInfo("ceylon.language::String") @Name("enc")@DocAnnotation$annotation$(description = "the encoding to use\n") ceylon.language.String enc) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(chunk);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(enc);
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.converter().safeConvert(delegate.write(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Write a `String` to the response body, encoded in UTF-8.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse write(
    final @TypeInfo("ceylon.language::String") @Name("chunk")@DocAnnotation$annotation$(description = "the string to write\n") ceylon.language.String chunk) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(chunk);
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.converter().safeConvert(delegate.write(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Used to write an interim 100 Continue response to signify that the client should send the rest of the request.\n Must only be used if the request contains an \"Expect:100-Continue\" header\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse writeContinue() {
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.converter().safeConvert(delegate.writeContinue());
    return this;
  }

  @DocAnnotation$annotation$(description = " Same as [end](../http/HttpServerResponse.type.html#end) but writes a String in UTF-8 encoding before ending the response.\n")
  @TypeInfo("ceylon.language::Anything")
  public void end(
    final @TypeInfo("ceylon.language::String") @Name("chunk")@DocAnnotation$annotation$(description = "the string to write before ending the response\n") ceylon.language.String chunk) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(chunk);
    delegate.end(arg_0);
  }

  @DocAnnotation$annotation$(description = " Same as [end](../http/HttpServerResponse.type.html#end) but writes a String with the specified encoding before ending the response.\n")
  @TypeInfo("ceylon.language::Anything")
  public void end(
    final @TypeInfo("ceylon.language::String") @Name("chunk")@DocAnnotation$annotation$(description = "the string to write before ending the response\n") ceylon.language.String chunk, 
    final @TypeInfo("ceylon.language::String") @Name("enc")@DocAnnotation$annotation$(description = "the encoding to use\n") ceylon.language.String enc) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(chunk);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(enc);
    delegate.end(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = " Same as [end](../http/HttpServerResponse.type.html#end) but writes some data to the response body before ending. If the response is not chunked and\n no other data has been written then the @code{Content-Length} header will be automatically set.\n")
  @TypeInfo("ceylon.language::Anything")
  public void end(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("chunk")@DocAnnotation$annotation$(description = "the buffer to write before ending the response\n") Buffer chunk) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(chunk);
    delegate.end(arg_0);
  }

  @DocAnnotation$annotation$(description = " Ends the response. If no data has been written to the response body,\n the actual response won't get written until this method gets called.\n <p>\n Once the response has ended, it cannot be used any more.\n")
  @TypeInfo("ceylon.language::Anything")
  public void end() {
    delegate.end();
  }

  @DocAnnotation$annotation$(description = " Same as [sendFile](../http/HttpServerResponse.type.html#sendFile) using offset @code{0} which means starting from the beginning of the file.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse sendFile(
    final @TypeInfo("ceylon.language::String") @Name("filename")@DocAnnotation$annotation$(description = "path to the file to serve\n") ceylon.language.String filename) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(filename);
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.converter().safeConvert(delegate.sendFile(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Same as [sendFile](../http/HttpServerResponse.type.html#sendFile) using length @code{Long.MAX_VALUE} which means until the end of the\n file.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse sendFile(
    final @TypeInfo("ceylon.language::String") @Name("filename")@DocAnnotation$annotation$(description = "path to the file to serve\n") ceylon.language.String filename, 
    final @TypeInfo("ceylon.language::Integer") @Name("offset")@DocAnnotation$annotation$(description = "offset to start serving from\n") long offset) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(filename);
    long arg_1 = offset;
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.converter().safeConvert(delegate.sendFile(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Ask the OS to stream a file as specified by <code>filename</code> directly\n from disk to the outgoing connection, bypassing userspace altogether\n (where supported by the underlying operating system.\n This is a very efficient way to serve files.<p>\n The actual serve is asynchronous and may not complete until some time after this method has returned.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse sendFile(
    final @TypeInfo("ceylon.language::String") @Name("filename")@DocAnnotation$annotation$(description = "path to the file to serve\n") ceylon.language.String filename, 
    final @TypeInfo("ceylon.language::Integer") @Name("offset")@DocAnnotation$annotation$(description = "offset to start serving from\n") long offset, 
    final @TypeInfo("ceylon.language::Integer") @Name("length")@DocAnnotation$annotation$(description = "length to serve to\n") long length) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(filename);
    long arg_1 = offset;
    long arg_2 = length;
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.converter().safeConvert(delegate.sendFile(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Like [sendFile](../http/HttpServerResponse.type.html#sendFile) but providing a handler which will be notified once the file has been completely\n written to the wire.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse sendFile(
    final @TypeInfo("ceylon.language::String") @Name("filename")@DocAnnotation$annotation$(description = "path to the file to serve\n") ceylon.language.String filename, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("resultHandler")@DocAnnotation$annotation$(description = "handler that will be called on completion\n") Callable<?> resultHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(filename);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(resultHandler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.converter().safeConvert(delegate.sendFile(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Like [sendFile](../http/HttpServerResponse.type.html#sendFile) but providing a handler which will be notified once the file has been completely\n written to the wire.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse sendFile(
    final @TypeInfo("ceylon.language::String") @Name("filename")@DocAnnotation$annotation$(description = "path to the file to serve\n") ceylon.language.String filename, 
    final @TypeInfo("ceylon.language::Integer") @Name("offset")@DocAnnotation$annotation$(description = "the offset to serve from\n") long offset, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("resultHandler")@DocAnnotation$annotation$(description = "handler that will be called on completion\n") Callable<?> resultHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(filename);
    long arg_1 = offset;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_2 = resultHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(resultHandler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.converter().safeConvert(delegate.sendFile(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Like [sendFile](../http/HttpServerResponse.type.html#sendFile) but providing a handler which will be notified once the file has been\n completely written to the wire.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse sendFile(
    final @TypeInfo("ceylon.language::String") @Name("filename")@DocAnnotation$annotation$(description = "path to the file to serve\n") ceylon.language.String filename, 
    final @TypeInfo("ceylon.language::Integer") @Name("offset")@DocAnnotation$annotation$(description = "the offset to serve from\n") long offset, 
    final @TypeInfo("ceylon.language::Integer") @Name("length")@DocAnnotation$annotation$(description = "the length to serve to\n") long length, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("resultHandler")@DocAnnotation$annotation$(description = "handler that will be called on completion\n") Callable<?> resultHandler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(filename);
    long arg_1 = offset;
    long arg_2 = length;
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_3 = resultHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(resultHandler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.converter().safeConvert(delegate.sendFile(arg_0, arg_1, arg_2, arg_3));
    return this;
  }

  @DocAnnotation$annotation$(description = " Close the underlying TCP connection corresponding to the request.\n")
  @TypeInfo("ceylon.language::Anything")
  public void close() {
    delegate.close();
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::Boolean")
  public boolean ended() {
    boolean ret = delegate.ended();
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::Boolean")
  public boolean closed() {
    boolean ret = delegate.closed();
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::Boolean")
  public boolean headWritten() {
    boolean ret = delegate.headWritten();
    return ret;
  }

  @DocAnnotation$annotation$(description = " Provide a handler that will be called just before the headers are written to the wire.<p>\n This provides a hook allowing you to add any more headers or do any more operations before this occurs.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse headersEndHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("handler")@DocAnnotation$annotation$(description = "the handler\n") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        handler.$call$();
      }
    };
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.converter().safeConvert(delegate.headersEndHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Provides a handler that will be called after the last part of the body is written to the wire.\n The handler is called asynchronously of when the response has been received by the client.\n This provides a hook allowing you to do more operations once the request has been sent over the wire\n such as resource cleanup.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse bodyEndHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("handler")@DocAnnotation$annotation$(description = "the handler\n") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        handler.$call$();
      }
    };
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.converter().safeConvert(delegate.bodyEndHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::Integer")
  public long bytesWritten() {
    long ret = delegate.bytesWritten();
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::Integer")
  public long streamId() {
    long ret = delegate.streamId();
    return ret;
  }

  @DocAnnotation$annotation$(description = " Like [push](../http/HttpServerResponse.type.html#push) with no headers.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse push(
    final @TypeInfo("io.vertx.ceylon.core.http::HttpMethod") @Name("method") io.vertx.ceylon.core.http.HttpMethod method, 
    final @TypeInfo("ceylon.language::String") @Name("host") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("path") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.http::HttpServerResponse)") @Name("handler") Callable<?> handler) {
    io.vertx.core.http.HttpMethod arg_0 = io.vertx.ceylon.core.http.httpMethod_.get_().getToJava().safeConvert(method);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServerResponse>> arg_3 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.core.http.HttpServerResponse>(handler) {
      public Object toCeylon(io.vertx.core.http.HttpServerResponse event) {
        return io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.converter().safeConvert(event);
      }
    };
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.converter().safeConvert(delegate.push(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Like [push](../http/HttpServerResponse.type.html#push) with the host copied from the current request.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse push(
    final @TypeInfo("io.vertx.ceylon.core.http::HttpMethod") @Name("method") io.vertx.ceylon.core.http.HttpMethod method, 
    final @TypeInfo("ceylon.language::String") @Name("path") ceylon.language.String path, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers") MultiMap headers, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.http::HttpServerResponse)") @Name("handler") Callable<?> handler) {
    io.vertx.core.http.HttpMethod arg_0 = io.vertx.ceylon.core.http.httpMethod_.get_().getToJava().safeConvert(method);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    io.vertx.core.MultiMap arg_2 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServerResponse>> arg_3 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.core.http.HttpServerResponse>(handler) {
      public Object toCeylon(io.vertx.core.http.HttpServerResponse event) {
        return io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.converter().safeConvert(event);
      }
    };
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.converter().safeConvert(delegate.push(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Like [push](../http/HttpServerResponse.type.html#push) with the host copied from the current request.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse push(
    final @TypeInfo("io.vertx.ceylon.core.http::HttpMethod") @Name("method") io.vertx.ceylon.core.http.HttpMethod method, 
    final @TypeInfo("ceylon.language::String") @Name("path") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.http::HttpServerResponse)") @Name("handler") Callable<?> handler) {
    io.vertx.core.http.HttpMethod arg_0 = io.vertx.ceylon.core.http.httpMethod_.get_().getToJava().safeConvert(method);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServerResponse>> arg_2 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.core.http.HttpServerResponse>(handler) {
      public Object toCeylon(io.vertx.core.http.HttpServerResponse event) {
        return io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.converter().safeConvert(event);
      }
    };
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.converter().safeConvert(delegate.push(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Push a response to the client.<p/>\n\n The <code>handler</code> will be notified with a <i>success</i> when the push can be sent and with\n a <i>failure</i> when the client has disabled push or reset the push before it has been sent.<p/>\n\n The <code>handler</code> may be queued if the client has reduced the maximum number of streams the server can push\n concurrently.<p/>\n\n Push can be sent only for peer initiated streams and if the response is not ended.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse push(
    final @TypeInfo("io.vertx.ceylon.core.http::HttpMethod") @Name("method")@DocAnnotation$annotation$(description = "the method of the promised request\n") io.vertx.ceylon.core.http.HttpMethod method, 
    final @TypeInfo("ceylon.language::String") @Name("host")@DocAnnotation$annotation$(description = "the host of the promised request\n") ceylon.language.String host, 
    final @TypeInfo("ceylon.language::String") @Name("path")@DocAnnotation$annotation$(description = "the path of the promised request\n") ceylon.language.String path, 
    final @TypeInfo("io.vertx.ceylon.core::MultiMap") @Name("headers")@DocAnnotation$annotation$(description = "the headers of the promised request\n") MultiMap headers, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.core.http::HttpServerResponse)") @Name("handler")@DocAnnotation$annotation$(description = "the handler notified when the response can be written\n") Callable<?> handler) {
    io.vertx.core.http.HttpMethod arg_0 = io.vertx.ceylon.core.http.httpMethod_.get_().getToJava().safeConvert(method);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(host);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    io.vertx.core.MultiMap arg_3 = io.vertx.ceylon.core.MultiMap.TO_JAVA.safeConvert(headers);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.http.HttpServerResponse>> arg_4 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.core.http.HttpServerResponse>(handler) {
      public Object toCeylon(io.vertx.core.http.HttpServerResponse event) {
        return io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.converter().safeConvert(event);
      }
    };
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.converter().safeConvert(delegate.push(arg_0, arg_1, arg_2, arg_3, arg_4));
    return this;
  }

  @DocAnnotation$annotation$(description = " Reset this HTTP/2 stream with the error code <code>0</code>.\n")
  @TypeInfo("ceylon.language::Anything")
  public void reset() {
    delegate.reset();
  }

  @DocAnnotation$annotation$(description = " Reset this HTTP/2 stream with the error <code>code</code>.\n")
  @TypeInfo("ceylon.language::Anything")
  public void reset(
    final @TypeInfo("ceylon.language::Integer") @Name("code")@DocAnnotation$annotation$(description = "the error code\n") long code) {
    long arg_0 = code;
    delegate.reset(arg_0);
  }

  @DocAnnotation$annotation$(description = " Write an HTTP/2 frame to the response, allowing to extend the HTTP/2 protocol.<p>\n\n The frame is sent immediatly and is not subject to flow control.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse writeCustomFrame(
    final @TypeInfo("ceylon.language::Integer") @Name("type")@DocAnnotation$annotation$(description = "the 8-bit frame type\n") long type, 
    final @TypeInfo("ceylon.language::Integer") @Name("flags")@DocAnnotation$annotation$(description = "the 8-bit frame flags\n") long flags, 
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("payload")@DocAnnotation$annotation$(description = "the frame payload\n") Buffer payload) {
    int arg_0 = (int)type;
    int arg_1 = (int)flags;
    io.vertx.core.buffer.Buffer arg_2 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(payload);
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.converter().safeConvert(delegate.writeCustomFrame(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Like [writeCustomFrame](../http/HttpServerResponse.type.html#writeCustomFrame) but with an [HttpFrame](../http/HttpFrame.type.html).\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerResponse")
  public HttpServerResponse writeCustomFrame(
    final @TypeInfo("io.vertx.ceylon.core.http::HttpFrame") @Name("frame")@DocAnnotation$annotation$(description = "the frame to write\n") HttpFrame frame) {
    io.vertx.core.http.HttpFrame arg_0 = io.vertx.ceylon.core.http.HttpFrame.TO_JAVA.safeConvert(frame);
    HttpServerResponse ret = io.vertx.ceylon.core.http.HttpServerResponse.TO_CEYLON.converter().safeConvert(delegate.writeCustomFrame(arg_0));
    return this;
  }

}
