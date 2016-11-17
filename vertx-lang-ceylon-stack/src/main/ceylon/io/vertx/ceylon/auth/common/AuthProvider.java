package io.vertx.ceylon.auth.common;

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
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = "\n User-facing interface for authenticating users.\n")
public class AuthProvider implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.AuthProvider, AuthProvider> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.AuthProvider, AuthProvider>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.AuthProvider, AuthProvider> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.AuthProvider, AuthProvider>() {
        public AuthProvider convert(io.vertx.ext.auth.AuthProvider src) {
          return new AuthProvider(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<AuthProvider, io.vertx.ext.auth.AuthProvider> TO_JAVA = new io.vertx.lang.ceylon.Converter<AuthProvider, io.vertx.ext.auth.AuthProvider>() {
    public io.vertx.ext.auth.AuthProvider convert(AuthProvider src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(AuthProvider.class), io.vertx.ext.auth.AuthProvider.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.ext.auth.AuthProvider delegate;

  public AuthProvider(io.vertx.ext.auth.AuthProvider delegate) {
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

  @DocAnnotation$annotation$(description = " Authenticate a user.\n <p>\n The first argument is a JSON object containing information for authenticating the user. What this actually contains\n depends on the specific implementation. In the case of a simple username/password based\n authentication it is likely to contain a JSON object with the following structure:\n <pre>\n   {\n     \"username\": \"tim\",\n     \"password\": \"mypassword\"\n   }\n </pre>\n For other types of authentication it contain different information - for example a JWT token or OAuth bearer token.\n <p>\n If the user is successfully authenticated a [User](User.type.html) object is passed to the handler in an _async result_.\n The user object can then be used for authorisation.\n")
  @TypeInfo("ceylon.language::Anything")
  public void authenticate(
    final @TypeInfo("ceylon.json::Object") @Name("authInfo")@DocAnnotation$annotation$(description = "The auth information\n") ceylon.json.Object authInfo, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.auth.common::User)") @Name("resultHandler")@DocAnnotation$annotation$(description = "The result handler\n") Callable<?> resultHandler) {
    io.vertx.core.json.JsonObject arg_0 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(authInfo);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.auth.User>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.CallableAsyncResultHandler<io.vertx.ext.auth.User>(resultHandler) {
      public Object toCeylon(io.vertx.ext.auth.User event) {
        return io.vertx.ceylon.auth.common.User.TO_CEYLON.converter().safeConvert(event);
      }
    };
    delegate.authenticate(arg_0, arg_1);
  }

}
