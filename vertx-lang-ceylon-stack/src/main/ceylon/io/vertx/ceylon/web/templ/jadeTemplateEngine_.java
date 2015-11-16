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

@Name("jadeTemplateEngine")
@com.redhat.ceylon.compiler.java.metadata.Object
public class jadeTemplateEngine_ {

  private static final jadeTemplateEngine_ instance = new jadeTemplateEngine_();

  @Ignore
  @TypeInfo("io.vertx.ceylon.web.templ::jadeTemplateEngine")
  public static jadeTemplateEngine_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.templ::JadeTemplateEngine")
  public static JadeTemplateEngine create() {
    JadeTemplateEngine ret = io.vertx.ceylon.web.templ.JadeTemplateEngine.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.templ.JadeTemplateEngine.create());
    return ret;
  }

}
