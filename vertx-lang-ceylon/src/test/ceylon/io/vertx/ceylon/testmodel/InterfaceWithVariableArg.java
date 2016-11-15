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

@TypeParameters({
  @TypeParameter(value="T",variance=Variance.NONE),
  @TypeParameter(value="U",variance=Variance.NONE)
})
@Ceylon(major = 8)
@DocAnnotation$annotation$(description = "")
public class InterfaceWithVariableArg<T,U> extends GenericRefedInterface<U> implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.codegen.testmodel.InterfaceWithVariableArg, InterfaceWithVariableArg> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.codegen.testmodel.InterfaceWithVariableArg, InterfaceWithVariableArg>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.InterfaceWithVariableArg, InterfaceWithVariableArg> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.InterfaceWithVariableArg, InterfaceWithVariableArg>() {
        public InterfaceWithVariableArg convert(io.vertx.codegen.testmodel.InterfaceWithVariableArg src) {
          return new InterfaceWithVariableArg(descriptors[0], descriptors[1], src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<InterfaceWithVariableArg, io.vertx.codegen.testmodel.InterfaceWithVariableArg> TO_JAVA = new io.vertx.lang.ceylon.Converter<InterfaceWithVariableArg, io.vertx.codegen.testmodel.InterfaceWithVariableArg>() {
    public io.vertx.codegen.testmodel.InterfaceWithVariableArg convert(InterfaceWithVariableArg src) {
      return src.delegate;
    }
  };

  @Ignore private final TypeDescriptor $TypeDescriptor$;
  @Ignore private final TypeDescriptor $reified$T;
  @Ignore private final TypeDescriptor $reified$U;
  @Ignore private final io.vertx.codegen.testmodel.InterfaceWithVariableArg delegate;

  public InterfaceWithVariableArg(@Ignore TypeDescriptor $reified$T, @Ignore TypeDescriptor $reified$U, io.vertx.codegen.testmodel.InterfaceWithVariableArg delegate) {
    super(null /* Not implememented */, delegate);
    this.$TypeDescriptor$ = TypeDescriptor.klass(InterfaceWithVariableArg.class, $reified$T, $reified$U);
    this.$reified$T = $reified$T;
    this.$reified$U = $reified$U;
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

  @TypeInfo("io.vertx.ceylon.testmodel::GenericRefedInterface<U>")
  public GenericRefedInterface<U> setValue(
    final @TypeInfo("U") @Name("value") U value) {
    java.lang.Object arg_0 = (U)io.vertx.lang.ceylon.VertxTypeDescriptor.getToJava($reified$U).convert(value);
    GenericRefedInterface<U> ret = io.vertx.ceylon.testmodel.GenericRefedInterface.TO_CEYLON.converter($reified$U).safeConvert(delegate.setValue(arg_0));
    return this;
  }

  @TypeInfo("U")
  public U $getValue() {
    U ret = (U)io.vertx.lang.ceylon.VertxTypeDescriptor.getToCeylon($reified$U).convert(delegate.getValue());
    return ret;
  }

  @TypeInfo("ceylon.language::Anything")
  public void $setOtherValue(
    final @TypeInfo("T") @Name("value") T value) {
    java.lang.Object arg_0 = (T)io.vertx.lang.ceylon.VertxTypeDescriptor.getToJava($reified$T).convert(value);
    delegate.setOtherValue(arg_0);
  }

  @TypeInfo("T")
  public T $getOtherValue() {
    T ret = (T)io.vertx.lang.ceylon.VertxTypeDescriptor.getToCeylon($reified$T).convert(delegate.getOtherValue());
    return ret;
  }

}
