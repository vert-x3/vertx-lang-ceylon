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
@DocAnnotation$annotation$(description = " Represents an authenticates User and contains operations to authorise the user.\n <p>\n Please consult the documentation for a detailed explanation.\n")
public class User implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.User, User> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.User, User>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.User, User> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.User, User>() {
        public User convert(io.vertx.ext.auth.User src) {
          return new User(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<User, io.vertx.ext.auth.User> TO_JAVA = new io.vertx.lang.ceylon.Converter<User, io.vertx.ext.auth.User>() {
    public io.vertx.ext.auth.User convert(User src) {
      return src.delegate;
    }
  };

  @Ignore private User cached_isAuthorised;
  @Ignore private User cached_clearCache;
  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(User.class);
  @Ignore private final io.vertx.ext.auth.User delegate;

  public User(io.vertx.ext.auth.User delegate) {
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

  @DocAnnotation$annotation$(description = " Is the user authorised to\n")
  @TypeInfo("io.vertx.ceylon.auth.common::User")
  public User isAuthorised(
    final @TypeInfo("ceylon.language::String") @Name("authority") @DocAnnotation$annotation$(description = "todo") ceylon.language.String authority, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::Boolean)") @Name("resultHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    if (cached_isAuthorised != null) {
      return cached_isAuthorised;
    }
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(authority);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.Boolean>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.Boolean>(resultHandler) {
      public Object toCeylon(java.lang.Boolean event) {
        return io.vertx.lang.ceylon.ToCeylon.Boolean.safeConvert(event);
      }
    };
    User ret = io.vertx.ceylon.auth.common.User.TO_CEYLON.converter().safeConvert(delegate.isAuthorised(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " The User object will cache any authorities that it knows it has to avoid hitting the\n underlying auth provider each time.  Use this method if you want to clear this cache.\n")
  @TypeInfo("io.vertx.ceylon.auth.common::User")
  public User clearCache() {
    if (cached_clearCache != null) {
      return cached_clearCache;
    }
    User ret = io.vertx.ceylon.auth.common.User.TO_CEYLON.converter().safeConvert(delegate.clearCache());
    return this;
  }

  @DocAnnotation$annotation$(description = " Get the underlying principal for the User. What this actually returns depends on the implementation.\n For a simple user/password based auth, it's likely to contain a JSON object with the following structure:\n <pre>\n   {\n     \"username\", \"tim\"\n   }\n </pre>\n")
  @TypeInfo("ceylon.json::Object")
  public ceylon.json.Object principal() {
    ceylon.json.Object ret = io.vertx.lang.ceylon.ToCeylon.JsonObject.safeConvert(delegate.principal());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Set the auth provider for the User. This is typically used to reattach a detached User with an AuthProvider, e.g.\n after it has been deserialized.\n")
  @TypeInfo("ceylon.language::Anything")
  public void setAuthProvider(
    final @TypeInfo("io.vertx.ceylon.auth.common::AuthProvider") @Name("authProvider") @DocAnnotation$annotation$(description = "todo") AuthProvider authProvider) {
    io.vertx.ext.auth.AuthProvider arg_0 = io.vertx.ceylon.auth.common.AuthProvider.TO_JAVA.safeConvert(authProvider);
    delegate.setAuthProvider(arg_0);
  }

}
