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

@Name("thymeleafTemplateEngine")
@com.redhat.ceylon.compiler.java.metadata.Object
public class thymeleafTemplateEngine_ {

  private static final thymeleafTemplateEngine_ instance = new thymeleafTemplateEngine_();

  @Ignore
  @TypeInfo("io.vertx.ceylon.web.templ::thymeleafTemplateEngine")
  public static thymeleafTemplateEngine_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.templ::ThymeleafTemplateEngine")
  public static ThymeleafTemplateEngine create() {
    ThymeleafTemplateEngine ret = io.vertx.ceylon.web.templ.ThymeleafTemplateEngine.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.templ.ThymeleafTemplateEngine.create());
    return ret;
  }

}
