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
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.ext.auth.oauth2.OAuth2FlowType;
import io.vertx.ceylon.auth.common.AuthProvider;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Factory interface for creating OAuth2 based `io.vertx.ext.auth.AuthProvider` instances.\n")
public class OAuth2Auth extends AuthProvider implements ReifiedType {

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

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(OAuth2Auth.class);
  @Ignore private final io.vertx.ext.auth.oauth2.OAuth2Auth delegate;

  public OAuth2Auth(io.vertx.ext.auth.oauth2.OAuth2Auth delegate) {
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

  @DocAnnotation$annotation$(description = " Generate a redirect URL to the authN/Z backend. It only applies to auth_code flow.\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String authorizeURL(
    final @TypeInfo("ceylon.json::Object") @Name("params")  ceylon.json.Object params) {
    io.vertx.core.json.JsonObject arg_0 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(params);
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.authorizeURL(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Returns the Access Token object.\n")
  @TypeInfo("ceylon.language::Anything")
  public void getToken(
    final @TypeInfo("ceylon.json::Object") @Name("params") @DocAnnotation$annotation$(description = "- JSON with the options, each flow requires different options.\n") ceylon.json.Object params, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.auth.oauth2::AccessToken)") @Name("handler") @DocAnnotation$annotation$(description = "- The handler returning the results.\n") Callable<?> handler) {
    io.vertx.core.json.JsonObject arg_0 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(params);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.auth.oauth2.AccessToken>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.ext.auth.oauth2.AccessToken>(handler) {
      public Object toCeylon(io.vertx.ext.auth.oauth2.AccessToken event) {
        return io.vertx.ceylon.auth.oauth2.AccessToken.TO_CEYLON.converter().safeConvert(event);
      }
    };
    delegate.getToken(arg_0, arg_1);
  }

  @DocAnnotation$annotation$(description = " Call OAuth2 APIs.\n")
  @TypeInfo("io.vertx.ceylon.auth.oauth2::OAuth2Auth")
  public OAuth2Auth api(
    final @TypeInfo("io.vertx.ceylon.core.http::HttpMethod") @Name("method") @DocAnnotation$annotation$(description = "HttpMethod\n") io.vertx.ceylon.core.http.HttpMethod method, 
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "target path\n") ceylon.language.String path, 
    final @TypeInfo("ceylon.json::Object") @Name("params") @DocAnnotation$annotation$(description = "parameters\n") ceylon.json.Object params, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.json::Object)") @Name("handler") @DocAnnotation$annotation$(description = "handler\n") Callable<?> handler) {
    io.vertx.core.http.HttpMethod arg_0 = io.vertx.ceylon.core.http.httpMethod_.get_().getToJava().safeConvert(method);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    io.vertx.core.json.JsonObject arg_2 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(params);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.json.JsonObject>> arg_3 = handler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.core.json.JsonObject>(handler) {
      public Object toCeylon(io.vertx.core.json.JsonObject event) {
        return io.vertx.lang.ceylon.ToCeylon.JsonObject.safeConvert(event);
      }
    };
    OAuth2Auth ret = io.vertx.ceylon.auth.oauth2.OAuth2Auth.TO_CEYLON.converter().safeConvert(delegate.api(arg_0, arg_1, arg_2, arg_3));
    return this;
  }

  @DocAnnotation$annotation$(description = " Returns true if this provider supports JWT tokens as the access_token. This is typically true if the provider\n implements the `openid-connect` protocol. This is a plain return from the config option jwtToken, which is false\n by default.\n\n This information is important to validate grants. Since pure OAuth2 should be used for authorization and when a\n token is requested all grants should be declared, in case of openid-connect this is not true. OpenId will issue\n a token and all grants will be encoded on the token itself so the requester does not need to list the required\n grants.\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean hasJWTToken() {
    boolean ret = delegate.hasJWTToken();
    return ret;
  }

}
