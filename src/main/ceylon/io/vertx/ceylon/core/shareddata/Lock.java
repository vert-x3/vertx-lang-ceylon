package io.vertx.ceylon.core.shareddata;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;

@DocAnnotation$annotation$(description = "todo")
public class Lock {

  private final io.vertx.core.shareddata.Lock delegate;

  public Lock(io.vertx.core.shareddata.Lock delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void release() {
    delegate.release();
  }

}
