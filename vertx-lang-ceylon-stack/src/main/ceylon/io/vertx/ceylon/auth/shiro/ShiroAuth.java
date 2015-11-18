package io.vertx.ceylon.auth.shiro;

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
@DocAnnotation$annotation$(description = " Factory interface for creating Apache Shiro based `io.vertx.ext.auth.AuthProvider` instances.\n")
public class ShiroAuth extends io.vertx.ceylon.auth.common.AuthProvider implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.shiro.ShiroAuth, ShiroAuth> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.shiro.ShiroAuth, ShiroAuth>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.shiro.ShiroAuth, ShiroAuth> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.shiro.ShiroAuth, ShiroAuth>() {
        public ShiroAuth convert(io.vertx.ext.auth.shiro.ShiroAuth src) {
          return new ShiroAuth(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<ShiroAuth, io.vertx.ext.auth.shiro.ShiroAuth> TO_JAVA = new io.vertx.lang.ceylon.Converter<ShiroAuth, io.vertx.ext.auth.shiro.ShiroAuth>() {
    public io.vertx.ext.auth.shiro.ShiroAuth convert(ShiroAuth src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(ShiroAuth.class);
  @Ignore private final io.vertx.ext.auth.shiro.ShiroAuth delegate;

  public ShiroAuth(io.vertx.ext.auth.shiro.ShiroAuth delegate) {
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

  @DocAnnotation$annotation$(description = " Set the role prefix to distinguish from permissions when checking for isPermitted requests.\n")
  @TypeInfo("io.vertx.ceylon.auth.shiro::ShiroAuth")
  public ShiroAuth setRolePrefix(
    final @TypeInfo("ceylon.language::String") @Name("rolePrefix") @DocAnnotation$annotation$(description = "todo") ceylon.language.String rolePrefix) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(rolePrefix);
    ShiroAuth ret = io.vertx.ceylon.auth.shiro.ShiroAuth.TO_CEYLON.converter().safeConvert(delegate.setRolePrefix(arg_0));
    return ret;
  }

}
