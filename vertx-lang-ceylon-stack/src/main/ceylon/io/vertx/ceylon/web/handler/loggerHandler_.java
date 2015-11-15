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

@Name("loggerHandler")
@com.redhat.ceylon.compiler.java.metadata.Object
public class loggerHandler_ {

  private static final loggerHandler_ instance = new loggerHandler_();

  @Ignore
  @TypeInfo("io.vertx.ceylon.web.handler::loggerHandler")
  public static loggerHandler_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.handler::LoggerHandler")
  public static LoggerHandler create() {
    LoggerHandler ret = io.vertx.ceylon.web.handler.LoggerHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.LoggerHandler.create());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.handler::LoggerHandler")
  public static LoggerHandler create(
    final @TypeInfo("io.vertx.ceylon.web.handler::LoggerFormat") @Name("format") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.web.handler.LoggerFormat format) {
    io.vertx.ext.web.handler.LoggerFormat arg_0 = io.vertx.ceylon.web.handler.loggerFormat_.get_().getToJava().safeConvert(format);
    LoggerHandler ret = io.vertx.ceylon.web.handler.LoggerHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.LoggerHandler.create(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.handler::LoggerHandler")
  public static LoggerHandler create(
    final @TypeInfo("ceylon.language::Boolean") @Name("immediate") @DocAnnotation$annotation$(description = "todo") boolean immediate, 
    final @TypeInfo("io.vertx.ceylon.web.handler::LoggerFormat") @Name("format") @DocAnnotation$annotation$(description = "todo") io.vertx.ceylon.web.handler.LoggerFormat format) {
    boolean arg_0 = immediate;
    io.vertx.ext.web.handler.LoggerFormat arg_1 = io.vertx.ceylon.web.handler.loggerFormat_.get_().getToJava().safeConvert(format);
    LoggerHandler ret = io.vertx.ceylon.web.handler.LoggerHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.LoggerHandler.create(arg_0, arg_1));
    return ret;
  }

}
