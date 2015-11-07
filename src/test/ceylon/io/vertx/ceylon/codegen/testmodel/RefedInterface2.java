package io.vertx.ceylon.codegen.testmodel;

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
public interface RefedInterface2 {

  io.vertx.lang.ceylon.ConverterFactory<io.vertx.codegen.testmodel.RefedInterface2, RefedInterface2> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.codegen.testmodel.RefedInterface2, RefedInterface2>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.RefedInterface2, RefedInterface2> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.RefedInterface2, RefedInterface2>() {
        public RefedInterface2 convert(io.vertx.codegen.testmodel.RefedInterface2 src) {
          return new RefedInterface2.Impl(src);
        }
      };
    }
  };

  io.vertx.lang.ceylon.Converter<RefedInterface2, io.vertx.codegen.testmodel.RefedInterface2> TO_JAVA = new io.vertx.lang.ceylon.Converter<RefedInterface2, io.vertx.codegen.testmodel.RefedInterface2>() {
    public io.vertx.codegen.testmodel.RefedInterface2 convert(RefedInterface2 src) {
      return (io.vertx.codegen.testmodel.RefedInterface2)src.getDelegate();
    }
  };

  @Ignore
  TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(RefedInterface2.class);
  @Ignore
  Object getDelegate();

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String getString();

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.codegen.testmodel::RefedInterface2")
  public RefedInterface2 setString(
    final @TypeInfo("ceylon.language::String") @Name("str") @DocAnnotation$annotation$(description = "todo") ceylon.language.String str);

  @Ignore
  public class Impl implements RefedInterface2 {
    @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(RefedInterface2.class);
    @Ignore private final io.vertx.codegen.testmodel.RefedInterface2 delegate;

    public Impl(io.vertx.codegen.testmodel.RefedInterface2 delegate) {
      this.delegate = delegate;
    }

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
  @TypeInfo("io.vertx.ceylon.codegen.testmodel::RefedInterface2")
  public RefedInterface2 setString(
    final @TypeInfo("ceylon.language::String") @Name("str") @DocAnnotation$annotation$(description = "todo") ceylon.language.String str) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(str);
    RefedInterface2 ret = io.vertx.ceylon.codegen.testmodel.RefedInterface2.TO_CEYLON.converter().safeConvert(delegate.setString(arg_0));
      return this;
    }
  }

}
