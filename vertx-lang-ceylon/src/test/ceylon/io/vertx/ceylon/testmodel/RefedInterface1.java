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
@DocAnnotation$annotation$(description = "todo")
public class RefedInterface1 implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.codegen.testmodel.RefedInterface1, RefedInterface1> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.codegen.testmodel.RefedInterface1, RefedInterface1>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.RefedInterface1, RefedInterface1> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.RefedInterface1, RefedInterface1>() {
        public RefedInterface1 convert(io.vertx.codegen.testmodel.RefedInterface1 src) {
          return new RefedInterface1(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<RefedInterface1, io.vertx.codegen.testmodel.RefedInterface1> TO_JAVA = new io.vertx.lang.ceylon.Converter<RefedInterface1, io.vertx.codegen.testmodel.RefedInterface1>() {
    public io.vertx.codegen.testmodel.RefedInterface1 convert(RefedInterface1 src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(RefedInterface1.class);
  @Ignore private final io.vertx.codegen.testmodel.RefedInterface1 delegate;

  public RefedInterface1(io.vertx.codegen.testmodel.RefedInterface1 delegate) {
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
  public ceylon.language.String getString() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.getString());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.testmodel::RefedInterface1")
  public RefedInterface1 setString(
    final @TypeInfo("ceylon.language::String") @Name("str") @DocAnnotation$annotation$(description = "todo") ceylon.language.String str) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(str);
    RefedInterface1 ret = io.vertx.ceylon.testmodel.RefedInterface1.TO_CEYLON.converter().safeConvert(delegate.setString(arg_0));
    return this;
  }

}
