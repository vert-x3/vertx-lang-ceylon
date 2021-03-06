package io.vertx.ceylon.web.sstore;

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
import io.vertx.ceylon.web.Session;
import io.vertx.ceylon.core.Vertx;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " A session store which stores sessions in a distributed map so they are available across the cluster.\n")
public class ClusteredSessionStore extends SessionStore implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.sstore.ClusteredSessionStore, ClusteredSessionStore> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.sstore.ClusteredSessionStore, ClusteredSessionStore>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.web.sstore.ClusteredSessionStore, ClusteredSessionStore> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.web.sstore.ClusteredSessionStore, ClusteredSessionStore>() {
        public ClusteredSessionStore convert(io.vertx.ext.web.sstore.ClusteredSessionStore src) {
          return new ClusteredSessionStore(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<ClusteredSessionStore, io.vertx.ext.web.sstore.ClusteredSessionStore> TO_JAVA = new io.vertx.lang.ceylon.Converter<ClusteredSessionStore, io.vertx.ext.web.sstore.ClusteredSessionStore>() {
    public io.vertx.ext.web.sstore.ClusteredSessionStore convert(ClusteredSessionStore src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(ClusteredSessionStore.class), io.vertx.ext.web.sstore.ClusteredSessionStore.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.ext.web.sstore.ClusteredSessionStore delegate;

  public ClusteredSessionStore(io.vertx.ext.web.sstore.ClusteredSessionStore delegate) {
    super(delegate);
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

}
