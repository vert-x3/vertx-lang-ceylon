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

@DocAnnotation$annotation$(description = "todo")
public class GenericRefedInterface {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(GenericRefedInterface.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.GenericRefedInterface, GenericRefedInterface> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.GenericRefedInterface, GenericRefedInterface>() {
    public GenericRefedInterface convert(io.vertx.codegen.testmodel.GenericRefedInterface src) {
      return new GenericRefedInterface(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<GenericRefedInterface, io.vertx.codegen.testmodel.GenericRefedInterface> TO_JAVA = new io.vertx.lang.ceylon.Converter<GenericRefedInterface, io.vertx.codegen.testmodel.GenericRefedInterface>() {
    public io.vertx.codegen.testmodel.GenericRefedInterface convert(GenericRefedInterface src) {
      return src.delegate;
    }
  };

  @Ignore private final io.vertx.codegen.testmodel.GenericRefedInterface delegate;

  public GenericRefedInterface(io.vertx.codegen.testmodel.GenericRefedInterface delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void setValue(
    final @TypeInfo("ceylon.language::Object?") @Name("value") @DocAnnotation$annotation$(description = "todo") Object value) {
    java.lang.Object arg_0 = io.vertx.lang.ceylon.ToJava.object(value);
    delegate.setValue(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Object?")
  public Object getValue() {
    Object ret = io.vertx.lang.ceylon.ToCeylon.object(delegate.getValue());
    return ret;
  }

}
