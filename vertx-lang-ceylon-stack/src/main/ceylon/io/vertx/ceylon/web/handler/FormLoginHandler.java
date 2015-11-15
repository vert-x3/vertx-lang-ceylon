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
import io.vertx.ceylon.auth.common.AuthProvider;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = "todo")
public class FormLoginHandler implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.FormLoginHandler, FormLoginHandler> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.ext.web.handler.FormLoginHandler, FormLoginHandler>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.FormLoginHandler, FormLoginHandler> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.ext.web.handler.FormLoginHandler, FormLoginHandler>() {
        public FormLoginHandler convert(io.vertx.ext.web.handler.FormLoginHandler src) {
          return new FormLoginHandler(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<FormLoginHandler, io.vertx.ext.web.handler.FormLoginHandler> TO_JAVA = new io.vertx.lang.ceylon.Converter<FormLoginHandler, io.vertx.ext.web.handler.FormLoginHandler>() {
    public io.vertx.ext.web.handler.FormLoginHandler convert(FormLoginHandler src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(FormLoginHandler.class);
  @Ignore private final io.vertx.ext.web.handler.FormLoginHandler delegate;

  public FormLoginHandler(io.vertx.ext.web.handler.FormLoginHandler delegate) {
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
  @TypeInfo("ceylon.language::Anything")
  public void handle(
    final @TypeInfo("io.vertx.ceylon.web::RoutingContext") @Name("arg0") @DocAnnotation$annotation$(description = "todo") RoutingContext arg0) {
    io.vertx.ext.web.RoutingContext arg_0 = io.vertx.ceylon.web.RoutingContext.TO_JAVA.safeConvert(arg0);
    delegate.handle(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.handler::FormLoginHandler")
  public FormLoginHandler setUsernameParam(
    final @TypeInfo("ceylon.language::String") @Name("usernameParam") @DocAnnotation$annotation$(description = "todo") ceylon.language.String usernameParam) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(usernameParam);
    FormLoginHandler ret = io.vertx.ceylon.web.handler.FormLoginHandler.TO_CEYLON.converter().safeConvert(delegate.setUsernameParam(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.handler::FormLoginHandler")
  public FormLoginHandler setPasswordParam(
    final @TypeInfo("ceylon.language::String") @Name("passwordParam") @DocAnnotation$annotation$(description = "todo") ceylon.language.String passwordParam) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(passwordParam);
    FormLoginHandler ret = io.vertx.ceylon.web.handler.FormLoginHandler.TO_CEYLON.converter().safeConvert(delegate.setPasswordParam(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.handler::FormLoginHandler")
  public FormLoginHandler setReturnURLParam(
    final @TypeInfo("ceylon.language::String") @Name("returnURLParam") @DocAnnotation$annotation$(description = "todo") ceylon.language.String returnURLParam) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(returnURLParam);
    FormLoginHandler ret = io.vertx.ceylon.web.handler.FormLoginHandler.TO_CEYLON.converter().safeConvert(delegate.setReturnURLParam(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.web.handler::FormLoginHandler")
  public FormLoginHandler setDirectLoggedInOKURL(
    final @TypeInfo("ceylon.language::String") @Name("directLoggedInOKURL") @DocAnnotation$annotation$(description = "todo") ceylon.language.String directLoggedInOKURL) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(directLoggedInOKURL);
    FormLoginHandler ret = io.vertx.ceylon.web.handler.FormLoginHandler.TO_CEYLON.converter().safeConvert(delegate.setDirectLoggedInOKURL(arg_0));
    return this;
  }

}
