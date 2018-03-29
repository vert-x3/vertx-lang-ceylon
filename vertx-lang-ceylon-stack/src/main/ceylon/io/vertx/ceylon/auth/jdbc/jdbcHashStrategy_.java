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
@Name("jdbcHashStrategy")
@com.redhat.ceylon.compiler.java.metadata.Object
public class jdbcHashStrategy_ implements ReifiedType {

  private static final jdbcHashStrategy_ instance = new jdbcHashStrategy_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(jdbcHashStrategy_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.auth.jdbc::jdbcHashStrategy")
  public static jdbcHashStrategy_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " This is the current backwards compatible hashing implementation, new applications should prefer the\n PBKDF2 implementation, unless the tradeoff between security and CPU usage is an option.\n")
  @TypeInfo("io.vertx.ceylon.auth.jdbc::JDBCHashStrategy")
  public JDBCHashStrategy createSHA512(
    final @TypeInfo("io.vertx.ceylon.core::Vertx") @Name("vertx")@DocAnnotation$annotation$(description = "the vert.x instance\n") Vertx vertx) {
    io.vertx.core.Vertx arg_0 = io.vertx.ceylon.core.Vertx.TO_JAVA.safeConvert(vertx);
    JDBCHashStrategy ret = io.vertx.ceylon.auth.jdbc.JDBCHashStrategy.TO_CEYLON.converter().safeConvert(io.vertx.ext.auth.jdbc.JDBCHashStrategy.createSHA512(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Implements a Hashing Strategy as per https://www.owasp.org/index.php/Password_Storage_Cheat_Sheet (2018-01-17).\n\n New deployments should use this strategy instead of the default one (which was the previous OWASP recommendation).\n\n The work factor can be updated by using the nonces json array.\n")
  @TypeInfo("io.vertx.ceylon.auth.jdbc::JDBCHashStrategy")
  public JDBCHashStrategy createPBKDF2(
    final @TypeInfo("io.vertx.ceylon.core::Vertx") @Name("vertx")@DocAnnotation$annotation$(description = "the vert.x instance\n") Vertx vertx) {
    io.vertx.core.Vertx arg_0 = io.vertx.ceylon.core.Vertx.TO_JAVA.safeConvert(vertx);
    JDBCHashStrategy ret = io.vertx.ceylon.auth.jdbc.JDBCHashStrategy.TO_CEYLON.converter().safeConvert(io.vertx.ext.auth.jdbc.JDBCHashStrategy.createPBKDF2(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Time constant string comparision to avoid timming attacks.\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isEqual(
    final @TypeInfo("ceylon.language::String") @Name("hasha")@DocAnnotation$annotation$(description = "hash a to compare\n") ceylon.language.String hasha, 
    final @TypeInfo("ceylon.language::String") @Name("hashb")@DocAnnotation$annotation$(description = "hash b to compare\n") ceylon.language.String hashb) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(hasha);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(hashb);
    boolean ret = io.vertx.ext.auth.jdbc.JDBCHashStrategy.isEqual(arg_0, arg_1);
    return ret;
  }

}
