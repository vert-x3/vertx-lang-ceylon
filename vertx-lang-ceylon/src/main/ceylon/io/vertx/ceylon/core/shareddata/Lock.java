package io.vertx.ceylon.core.shareddata;

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
@DocAnnotation$annotation$(description = " An asynchronous exclusive lock which can be obtained from any node in the cluster.\n <p>\n When the lock is obtained, no-one else in the cluster can obtain the lock with the same name until the lock\n is released.\n")
public class Lock implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.shareddata.Lock, Lock> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.shareddata.Lock, Lock>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.shareddata.Lock, Lock> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.shareddata.Lock, Lock>() {
        public Lock convert(io.vertx.core.shareddata.Lock src) {
          return new Lock(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<Lock, io.vertx.core.shareddata.Lock> TO_JAVA = new io.vertx.lang.ceylon.Converter<Lock, io.vertx.core.shareddata.Lock>() {
    public io.vertx.core.shareddata.Lock convert(Lock src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(Lock.class), io.vertx.core.shareddata.Lock.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.core.shareddata.Lock delegate;

  public Lock(io.vertx.core.shareddata.Lock delegate) {
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

  @DocAnnotation$annotation$(description = " Release the lock. Once the lock is released another will be able to obtain the lock.\n")
  @TypeInfo("ceylon.language::Anything")
  public void release() {
    delegate.release();
  }

}
