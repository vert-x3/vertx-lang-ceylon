package io.vertx.ceylon.core.metrics;

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

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " @author <a href=\"mailto:nscavell@redhat.com\">Nick Scavelli</a>\n")
public interface Measured {

  @Ignore
  io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.metrics.Measured, Measured> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.metrics.Measured, Measured>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.metrics.Measured, Measured> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.metrics.Measured, Measured>() {
        public Measured convert(io.vertx.core.metrics.Measured src) {
          return new Measured.Impl(src);
        }
      };
    }
  };

  @Ignore
  io.vertx.lang.ceylon.Converter<Measured, io.vertx.core.metrics.Measured> TO_JAVA = new io.vertx.lang.ceylon.Converter<Measured, io.vertx.core.metrics.Measured>() {
    public io.vertx.core.metrics.Measured convert(Measured src) {
      return (io.vertx.core.metrics.Measured)src.getDelegate();
    }
  };

  @Ignore
  TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(Measured.class);
  @Ignore
  Object getDelegate();

  @DocAnnotation$annotation$(description = " Whether the metrics are enabled for this measured object\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean $isMetricsEnabled();

  @Ignore
  public class Impl implements Measured {
    @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(Measured.class);
    @Ignore private final io.vertx.core.metrics.Measured delegate;

    public Impl(io.vertx.core.metrics.Measured delegate) {
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

  @DocAnnotation$annotation$(description = " Whether the metrics are enabled for this measured object\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean $isMetricsEnabled() {
    boolean ret = delegate.isMetricsEnabled();
      return ret;
    }
  }

}
