package io.vertx.ceylon.core.metrics;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;

public interface Measured {

  Object getDelegate();

  @TypeInfo("ceylon.language::Boolean")
  boolean isMetricsEnabled();

  public class Impl implements Measured {
    private final io.vertx.core.metrics.Measured delegate;

    public Impl(io.vertx.core.metrics.Measured delegate) {
      this.delegate = delegate;
    }

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
