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
import io.vertx.ceylon.core.buffer.Buffer;
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
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.ceylon.auth.common.AuthProvider;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " AccessToken extension to the User interface\n")
public class AccessToken extends User implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.oauth2.AccessToken, AccessToken> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.oauth2.AccessToken, AccessToken>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.oauth2.AccessToken, AccessToken> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.oauth2.AccessToken, AccessToken>() {
        public AccessToken convert(io.vertx.ext.auth.oauth2.AccessToken src) {
          return new AccessToken(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<AccessToken, io.vertx.ext.auth.oauth2.AccessToken> TO_JAVA = new io.vertx.lang.ceylon.Converter<AccessToken, io.vertx.ext.auth.oauth2.AccessToken>() {
    public io.vertx.ext.auth.oauth2.AccessToken convert(AccessToken src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(AccessToken.class), io.vertx.ext.auth.oauth2.AccessToken.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.ext.auth.oauth2.AccessToken delegate;

  public AccessToken(io.vertx.ext.auth.oauth2.AccessToken delegate) {
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

  @DocAnnotation$annotation$(description = " Check if the access token is expired or not.\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean expired() {
    boolean ret = delegate.expired();
    return ret;
  }

  @DocAnnotation$annotation$(description = " The Access Token if present parsed as a JsonObject\n")
  @TypeInfo("ceylon.json::Object")
  public ceylon.json.Object accessToken() {
    ceylon.json.Object ret = io.vertx.lang.ceylon.ToCeylon.JsonObject.safeConvert(delegate.accessToken());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Refresh the access token\n")
  @TypeInfo("io.vertx.ceylon.auth.oauth2::AccessToken")
  public AccessToken refresh(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("callback")@DocAnnotation$annotation$(description = "- The callback function returning the results.\n") Callable<?> callback) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_0 = callback == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(callback) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    AccessToken ret = io.vertx.ceylon.auth.oauth2.AccessToken.TO_CEYLON.converter().safeConvert(delegate.refresh(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Revoke access or refresh token\n")
  @TypeInfo("io.vertx.ceylon.auth.oauth2::AccessToken")
  public AccessToken revoke(
    final @TypeInfo("ceylon.language::String") @Name("token_type")@DocAnnotation$annotation$(description = "- A String containing the type of token to revoke. Should be either \"access_token\" or \"refresh_token\".\n") ceylon.language.String token_type, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("callback")@DocAnnotation$annotation$(description = "- The callback function returning the results.\n") Callable<?> callback) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(token_type);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_1 = callback == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(callback) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    AccessToken ret = io.vertx.ceylon.auth.oauth2.AccessToken.TO_CEYLON.converter().safeConvert(delegate.revoke(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Revoke refresh token and calls the logout endpoint. This is a openid-connect extension and might not be\n available on all providers.\n")
  @TypeInfo("io.vertx.ceylon.auth.oauth2::AccessToken")
  public AccessToken logout(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("callback")@DocAnnotation$annotation$(description = "- The callback function returning the results.\n") Callable<?> callback) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_0 = callback == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(callback) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    AccessToken ret = io.vertx.ceylon.auth.oauth2.AccessToken.TO_CEYLON.converter().safeConvert(delegate.logout(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Introspect access token. This is an OAuth2 extension that allow to verify if an access token is still valid.\n")
  @TypeInfo("io.vertx.ceylon.auth.oauth2::AccessToken")
  public AccessToken introspect(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("callback")@DocAnnotation$annotation$(description = "- The callback function returning the results.\n") Callable<?> callback) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_0 = callback == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(callback) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    AccessToken ret = io.vertx.ceylon.auth.oauth2.AccessToken.TO_CEYLON.converter().safeConvert(delegate.introspect(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Introspect access token. This is an OAuth2 extension that allow to verify if an access token is still valid.\n")
  @TypeInfo("io.vertx.ceylon.auth.oauth2::AccessToken")
  public AccessToken introspect(
    final @TypeInfo("ceylon.language::String") @Name("tokenType")@DocAnnotation$annotation$(description = "- A String containing the type of token to revoke. Should be either \"access_token\" or \"refresh_token\".\n") ceylon.language.String tokenType, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("callback")@DocAnnotation$annotation$(description = "- The callback function returning the results.\n") Callable<?> callback) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(tokenType);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_1 = callback == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<java.lang.Void>(callback) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    AccessToken ret = io.vertx.ceylon.auth.oauth2.AccessToken.TO_CEYLON.converter().safeConvert(delegate.introspect(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Load the user info as per OIDC spec.\n")
  @TypeInfo("io.vertx.ceylon.auth.oauth2::AccessToken")
  public AccessToken userInfo(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.json::Object)") @Name("callback")@DocAnnotation$annotation$(description = "- The callback function returning the results.\n") Callable<?> callback) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.core.json.JsonObject>> arg_0 = callback == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.core.json.JsonObject>(callback) {
      public Object toCeylon(io.vertx.core.json.JsonObject event) {
        return io.vertx.lang.ceylon.ToCeylon.JsonObject.safeConvert(event);
      }
    };
    AccessToken ret = io.vertx.ceylon.auth.oauth2.AccessToken.TO_CEYLON.converter().safeConvert(delegate.userInfo(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Fetches a JSON resource using this Access Token.\n")
  @TypeInfo("io.vertx.ceylon.auth.oauth2::AccessToken")
  public AccessToken fetch(
    final @TypeInfo("ceylon.language::String") @Name("resource")@DocAnnotation$annotation$(description = "- the resource to fetch.\n") ceylon.language.String resource, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.auth.oauth2::OAuth2Response)") @Name("callback")@DocAnnotation$annotation$(description = "- The callback function returning the results.\n") Callable<?> callback) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(resource);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.auth.oauth2.OAuth2Response>> arg_1 = callback == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.ext.auth.oauth2.OAuth2Response>(callback) {
      public Object toCeylon(io.vertx.ext.auth.oauth2.OAuth2Response event) {
        return io.vertx.ceylon.auth.oauth2.OAuth2Response.TO_CEYLON.converter().safeConvert(event);
      }
    };
    AccessToken ret = io.vertx.ceylon.auth.oauth2.AccessToken.TO_CEYLON.converter().safeConvert(delegate.fetch(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Fetches a JSON resource using this Access Token.\n")
  @TypeInfo("io.vertx.ceylon.auth.oauth2::AccessToken")
  public AccessToken fetch(
    final @TypeInfo("io.vertx.ceylon.core.http::HttpMethod") @Name("method")@DocAnnotation$annotation$(description = "- the HTTP method to user.\n") io.vertx.ceylon.core.http.HttpMethod method, 
    final @TypeInfo("ceylon.language::String") @Name("resource")@DocAnnotation$annotation$(description = "- the resource to fetch.\n") ceylon.language.String resource, 
    final @TypeInfo("ceylon.json::Object") @Name("headers")@DocAnnotation$annotation$(description = "- extra headers to pass to the request.\n") ceylon.json.Object headers, 
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("payload")@DocAnnotation$annotation$(description = "- payload to send to the server.\n") Buffer payload, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.auth.oauth2::OAuth2Response)") @Name("callback")@DocAnnotation$annotation$(description = "- The callback function returning the results.\n") Callable<?> callback) {
    io.vertx.core.http.HttpMethod arg_0 = io.vertx.ceylon.core.http.httpMethod_.get_().getToJava().safeConvert(method);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(resource);
    io.vertx.core.json.JsonObject arg_2 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(headers);
    io.vertx.core.buffer.Buffer arg_3 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(payload);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.auth.oauth2.OAuth2Response>> arg_4 = callback == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.ext.auth.oauth2.OAuth2Response>(callback) {
      public Object toCeylon(io.vertx.ext.auth.oauth2.OAuth2Response event) {
        return io.vertx.ceylon.auth.oauth2.OAuth2Response.TO_CEYLON.converter().safeConvert(event);
      }
    };
    AccessToken ret = io.vertx.ceylon.auth.oauth2.AccessToken.TO_CEYLON.converter().safeConvert(delegate.fetch(arg_0, arg_1, arg_2, arg_3, arg_4));
    return this;
  }

}
