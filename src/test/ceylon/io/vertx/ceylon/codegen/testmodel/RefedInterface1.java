package io.vertx.ceylon.codegen.testmodel;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;

@DocAnnotation$annotation$(description = "todo")
public class RefedInterface1 {

  private final io.vertx.codegen.testmodel.RefedInterface1 delegate;

  public RefedInterface1(io.vertx.codegen.testmodel.RefedInterface1 delegate) {
    this.delegate = delegate;
  }

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
