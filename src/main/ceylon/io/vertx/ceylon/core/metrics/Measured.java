package io.vertx.ceylon.core.metrics;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;

@DocAnnotation$annotation$(description = "todo")
public interface Measured {

  @Ignore
  Object getDelegate();

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  boolean isMetricsEnabled();

  @Ignore
  public class Impl implements Measured {
    @Ignore
    private final io.vertx.core.metrics.Measured delegate;

    public Impl(io.vertx.core.metrics.Measured delegate) {
      this.delegate = delegate;
    }

    @Ignore
    public Object getDelegate() {
      return delegate;
    }

    @Override
    public boolean isMetricsEnabled() {
      boolean ret = delegate.isMetricsEnabled();
      return ret;
    }
  }

}
