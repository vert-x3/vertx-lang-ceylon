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

@Name("responseTimeHandler")
@com.redhat.ceylon.compiler.java.metadata.Object
public class responseTimeHandler_ {

  private static final responseTimeHandler_ instance = new responseTimeHandler_();

  @Ignore
  @TypeInfo("io.vertx.ceylon.web.handler::responseTimeHandler")
  public static responseTimeHandler_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a handler\n")
  @TypeInfo("io.vertx.ceylon.web.handler::ResponseTimeHandler")
  public static ResponseTimeHandler create() {
    ResponseTimeHandler ret = io.vertx.ceylon.web.handler.ResponseTimeHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.ResponseTimeHandler.create());
    return ret;
  }

}
