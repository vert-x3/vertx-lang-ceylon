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

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " @author <a href=\"mailto:julien@julienviet.com\">Julien Viet</a>\n")
public class MyInterface implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<com.acme.pkg.MyInterface, MyInterface> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<com.acme.pkg.MyInterface, MyInterface>() {
    public io.vertx.lang.ceylon.Converter<com.acme.pkg.MyInterface, MyInterface> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<com.acme.pkg.MyInterface, MyInterface>() {
        public MyInterface convert(com.acme.pkg.MyInterface src) {
          return new MyInterface(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<MyInterface, com.acme.pkg.MyInterface> TO_JAVA = new io.vertx.lang.ceylon.Converter<MyInterface, com.acme.pkg.MyInterface>() {
    public com.acme.pkg.MyInterface convert(MyInterface src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(MyInterface.class);
  @Ignore private final com.acme.pkg.MyInterface delegate;

  public MyInterface(com.acme.pkg.MyInterface delegate) {
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

  @TypeInfo("com.acme.ceylon.acme.sub::SubInterface")
  public SubInterface sub() {
    SubInterface ret = com.acme.ceylon.acme.sub.SubInterface.TO_CEYLON.converter().safeConvert(delegate.sub());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.testmodel::TestInterface")
  public TestInterface method() {
    TestInterface ret = io.vertx.ceylon.testmodel.TestInterface.TO_CEYLON.converter().safeConvert(delegate.method());
    return ret;
  }

}
