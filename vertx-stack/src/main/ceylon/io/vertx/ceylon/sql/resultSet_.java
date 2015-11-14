package io.vertx.ceylon.sql;

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
import java.util.List;
import io.vertx.core.json.JsonObject;

@Name("resultSet")
@com.redhat.ceylon.compiler.java.metadata.Object
public class resultSet_ {

  private static final resultSet_ instance = new resultSet_();

  @Ignore
  @TypeInfo("io.vertx.ceylon.sql::resultSet")
  public static resultSet_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.sql::ResultSet")
  public static ResultSet create(
    final @TypeInfo("ceylon.language::List<ceylon.language::String>") @Name("columnNames") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.language.String> columnNames, 
    final @TypeInfo("ceylon.language::List<ceylon.json::Array>") @Name("results") @DocAnnotation$annotation$(description = "todo") ceylon.language.List<ceylon.json.Array> results) {
    java.util.List<java.lang.String> arg_0 = io.vertx.lang.ceylon.ToJava.convertList(columnNames, io.vertx.lang.ceylon.ToJava.String);
    java.util.List<io.vertx.core.json.JsonArray> arg_1 = io.vertx.lang.ceylon.ToJava.convertList(results, io.vertx.lang.ceylon.ToJava.JsonArray);
    ResultSet ret = io.vertx.ceylon.sql.ResultSet.TO_CEYLON.converter().safeConvert(io.vertx.ext.sql.ResultSet.create(arg_0, arg_1));
    return ret;
  }

}
