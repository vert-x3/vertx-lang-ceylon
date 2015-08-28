package com.acme.ceylon.pkg.sub;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;

@DocAnnotation$annotation$(description = "todo")
public class SubInterface {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(SubInterface.class);

  public static final io.vertx.lang.ceylon.Converter<com.acme.pkg.sub.SubInterface, SubInterface> TO_CEYLON = new io.vertx.lang.ceylon.Converter<com.acme.pkg.sub.SubInterface, SubInterface>() {
    public SubInterface convert(com.acme.pkg.sub.SubInterface src) {
      return new SubInterface(src);
    }
  };

  @Ignore
  private final com.acme.pkg.sub.SubInterface delegate;

  public SubInterface(com.acme.pkg.sub.SubInterface delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String reverse(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String s) {
    java.lang.String arg_0 = s.toString();
    ceylon.language.String ret = new ceylon.language.String(delegate.reverse(arg_0));
    return ret;
  }

}
