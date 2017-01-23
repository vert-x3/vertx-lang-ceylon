package io.vertx.ceylon.auth.htdigest;

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
import io.vertx.ceylon.auth.common.User;
import io.vertx.ceylon.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.ceylon.auth.common.AuthProvider;

@Ceylon(major = 8)
@Name("htdigestAuth")
@com.redhat.ceylon.compiler.java.metadata.Object
public class htdigestAuth_ implements ReifiedType {

  private static final htdigestAuth_ instance = new htdigestAuth_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(htdigestAuth_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.auth.htdigest::htdigestAuth")
  public static htdigestAuth_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Creates an instance of HtdigestAuth.\n")
  @TypeInfo("io.vertx.ceylon.auth.htdigest::HtdigestAuth")
  public HtdigestAuth create(
    final @TypeInfo("io.vertx.ceylon.core::Vertx") @Name("vertx") Vertx vertx) {
    io.vertx.core.Vertx arg_0 = io.vertx.ceylon.core.Vertx.TO_JAVA.safeConvert(vertx);
    HtdigestAuth ret = io.vertx.ceylon.auth.htdigest.HtdigestAuth.TO_CEYLON.converter().safeConvert(io.vertx.ext.auth.htdigest.HtdigestAuth.create(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Creates an instance of HtdigestAuth by using the given htfile file.\n")
  @TypeInfo("io.vertx.ceylon.auth.htdigest::HtdigestAuth")
  public HtdigestAuth create(
    final @TypeInfo("io.vertx.ceylon.core::Vertx") @Name("vertx") Vertx vertx, 
    final @TypeInfo("ceylon.language::String") @Name("htfile")@DocAnnotation$annotation$(description = "the existing htfile.\n") ceylon.language.String htfile) {
    io.vertx.core.Vertx arg_0 = io.vertx.ceylon.core.Vertx.TO_JAVA.safeConvert(vertx);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(htfile);
    HtdigestAuth ret = io.vertx.ceylon.auth.htdigest.HtdigestAuth.TO_CEYLON.converter().safeConvert(io.vertx.ext.auth.htdigest.HtdigestAuth.create(arg_0, arg_1));
    return ret;
  }

}
