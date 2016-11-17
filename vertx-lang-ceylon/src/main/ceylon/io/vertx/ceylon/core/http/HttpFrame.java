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

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " An HTTP/2 frame.\n")
public class HttpFrame implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.http.HttpFrame, HttpFrame> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.http.HttpFrame, HttpFrame>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.http.HttpFrame, HttpFrame> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.http.HttpFrame, HttpFrame>() {
        public HttpFrame convert(io.vertx.core.http.HttpFrame src) {
          return new HttpFrame(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<HttpFrame, io.vertx.core.http.HttpFrame> TO_JAVA = new io.vertx.lang.ceylon.Converter<HttpFrame, io.vertx.core.http.HttpFrame>() {
    public io.vertx.core.http.HttpFrame convert(HttpFrame src) {
      return src.delegate;
    }
  };

  @Ignore private java.lang.Long cached_type;
  @Ignore private java.lang.Long cached_flags;
  @Ignore private Buffer cached_payload;
  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(HttpFrame.class), io.vertx.core.http.HttpFrame.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.core.http.HttpFrame delegate;

  public HttpFrame(io.vertx.core.http.HttpFrame delegate) {
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

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::Integer")
  public long type() {
    if (cached_type != null) {
      return cached_type;
    }
    long ret = delegate.type();
    cached_type = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("ceylon.language::Integer")
  public long flags() {
    if (cached_flags != null) {
      return cached_flags;
    }
    long ret = delegate.flags();
    cached_flags = ret;
    return ret;
  }

  @DocAnnotation$annotation$(description = "")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer payload() {
    if (cached_payload != null) {
      return cached_payload;
    }
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.payload());
    cached_payload = ret;
    return ret;
  }

}
