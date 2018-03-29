package io.vertx.ceylon.web.templ.jade;

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
import io.vertx.ceylon.core.buffer.Buffer;
import io.vertx.ceylon.web.templ.TemplateEngine;
import io.vertx.ceylon.web.RoutingContext;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@Name("jadeTemplateEngine")
@com.redhat.ceylon.compiler.java.metadata.Object
public class jadeTemplateEngine_ implements ReifiedType {

  private static final jadeTemplateEngine_ instance = new jadeTemplateEngine_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(jadeTemplateEngine_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.web.templ.jade::jadeTemplateEngine")
  public static jadeTemplateEngine_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a template engine using defaults\n")
  @TypeInfo("io.vertx.ceylon.web.templ.jade::JadeTemplateEngine")
  public JadeTemplateEngine create() {
    JadeTemplateEngine ret = io.vertx.ceylon.web.templ.jade.JadeTemplateEngine.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.templ.jade.JadeTemplateEngine.create());
    return ret;
  }

}
