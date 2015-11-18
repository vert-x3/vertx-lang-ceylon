package io.vertx.ceylon.web;

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
import io.vertx.ceylon.core.http.HttpServerRequest;
import java.util.List;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.Vertx;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@Name("router")
@com.redhat.ceylon.compiler.java.metadata.Object
public class router_ implements ReifiedType {

  private static final router_ instance = new router_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(router_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.web::router")
  public static router_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a router\n")
  @TypeInfo("io.vertx.ceylon.web::Router")
  public Router router(
    final @TypeInfo("io.vertx.ceylon.core::Vertx") @Name("vertx") @DocAnnotation$annotation$(description = "todo") Vertx vertx) {
    io.vertx.core.Vertx arg_0 = io.vertx.ceylon.core.Vertx.TO_JAVA.safeConvert(vertx);
    Router ret = io.vertx.ceylon.web.Router.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.Router.router(arg_0));
    return ret;
  }

}
