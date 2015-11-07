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
import io.vertx.ceylon.core.streams.ReadStream;
import io.vertx.core.Handler;

@Ceylon(major = 8)@DocAnnotation$annotation$(description = "todo")
public class HttpServerRequestStream implements ReifiedType,  ReadStream<HttpServerRequest> {

  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.http.HttpServerRequestStream, HttpServerRequestStream> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.http.HttpServerRequestStream, HttpServerRequestStream>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.http.HttpServerRequestStream, HttpServerRequestStream> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.http.HttpServerRequestStream, HttpServerRequestStream>() {
        public HttpServerRequestStream convert(io.vertx.core.http.HttpServerRequestStream src) {
          return new HttpServerRequestStream(src);
        }
      };
    }
  };

  public static final io.vertx.lang.ceylon.Converter<HttpServerRequestStream, io.vertx.core.http.HttpServerRequestStream> TO_JAVA = new io.vertx.lang.ceylon.Converter<HttpServerRequestStream, io.vertx.core.http.HttpServerRequestStream>() {
    public io.vertx.core.http.HttpServerRequestStream convert(HttpServerRequestStream src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(HttpServerRequestStream.class);
  @Ignore private final io.vertx.core.http.HttpServerRequestStream delegate;

  public HttpServerRequestStream(io.vertx.core.http.HttpServerRequestStream delegate) {
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
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequestStream")
  public HttpServerRequestStream exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)?") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        handler.$call$((Object)event);
      }
    };
    HttpServerRequestStream ret = io.vertx.ceylon.core.http.HttpServerRequestStream.TO_CEYLON.converter().safeConvert(delegate.exceptionHandler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequestStream")
  public HttpServerRequestStream handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.http::HttpServerRequest)?") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.http.HttpServerRequest>() {
      public void handle(io.vertx.core.http.HttpServerRequest event) {
        handler.$call$((Object)io.vertx.ceylon.core.http.HttpServerRequest.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpServerRequestStream ret = io.vertx.ceylon.core.http.HttpServerRequestStream.TO_CEYLON.converter().safeConvert(delegate.handler(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequestStream")
  public HttpServerRequestStream pause() {
    HttpServerRequestStream ret = io.vertx.ceylon.core.http.HttpServerRequestStream.TO_CEYLON.converter().safeConvert(delegate.pause());
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequestStream")
  public HttpServerRequestStream resume() {
    HttpServerRequestStream ret = io.vertx.ceylon.core.http.HttpServerRequestStream.TO_CEYLON.converter().safeConvert(delegate.resume());
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerRequestStream")
  public HttpServerRequestStream endHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("endHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = endHandler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        endHandler.$call$();
      }
    };
    HttpServerRequestStream ret = io.vertx.ceylon.core.http.HttpServerRequestStream.TO_CEYLON.converter().safeConvert(delegate.endHandler(arg_0));
    return this;
  }

}
