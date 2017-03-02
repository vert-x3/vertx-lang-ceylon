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

@Ceylon(major = 8)
@Name("responseContentTypeHandler")
@com.redhat.ceylon.compiler.java.metadata.Object
public class responseContentTypeHandler_ implements ReifiedType {

  private static final responseContentTypeHandler_ instance = new responseContentTypeHandler_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(responseContentTypeHandler_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.web.handler::responseContentTypeHandler")
  public static responseContentTypeHandler_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a response content type handler.\n")
  @TypeInfo("io.vertx.ceylon.web.handler::ResponseContentTypeHandler")
  public ResponseContentTypeHandler create() {
    ResponseContentTypeHandler ret = io.vertx.ceylon.web.handler.ResponseContentTypeHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.ResponseContentTypeHandler.create());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a response content type handler with a custom disable flag.\n")
  @TypeInfo("io.vertx.ceylon.web.handler::ResponseContentTypeHandler")
  public ResponseContentTypeHandler create(
    final @TypeInfo("ceylon.language::String") @Name("disableFlag") ceylon.language.String disableFlag) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(disableFlag);
    ResponseContentTypeHandler ret = io.vertx.ceylon.web.handler.ResponseContentTypeHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.ResponseContentTypeHandler.create(arg_0));
    return ret;
  }

}
