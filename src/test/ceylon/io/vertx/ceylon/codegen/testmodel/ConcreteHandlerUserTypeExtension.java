package io.vertx.ceylon.codegen.testmodel;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;

@DocAnnotation$annotation$(description = "todo")
public class ConcreteHandlerUserTypeExtension {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(ConcreteHandlerUserTypeExtension.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.ConcreteHandlerUserTypeExtension, ConcreteHandlerUserTypeExtension> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.ConcreteHandlerUserTypeExtension, ConcreteHandlerUserTypeExtension>() {
    public ConcreteHandlerUserTypeExtension convert(io.vertx.codegen.testmodel.ConcreteHandlerUserTypeExtension src) {
      return new ConcreteHandlerUserTypeExtension(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<ConcreteHandlerUserTypeExtension, io.vertx.codegen.testmodel.ConcreteHandlerUserTypeExtension> TO_JAVA = new io.vertx.lang.ceylon.Converter<ConcreteHandlerUserTypeExtension, io.vertx.codegen.testmodel.ConcreteHandlerUserTypeExtension>() {
    public io.vertx.codegen.testmodel.ConcreteHandlerUserTypeExtension convert(ConcreteHandlerUserTypeExtension src) {
      return src.delegate;
    }
  };

  @Ignore
  private final io.vertx.codegen.testmodel.ConcreteHandlerUserTypeExtension delegate;

  public ConcreteHandlerUserTypeExtension(io.vertx.codegen.testmodel.ConcreteHandlerUserTypeExtension delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void handle(
    final @TypeInfo("io.vertx.ceylon.codegen.testmodel::RefedInterface1") @DocAnnotation$annotation$(description = "todo") RefedInterface1 arg0) {
    io.vertx.codegen.testmodel.RefedInterface1 arg_0 = (io.vertx.codegen.testmodel.RefedInterface1)arg0.getDelegate();
    delegate.handle(arg_0);
  }

}
