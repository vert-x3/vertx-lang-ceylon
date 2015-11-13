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
@DocAnnotation$annotation$(description = "todo")
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

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(AuthProvider.class);
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

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void authenticate(
    final @TypeInfo("ceylon.json::Object") @Name("authInfo") @DocAnnotation$annotation$(description = "todo") ceylon.json.Object authInfo, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|io.vertx.ceylon.auth.common::User)") @Name("resultHandler") @DocAnnotation$annotation$(description = "todo") Callable<?> resultHandler) {
    io.vertx.core.json.JsonObject arg_0 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(authInfo);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<io.vertx.ext.auth.User>> arg_1 = resultHandler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<io.vertx.ext.auth.User>(resultHandler) {
      public Object toCeylon(io.vertx.ext.auth.User event) {
        return io.vertx.ceylon.auth.common.User.TO_CEYLON.converter().safeConvert(event);
      }
    };
    delegate.authenticate(arg_0, arg_1);
  }

}
