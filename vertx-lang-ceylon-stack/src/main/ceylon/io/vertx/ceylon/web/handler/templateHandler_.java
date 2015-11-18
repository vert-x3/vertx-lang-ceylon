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
import io.vertx.ceylon.web.templ.TemplateEngine;
import io.vertx.ceylon.web.RoutingContext;
import io.vertx.core.Handler;

@Name("templateHandler")
@com.redhat.ceylon.compiler.java.metadata.Object
public class templateHandler_ {

  private static final templateHandler_ instance = new templateHandler_();

  @Ignore
  @TypeInfo("io.vertx.ceylon.web.handler::templateHandler")
  public static templateHandler_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a handler\n")
  @TypeInfo("io.vertx.ceylon.web.handler::TemplateHandler")
  public static TemplateHandler create(
    final @TypeInfo("io.vertx.ceylon.web.templ::TemplateEngine") @Name("engine") @DocAnnotation$annotation$(description = "todo") TemplateEngine engine) {
    io.vertx.ext.web.templ.TemplateEngine arg_0 = io.vertx.ceylon.web.templ.TemplateEngine.TO_JAVA.safeConvert(engine);
    TemplateHandler ret = io.vertx.ceylon.web.handler.TemplateHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.TemplateHandler.create(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a handler\n")
  @TypeInfo("io.vertx.ceylon.web.handler::TemplateHandler")
  public static TemplateHandler create(
    final @TypeInfo("io.vertx.ceylon.web.templ::TemplateEngine") @Name("engine") @DocAnnotation$annotation$(description = "todo") TemplateEngine engine, 
    final @TypeInfo("ceylon.language::String") @Name("templateDirectory") @DocAnnotation$annotation$(description = "todo") ceylon.language.String templateDirectory, 
    final @TypeInfo("ceylon.language::String") @Name("contentType") @DocAnnotation$annotation$(description = "todo") ceylon.language.String contentType) {
    io.vertx.ext.web.templ.TemplateEngine arg_0 = io.vertx.ceylon.web.templ.TemplateEngine.TO_JAVA.safeConvert(engine);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(templateDirectory);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(contentType);
    TemplateHandler ret = io.vertx.ceylon.web.handler.TemplateHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.TemplateHandler.create(arg_0, arg_1, arg_2));
    return ret;
  }

}
