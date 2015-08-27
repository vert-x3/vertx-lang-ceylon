package io.vertx.ceylon.codegen.testmodel;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.core.Handler;

@DocAnnotation$annotation$(description = "todo")
public interface AbstractHandlerUserType {

  Object getDelegate();

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  void handle(
    final @TypeInfo("io.vertx.ceylon.codegen.testmodel::RefedInterface1") @DocAnnotation$annotation$(description = "todo") RefedInterface1 arg0);

  public class Impl implements AbstractHandlerUserType {
    private final io.vertx.codegen.testmodel.AbstractHandlerUserType delegate;

    public Impl(io.vertx.codegen.testmodel.AbstractHandlerUserType delegate) {
      this.delegate = delegate;
    }

    public Object getDelegate() {
      return delegate;
    }

    @Override
    public void handle(final RefedInterface1 arg0) {
      io.vertx.codegen.testmodel.RefedInterface1 arg_0 = (io.vertx.codegen.testmodel.RefedInterface1)arg0.getDelegate();
      delegate.handle(arg_0);
    }
  }

}
