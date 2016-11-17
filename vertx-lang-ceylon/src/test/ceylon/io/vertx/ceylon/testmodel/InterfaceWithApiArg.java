package io.vertx.ceylon.testmodel;

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
@DocAnnotation$annotation$(description = "")
public class InterfaceWithApiArg extends GenericRefedInterface<RefedInterface1> implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.codegen.testmodel.InterfaceWithApiArg, InterfaceWithApiArg> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.codegen.testmodel.InterfaceWithApiArg, InterfaceWithApiArg>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.InterfaceWithApiArg, InterfaceWithApiArg> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.InterfaceWithApiArg, InterfaceWithApiArg>() {
        public InterfaceWithApiArg convert(io.vertx.codegen.testmodel.InterfaceWithApiArg src) {
          return new InterfaceWithApiArg(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<InterfaceWithApiArg, io.vertx.codegen.testmodel.InterfaceWithApiArg> TO_JAVA = new io.vertx.lang.ceylon.Converter<InterfaceWithApiArg, io.vertx.codegen.testmodel.InterfaceWithApiArg>() {
    public io.vertx.codegen.testmodel.InterfaceWithApiArg convert(InterfaceWithApiArg src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(InterfaceWithApiArg.class), io.vertx.codegen.testmodel.InterfaceWithApiArg.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.codegen.testmodel.InterfaceWithApiArg delegate;

  public InterfaceWithApiArg(io.vertx.codegen.testmodel.InterfaceWithApiArg delegate) {
    super(TypeDescriptor.klass(io.vertx.codegen.testmodel.RefedInterface1.class), delegate);
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

  @TypeInfo("io.vertx.ceylon.testmodel::GenericRefedInterface<io.vertx.ceylon.testmodel::RefedInterface1>")
  public GenericRefedInterface<RefedInterface1> setValue(
    final @TypeInfo("io.vertx.ceylon.testmodel::RefedInterface1") @Name("value") RefedInterface1 value) {
    io.vertx.codegen.testmodel.RefedInterface1 arg_0 = io.vertx.ceylon.testmodel.RefedInterface1.TO_JAVA.safeConvert(value);
    GenericRefedInterface<RefedInterface1> ret = io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter(RefedInterface1.$TypeDescriptor$).safeConvert(delegate.setValue(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::RefedInterface1")
  public RefedInterface1 $getValue() {
    RefedInterface1 ret = io.vertx.ceylon.testmodel.RefedInterface1.TO_CEYLON.converter().safeConvert(delegate.getValue());
    return ret;
  }

  @TypeInfo("ceylon.language::Anything")
  public void meth() {
    delegate.meth();
  }

}
