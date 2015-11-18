package io.vertx.ceylon.web.handler;

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
import io.vertx.ceylon.web.RoutingContext;
import io.vertx.core.Handler;

@Name("cookieHandler")
@com.redhat.ceylon.compiler.java.metadata.Object
public class cookieHandler_ {

  private static final cookieHandler_ instance = new cookieHandler_();

  @Ignore
  @TypeInfo("io.vertx.ceylon.web.handler::cookieHandler")
  public static cookieHandler_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a cookie handler\n")
  @TypeInfo("io.vertx.ceylon.web.handler::CookieHandler")
  public static CookieHandler create() {
    CookieHandler ret = io.vertx.ceylon.web.handler.CookieHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.CookieHandler.create());
    return ret;
  }

}
