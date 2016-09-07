package io.vertx.ceylon.auth.oauth2;

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
import io.vertx.ceylon.auth.common.User;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.http.HttpMethod;
import io.vertx.ceylon.core.Vertx;
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;
import io.vertx.ext.auth.oauth2.OAuth2FlowType;
import io.vertx.ceylon.auth.common.AuthProvider;

@Ceylon(major = 8)
@Name("oAuth2Auth")
@com.redhat.ceylon.compiler.java.metadata.Object
public class oAuth2Auth_ implements ReifiedType {

  private static final oAuth2Auth_ instance = new oAuth2Auth_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(oAuth2Auth_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.auth.oauth2::oAuth2Auth")
  public static oAuth2Auth_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a OAuth2 auth provider\n")
  @TypeInfo("io.vertx.ceylon.auth.oauth2::OAuth2Auth")
  public OAuth2Auth createKeycloak(
    final @TypeInfo("io.vertx.ceylon.core::Vertx") @Name("vertx") @DocAnnotation$annotation$(description = "the Vertx instance\n") Vertx vertx, 
    final @TypeInfo("ceylon.language::String") @Name("flow")  ceylon.language.String flow, 
    final @TypeInfo("ceylon.json::Object") @Name("config") @DocAnnotation$annotation$(description = "the config as exported from the admin console\n") ceylon.json.Object config) {
    io.vertx.core.Vertx arg_0 = io.vertx.ceylon.core.Vertx.TO_JAVA.safeConvert(vertx);
    io.vertx.ext.auth.oauth2.OAuth2FlowType arg_1 = io.vertx.lang.ceylon.ToJava.enumeration(io.vertx.ext.auth.oauth2.OAuth2FlowType.class).safeConvert(flow);
    io.vertx.core.json.JsonObject arg_2 = io.vertx.lang.ceylon.ToJava.JsonObject.safeConvert(config);
    OAuth2Auth ret = io.vertx.ceylon.auth.oauth2.OAuth2Auth.TO_CEYLON.converter().safeConvert(io.vertx.ext.auth.oauth2.OAuth2Auth.createKeycloak(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a OAuth2 auth provider\n")
  @TypeInfo("io.vertx.ceylon.auth.oauth2::OAuth2Auth")
  public OAuth2Auth create(
    final @TypeInfo("io.vertx.ceylon.core::Vertx") @Name("vertx") @DocAnnotation$annotation$(description = "the Vertx instance\n") Vertx vertx, 
    final @TypeInfo("ceylon.language::String") @Name("flow")  ceylon.language.String flow, 
    final @TypeInfo("io.vertx.ceylon.auth.oauth2::OAuth2ClientOptions") @Name("config") @DocAnnotation$annotation$(description = "the config\n") io.vertx.ceylon.auth.oauth2.OAuth2ClientOptions config) {
    io.vertx.core.Vertx arg_0 = io.vertx.ceylon.core.Vertx.TO_JAVA.safeConvert(vertx);
    io.vertx.ext.auth.oauth2.OAuth2FlowType arg_1 = io.vertx.lang.ceylon.ToJava.enumeration(io.vertx.ext.auth.oauth2.OAuth2FlowType.class).safeConvert(flow);
    io.vertx.ext.auth.oauth2.OAuth2ClientOptions arg_2 = config == null ? null : new io.vertx.ext.auth.oauth2.OAuth2ClientOptions(io.vertx.lang.ceylon.ToJava.JsonObject.convert(config.toJson()));
    OAuth2Auth ret = io.vertx.ceylon.auth.oauth2.OAuth2Auth.TO_CEYLON.converter().safeConvert(io.vertx.ext.auth.oauth2.OAuth2Auth.create(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a OAuth2 auth provider\n")
  @TypeInfo("io.vertx.ceylon.auth.oauth2::OAuth2Auth")
  public OAuth2Auth create(
    final @TypeInfo("io.vertx.ceylon.core::Vertx") @Name("vertx") @DocAnnotation$annotation$(description = "the Vertx instance\n") Vertx vertx, 
    final @TypeInfo("ceylon.language::String") @Name("flow")  ceylon.language.String flow) {
    io.vertx.core.Vertx arg_0 = io.vertx.ceylon.core.Vertx.TO_JAVA.safeConvert(vertx);
    io.vertx.ext.auth.oauth2.OAuth2FlowType arg_1 = io.vertx.lang.ceylon.ToJava.enumeration(io.vertx.ext.auth.oauth2.OAuth2FlowType.class).safeConvert(flow);
    OAuth2Auth ret = io.vertx.ceylon.auth.oauth2.OAuth2Auth.TO_CEYLON.converter().safeConvert(io.vertx.ext.auth.oauth2.OAuth2Auth.create(arg_0, arg_1));
    return ret;
  }

}
