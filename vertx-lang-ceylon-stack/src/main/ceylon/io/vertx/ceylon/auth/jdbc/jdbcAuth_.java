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
@Name("jdbcAuth")
@com.redhat.ceylon.compiler.java.metadata.Object
public class jdbcAuth_ implements ReifiedType {

  private static final jdbcAuth_ instance = new jdbcAuth_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(jdbcAuth_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.auth.jdbc::jdbcAuth")
  public static jdbcAuth_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a JDBC auth provider implementation\n")
  @TypeInfo("io.vertx.ceylon.auth.jdbc::JDBCAuth")
  public JDBCAuth create(
    final @TypeInfo("io.vertx.ceylon.jdbc::JDBCClient") @Name("client") @DocAnnotation$annotation$(description = "the JDBC client instance\n") JDBCClient client) {
    io.vertx.ext.jdbc.JDBCClient arg_0 = io.vertx.ceylon.jdbc.JDBCClient.TO_JAVA.safeConvert(client);
    JDBCAuth ret = io.vertx.ceylon.auth.jdbc.JDBCAuth.TO_CEYLON.converter().safeConvert(io.vertx.ext.auth.jdbc.JDBCAuth.create(arg_0));
    return ret;
  }

}
