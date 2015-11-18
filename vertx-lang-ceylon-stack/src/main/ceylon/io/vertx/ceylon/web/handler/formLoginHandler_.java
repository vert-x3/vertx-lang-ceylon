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

@Name("formLoginHandler")
@com.redhat.ceylon.compiler.java.metadata.Object
public class formLoginHandler_ {

  private static final formLoginHandler_ instance = new formLoginHandler_();

  @Ignore
  @TypeInfo("io.vertx.ceylon.web.handler::formLoginHandler")
  public static formLoginHandler_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a handler\n")
  @TypeInfo("io.vertx.ceylon.web.handler::FormLoginHandler")
  public static FormLoginHandler create(
    final @TypeInfo("io.vertx.ceylon.auth.common::AuthProvider") @Name("authProvider") @DocAnnotation$annotation$(description = "todo") AuthProvider authProvider) {
    io.vertx.ext.auth.AuthProvider arg_0 = io.vertx.ceylon.auth.common.AuthProvider.TO_JAVA.safeConvert(authProvider);
    FormLoginHandler ret = io.vertx.ceylon.web.handler.FormLoginHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.FormLoginHandler.create(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a handler\n")
  @TypeInfo("io.vertx.ceylon.web.handler::FormLoginHandler")
  public static FormLoginHandler create(
    final @TypeInfo("io.vertx.ceylon.auth.common::AuthProvider") @Name("authProvider") @DocAnnotation$annotation$(description = "todo") AuthProvider authProvider, 
    final @TypeInfo("ceylon.language::String") @Name("usernameParam") @DocAnnotation$annotation$(description = "todo") ceylon.language.String usernameParam, 
    final @TypeInfo("ceylon.language::String") @Name("passwordParam") @DocAnnotation$annotation$(description = "todo") ceylon.language.String passwordParam, 
    final @TypeInfo("ceylon.language::String") @Name("returnURLParam") @DocAnnotation$annotation$(description = "todo") ceylon.language.String returnURLParam, 
    final @TypeInfo("ceylon.language::String") @Name("directLoggedInOKURL") @DocAnnotation$annotation$(description = "todo") ceylon.language.String directLoggedInOKURL) {
    io.vertx.ext.auth.AuthProvider arg_0 = io.vertx.ceylon.auth.common.AuthProvider.TO_JAVA.safeConvert(authProvider);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(usernameParam);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(passwordParam);
    java.lang.String arg_3 = io.vertx.lang.ceylon.ToJava.String.safeConvert(returnURLParam);
    java.lang.String arg_4 = io.vertx.lang.ceylon.ToJava.String.safeConvert(directLoggedInOKURL);
    FormLoginHandler ret = io.vertx.ceylon.web.handler.FormLoginHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.FormLoginHandler.create(arg_0, arg_1, arg_2, arg_3, arg_4));
    return ret;
  }

}
