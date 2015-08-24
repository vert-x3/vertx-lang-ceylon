package io.vertx.ceylon.codegen.testmodel;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;

@TypeParameters({
  @TypeParameter(value="T",variance=Variance.NONE)
})
public class GenericRefedInterface<T> {

  private final io.vertx.codegen.testmodel.GenericRefedInterface delegate;

  public GenericRefedInterface(io.vertx.codegen.testmodel.GenericRefedInterface delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  @TypeInfo("ceylon.language::Anything")
  public void setValue(
    final @TypeInfo("T") T value) {
    java.lang.Object arg_0 = null;
    delegate.setValue(arg_0);
  }

  @TypeInfo("T")
  public T getValue() {
    T ret = null;
    return ret;
  }

}
