package io.vertx.ceylon.auth.oauth2.providers;

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
import io.vertx.ceylon.core.Vertx;
import io.vertx.core.AsyncResult;
import io.vertx.ceylon.auth.oauth2.OAuth2Auth;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Simplified factory to create an [OAuth2Auth](OAuth2Auth.type.html) for OpenID Connect.\n")
public class OpenIDConnectAuth implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.oauth2.providers.OpenIDConnectAuth, OpenIDConnectAuth> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.oauth2.providers.OpenIDConnectAuth, OpenIDConnectAuth>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.oauth2.providers.OpenIDConnectAuth, OpenIDConnectAuth> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.oauth2.providers.OpenIDConnectAuth, OpenIDConnectAuth>() {
        public OpenIDConnectAuth convert(io.vertx.ext.auth.oauth2.providers.OpenIDConnectAuth src) {
          return new OpenIDConnectAuth(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<OpenIDConnectAuth, io.vertx.ext.auth.oauth2.providers.OpenIDConnectAuth> TO_JAVA = new io.vertx.lang.ceylon.Converter<OpenIDConnectAuth, io.vertx.ext.auth.oauth2.providers.OpenIDConnectAuth>() {
    public io.vertx.ext.auth.oauth2.providers.OpenIDConnectAuth convert(OpenIDConnectAuth src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(OpenIDConnectAuth.class), io.vertx.ext.auth.oauth2.providers.OpenIDConnectAuth.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.ext.auth.oauth2.providers.OpenIDConnectAuth delegate;

  public OpenIDConnectAuth(io.vertx.ext.auth.oauth2.providers.OpenIDConnectAuth delegate) {
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
