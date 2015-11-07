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

@Ceylon(major = 8)@DocAnnotation$annotation$(description = "todo")
public class SuperInterface1 implements ReifiedType {

  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.codegen.testmodel.SuperInterface1, SuperInterface1> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.codegen.testmodel.SuperInterface1, SuperInterface1>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.SuperInterface1, SuperInterface1> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.SuperInterface1, SuperInterface1>() {
        public SuperInterface1 convert(io.vertx.codegen.testmodel.SuperInterface1 src) {
          return new SuperInterface1(src);
        }
      };
    }
  };

  public static final io.vertx.lang.ceylon.Converter<SuperInterface1, io.vertx.codegen.testmodel.SuperInterface1> TO_JAVA = new io.vertx.lang.ceylon.Converter<SuperInterface1, io.vertx.codegen.testmodel.SuperInterface1>() {
    public io.vertx.codegen.testmodel.SuperInterface1 convert(SuperInterface1 src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(SuperInterface1.class);
  @Ignore private final io.vertx.codegen.testmodel.SuperInterface1 delegate;

  public SuperInterface1(io.vertx.codegen.testmodel.SuperInterface1 delegate) {
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
  @TypeInfo("ceylon.language::Anything")
  public void superMethodWithBasicParams(
    final @TypeInfo("ceylon.language::Byte") @Name("b") @DocAnnotation$annotation$(description = "todo") byte b, 
    final @TypeInfo("ceylon.language::Integer") @Name("s") @DocAnnotation$annotation$(description = "todo") long s, 
    final @TypeInfo("ceylon.language::Integer") @Name("i") @DocAnnotation$annotation$(description = "todo") long i, 
    final @TypeInfo("ceylon.language::Integer") @Name("l") @DocAnnotation$annotation$(description = "todo") long l, 
    final @TypeInfo("ceylon.language::Float") @Name("f") @DocAnnotation$annotation$(description = "todo") double f, 
    final @TypeInfo("ceylon.language::Float") @Name("d") @DocAnnotation$annotation$(description = "todo") double d, 
    final @TypeInfo("ceylon.language::Boolean") @Name("bool") @DocAnnotation$annotation$(description = "todo") boolean bool, 
    final @TypeInfo("ceylon.language::Character") @Name("ch") @DocAnnotation$annotation$(description = "todo") int ch, 
    final @TypeInfo("ceylon.language::String") @Name("str") @DocAnnotation$annotation$(description = "todo") ceylon.language.String str) {
    byte arg_0 = b;
    short arg_1 = (short)s;
    int arg_2 = (int)i;
    long arg_3 = l;
    float arg_4 = (float)f;
    double arg_5 = d;
    boolean arg_6 = bool;
    char arg_7 = (char)ch;
    java.lang.String arg_8 = io.vertx.lang.ceylon.ToJava.String.safeConvert(str);
    delegate.superMethodWithBasicParams(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7, arg_8);
  }

}
