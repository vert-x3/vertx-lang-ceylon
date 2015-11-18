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

@Ceylon(major = 8)
@Name("mvelTemplateEngine")
@com.redhat.ceylon.compiler.java.metadata.Object
public class mvelTemplateEngine_ implements ReifiedType {

  private static final mvelTemplateEngine_ instance = new mvelTemplateEngine_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(mvelTemplateEngine_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.web.templ::mvelTemplateEngine")
  public static mvelTemplateEngine_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a template engine using defaults\n")
  @TypeInfo("io.vertx.ceylon.web.templ::MVELTemplateEngine")
  public MVELTemplateEngine create() {
    MVELTemplateEngine ret = io.vertx.ceylon.web.templ.MVELTemplateEngine.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.templ.MVELTemplateEngine.create());
    return ret;
  }

}
