package io.vertx.ceylon.web.templ;

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

@Name("handlebarsTemplateEngine")
@com.redhat.ceylon.compiler.java.metadata.Object
public class handlebarsTemplateEngine_ {

  private static final handlebarsTemplateEngine_ instance = new handlebarsTemplateEngine_();

  @Ignore
  @TypeInfo("io.vertx.ceylon.web.templ::handlebarsTemplateEngine")
  public static handlebarsTemplateEngine_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a template engine using defaults\n")
  @TypeInfo("io.vertx.ceylon.web.templ::HandlebarsTemplateEngine")
  public static HandlebarsTemplateEngine create() {
    HandlebarsTemplateEngine ret = io.vertx.ceylon.web.templ.HandlebarsTemplateEngine.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.templ.HandlebarsTemplateEngine.create());
    return ret;
  }

}
