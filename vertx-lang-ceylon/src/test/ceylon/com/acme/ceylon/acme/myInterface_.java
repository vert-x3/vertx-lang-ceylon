package com.acme.ceylon.acme;

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
import com.acme.ceylon.acme.sub.SubInterface;
import io.vertx.ceylon.testmodel.TestInterface;

@Name("myInterface")
@com.redhat.ceylon.compiler.java.metadata.Object
public class myInterface_ {

  private static final myInterface_ instance = new myInterface_();

  @Ignore
  @TypeInfo("com.acme.ceylon.acme::myInterface")
  public static myInterface_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("com.acme.ceylon.acme::MyInterface")
  public static MyInterface create() {
    MyInterface ret = com.acme.ceylon.acme.MyInterface.TO_CEYLON.converter().safeConvert(com.acme.pkg.MyInterface.create());
    return ret;
  }

}
