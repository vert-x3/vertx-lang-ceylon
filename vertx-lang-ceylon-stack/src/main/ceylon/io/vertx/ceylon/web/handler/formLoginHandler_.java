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
@Name("formLoginHandler")
@com.redhat.ceylon.compiler.java.metadata.Object
public class formLoginHandler_ implements ReifiedType {

  private static final formLoginHandler_ instance = new formLoginHandler_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(formLoginHandler_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.web.handler::formLoginHandler")
  public static formLoginHandler_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a handler\n")
  @TypeInfo("io.vertx.ceylon.web.handler::FormLoginHandler")
  public FormLoginHandler create(
    final @TypeInfo("io.vertx.ceylon.auth.common::AuthProvider") @Name("authProvider")@DocAnnotation$annotation$(description = "the auth service to use\n") AuthProvider authProvider) {
    io.vertx.ext.auth.AuthProvider arg_0 = io.vertx.ceylon.auth.common.AuthProvider.TO_JAVA.safeConvert(authProvider);
    FormLoginHandler ret = io.vertx.ceylon.web.handler.FormLoginHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.FormLoginHandler.create(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a handler\n")
  @TypeInfo("io.vertx.ceylon.web.handler::FormLoginHandler")
  public FormLoginHandler create(
    final @TypeInfo("io.vertx.ceylon.auth.common::AuthProvider") @Name("authProvider")@DocAnnotation$annotation$(description = "the auth service to use\n") AuthProvider authProvider, 
    final @TypeInfo("ceylon.language::String") @Name("usernameParam")@DocAnnotation$annotation$(description = "the value of the form attribute which will contain the username\n") ceylon.language.String usernameParam, 
    final @TypeInfo("ceylon.language::String") @Name("passwordParam")@DocAnnotation$annotation$(description = "the value of the form attribute which will contain the password\n") ceylon.language.String passwordParam, 
    final @TypeInfo("ceylon.language::String") @Name("returnURLParam")@DocAnnotation$annotation$(description = "the value of the session attribute which will contain the return url\n") ceylon.language.String returnURLParam, 
    final @TypeInfo("ceylon.language::String") @Name("directLoggedInOKURL")@DocAnnotation$annotation$(description = "a url to redirect to if the user logs in directly at the url of the form login handler without being redirected here first\n") ceylon.language.String directLoggedInOKURL) {
    io.vertx.ext.auth.AuthProvider arg_0 = io.vertx.ceylon.auth.common.AuthProvider.TO_JAVA.safeConvert(authProvider);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(usernameParam);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(passwordParam);
    java.lang.String arg_3 = io.vertx.lang.ceylon.ToJava.String.safeConvert(returnURLParam);
    java.lang.String arg_4 = io.vertx.lang.ceylon.ToJava.String.safeConvert(directLoggedInOKURL);
    FormLoginHandler ret = io.vertx.ceylon.web.handler.FormLoginHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.FormLoginHandler.create(arg_0, arg_1, arg_2, arg_3, arg_4));
    return ret;
  }

}
