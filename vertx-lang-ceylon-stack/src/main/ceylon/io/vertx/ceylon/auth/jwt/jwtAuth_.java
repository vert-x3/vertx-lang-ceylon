package io.vertx.ceylon.auth.jwt;

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
@Name("jwtAuth")
@com.redhat.ceylon.compiler.java.metadata.Object
public class jwtAuth_ implements ReifiedType {

  private static final jwtAuth_ instance = new jwtAuth_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(jwtAuth_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.auth.jwt::jwtAuth")
  public static jwtAuth_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a JWT auth provider\n")
  @TypeInfo("io.vertx.ceylon.auth.jwt::JWTAuth")
  public JWTAuth create(
    final @TypeInfo("io.vertx.ceylon.core::Vertx") @Name("vertx") @DocAnnotation$annotation$(description = "todo") Vertx vertx, 
    final @TypeInfo("ceylon.json::Object") @Name("config") @DocAnnotation$annotation$(description = "todo") ceylon.json.Object config) {
    io.vertx.core.Vertx arg_0 = io.vertx.ceylon.core.Vertx.TO_JAVA.safeConvert(vertx);
    io.vertx.core.json.JsonObject arg_1 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(config);
    JWTAuth ret = io.vertx.ceylon.auth.jwt.JWTAuth.TO_CEYLON.converter().safeConvert(io.vertx.ext.auth.jwt.JWTAuth.create(arg_0, arg_1));
    return ret;
  }

}
