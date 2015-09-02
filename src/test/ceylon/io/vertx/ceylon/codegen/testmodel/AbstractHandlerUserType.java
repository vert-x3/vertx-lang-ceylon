package io.vertx.ceylon.codegen.testmodel;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.core.Handler;

@DocAnnotation$annotation$(description = "todo")
public interface AbstractHandlerUserType {

  TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(AbstractHandlerUserType.class);

  io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.AbstractHandlerUserType, AbstractHandlerUserType> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.AbstractHandlerUserType, AbstractHandlerUserType>() {
    public AbstractHandlerUserType convert(io.vertx.codegen.testmodel.AbstractHandlerUserType src) {
      return new AbstractHandlerUserType.Impl(src);
    }
  };

  io.vertx.lang.ceylon.Converter<AbstractHandlerUserType, io.vertx.codegen.testmodel.AbstractHandlerUserType> TO_JAVA = new io.vertx.lang.ceylon.Converter<AbstractHandlerUserType, io.vertx.codegen.testmodel.AbstractHandlerUserType>() {
    public io.vertx.codegen.testmodel.AbstractHandlerUserType convert(AbstractHandlerUserType src) {
      return (io.vertx.codegen.testmodel.AbstractHandlerUserType)src.getDelegate();
    }
  };

  @Ignore
  Object getDelegate();

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  void handle(
    final @TypeInfo("io.vertx.ceylon.codegen.testmodel::RefedInterface1") @DocAnnotation$annotation$(description = "todo") RefedInterface1 arg0);

  @Ignore
  public class Impl implements AbstractHandlerUserType {
    @Ignore private final io.vertx.codegen.testmodel.AbstractHandlerUserType delegate;

    public Impl(io.vertx.codegen.testmodel.AbstractHandlerUserType delegate) {
      this.delegate = delegate;
    }

    @Ignore
    public Object getDelegate() {
      return delegate;
    }

    @Override
    public void handle(final RefedInterface1 arg0) {
    io.vertx.codegen.testmodel.RefedInterface1 arg_0 = io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_JAVA.convert(arg0);
    delegate.handle(arg_0);
    }
  }

}
