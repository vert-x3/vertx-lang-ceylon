package com.acme.ceylon.pkg;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import com.acme.ceylon.pkg.sub.SubInterface;
import io.vertx.ceylon.codegen.testmodel.TestInterface;

@DocAnnotation$annotation$(description = "todo")
public class MyInterface {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(MyInterface.class);

  public static final io.vertx.lang.ceylon.Converter<com.acme.pkg.MyInterface, MyInterface> TO_CEYLON = new io.vertx.lang.ceylon.Converter<com.acme.pkg.MyInterface, MyInterface>() {
    public MyInterface convert(com.acme.pkg.MyInterface src) {
      return new MyInterface(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<MyInterface, com.acme.pkg.MyInterface> TO_JAVA = new io.vertx.lang.ceylon.Converter<MyInterface, com.acme.pkg.MyInterface>() {
    public com.acme.pkg.MyInterface convert(MyInterface src) {
      return src.delegate;
    }
  };

  @Ignore
  private final com.acme.pkg.MyInterface delegate;

  public MyInterface(com.acme.pkg.MyInterface delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("com.acme.ceylon.pkg::MyInterface")
  public static MyInterface create() {
    MyInterface ret = new com.acme.ceylon.pkg.MyInterface(com.acme.pkg.MyInterface.create());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("com.acme.ceylon.pkg.sub::SubInterface")
  public SubInterface sub() {
    SubInterface ret = new com.acme.ceylon.pkg.sub.SubInterface(delegate.sub());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.codegen.testmodel::TestInterface")
  public TestInterface method() {
    TestInterface ret = new io.vertx.ceylon.codegen.testmodel.TestInterface(delegate.method());
    return ret;
  }

}
