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
public interface SuperInterface2 {

  TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(SuperInterface2.class);

  io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.SuperInterface2, SuperInterface2> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.SuperInterface2, SuperInterface2>() {
    public SuperInterface2 convert(io.vertx.codegen.testmodel.SuperInterface2 src) {
      return new SuperInterface2.Impl(src);
    }
  };

  @Ignore
  Object getDelegate();

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  void otherSuperMethodWithBasicParams(
    final @TypeInfo("ceylon.language::Byte") @DocAnnotation$annotation$(description = "todo") byte b, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long s, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long i, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long l, 
    final @TypeInfo("ceylon.language::Float") @DocAnnotation$annotation$(description = "todo") double f, 
    final @TypeInfo("ceylon.language::Float") @DocAnnotation$annotation$(description = "todo") double d, 
    final @TypeInfo("ceylon.language::Boolean") @DocAnnotation$annotation$(description = "todo") boolean bool, 
    final @TypeInfo("ceylon.language::Character") @DocAnnotation$annotation$(description = "todo") int ch, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String str);

  @Ignore
  public class Impl implements SuperInterface2 {
    @Ignore
    private final io.vertx.codegen.testmodel.SuperInterface2 delegate;

    public Impl(io.vertx.codegen.testmodel.SuperInterface2 delegate) {
      this.delegate = delegate;
    }

    @Ignore
    public Object getDelegate() {
      return delegate;
    }

    @Override
    public void otherSuperMethodWithBasicParams(final byte b, final long s, final long i, final long l, final double f, final double d, final boolean bool, final int ch, final ceylon.language.String str) {
      byte arg_0 = b;
      short arg_1 = (short)s;
      int arg_2 = (int)i;
      long arg_3 = l;
      float arg_4 = (float)f;
      double arg_5 = d;
      boolean arg_6 = bool;
      char arg_7 = (char)ch;
      java.lang.String arg_8 = str.toString();
      delegate.otherSuperMethodWithBasicParams(arg_0, arg_1, arg_2, arg_3, arg_4, arg_5, arg_6, arg_7, arg_8);
    }
  }

}
