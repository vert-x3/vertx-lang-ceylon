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
import java.util.Map;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Hashing Strategy manager.\n\n This class will load system provided hashing strategies and algorithms.\n")
public class HashingStrategy implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.HashingStrategy, HashingStrategy> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.auth.HashingStrategy, HashingStrategy>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.HashingStrategy, HashingStrategy> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.auth.HashingStrategy, HashingStrategy>() {
        public HashingStrategy convert(io.vertx.ext.auth.HashingStrategy src) {
          return new HashingStrategy(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<HashingStrategy, io.vertx.ext.auth.HashingStrategy> TO_JAVA = new io.vertx.lang.ceylon.Converter<HashingStrategy, io.vertx.ext.auth.HashingStrategy>() {
    public io.vertx.ext.auth.HashingStrategy convert(HashingStrategy src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(HashingStrategy.class), io.vertx.ext.auth.HashingStrategy.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.ext.auth.HashingStrategy delegate;

  public HashingStrategy(io.vertx.ext.auth.HashingStrategy delegate) {
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

  @DocAnnotation$annotation$(description = " Hashes a password.\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String hash(
    final @TypeInfo("ceylon.language::String") @Name("id")@DocAnnotation$annotation$(description = "the algorithm id\n") ceylon.language.String id, 
    final @TypeInfo("ceylon.language::Map<ceylon.language::String,ceylon.language::String>") @Name("params")@DocAnnotation$annotation$(description = "the algorithm specific paramters\n") ceylon.language.Map<ceylon.language.String,ceylon.language.String> params, 
    final @TypeInfo("ceylon.language::String") @Name("salt")@DocAnnotation$annotation$(description = "the given salt\n") ceylon.language.String salt, 
    final @TypeInfo("ceylon.language::String") @Name("password")@DocAnnotation$annotation$(description = "the given password\n") ceylon.language.String password) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(id);
    java.util.Map<java.lang.String,java.lang.String> arg_1 = io.vertx.lang.ceylon.ToJava.convertMap(params, io.vertx.lang.ceylon.ToJava.String, io.vertx.lang.ceylon.ToJava.String);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(salt);
    java.lang.String arg_3 = io.vertx.lang.ceylon.ToJava.String.safeConvert(password);
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.hash(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Time constant password check. Regardless of the check, this algorithm executes the same number of\n checks regardless of the correctly number of characters\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean verify(
    final @TypeInfo("ceylon.language::String") @Name("hash")@DocAnnotation$annotation$(description = "the hash to verify\n") ceylon.language.String hash, 
    final @TypeInfo("ceylon.language::String") @Name("password")@DocAnnotation$annotation$(description = "the password to test against\n") ceylon.language.String password) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(hash);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(password);
    boolean ret = delegate.verify(arg_0, arg_1);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Get an algorithm interface by its Id\n")
  @TypeInfo("io.vertx.ceylon.auth.common::HashingAlgorithm")
  public HashingAlgorithm get(
    final @TypeInfo("ceylon.language::String") @Name("id")@DocAnnotation$annotation$(description = "the algorithm id\n") ceylon.language.String id) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(id);
    HashingAlgorithm ret = io.vertx.ceylon.auth.common.HashingAlgorithm.TO_CEYLON.converter().safeConvert(delegate.get(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Put or replace an algorithm into the list of system loaded algorithms.\n")
  @TypeInfo("io.vertx.ceylon.auth.common::HashingStrategy")
  public HashingStrategy put(
    final @TypeInfo("ceylon.language::String") @Name("id")@DocAnnotation$annotation$(description = "the algorithm id\n") ceylon.language.String id, 
    final @TypeInfo("io.vertx.ceylon.auth.common::HashingAlgorithm") @Name("algorithm")@DocAnnotation$annotation$(description = "the implementation\n") HashingAlgorithm algorithm) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(id);
    io.vertx.ext.auth.HashingAlgorithm arg_1 = io.vertx.ceylon.auth.common.HashingAlgorithm.TO_JAVA.safeConvert(algorithm);
    HashingStrategy ret = io.vertx.ceylon.auth.common.HashingStrategy.TO_CEYLON.converter().safeConvert(delegate.put(arg_0, arg_1));
    return this;
  }

}
