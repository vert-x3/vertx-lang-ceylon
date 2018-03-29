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
import io.vertx.ceylon.core.Vertx;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Determines how the hashing is computed in the implementation\n\n You can implement this to provide a different hashing strategy to the default.\n")
public class JDBCHashStrategy implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.jdbc.JDBCHashStrategy, JDBCHashStrategy> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.jdbc.JDBCHashStrategy, JDBCHashStrategy>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.jdbc.JDBCHashStrategy, JDBCHashStrategy> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.jdbc.JDBCHashStrategy, JDBCHashStrategy>() {
        public JDBCHashStrategy convert(io.vertx.ext.auth.jdbc.JDBCHashStrategy src) {
          return new JDBCHashStrategy(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<JDBCHashStrategy, io.vertx.ext.auth.jdbc.JDBCHashStrategy> TO_JAVA = new io.vertx.lang.ceylon.Converter<JDBCHashStrategy, io.vertx.ext.auth.jdbc.JDBCHashStrategy>() {
    public io.vertx.ext.auth.jdbc.JDBCHashStrategy convert(JDBCHashStrategy src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(JDBCHashStrategy.class), io.vertx.ext.auth.jdbc.JDBCHashStrategy.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.ext.auth.jdbc.JDBCHashStrategy delegate;

  public JDBCHashStrategy(io.vertx.ext.auth.jdbc.JDBCHashStrategy delegate) {
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

  @DocAnnotation$annotation$(description = " Compute a random salt.\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String generateSalt() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.generateSalt());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Compute the hashed password given the unhashed password and the salt\n")
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

  @DocAnnotation$annotation$(description = " Retrieve the hashed password from the result of the authentication query\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String getHashedStoredPwd(
    final @TypeInfo("ceylon.json::Array") @Name("row")@DocAnnotation$annotation$(description = "the row\n") ceylon.json.Array row) {
    io.vertx.core.json.JsonArray arg_0 = io.vertx.lang.ceylon.ToJava.JsonArray.safeConvert(row);
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.getHashedStoredPwd(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Retrieve the salt from the result of the authentication query\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String getSalt(
    final @TypeInfo("ceylon.json::Array") @Name("row")@DocAnnotation$annotation$(description = "the row\n") ceylon.json.Array row) {
    io.vertx.core.json.JsonArray arg_0 = io.vertx.lang.ceylon.ToJava.JsonArray.safeConvert(row);
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.getSalt(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Sets a ordered list of nonces where each position corresponds to a version.\n\n The nonces are supposed not to be stored in the underlying jdbc storage but to\n be provided as a application configuration. The idea is to add one extra variable\n to the hash function in order to make breaking the passwords using rainbow tables\n or precomputed hashes harder. Leaving the attacker only with the brute force\n approach.\n\n Nonces are dependent on the implementation. E.g.: for the SHA512 they are extra salt\n used during the hashing, for the PBKDF2 they map the number of iterations the algorithm\n should take\n")
  @TypeInfo("ceylon.language::Anything")
  public void $setNonces(
    final @TypeInfo("ceylon.json::Array") @Name("nonces")@DocAnnotation$annotation$(description = "a json array.\n") ceylon.json.Array nonces) {
    io.vertx.core.json.JsonArray arg_0 = io.vertx.lang.ceylon.ToJava.JsonArray.safeConvert(nonces);
    delegate.setNonces(arg_0);
  }

}
