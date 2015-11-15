package io.vertx.ceylon.auth.jwt;

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
import io.vertx.core.json.JsonObject;
import io.vertx.ceylon.auth.common.AuthProvider;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = "todo")
public class JWTAuth extends io.vertx.ceylon.auth.common.AuthProvider implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.jwt.JWTAuth, JWTAuth> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.jwt.JWTAuth, JWTAuth>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.jwt.JWTAuth, JWTAuth> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.jwt.JWTAuth, JWTAuth>() {
        public JWTAuth convert(io.vertx.ext.auth.jwt.JWTAuth src) {
          return new JWTAuth(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<JWTAuth, io.vertx.ext.auth.jwt.JWTAuth> TO_JAVA = new io.vertx.lang.ceylon.Converter<JWTAuth, io.vertx.ext.auth.jwt.JWTAuth>() {
    public io.vertx.ext.auth.jwt.JWTAuth convert(JWTAuth src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(JWTAuth.class);
  @Ignore private final io.vertx.ext.auth.jwt.JWTAuth delegate;

  public JWTAuth(io.vertx.ext.auth.jwt.JWTAuth delegate) {
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

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String generateToken(
    final @TypeInfo("ceylon.json::Object") @Name("claims") @DocAnnotation$annotation$(description = "todo") ceylon.json.Object claims, 
    final @TypeInfo("io.vertx.ceylon.auth.jwt::JWTOptions") @Name("options") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.auth.jwt.JWTOptions options) {
    io.vertx.core.json.JsonObject arg_0 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(claims);
    io.vertx.ext.auth.jwt.JWTOptions arg_1 = options == null ? null : new io.vertx.ext.auth.jwt.JWTOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(options.toJson()));
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.generateToken(arg_0, arg_1));
    return ret;
  }

}
