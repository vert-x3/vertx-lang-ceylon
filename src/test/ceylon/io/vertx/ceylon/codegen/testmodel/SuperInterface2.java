package io.vertx.ceylon.codegen.testmodel;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;

public interface SuperInterface2 {

  Object getDelegate();

  @TypeInfo("ceylon.language::Anything")
  void otherSuperMethodWithBasicParams(
    final @TypeInfo("ceylon.language::Byte") byte b, 
    final @TypeInfo("ceylon.language::Integer") long s, 
    final @TypeInfo("ceylon.language::Integer") long i, 
    final @TypeInfo("ceylon.language::Integer") long l, 
    final @TypeInfo("ceylon.language::Float") double f, 
    final @TypeInfo("ceylon.language::Float") double d, 
    final @TypeInfo("ceylon.language::Boolean") boolean bool, 
    final @TypeInfo("ceylon.language::Character") int ch, 
    final @TypeInfo("ceylon.language::String") ceylon.language.String str);

  public class Impl implements SuperInterface2 {
    private final io.vertx.codegen.testmodel.SuperInterface2 delegate;

    public Impl(io.vertx.codegen.testmodel.SuperInterface2 delegate) {
      this.delegate = delegate;
    }

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
