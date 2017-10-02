package io.vertx.ceylon.jdbc;

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
import io.vertx.ceylon.sql.SQLQuery;
import io.vertx.ceylon.sql.SQLConnection;
import io.vertx.ceylon.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import io.vertx.ceylon.sql.SQLClient;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@Name("jdbcClient")
@com.redhat.ceylon.compiler.java.metadata.Object
public class jdbcClient_ implements ReifiedType {

  private static final jdbcClient_ instance = new jdbcClient_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(jdbcClient_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.jdbc::jdbcClient")
  public static jdbcClient_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a JDBC client which maintains its own data source.\n")
  @TypeInfo("io.vertx.ceylon.jdbc::JDBCClient")
  public JDBCClient createNonShared(
    final @TypeInfo("io.vertx.ceylon.core::Vertx") @Name("vertx")@DocAnnotation$annotation$(description = "the Vert.x instance\n") Vertx vertx, 
    final @TypeInfo("ceylon.json::Object") @Name("config")@DocAnnotation$annotation$(description = "the configuration\n") ceylon.json.Object config) {
    io.vertx.core.Vertx arg_0 = io.vertx.ceylon.core.Vertx.TO_JAVA.safeConvert(vertx);
    io.vertx.core.json.JsonObject arg_1 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(config);
    JDBCClient ret = io.vertx.ceylon.jdbc.JDBCClient.TO_CEYLON.converter().safeConvert(io.vertx.ext.jdbc.JDBCClient.createNonShared(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a JDBC client which shares its data source with any other JDBC clients created with the same\n data source name\n")
  @TypeInfo("io.vertx.ceylon.jdbc::JDBCClient")
  public JDBCClient createShared(
    final @TypeInfo("io.vertx.ceylon.core::Vertx") @Name("vertx")@DocAnnotation$annotation$(description = "the Vert.x instance\n") Vertx vertx, 
    final @TypeInfo("ceylon.json::Object") @Name("config")@DocAnnotation$annotation$(description = "the configuration\n") ceylon.json.Object config, 
    final @TypeInfo("ceylon.language::String") @Name("dataSourceName")@DocAnnotation$annotation$(description = "the data source name\n") ceylon.language.String dataSourceName) {
    io.vertx.core.Vertx arg_0 = io.vertx.ceylon.core.Vertx.TO_JAVA.safeConvert(vertx);
    io.vertx.core.json.JsonObject arg_1 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(config);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(dataSourceName);
    JDBCClient ret = io.vertx.ceylon.jdbc.JDBCClient.TO_CEYLON.converter().safeConvert(io.vertx.ext.jdbc.JDBCClient.createShared(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Like [createShared](jdbcClient.type.html#createShared) but with the default data source name\n")
  @TypeInfo("io.vertx.ceylon.jdbc::JDBCClient")
  public JDBCClient createShared(
    final @TypeInfo("io.vertx.ceylon.core::Vertx") @Name("vertx")@DocAnnotation$annotation$(description = "the Vert.x instance\n") Vertx vertx, 
    final @TypeInfo("ceylon.json::Object") @Name("config")@DocAnnotation$annotation$(description = "the configuration\n") ceylon.json.Object config) {
    io.vertx.core.Vertx arg_0 = io.vertx.ceylon.core.Vertx.TO_JAVA.safeConvert(vertx);
    io.vertx.core.json.JsonObject arg_1 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(config);
    JDBCClient ret = io.vertx.ceylon.jdbc.JDBCClient.TO_CEYLON.converter().safeConvert(io.vertx.ext.jdbc.JDBCClient.createShared(arg_0, arg_1));
    return ret;
  }

}
