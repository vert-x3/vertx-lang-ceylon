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

@Name("errorHandler")
@com.redhat.ceylon.compiler.java.metadata.Object
public class errorHandler_ {

  private static final errorHandler_ instance = new errorHandler_();

  @Ignore
  @TypeInfo("io.vertx.ceylon.web.handler::errorHandler")
  public static errorHandler_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create an error handler using defaults\n")
  @TypeInfo("io.vertx.ceylon.web.handler::ErrorHandler")
  public static ErrorHandler create() {
    ErrorHandler ret = io.vertx.ceylon.web.handler.ErrorHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.ErrorHandler.create());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an error handler\n")
  @TypeInfo("io.vertx.ceylon.web.handler::ErrorHandler")
  public static ErrorHandler create(
    final @TypeInfo("ceylon.language::String") @Name("errorTemplateName") @DocAnnotation$annotation$(description = "todo") ceylon.language.String errorTemplateName, 
    final @TypeInfo("ceylon.language::Boolean") @Name("displayExceptionDetails") @DocAnnotation$annotation$(description = "todo") boolean displayExceptionDetails) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(errorTemplateName);
    boolean arg_1 = displayExceptionDetails;
    ErrorHandler ret = io.vertx.ceylon.web.handler.ErrorHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.ErrorHandler.create(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an error handler\n")
  @TypeInfo("io.vertx.ceylon.web.handler::ErrorHandler")
  public static ErrorHandler create(
    final @TypeInfo("ceylon.language::Boolean") @Name("displayExceptionDetails") @DocAnnotation$annotation$(description = "todo") boolean displayExceptionDetails) {
    boolean arg_0 = displayExceptionDetails;
    ErrorHandler ret = io.vertx.ceylon.web.handler.ErrorHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.ErrorHandler.create(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create an error handler\n")
  @TypeInfo("io.vertx.ceylon.web.handler::ErrorHandler")
  public static ErrorHandler create(
    final @TypeInfo("ceylon.language::String") @Name("errorTemplateName") @DocAnnotation$annotation$(description = "todo") ceylon.language.String errorTemplateName) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(errorTemplateName);
    ErrorHandler ret = io.vertx.ceylon.web.handler.ErrorHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.ErrorHandler.create(arg_0));
    return ret;
  }

}
