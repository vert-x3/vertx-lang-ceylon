package io.vertx.ceylon.auth.oauth2;

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
import java.util.Set;
import io.vertx.core.json.JsonObject;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Helper class for processing Keycloak principal.\n")
public class KeycloakHelper implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.oauth2.KeycloakHelper, KeycloakHelper> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.oauth2.KeycloakHelper, KeycloakHelper>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.oauth2.KeycloakHelper, KeycloakHelper> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.oauth2.KeycloakHelper, KeycloakHelper>() {
        public KeycloakHelper convert(io.vertx.ext.auth.oauth2.KeycloakHelper src) {
          return new KeycloakHelper(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<KeycloakHelper, io.vertx.ext.auth.oauth2.KeycloakHelper> TO_JAVA = new io.vertx.lang.ceylon.Converter<KeycloakHelper, io.vertx.ext.auth.oauth2.KeycloakHelper>() {
    public io.vertx.ext.auth.oauth2.KeycloakHelper convert(KeycloakHelper src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(KeycloakHelper.class), io.vertx.ext.auth.oauth2.KeycloakHelper.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.ext.auth.oauth2.KeycloakHelper delegate;

  public KeycloakHelper(io.vertx.ext.auth.oauth2.KeycloakHelper delegate) {
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
