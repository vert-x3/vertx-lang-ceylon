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
import io.vertx.core.json.JsonArray;
import io.vertx.ceylon.auth.common.User;
import io.vertx.ceylon.jdbc.JDBCClient;
import io.vertx.ceylon.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.ceylon.auth.common.AuthProvider;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Factory interface for creating `io.vertx.ext.auth.AuthProvider` instances that use the Vert.x JDBC client.\n\n By default the hashing strategy is SHA-512. If you're already running in production this is backwards\n compatible, however for new deployments or security upgrades it is recommended to use the PBKDF2 strategy\n as it is the current OWASP recommendation for password storage.\n")
public class JDBCAuth extends AuthProvider implements ReifiedType {

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

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(JDBCAuth.class), io.vertx.ext.auth.jdbc.JDBCAuth.class, TO_JAVA, TO_CEYLON);
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
    final @TypeInfo("ceylon.language::String") @Name("authenticationQuery")@DocAnnotation$annotation$(description = "the authentication query\n") ceylon.language.String authenticationQuery) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(authenticationQuery);
    JDBCAuth ret = io.vertx.ceylon.auth.jdbc.JDBCAuth.TO_CEYLON.converter().safeConvert(delegate.setAuthenticationQuery(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set the roles query to use. Use this if you want to override the default roles query.\n")
  @TypeInfo("io.vertx.ceylon.auth.jdbc::JDBCAuth")
  public JDBCAuth setRolesQuery(
    final @TypeInfo("ceylon.language::String") @Name("rolesQuery")@DocAnnotation$annotation$(description = "the roles query\n") ceylon.language.String rolesQuery) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(rolesQuery);
    JDBCAuth ret = io.vertx.ceylon.auth.jdbc.JDBCAuth.TO_CEYLON.converter().safeConvert(delegate.setRolesQuery(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set the permissions query to use. Use this if you want to override the default permissions query.\n")
  @TypeInfo("io.vertx.ceylon.auth.jdbc::JDBCAuth")
  public JDBCAuth setPermissionsQuery(
    final @TypeInfo("ceylon.language::String") @Name("permissionsQuery")@DocAnnotation$annotation$(description = "the permissions query\n") ceylon.language.String permissionsQuery) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(permissionsQuery);
    JDBCAuth ret = io.vertx.ceylon.auth.jdbc.JDBCAuth.TO_CEYLON.converter().safeConvert(delegate.setPermissionsQuery(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Set the role prefix to distinguish from permissions when checking for isPermitted requests.\n")
  @TypeInfo("io.vertx.ceylon.auth.jdbc::JDBCAuth")
  public JDBCAuth setRolePrefix(
    final @TypeInfo("ceylon.language::String") @Name("rolePrefix")@DocAnnotation$annotation$(description = "a Prefix e.g.: \"role:\"\n") ceylon.language.String rolePrefix) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(rolePrefix);
    JDBCAuth ret = io.vertx.ceylon.auth.jdbc.JDBCAuth.TO_CEYLON.converter().safeConvert(delegate.setRolePrefix(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Compute the hashed password given the unhashed password and the salt without nonce\n\n The implementation relays to the JDBCHashStrategy provided.\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String computeHash(
    final @TypeInfo("ceylon.language::String") @Name("password")@DocAnnotation$annotation$(description = "the unhashed password\n") ceylon.language.String password, 
    final @TypeInfo("ceylon.language::String") @Name("salt")@DocAnnotation$annotation$(description = "the salt\n") ceylon.language.String salt) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(password);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(salt);
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.computeHash(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Compute the hashed password given the unhashed password and the salt\n\n The implementation relays to the JDBCHashStrategy provided.\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String computeHash(
    final @TypeInfo("ceylon.language::String") @Name("password")@DocAnnotation$annotation$(description = "the unhashed password\n") ceylon.language.String password, 
    final @TypeInfo("ceylon.language::String") @Name("salt")@DocAnnotation$annotation$(description = "the salt\n") ceylon.language.String salt, 
    final @TypeInfo("ceylon.language::Integer") @Name("version")@DocAnnotation$annotation$(description = "the nonce version to use\n") long version) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(password);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(salt);
    int arg_2 = (int)version;
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.computeHash(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Compute a salt string.\n\n The implementation relays to the JDBCHashStrategy provided.\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String generateSalt() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.generateSalt());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Provide a application configuration level on hash nonce's as a ordered list of\n nonces where each position corresponds to a version.\n\n The nonces are supposed not to be stored in the underlying jdbc storage but to\n be provided as a application configuration. The idea is to add one extra variable\n to the hash function in order to make breaking the passwords using rainbow tables\n or precomputed hashes harder. Leaving the attacker only with the brute force\n approach.\n\n The implementation relays to the JDBCHashStrategy provided.\n")
  @TypeInfo("io.vertx.ceylon.auth.jdbc::JDBCAuth")
  public JDBCAuth setNonces(
    final @TypeInfo("ceylon.json::Array") @Name("nonces")@DocAnnotation$annotation$(description = "a List of non null Strings.\n") ceylon.json.Array nonces) {
    io.vertx.core.json.JsonArray arg_0 = io.vertx.lang.ceylon.ToJava.JsonArray.safeConvert(nonces);
    JDBCAuth ret = io.vertx.ceylon.auth.jdbc.JDBCAuth.TO_CEYLON.converter().safeConvert(delegate.setNonces(arg_0));
    return this;
  }

}
