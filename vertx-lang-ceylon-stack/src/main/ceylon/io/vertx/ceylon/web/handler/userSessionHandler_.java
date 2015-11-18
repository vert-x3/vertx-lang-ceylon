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
@Name("userSessionHandler")
@com.redhat.ceylon.compiler.java.metadata.Object
public class userSessionHandler_ implements ReifiedType {

  private static final userSessionHandler_ instance = new userSessionHandler_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(userSessionHandler_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.web.handler::userSessionHandler")
  public static userSessionHandler_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a new handler\n")
  @TypeInfo("io.vertx.ceylon.web.handler::UserSessionHandler")
  public UserSessionHandler create(
    final @TypeInfo("io.vertx.ceylon.auth.common::AuthProvider") @Name("authProvider") @DocAnnotation$annotation$(description = "The auth provider to use\n") AuthProvider authProvider) {
    io.vertx.ext.auth.AuthProvider arg_0 = io.vertx.ceylon.auth.common.AuthProvider.TO_JAVA.safeConvert(authProvider);
    UserSessionHandler ret = io.vertx.ceylon.web.handler.UserSessionHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.UserSessionHandler.create(arg_0));
    return ret;
  }

}
