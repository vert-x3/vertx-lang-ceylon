package io.vertx.ceylon.auth.shiro;

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
@Name("shiroAuth")
@com.redhat.ceylon.compiler.java.metadata.Object
public class shiroAuth_ implements ReifiedType {

  private static final shiroAuth_ instance = new shiroAuth_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(shiroAuth_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.auth.shiro::shiroAuth")
  public static shiroAuth_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a Shiro auth provider\n")
  @TypeInfo("io.vertx.ceylon.auth.shiro::ShiroAuth")
  public ShiroAuth create(
    final @TypeInfo("io.vertx.ceylon.core::Vertx") @Name("vertx") @DocAnnotation$annotation$(description = "todo") Vertx vertx, 
    final @TypeInfo("io.vertx.ceylon.auth.shiro::ShiroAuthRealmType") @Name("realmType") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.auth.shiro.ShiroAuthRealmType realmType, 
    final @TypeInfo("ceylon.json::Object") @Name("config") @DocAnnotation$annotation$(description = "todo") ceylon.json.Object config) {
    io.vertx.core.Vertx arg_0 = io.vertx.ceylon.core.Vertx.TO_JAVA.safeConvert(vertx);
    io.vertx.ext.auth.shiro.ShiroAuthRealmType arg_1 = io.vertx.ceylon.auth.shiro.shiroAuthRealmType_.get_().getToJava().safeConvert(realmType);
    io.vertx.core.json.JsonObject arg_2 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(config);
    ShiroAuth ret = io.vertx.ceylon.auth.shiro.ShiroAuth.TO_CEYLON.converter().safeConvert(io.vertx.ext.auth.shiro.ShiroAuth.create(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a Shiro auth provider\n")
  @TypeInfo("io.vertx.ceylon.auth.shiro::ShiroAuth")
  public ShiroAuth create(
    final @TypeInfo("io.vertx.ceylon.core::Vertx") @Name("vertx") @DocAnnotation$annotation$(description = "todo") Vertx vertx, 
    final @TypeInfo("io.vertx.ceylon.auth.shiro::ShiroAuthOptions") @Name("options") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.auth.shiro.ShiroAuthOptions options) {
    io.vertx.core.Vertx arg_0 = io.vertx.ceylon.core.Vertx.TO_JAVA.safeConvert(vertx);
    io.vertx.ext.auth.shiro.ShiroAuthOptions arg_1 = options == null ? null : new io.vertx.ext.auth.shiro.ShiroAuthOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(options.toJson()));
    ShiroAuth ret = io.vertx.ceylon.auth.shiro.ShiroAuth.TO_CEYLON.converter().safeConvert(io.vertx.ext.auth.shiro.ShiroAuth.create(arg_0, arg_1));
    return ret;
  }

}
