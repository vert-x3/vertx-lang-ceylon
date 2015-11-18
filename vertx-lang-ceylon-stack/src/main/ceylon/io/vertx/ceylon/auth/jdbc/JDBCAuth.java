package io.vertx.ceylon.auth.jdbc;

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
import io.vertx.ceylon.jdbc.JDBCClient;
import io.vertx.ceylon.auth.common.AuthProvider;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Factory interface for creating todo_link(io.vertx.ext.auth.AuthProvider) instances that use the Vert.x JDBC client\n")
public class JDBCAuth extends io.vertx.ceylon.auth.common.AuthProvider implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.jdbc.JDBCAuth, JDBCAuth> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.jdbc.JDBCAuth, JDBCAuth>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.jdbc.JDBCAuth, JDBCAuth> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.jdbc.JDBCAuth, JDBCAuth>() {
        public JDBCAuth convert(io.vertx.ext.auth.jdbc.JDBCAuth src) {
          return new JDBCAuth(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<JDBCAuth, io.vertx.ext.auth.jdbc.JDBCAuth> TO_JAVA = new io.vertx.lang.ceylon.Converter<JDBCAuth, io.vertx.ext.auth.jdbc.JDBCAuth>() {
    public io.vertx.ext.auth.jdbc.JDBCAuth convert(JDBCAuth src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(JDBCAuth.class);
  @Ignore private final io.vertx.ext.auth.jdbc.JDBCAuth delegate;

  public JDBCAuth(io.vertx.ext.auth.jdbc.JDBCAuth delegate) {
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

  @DocAnnotation$annotation$(description = " Set the authentication query to use. Use this if you want to override the default authentication query.\n")
  @TypeInfo("io.vertx.ceylon.auth.jdbc::JDBCAuth")
  public JDBCAuth setAuthenticationQuery(
    final @TypeInfo("ceylon.language::String") @Name("authenticationQuery") @DocAnnotation$annotation$(description = "todo") ceylon.language.String authenticationQuery) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(authenticationQuery);
    JDBCAuth ret = io.vertx.ceylon.auth.jdbc.JDBCAuth.TO_CEYLON.converter().safeConvert(delegate.setAuthenticationQuery(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Set the roles query to use. Use this if you want to override the default roles query.\n")
  @TypeInfo("io.vertx.ceylon.auth.jdbc::JDBCAuth")
  public JDBCAuth setRolesQuery(
    final @TypeInfo("ceylon.language::String") @Name("rolesQuery") @DocAnnotation$annotation$(description = "todo") ceylon.language.String rolesQuery) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(rolesQuery);
    JDBCAuth ret = io.vertx.ceylon.auth.jdbc.JDBCAuth.TO_CEYLON.converter().safeConvert(delegate.setRolesQuery(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Set the permissions query to use. Use this if you want to override the default permissions query.\n")
  @TypeInfo("io.vertx.ceylon.auth.jdbc::JDBCAuth")
  public JDBCAuth setPermissionsQuery(
    final @TypeInfo("ceylon.language::String") @Name("permissionsQuery") @DocAnnotation$annotation$(description = "todo") ceylon.language.String permissionsQuery) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(permissionsQuery);
    JDBCAuth ret = io.vertx.ceylon.auth.jdbc.JDBCAuth.TO_CEYLON.converter().safeConvert(delegate.setPermissionsQuery(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Set the role prefix to distinguish from permissions when checking for isPermitted requests.\n")
  @TypeInfo("io.vertx.ceylon.auth.jdbc::JDBCAuth")
  public JDBCAuth setRolePrefix(
    final @TypeInfo("ceylon.language::String") @Name("rolePrefix") @DocAnnotation$annotation$(description = "todo") ceylon.language.String rolePrefix) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(rolePrefix);
    JDBCAuth ret = io.vertx.ceylon.auth.jdbc.JDBCAuth.TO_CEYLON.converter().safeConvert(delegate.setRolePrefix(arg_0));
    return ret;
  }

}
