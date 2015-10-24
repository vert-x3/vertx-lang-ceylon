package io.vertx.ceylon.codegen.testmodel;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.metadata.Name;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.core.Handler;

@DocAnnotation$annotation$(description = "todo")
public class ConcreteHandlerUserType {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(ConcreteHandlerUserType.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.ConcreteHandlerUserType, ConcreteHandlerUserType> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.ConcreteHandlerUserType, ConcreteHandlerUserType>() {
    public ConcreteHandlerUserType convert(io.vertx.codegen.testmodel.ConcreteHandlerUserType src) {
      return new ConcreteHandlerUserType(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<ConcreteHandlerUserType, io.vertx.codegen.testmodel.ConcreteHandlerUserType> TO_JAVA = new io.vertx.lang.ceylon.Converter<ConcreteHandlerUserType, io.vertx.codegen.testmodel.ConcreteHandlerUserType>() {
    public io.vertx.codegen.testmodel.ConcreteHandlerUserType convert(ConcreteHandlerUserType src) {
      return src.delegate;
    }
  };

  @Ignore private final io.vertx.codegen.testmodel.ConcreteHandlerUserType delegate;

  public ConcreteHandlerUserType(io.vertx.codegen.testmodel.ConcreteHandlerUserType delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void handle(
    final @TypeInfo("io.vertx.ceylon.codegen.testmodel::RefedInterface1") @Name("arg0") @DocAnnotation$annotation$(description = "todo") RefedInterface1 arg0) {
    io.vertx.codegen.testmodel.RefedInterface1 arg_0 = io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_JAVA.safeConvert(arg0);
    delegate.handle(arg_0);
  }

}
