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

@Ceylon(major = 8)@DocAnnotation$annotation$(description = "todo")
public class HttpClientRequest implements ReifiedType,  WriteStream<Buffer>,  ReadStream<HttpClientResponse> {

  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.http.HttpClientRequest, HttpClientRequest> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.http.HttpClientRequest, HttpClientRequest>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.http.HttpClientRequest, HttpClientRequest> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.http.HttpClientRequest, HttpClientRequest>() {
        public HttpClientRequest convert(io.vertx.core.http.HttpClientRequest src) {
          return new HttpClientRequest(src);
        }
      };
    }
  };

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

  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
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
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)?") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        handler.$call$((Object)event);
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.exceptionHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest write(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("data") @DocAnnotation$annotation$(description = "todo") Buffer data) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(data);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.write(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest setWriteQueueMaxSize(
    final @TypeInfo("ceylon.language::Integer") @Name("maxSize") @DocAnnotation$annotation$(description = "todo") long maxSize) {
    int arg_0 = (int)maxSize;
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.setWriteQueueMaxSize(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest drainHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        handler.$call$();
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.drainHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpClientResponse)?") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpClientResponse>() {
      public void handle(io.vertx.core.http.HttpClientResponse event) {
        handler.$call$((Object)io.vertx.ceylon.core.http.HttpClientResponse.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.handler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest pause() {
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.pause());
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest resume() {
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.resume());
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest endHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("endHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = endHandler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        endHandler.$call$();
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.endHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest setChunked(
    final @TypeInfo("ceylon.language::Boolean") @Name("chunked") @DocAnnotation$annotation$(description = "todo") boolean chunked) {
    boolean arg_0 = chunked;
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.setChunked(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isChunked() {
    boolean ret = delegate.isChunked();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpMethod")
  public io.vertx.ceylon.core.http.HttpMethod method() {
    io.vertx.ceylon.core.http.HttpMethod ret = io.vertx.ceylon.core.http.toCeylonHttpMethod_.get_().safeConvert(delegate.method());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String uri() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.uri());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public MultiMap headers() {
    if (cached_headers != null) {
      return cached_headers;
    }
    MultiMap ret = io.vertx.ceylon.core.MultiMap.TO_CEYLON.converter().safeConvert(delegate.headers());
    cached_headers = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest putHeader(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::String") @Name("value") @DocAnnotation$annotation$(description = "todo") ceylon.language.String value) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(value);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.putHeader(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest write(
    final @TypeInfo("ceylon.language::String") @Name("chunk") @DocAnnotation$annotation$(description = "todo") ceylon.language.String chunk) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(chunk);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.write(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest write(
    final @TypeInfo("ceylon.language::String") @Name("chunk") @DocAnnotation$annotation$(description = "todo") ceylon.language.String chunk, 
    final @TypeInfo("ceylon.language::String") @Name("enc") @DocAnnotation$annotation$(description = "todo") ceylon.language.String enc) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(chunk);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(enc);
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.write(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest continueHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        handler.$call$();
      }
    };
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.continueHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest sendHead() {
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.sendHead());
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void end(
    final @TypeInfo("ceylon.language::String") @Name("chunk") @DocAnnotation$annotation$(description = "todo") ceylon.language.String chunk) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(chunk);
    delegate.end(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void end(
    final @TypeInfo("ceylon.language::String") @Name("chunk") @DocAnnotation$annotation$(description = "todo") ceylon.language.String chunk, 
    final @TypeInfo("ceylon.language::String") @Name("enc") @DocAnnotation$annotation$(description = "todo") ceylon.language.String enc) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(chunk);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(enc);
    delegate.end(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void end(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("chunk") @DocAnnotation$annotation$(description = "todo") Buffer chunk) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(chunk);
    delegate.end(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void end() {
    delegate.end();
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpClientRequest")
  public HttpClientRequest setTimeout(
    final @TypeInfo("ceylon.language::Integer") @Name("timeoutMs") @DocAnnotation$annotation$(description = "todo") long timeoutMs) {
    long arg_0 = timeoutMs;
    HttpClientRequest ret = io.vertx.ceylon.core.http.HttpClientRequest.TO_CEYLON.converter().safeConvert(delegate.setTimeout(arg_0));
    return this;
  }

}
