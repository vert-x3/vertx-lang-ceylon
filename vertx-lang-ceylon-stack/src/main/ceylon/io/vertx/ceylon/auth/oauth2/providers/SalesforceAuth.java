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
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Simplified factory to create an  for Salesforce.\n")
public class SalesforceAuth extends OpenIDConnectAuth implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.oauth2.providers.SalesforceAuth, SalesforceAuth> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.oauth2.providers.SalesforceAuth, SalesforceAuth>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.oauth2.providers.SalesforceAuth, SalesforceAuth> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.oauth2.providers.SalesforceAuth, SalesforceAuth>() {
        public SalesforceAuth convert(io.vertx.ext.auth.oauth2.providers.SalesforceAuth src) {
          return new SalesforceAuth(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<SalesforceAuth, io.vertx.ext.auth.oauth2.providers.SalesforceAuth> TO_JAVA = new io.vertx.lang.ceylon.Converter<SalesforceAuth, io.vertx.ext.auth.oauth2.providers.SalesforceAuth>() {
    public io.vertx.ext.auth.oauth2.providers.SalesforceAuth convert(SalesforceAuth src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(SalesforceAuth.class), io.vertx.ext.auth.oauth2.providers.SalesforceAuth.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.ext.auth.oauth2.providers.SalesforceAuth delegate;

  public SalesforceAuth(io.vertx.ext.auth.oauth2.providers.SalesforceAuth delegate) {
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
