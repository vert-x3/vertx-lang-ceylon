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
public class RefedInterface1 {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(RefedInterface1.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.RefedInterface1, RefedInterface1> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.RefedInterface1, RefedInterface1>() {
    public RefedInterface1 convert(io.vertx.codegen.testmodel.RefedInterface1 src) {
      return new RefedInterface1(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<RefedInterface1, io.vertx.codegen.testmodel.RefedInterface1> TO_JAVA = new io.vertx.lang.ceylon.Converter<RefedInterface1, io.vertx.codegen.testmodel.RefedInterface1>() {
    public io.vertx.codegen.testmodel.RefedInterface1 convert(RefedInterface1 src) {
      return src.delegate;
    }
  };

  @Ignore
  private final io.vertx.codegen.testmodel.RefedInterface1 delegate;

  public RefedInterface1(io.vertx.codegen.testmodel.RefedInterface1 delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String getString() {
    ceylon.language.String ret = new ceylon.language.String(delegate.getString());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.codegen.testmodel::RefedInterface1")
  public RefedInterface1 setString(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String str) {
    java.lang.String arg_0 = str.toString();
    RefedInterface1 ret = new io.vertx.ceylon.codegen.testmodel.RefedInterface1(delegate.setString(arg_0));
    return ret;
  }

}
