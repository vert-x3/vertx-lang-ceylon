package io.vertx.ceylon.core.shareddata;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;

@DocAnnotation$annotation$(description = "todo")
public class Lock {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(Lock.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.shareddata.Lock, Lock> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.shareddata.Lock, Lock>() {
    public Lock convert(io.vertx.core.shareddata.Lock src) {
      return new Lock(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<Lock, io.vertx.core.shareddata.Lock> TO_JAVA = new io.vertx.lang.ceylon.Converter<Lock, io.vertx.core.shareddata.Lock>() {
    public io.vertx.core.shareddata.Lock convert(Lock src) {
      return src.delegate;
    }
  };

  @Ignore private final io.vertx.core.shareddata.Lock delegate;

  public Lock(io.vertx.core.shareddata.Lock delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void release() {
    delegate.release();
  }

}
