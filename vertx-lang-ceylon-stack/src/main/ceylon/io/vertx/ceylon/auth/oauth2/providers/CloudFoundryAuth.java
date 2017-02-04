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
import io.vertx.ceylon.auth.oauth2.OAuth2Auth;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Simplified factory to create an  for CloudFoundry UAA.\n")
public class CloudFoundryAuth implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.oauth2.providers.CloudFoundryAuth, CloudFoundryAuth> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.oauth2.providers.CloudFoundryAuth, CloudFoundryAuth>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.oauth2.providers.CloudFoundryAuth, CloudFoundryAuth> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.oauth2.providers.CloudFoundryAuth, CloudFoundryAuth>() {
        public CloudFoundryAuth convert(io.vertx.ext.auth.oauth2.providers.CloudFoundryAuth src) {
          return new CloudFoundryAuth(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<CloudFoundryAuth, io.vertx.ext.auth.oauth2.providers.CloudFoundryAuth> TO_JAVA = new io.vertx.lang.ceylon.Converter<CloudFoundryAuth, io.vertx.ext.auth.oauth2.providers.CloudFoundryAuth>() {
    public io.vertx.ext.auth.oauth2.providers.CloudFoundryAuth convert(CloudFoundryAuth src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(CloudFoundryAuth.class), io.vertx.ext.auth.oauth2.providers.CloudFoundryAuth.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.ext.auth.oauth2.providers.CloudFoundryAuth delegate;

  public CloudFoundryAuth(io.vertx.ext.auth.oauth2.providers.CloudFoundryAuth delegate) {
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
