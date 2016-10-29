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
public class InterfaceWithStringArg extends GenericRefedInterface<ceylon.language.String> implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.codegen.testmodel.InterfaceWithStringArg, InterfaceWithStringArg> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.codegen.testmodel.InterfaceWithStringArg, InterfaceWithStringArg>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.InterfaceWithStringArg, InterfaceWithStringArg> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.InterfaceWithStringArg, InterfaceWithStringArg>() {
        public InterfaceWithStringArg convert(io.vertx.codegen.testmodel.InterfaceWithStringArg src) {
          return new InterfaceWithStringArg(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<InterfaceWithStringArg, io.vertx.codegen.testmodel.InterfaceWithStringArg> TO_JAVA = new io.vertx.lang.ceylon.Converter<InterfaceWithStringArg, io.vertx.codegen.testmodel.InterfaceWithStringArg>() {
    public io.vertx.codegen.testmodel.InterfaceWithStringArg convert(InterfaceWithStringArg src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(InterfaceWithStringArg.class), io.vertx.codegen.testmodel.InterfaceWithStringArg.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.codegen.testmodel.InterfaceWithStringArg delegate;

  public InterfaceWithStringArg(io.vertx.codegen.testmodel.InterfaceWithStringArg delegate) {
    super(TypeDescriptor.klass(java.lang.String.class), delegate);
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

  @TypeInfo("ceylon.language::Anything")
  public void $setValue(
    final @TypeInfo("ceylon.language::String") @Name("value") ceylon.language.String value) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(value);
    delegate.setValue(arg_0);
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String $getValue() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.getValue());
    return ret;
  }

  @TypeInfo("ceylon.language::Anything")
  public void meth() {
    delegate.meth();
  }

}
