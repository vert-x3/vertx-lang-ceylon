package com.acme.ceylon.pkg.sub;

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
@DocAnnotation$annotation$(description = "todo")
public class SubInterface implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<com.acme.pkg.sub.SubInterface, SubInterface> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<com.acme.pkg.sub.SubInterface, SubInterface>() {
    public io.vertx.lang.ceylon.Converter<com.acme.pkg.sub.SubInterface, SubInterface> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<com.acme.pkg.sub.SubInterface, SubInterface>() {
        public SubInterface convert(com.acme.pkg.sub.SubInterface src) {
          return new SubInterface(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<SubInterface, com.acme.pkg.sub.SubInterface> TO_JAVA = new io.vertx.lang.ceylon.Converter<SubInterface, com.acme.pkg.sub.SubInterface>() {
    public com.acme.pkg.sub.SubInterface convert(SubInterface src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(SubInterface.class);
  @Ignore private final com.acme.pkg.sub.SubInterface delegate;

  public SubInterface(com.acme.pkg.sub.SubInterface delegate) {
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
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String reverse(
    final @TypeInfo("ceylon.language::String") @Name("s") @DocAnnotation$annotation$(description = "todo") ceylon.language.String s) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(s);
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.reverse(arg_0));
    return ret;
  }

}
