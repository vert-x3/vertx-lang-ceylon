package io.vertx.ceylon.web;

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
@Name("cookie")
@com.redhat.ceylon.compiler.java.metadata.Object
public class cookie_ implements ReifiedType {

  private static final cookie_ instance = new cookie_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(cookie_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.web::cookie")
  public static cookie_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a new cookie\n")
  @TypeInfo("io.vertx.ceylon.web::Cookie")
  public Cookie cookie(
    final @TypeInfo("ceylon.language::String") @Name("name")@DocAnnotation$annotation$(description = "the name of the cookie\n") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::String") @Name("value")@DocAnnotation$annotation$(description = "the cookie value\n") ceylon.language.String value) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(value);
    Cookie ret = io.vertx.ceylon.web.Cookie.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.Cookie.cookie(arg_0, arg_1));
    return ret;
  }

}
