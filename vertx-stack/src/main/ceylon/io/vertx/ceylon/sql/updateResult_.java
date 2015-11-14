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

@Name("updateResult")
@com.redhat.ceylon.compiler.java.metadata.Object
public class updateResult_ {

  private static final updateResult_ instance = new updateResult_();

  @Ignore
  @TypeInfo("io.vertx.ceylon.sql::updateResult")
  public static updateResult_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.sql::UpdateResult")
  public static UpdateResult create(
    final @TypeInfo("ceylon.language::Integer") @Name("updated") @DocAnnotation$annotation$(description = "todo") long updated, 
    final @TypeInfo("ceylon.json::Array") @Name("keys") @DocAnnotation$annotation$(description = "todo") ceylon.json.Array keys) {
    int arg_0 = (int)updated;
    io.vertx.core.json.JsonArray arg_1 = io.vertx.lang.ceylon.ToJava.JsonArray.safeConvert(keys);
    UpdateResult ret = io.vertx.ceylon.sql.UpdateResult.TO_CEYLON.converter().safeConvert(io.vertx.ext.sql.UpdateResult.create(arg_0, arg_1));
    return ret;
  }

}
