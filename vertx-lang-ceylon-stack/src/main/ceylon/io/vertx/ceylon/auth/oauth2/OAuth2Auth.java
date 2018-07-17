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
import io.vertx.ceylon.auth.common.User;
import io.vertx.ceylon.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import io.vertx.ext.auth.impl.AuthProviderInternal;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Factory interface for creating OAuth2 based `io.vertx.ext.auth.AuthProvider` instances.\n")
public class OAuth2Auth implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.oauth2.OAuth2Auth, OAuth2Auth> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.oauth2.OAuth2Auth, OAuth2Auth>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.oauth2.OAuth2Auth, OAuth2Auth> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.oauth2.OAuth2Auth, OAuth2Auth>() {
        public OAuth2Auth convert(io.vertx.ext.auth.oauth2.OAuth2Auth src) {
          return new OAuth2Auth(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<OAuth2Auth, io.vertx.ext.auth.oauth2.OAuth2Auth> TO_JAVA = new io.vertx.lang.ceylon.Converter<OAuth2Auth, io.vertx.ext.auth.oauth2.OAuth2Auth>() {
    public io.vertx.ext.auth.oauth2.OAuth2Auth convert(OAuth2Auth src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(OAuth2Auth.class), io.vertx.ext.auth.oauth2.OAuth2Auth.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.ext.auth.oauth2.OAuth2Auth delegate;

  public OAuth2Auth(io.vertx.ext.auth.oauth2.OAuth2Auth delegate) {
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

  @TypeInfo("ceylon.language::Anything")
  public void verifyIsUsingPassword() {
    delegate.verifyIsUsingPassword();
  }

  @DocAnnotation$annotation$(description = " Generate a redirect URL to the authN/Z backend. It only applies to auth_code flow.\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String authorizeURL(
    final @TypeInfo("ceylon.json::Object") @Name("params") ceylon.json.Object params) {
    io.vertx.core.json.JsonObject arg_0 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(params);
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.authorizeURL(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Returns the Access Token object.\n")
  @TypeInfo("ceylon.language::Anything")
  public void getToken(
    final @TypeInfo("ceylon.json::Object") @Name("params")@DocAnnotation$annotation$(description = "- JSON with the options, each flow requires different options.\n") ceylon.json.Object params, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.auth.oauth2::AccessToken)") @Name("handler")@DocAnnotation$annotation$(description = "- The handler returning the results.\n") Callable<?> handler) {
    io.vertx.core.json.JsonObject arg_0 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(params);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.auth.oauth2.AccessToken>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.ext.auth.oauth2.AccessToken>(handler) {
      public Object toCeylon(io.vertx.ext.auth.oauth2.AccessToken event) {
        return io.vertx.ceylon.auth.oauth2.AccessToken.TO_CEYLON.converter().safeConvert(event);
      }
    };
    delegate.getToken(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = " Decode a token to a [AccessToken](AccessToken.type.html) object. This is useful to handle bearer JWT tokens.\n")
  @TypeInfo("io.vertx.ceylon.auth.oauth2::OAuth2Auth")
  public OAuth2Auth decodeToken(
    final @TypeInfo("ceylon.language::String") @Name("token")@DocAnnotation$annotation$(description = "the access token (base64 string)\n") ceylon.language.String token, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.auth.oauth2::AccessToken)") @Name("handler")@DocAnnotation$annotation$(description = "A handler to receive the event\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(token);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.auth.oauth2.AccessToken>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.ext.auth.oauth2.AccessToken>(handler) {
      public Object toCeylon(io.vertx.ext.auth.oauth2.AccessToken event) {
        return io.vertx.ceylon.auth.oauth2.AccessToken.TO_CEYLON.converter().safeConvert(event);
      }
    };
    OAuth2Auth ret = io.vertx.ceylon.auth.oauth2.OAuth2Auth.TO_CEYLON.converter().safeConvert(delegate.decodeToken(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Query an OAuth 2.0 authorization server to determine the active state of an OAuth 2.0 token and to determine\n meta-information about this token.\n")
  @TypeInfo("io.vertx.ceylon.auth.oauth2::OAuth2Auth")
  public OAuth2Auth introspectToken(
    final @TypeInfo("ceylon.language::String") @Name("token")@DocAnnotation$annotation$(description = "the access token (base64 string)\n") ceylon.language.String token, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.auth.oauth2::AccessToken)") @Name("handler")@DocAnnotation$annotation$(description = "A handler to receive the event\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(token);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.auth.oauth2.AccessToken>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.ext.auth.oauth2.AccessToken>(handler) {
      public Object toCeylon(io.vertx.ext.auth.oauth2.AccessToken event) {
        return io.vertx.ceylon.auth.oauth2.AccessToken.TO_CEYLON.converter().safeConvert(event);
      }
    };
    OAuth2Auth ret = io.vertx.ceylon.auth.oauth2.OAuth2Auth.TO_CEYLON.converter().safeConvert(delegate.introspectToken(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Query an OAuth 2.0 authorization server to determine the active state of an OAuth 2.0 token and to determine\n meta-information about this token.\n")
  @TypeInfo("io.vertx.ceylon.auth.oauth2::OAuth2Auth")
  public OAuth2Auth introspectToken(
    final @TypeInfo("ceylon.language::String") @Name("token")@DocAnnotation$annotation$(description = "the access token (base64 string)\n") ceylon.language.String token, 
    final @TypeInfo("ceylon.language::String") @Name("tokenType")@DocAnnotation$annotation$(description = "hint to the token type e.g.: `access_token`\n") ceylon.language.String tokenType, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.auth.oauth2::AccessToken)") @Name("handler")@DocAnnotation$annotation$(description = "A handler to receive the event\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(token);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(tokenType);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.auth.oauth2.AccessToken>> arg_2 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.ext.auth.oauth2.AccessToken>(handler) {
      public Object toCeylon(io.vertx.ext.auth.oauth2.AccessToken event) {
        return io.vertx.ceylon.auth.oauth2.AccessToken.TO_CEYLON.converter().safeConvert(event);
      }
    };
    OAuth2Auth ret = io.vertx.ceylon.auth.oauth2.OAuth2Auth.TO_CEYLON.converter().safeConvert(delegate.introspectToken(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Returns the scope separator.\n\n The RFC 6749 states that a scope is expressed as a set of case-sensitive and space-delimited strings, however\n vendors tend not to agree on this and we see the following cases being used: space, plus sign, comma.\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String $getScopeSeparator() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.getScopeSeparator());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Returns the configured flow type for the Oauth2 provider.\n")
  @TypeInfo("io.vertx.ceylon.auth.oauth2::OAuth2FlowType")
  public io.vertx.ceylon.auth.oauth2.OAuth2FlowType $getFlowType() {
    io.vertx.ceylon.auth.oauth2.OAuth2FlowType ret = io.vertx.ceylon.auth.oauth2.oAuth2FlowType_.get_().getToCeylon().safeConvert(delegate.getFlowType());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Loads a JWK Set from the remote provider.\n\n When calling this method several times, the loaded JWKs are updated in the underlying JWT object.\n")
  @TypeInfo("io.vertx.ceylon.auth.oauth2::OAuth2Auth")
  public OAuth2Auth loadJWK(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("handler") Callable<?> handler) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_0 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(handler) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    OAuth2Auth ret = io.vertx.ceylon.auth.oauth2.OAuth2Auth.TO_CEYLON.converter().safeConvert(delegate.loadJWK(arg_0));
    return this;
  }

}
