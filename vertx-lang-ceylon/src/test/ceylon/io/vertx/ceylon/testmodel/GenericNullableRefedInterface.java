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
  @TypeParameter(value="T",variance=Variance.NONE)
})
@Ceylon(major = 8)
@DocAnnotation$annotation$(description = "")
public class GenericNullableRefedInterface<T> implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.codegen.testmodel.GenericNullableRefedInterface, GenericNullableRefedInterface> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.codegen.testmodel.GenericNullableRefedInterface, GenericNullableRefedInterface>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.GenericNullableRefedInterface, GenericNullableRefedInterface> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.GenericNullableRefedInterface, GenericNullableRefedInterface>() {
        public GenericNullableRefedInterface convert(io.vertx.codegen.testmodel.GenericNullableRefedInterface src) {
          return new GenericNullableRefedInterface(descriptors[0], src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<GenericNullableRefedInterface, io.vertx.codegen.testmodel.GenericNullableRefedInterface> TO_JAVA = new io.vertx.lang.ceylon.Converter<GenericNullableRefedInterface, io.vertx.codegen.testmodel.GenericNullableRefedInterface>() {
    public io.vertx.codegen.testmodel.GenericNullableRefedInterface convert(GenericNullableRefedInterface src) {
      return src.delegate;
    }
  };

  @Ignore private final TypeDescriptor $TypeDescriptor$;
  @Ignore private final TypeDescriptor $reified$T;
  @Ignore private final io.vertx.codegen.testmodel.GenericNullableRefedInterface delegate;

  public GenericNullableRefedInterface(@Ignore TypeDescriptor $reified$T, io.vertx.codegen.testmodel.GenericNullableRefedInterface delegate) {
    this.$TypeDescriptor$ = TypeDescriptor.klass(GenericNullableRefedInterface.class, $reified$T);
    this.$reified$T = $reified$T;
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

  @TypeInfo("T")
  public T $getValue() {
    T ret = (T)io.vertx.lang.ceylon.VertxTypeDescriptor.getToCeylon($reified$T).convert(delegate.getValue());
    return ret;
  }

}
