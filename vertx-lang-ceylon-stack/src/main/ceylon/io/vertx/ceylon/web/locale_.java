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
@Name("locale")
@com.redhat.ceylon.compiler.java.metadata.Object
public class locale_ implements ReifiedType {

  private static final locale_ instance = new locale_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(locale_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.web::locale")
  public static locale_ get_() {
    return instance;
  }


  @TypeInfo("io.vertx.ceylon.web::Locale")
  public Locale create() {
    Locale ret = io.vertx.ceylon.web.Locale.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.Locale.create());
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.web::Locale")
  public Locale create(
    final @TypeInfo("ceylon.language::String") @Name("language")  ceylon.language.String language) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(language);
    Locale ret = io.vertx.ceylon.web.Locale.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.Locale.create(arg_0));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.web::Locale")
  public Locale create(
    final @TypeInfo("ceylon.language::String") @Name("language")  ceylon.language.String language, 
    final @TypeInfo("ceylon.language::String") @Name("country")  ceylon.language.String country) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(language);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(country);
    Locale ret = io.vertx.ceylon.web.Locale.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.Locale.create(arg_0, arg_1));
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.web::Locale")
  public Locale create(
    final @TypeInfo("ceylon.language::String") @Name("language")  ceylon.language.String language, 
    final @TypeInfo("ceylon.language::String") @Name("country")  ceylon.language.String country, 
    final @TypeInfo("ceylon.language::String") @Name("variant")  ceylon.language.String variant) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(language);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(country);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(variant);
    Locale ret = io.vertx.ceylon.web.Locale.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.Locale.create(arg_0, arg_1, arg_2));
    return ret;
  }

}
