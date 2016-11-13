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
@Name("staticHandler")
@com.redhat.ceylon.compiler.java.metadata.Object
public class staticHandler_ implements ReifiedType {

  private static final staticHandler_ instance = new staticHandler_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(staticHandler_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.web.handler::staticHandler")
  public static staticHandler_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a handler using defaults\n")
  @TypeInfo("io.vertx.ceylon.web.handler::StaticHandler")
  public StaticHandler create() {
    StaticHandler ret = io.vertx.ceylon.web.handler.StaticHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.StaticHandler.create());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a handler, specifying web-root\n")
  @TypeInfo("io.vertx.ceylon.web.handler::StaticHandler")
  public StaticHandler create(
    final @TypeInfo("ceylon.language::String") @Name("root")@DocAnnotation$annotation$(description = "the web-root\n") ceylon.language.String root) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(root);
    StaticHandler ret = io.vertx.ceylon.web.handler.StaticHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.StaticHandler.create(arg_0));
    return ret;
  }

}
