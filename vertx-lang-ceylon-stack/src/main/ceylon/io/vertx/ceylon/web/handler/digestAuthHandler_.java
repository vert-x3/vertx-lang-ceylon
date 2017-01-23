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
import io.vertx.ceylon.auth.htdigest.HtdigestAuth;
import java.util.Set;
import io.vertx.ceylon.web.RoutingContext;

@Ceylon(major = 8)
@Name("digestAuthHandler")
@com.redhat.ceylon.compiler.java.metadata.Object
public class digestAuthHandler_ implements ReifiedType {

  private static final digestAuthHandler_ instance = new digestAuthHandler_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(digestAuthHandler_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.web.handler::digestAuthHandler")
  public static digestAuthHandler_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a digest auth handler\n")
  @TypeInfo("io.vertx.ceylon.web.handler::DigestAuthHandler")
  public DigestAuthHandler create(
    final @TypeInfo("io.vertx.ceylon.auth.htdigest::HtdigestAuth") @Name("authProvider")@DocAnnotation$annotation$(description = "the auth provider to use\n") HtdigestAuth authProvider) {
    io.vertx.ext.auth.htdigest.HtdigestAuth arg_0 = io.vertx.ceylon.auth.htdigest.HtdigestAuth.TO_JAVA.safeConvert(authProvider);
    DigestAuthHandler ret = io.vertx.ceylon.web.handler.DigestAuthHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.DigestAuthHandler.create(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a digest auth handler, specifying the expire timeout for nonces.\n")
  @TypeInfo("io.vertx.ceylon.web.handler::DigestAuthHandler")
  public DigestAuthHandler create(
    final @TypeInfo("io.vertx.ceylon.auth.htdigest::HtdigestAuth") @Name("authProvider")@DocAnnotation$annotation$(description = "the auth service to use\n") HtdigestAuth authProvider, 
    final @TypeInfo("ceylon.language::Integer") @Name("nonceExpireTimeout")@DocAnnotation$annotation$(description = "the nonce expire timeout in milliseconds.\n") long nonceExpireTimeout) {
    io.vertx.ext.auth.htdigest.HtdigestAuth arg_0 = io.vertx.ceylon.auth.htdigest.HtdigestAuth.TO_JAVA.safeConvert(authProvider);
    long arg_1 = nonceExpireTimeout;
    DigestAuthHandler ret = io.vertx.ceylon.web.handler.DigestAuthHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.DigestAuthHandler.create(arg_0, arg_1));
    return ret;
  }

}
