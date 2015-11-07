package io.vertx.ceylon.codegen.testmodel;

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
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = "todo")
public interface AbstractHandlerUserType {

  @Ignore
  io.vertx.lang.ceylon.ConverterFactory<io.vertx.codegen.testmodel.AbstractHandlerUserType, AbstractHandlerUserType> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.codegen.testmodel.AbstractHandlerUserType, AbstractHandlerUserType>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.AbstractHandlerUserType, AbstractHandlerUserType> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.AbstractHandlerUserType, AbstractHandlerUserType>() {
        public AbstractHandlerUserType convert(io.vertx.codegen.testmodel.AbstractHandlerUserType src) {
          return new AbstractHandlerUserType.Impl(src);
        }
      };
    }
  };

  @Ignore
  io.vertx.lang.ceylon.Converter<AbstractHandlerUserType, io.vertx.codegen.testmodel.AbstractHandlerUserType> TO_JAVA = new io.vertx.lang.ceylon.Converter<AbstractHandlerUserType, io.vertx.codegen.testmodel.AbstractHandlerUserType>() {
    public io.vertx.codegen.testmodel.AbstractHandlerUserType convert(AbstractHandlerUserType src) {
      return (io.vertx.codegen.testmodel.AbstractHandlerUserType)src.getDelegate();
    }
  };

  @Ignore
  TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(AbstractHandlerUserType.class);
  @Ignore
  Object getDelegate();

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void handle(
    final @TypeInfo("io.vertx.ceylon.codegen.testmodel::RefedInterface1") @Name("arg0") @DocAnnotation$annotation$(description = "todo") RefedInterface1 arg0);

  @Ignore
  public class Impl implements AbstractHandlerUserType {
    @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(AbstractHandlerUserType.class);
    @Ignore private final io.vertx.codegen.testmodel.AbstractHandlerUserType delegate;

    public Impl(io.vertx.codegen.testmodel.AbstractHandlerUserType delegate) {
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

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void handle(
    final @TypeInfo("io.vertx.ceylon.codegen.testmodel::RefedInterface1") @Name("arg0") @DocAnnotation$annotation$(description = "todo") RefedInterface1 arg0) {
    io.vertx.codegen.testmodel.RefedInterface1 arg_0 = io.vertx.ceylon.codegen.testmodel.RefedInterface1.TO_JAVA.safeConvert(arg0);
    delegate.handle(arg_0);
    }
  }

}
