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
import io.vertx.ceylon.core.streams.ReadStream;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Represents an file upload from an HTML FORM.\n")
public class HttpServerFileUpload implements ReifiedType,  ReadStream<Buffer> {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.http.HttpServerFileUpload, HttpServerFileUpload> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.http.HttpServerFileUpload, HttpServerFileUpload>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.http.HttpServerFileUpload, HttpServerFileUpload> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.http.HttpServerFileUpload, HttpServerFileUpload>() {
        public HttpServerFileUpload convert(io.vertx.core.http.HttpServerFileUpload src) {
          return new HttpServerFileUpload(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<HttpServerFileUpload, io.vertx.core.http.HttpServerFileUpload> TO_JAVA = new io.vertx.lang.ceylon.Converter<HttpServerFileUpload, io.vertx.core.http.HttpServerFileUpload>() {
    public io.vertx.core.http.HttpServerFileUpload convert(HttpServerFileUpload src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(HttpServerFileUpload.class);
  @Ignore private final io.vertx.core.http.HttpServerFileUpload delegate;

  public HttpServerFileUpload(io.vertx.core.http.HttpServerFileUpload delegate) {
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

  @TypeInfo("io.vertx.ceylon.core.http::HttpServerFileUpload")
  public HttpServerFileUpload exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)?") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        handler.$call$((Object)event);
      }
    };
    HttpServerFileUpload ret = io.vertx.ceylon.core.http.HttpServerFileUpload.TO_CEYLON.converter().safeConvert(delegate.exceptionHandler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpServerFileUpload")
  public HttpServerFileUpload handler(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)?") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_0 = handler == null ? null : new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        handler.$call$((Object)io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(event));
      }
    };
    HttpServerFileUpload ret = io.vertx.ceylon.core.http.HttpServerFileUpload.TO_CEYLON.converter().safeConvert(delegate.handler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpServerFileUpload")
  public HttpServerFileUpload endHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("endHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> endHandler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = endHandler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        endHandler.$call$();
      }
    };
    HttpServerFileUpload ret = io.vertx.ceylon.core.http.HttpServerFileUpload.TO_CEYLON.converter().safeConvert(delegate.endHandler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpServerFileUpload")
  public HttpServerFileUpload pause() {
    HttpServerFileUpload ret = io.vertx.ceylon.core.http.HttpServerFileUpload.TO_CEYLON.converter().safeConvert(delegate.pause());
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.http::HttpServerFileUpload")
  public HttpServerFileUpload resume() {
    HttpServerFileUpload ret = io.vertx.ceylon.core.http.HttpServerFileUpload.TO_CEYLON.converter().safeConvert(delegate.resume());
    return this;
  }

  @DocAnnotation$annotation$(description = " Stream the content of this upload to the given file on storage.\n")
  @TypeInfo("io.vertx.ceylon.core.http::HttpServerFileUpload")
  public HttpServerFileUpload streamToFileSystem(
    final @TypeInfo("ceylon.language::String") @Name("filename") @DocAnnotation$annotation$(description = "todo") ceylon.language.String filename) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(filename);
    HttpServerFileUpload ret = io.vertx.ceylon.core.http.HttpServerFileUpload.TO_CEYLON.converter().safeConvert(delegate.streamToFileSystem(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " @return the filename which was used when upload the file.\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String filename() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.filename());
    return ret;
  }

  @DocAnnotation$annotation$(description = " @return the name of the attribute\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String name() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.name());
    return ret;
  }

  @DocAnnotation$annotation$(description = " @return  the content type for the upload\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String contentType() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.contentType());
    return ret;
  }

  @DocAnnotation$annotation$(description = " @return the contentTransferEncoding for the upload\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String contentTransferEncoding() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.contentTransferEncoding());
    return ret;
  }

  @DocAnnotation$annotation$(description = " @return the charset for the upload\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String charset() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.charset());
    return ret;
  }

  @DocAnnotation$annotation$(description = " The size of the upload may not be available until it is all read.\n Check [HttpServerFileUpload](../http/HttpServerFileUpload.type.html) to determine this\n")
  @TypeInfo("ceylon.language::Integer")
  public long size() {
    long ret = delegate.size();
    return ret;
  }

  @DocAnnotation$annotation$(description = " @return true if the size of the upload can be retrieved via [HttpServerFileUpload](../http/HttpServerFileUpload.type.html).\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isSizeAvailable() {
    boolean ret = delegate.isSizeAvailable();
    return ret;
  }

}
