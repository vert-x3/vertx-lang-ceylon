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
import java.util.List;
import java.util.Set;
import io.vertx.ceylon.web.RoutingContext;
import io.vertx.ceylon.auth.common.AuthProvider;

@Ceylon(major = 8)
@Name("jwtAuthHandler")
@com.redhat.ceylon.compiler.java.metadata.Object
public class jwtAuthHandler_ implements ReifiedType {

  private static final jwtAuthHandler_ instance = new jwtAuthHandler_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(jwtAuthHandler_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.web.handler::jwtAuthHandler")
  public static jwtAuthHandler_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a JWT auth handler\n")
  @TypeInfo("io.vertx.ceylon.web.handler::JWTAuthHandler")
  public JWTAuthHandler create(
    final @TypeInfo("io.vertx.ceylon.auth.common::AuthProvider") @Name("authProvider") @DocAnnotation$annotation$(description = "the auth provider to use\n") AuthProvider authProvider) {
    io.vertx.ext.auth.AuthProvider arg_0 = io.vertx.ceylon.auth.common.AuthProvider.TO_JAVA.safeConvert(authProvider);
    JWTAuthHandler ret = io.vertx.ceylon.web.handler.JWTAuthHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.JWTAuthHandler.create(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a JWT auth handler\n")
  @TypeInfo("io.vertx.ceylon.web.handler::JWTAuthHandler")
  public JWTAuthHandler create(
    final @TypeInfo("io.vertx.ceylon.auth.common::AuthProvider") @Name("authProvider") @DocAnnotation$annotation$(description = "the auth provider to use.\n") AuthProvider authProvider, 
    final @TypeInfo("ceylon.language::String") @Name("skip")  ceylon.language.String skip) {
    io.vertx.ext.auth.AuthProvider arg_0 = io.vertx.ceylon.auth.common.AuthProvider.TO_JAVA.safeConvert(authProvider);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(skip);
    JWTAuthHandler ret = io.vertx.ceylon.web.handler.JWTAuthHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.JWTAuthHandler.create(arg_0, arg_1));
    return ret;
  }

}
