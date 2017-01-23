package io.vertx.ceylon.auth.htdigest;

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
import io.vertx.ceylon.auth.common.User;
import io.vertx.ceylon.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.ceylon.auth.common.AuthProvider;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " An extension of AuthProvider which is using .htdigest file as store\n")
public class HtdigestAuth extends AuthProvider implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.htdigest.HtdigestAuth, HtdigestAuth> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.htdigest.HtdigestAuth, HtdigestAuth>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.htdigest.HtdigestAuth, HtdigestAuth> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.htdigest.HtdigestAuth, HtdigestAuth>() {
        public HtdigestAuth convert(io.vertx.ext.auth.htdigest.HtdigestAuth src) {
          return new HtdigestAuth(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<HtdigestAuth, io.vertx.ext.auth.htdigest.HtdigestAuth> TO_JAVA = new io.vertx.lang.ceylon.Converter<HtdigestAuth, io.vertx.ext.auth.htdigest.HtdigestAuth>() {
    public io.vertx.ext.auth.htdigest.HtdigestAuth convert(HtdigestAuth src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(HtdigestAuth.class), io.vertx.ext.auth.htdigest.HtdigestAuth.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.ext.auth.htdigest.HtdigestAuth delegate;

  public HtdigestAuth(io.vertx.ext.auth.htdigest.HtdigestAuth delegate) {
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

  @DocAnnotation$annotation$(description = " Return the currently used realm\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String realm() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.realm());
    return ret;
  }

}
