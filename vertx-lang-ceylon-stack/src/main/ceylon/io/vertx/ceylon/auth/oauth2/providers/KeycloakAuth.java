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
import io.vertx.core.json.JsonObject;
import io.vertx.ceylon.auth.oauth2.OAuth2Auth;
import io.vertx.ceylon.auth.oauth2.OAuth2FlowType;
import io.vertx.ceylon.auth.oauth2.OAuth2FlowType;
import io.vertx.ceylon.auth.oauth2.OAuth2FlowType;
import io.vertx.ceylon.auth.oauth2.OAuth2FlowType;
import io.vertx.ceylon.auth.oauth2.OAuth2FlowType;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Simplified factory to create an  for Keycloak.\n")
public class KeycloakAuth extends OpenIDConnectAuth implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.oauth2.providers.KeycloakAuth, KeycloakAuth> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.oauth2.providers.KeycloakAuth, KeycloakAuth>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.oauth2.providers.KeycloakAuth, KeycloakAuth> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.oauth2.providers.KeycloakAuth, KeycloakAuth>() {
        public KeycloakAuth convert(io.vertx.ext.auth.oauth2.providers.KeycloakAuth src) {
          return new KeycloakAuth(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<KeycloakAuth, io.vertx.ext.auth.oauth2.providers.KeycloakAuth> TO_JAVA = new io.vertx.lang.ceylon.Converter<KeycloakAuth, io.vertx.ext.auth.oauth2.providers.KeycloakAuth>() {
    public io.vertx.ext.auth.oauth2.providers.KeycloakAuth convert(KeycloakAuth src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(KeycloakAuth.class), io.vertx.ext.auth.oauth2.providers.KeycloakAuth.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.ext.auth.oauth2.providers.KeycloakAuth delegate;

  public KeycloakAuth(io.vertx.ext.auth.oauth2.providers.KeycloakAuth delegate) {
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
