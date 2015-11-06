package io.vertx.ceylon.codegen.testmodel;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.metadata.Name;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.core.Handler;

@DocAnnotation$annotation$(description = "todo")
public class Factory {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(Factory.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.Factory, Factory> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.codegen.testmodel.Factory, Factory>() {
    public Factory convert(io.vertx.codegen.testmodel.Factory src) {
      return new Factory(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<Factory, io.vertx.codegen.testmodel.Factory> TO_JAVA = new io.vertx.lang.ceylon.Converter<Factory, io.vertx.codegen.testmodel.Factory>() {
    public io.vertx.codegen.testmodel.Factory convert(Factory src) {
      return src.delegate;
    }
  };

  @Ignore private final io.vertx.codegen.testmodel.Factory delegate;

  public Factory(io.vertx.codegen.testmodel.Factory delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

}
