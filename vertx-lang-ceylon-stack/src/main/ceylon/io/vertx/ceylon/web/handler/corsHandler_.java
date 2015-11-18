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
import java.util.Set;
import io.vertx.ceylon.web.RoutingContext;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@Name("corsHandler")
@com.redhat.ceylon.compiler.java.metadata.Object
public class corsHandler_ implements ReifiedType {

  private static final corsHandler_ instance = new corsHandler_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(corsHandler_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.web.handler::corsHandler")
  public static corsHandler_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a CORS handler\n")
  @TypeInfo("io.vertx.ceylon.web.handler::CorsHandler")
  public CorsHandler create(
    final @TypeInfo("ceylon.language::String") @Name("allowedOriginPattern") @DocAnnotation$annotation$(description = "todo") ceylon.language.String allowedOriginPattern) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(allowedOriginPattern);
    CorsHandler ret = io.vertx.ceylon.web.handler.CorsHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.CorsHandler.create(arg_0));
    return ret;
  }

}
