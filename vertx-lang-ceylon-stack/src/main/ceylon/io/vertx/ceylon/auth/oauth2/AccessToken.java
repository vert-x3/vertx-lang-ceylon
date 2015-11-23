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
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " AccessToken extension to the User interface\n")
public class AccessToken extends io.vertx.ceylon.auth.common.User implements ReifiedType {

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

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(AccessToken.class);
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

  @DocAnnotation$annotation$(description = " Refresh the access token\n")
  @TypeInfo("io.vertx.ceylon.auth.oauth2::AccessToken")
  public AccessToken refresh(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("callback") @DocAnnotation$annotation$(description = "- The callback function returning the results.\n") Callable<?> callback) {
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_0 = callback == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(callback) {
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
    final @TypeInfo("ceylon.language::String") @Name("token_type") @DocAnnotation$annotation$(description = "- A String containing the type of token to revoke. Should be either \"access_token\" or \"refresh_token\".\n") ceylon.language.String token_type, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable?)") @Name("callback") @DocAnnotation$annotation$(description = "- The callback function returning the results.\n") Callable<?> callback) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(token_type);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Void>> arg_1 = callback == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Void>(callback) {
      public Object toCeylon(java.lang.Void event) {
        return null;
      }
    };
    AccessToken ret = io.vertx.ceylon.auth.oauth2.AccessToken.TO_CEYLON.converter().safeConvert(delegate.revoke(arg_0, arg_1));
    return this;
  }

}
