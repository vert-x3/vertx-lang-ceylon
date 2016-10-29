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
@DocAnnotation$annotation$(description = "")
public interface SuperInterface2 {

  @Ignore
  io.vertx.lang.ceylon.ConverterFactory<io.vertx.codegen.testmodel.SuperInterface2, SuperInterface2> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.codegen.testmodel.SuperInterface2, SuperInterface2>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.SuperInterface2, SuperInterface2> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.SuperInterface2, SuperInterface2>() {
        public SuperInterface2 convert(io.vertx.codegen.testmodel.SuperInterface2 src) {
          return new SuperInterface2.Impl(src);
        }
      };
    }
  };

  @Ignore
  io.vertx.lang.ceylon.Converter<SuperInterface2, io.vertx.codegen.testmodel.SuperInterface2> TO_JAVA = new io.vertx.lang.ceylon.Converter<SuperInterface2, io.vertx.codegen.testmodel.SuperInterface2>() {
    public io.vertx.codegen.testmodel.SuperInterface2 convert(SuperInterface2 src) {
      return (io.vertx.codegen.testmodel.SuperInterface2)src.getDelegate();
    }
  };

  @Ignore
  TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(SuperInterface2.class);
  @Ignore
  Object getDelegate();

  @TypeInfo("ceylon.language::Anything")
  public void otherSuperMethodWithBasicParams(
    final @TypeInfo("ceylon.language::Byte") @Name("b") byte b, 
    final @TypeInfo("ceylon.language::Integer") @Name("s") long s, 
    final @TypeInfo("ceylon.language::Integer") @Name("i") long i, 
    final @TypeInfo("ceylon.language::Integer") @Name("l") long l, 
    final @TypeInfo("ceylon.language::Float") @Name("f") double f, 
    final @TypeInfo("ceylon.language::Float") @Name("d") double d, 
    final @TypeInfo("ceylon.language::Boolean") @Name("bool") boolean bool, 
    final @TypeInfo("ceylon.language::Character") @Name("ch") int ch, 
    final @TypeInfo("ceylon.language::String") @Name("str") ceylon.language.String str);

  @Ignore
  public class Impl implements SuperInterface2 {
    @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(SuperInterface2.class), io.vertx.codegen.testmodel.SuperInterface2.class, TO_JAVA, TO_CEYLON);
    @Ignore private final io.vertx.codegen.testmodel.SuperInterface2 delegate;

    public Impl(io.vertx.codegen.testmodel.SuperInterface2 delegate) {
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

  @TypeInfo("ceylon.language::Anything")
  public void otherSuperMethodWithBasicParams(
    final @TypeInfo("ceylon.language::Byte") @Name("b") byte b, 
    final @TypeInfo("ceylon.language::Integer") @Name("s") long s, 
    final @TypeInfo("ceylon.language::Integer") @Name("i") long i, 
    final @TypeInfo("ceylon.language::Integer") @Name("l") long l, 
    final @TypeInfo("ceylon.language::Float") @Name("f") double f, 
    final @TypeInfo("ceylon.language::Float") @Name("d") double d, 
    final @TypeInfo("ceylon.language::Boolean") @Name("bool") boolean bool, 
    final @TypeInfo("ceylon.language::Character") @Name("ch") int ch, 
    final @TypeInfo("ceylon.language::String") @Name("str") ceylon.language.String str) {
    byte arg_0 = b;
    short arg_1 = (short)s;
    int arg_2 = (int)i;
    long arg_3 = l;
    float arg_4 = (float)f;
    double arg_5 = d;
    boolean arg_6 = bool;
    char arg_7 = (char)ch;
    java.lang.String arg_8 = io.vertx.lang.ceylon.ToJava.String.safeConvert(str);
    delegate.otherSuperMethodWithBasicParams(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7, arg_8);
    }
  }

}
