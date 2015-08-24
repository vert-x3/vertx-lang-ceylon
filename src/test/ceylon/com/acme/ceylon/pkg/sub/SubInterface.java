package com.acme.ceylon.pkg.sub;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;

public class SubInterface {

  private final com.acme.pkg.sub.SubInterface delegate;

  public SubInterface(com.acme.pkg.sub.SubInterface delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String reverse(
    final @TypeInfo("ceylon.language::String") ceylon.language.String s) {
    java.lang.String arg_0 = s.toString();
    ceylon.language.String ret = new ceylon.language.String(delegate.reverse(arg_0));
    return ret;
  }

}
