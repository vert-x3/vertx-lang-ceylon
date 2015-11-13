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
@DocAnnotation$annotation$(description = "todo")
public class Cookie implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.Cookie, Cookie> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.Cookie, Cookie>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.web.Cookie, Cookie> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.web.Cookie, Cookie>() {
        public Cookie convert(io.vertx.ext.web.Cookie src) {
          return new Cookie(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<Cookie, io.vertx.ext.web.Cookie> TO_JAVA = new io.vertx.lang.ceylon.Converter<Cookie, io.vertx.ext.web.Cookie>() {
    public io.vertx.ext.web.Cookie convert(Cookie src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(Cookie.class);
  @Ignore private final io.vertx.ext.web.Cookie delegate;

  public Cookie(io.vertx.ext.web.Cookie delegate) {
    this.delegate = delegate;
  }

  @Ignore 
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String getName() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.getName());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String getValue() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.getValue());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web::Cookie")
  public Cookie setValue(
    final @TypeInfo("ceylon.language::String") @Name("value") @DocAnnotation$annotation$(description = "todo") ceylon.language.String value) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(value);
    Cookie ret = io.vertx.ceylon.web.Cookie.TO_CEYLON.converter().safeConvert(delegate.setValue(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web::Cookie")
  public Cookie setDomain(
    final @TypeInfo("ceylon.language::String") @Name("domain") @DocAnnotation$annotation$(description = "todo") ceylon.language.String domain) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(domain);
    Cookie ret = io.vertx.ceylon.web.Cookie.TO_CEYLON.converter().safeConvert(delegate.setDomain(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String getDomain() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.getDomain());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web::Cookie")
  public Cookie setPath(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    Cookie ret = io.vertx.ceylon.web.Cookie.TO_CEYLON.converter().safeConvert(delegate.setPath(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String getPath() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.getPath());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web::Cookie")
  public Cookie setMaxAge(
    final @TypeInfo("ceylon.language::Integer") @Name("maxAge") @DocAnnotation$annotation$(description = "todo") long maxAge) {
    long arg_0 = maxAge;
    Cookie ret = io.vertx.ceylon.web.Cookie.TO_CEYLON.converter().safeConvert(delegate.setMaxAge(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web::Cookie")
  public Cookie setSecure(
    final @TypeInfo("ceylon.language::Boolean") @Name("secure") @DocAnnotation$annotation$(description = "todo") boolean secure) {
    boolean arg_0 = secure;
    Cookie ret = io.vertx.ceylon.web.Cookie.TO_CEYLON.converter().safeConvert(delegate.setSecure(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web::Cookie")
  public Cookie setHttpOnly(
    final @TypeInfo("ceylon.language::Boolean") @Name("httpOnly") @DocAnnotation$annotation$(description = "todo") boolean httpOnly) {
    boolean arg_0 = httpOnly;
    Cookie ret = io.vertx.ceylon.web.Cookie.TO_CEYLON.converter().safeConvert(delegate.setHttpOnly(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String encode() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.encode());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Boolean")
  public boolean isChanged() {
    boolean ret = delegate.isChanged();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void setChanged(
    final @TypeInfo("ceylon.language::Boolean") @Name("changed") @DocAnnotation$annotation$(description = "todo") boolean changed) {
    boolean arg_0 = changed;
    delegate.setChanged(arg_0);
  }

}
