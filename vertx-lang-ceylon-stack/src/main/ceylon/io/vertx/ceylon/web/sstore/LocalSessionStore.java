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
@DocAnnotation$annotation$(description = " A session store which is only available on a single node.\n <p>\n Can be used when sticky sessions are being used.\n")
public class LocalSessionStore extends SessionStore implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.sstore.LocalSessionStore, LocalSessionStore> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.sstore.LocalSessionStore, LocalSessionStore>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.web.sstore.LocalSessionStore, LocalSessionStore> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.web.sstore.LocalSessionStore, LocalSessionStore>() {
        public LocalSessionStore convert(io.vertx.ext.web.sstore.LocalSessionStore src) {
          return new LocalSessionStore(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<LocalSessionStore, io.vertx.ext.web.sstore.LocalSessionStore> TO_JAVA = new io.vertx.lang.ceylon.Converter<LocalSessionStore, io.vertx.ext.web.sstore.LocalSessionStore>() {
    public io.vertx.ext.web.sstore.LocalSessionStore convert(LocalSessionStore src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(LocalSessionStore.class), io.vertx.ext.web.sstore.LocalSessionStore.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.ext.web.sstore.LocalSessionStore delegate;

  public LocalSessionStore(io.vertx.ext.web.sstore.LocalSessionStore delegate) {
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
