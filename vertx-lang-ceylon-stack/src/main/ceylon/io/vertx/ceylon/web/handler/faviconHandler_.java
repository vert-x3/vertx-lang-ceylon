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
@Name("faviconHandler")
@com.redhat.ceylon.compiler.java.metadata.Object
public class faviconHandler_ implements ReifiedType {

  private static final faviconHandler_ instance = new faviconHandler_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(faviconHandler_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.web.handler::faviconHandler")
  public static faviconHandler_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a handler with defaults\n")
  @TypeInfo("io.vertx.ceylon.web.handler::FaviconHandler")
  public FaviconHandler create() {
    FaviconHandler ret = io.vertx.ceylon.web.handler.FaviconHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.FaviconHandler.create());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a handler attempting to load favicon file from the specified path\n")
  @TypeInfo("io.vertx.ceylon.web.handler::FaviconHandler")
  public FaviconHandler create(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    FaviconHandler ret = io.vertx.ceylon.web.handler.FaviconHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.FaviconHandler.create(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a handler attempting to load favicon file from the specified path, and with the specified max cache time\n")
  @TypeInfo("io.vertx.ceylon.web.handler::FaviconHandler")
  public FaviconHandler create(
    final @TypeInfo("ceylon.language::String") @Name("path") @DocAnnotation$annotation$(description = "todo") ceylon.language.String path, 
    final @TypeInfo("ceylon.language::Integer") @Name("maxAgeSeconds") @DocAnnotation$annotation$(description = "todo") long maxAgeSeconds) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(path);
    long arg_1 = maxAgeSeconds;
    FaviconHandler ret = io.vertx.ceylon.web.handler.FaviconHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.FaviconHandler.create(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a handler with the specified max cache time\n")
  @TypeInfo("io.vertx.ceylon.web.handler::FaviconHandler")
  public FaviconHandler create(
    final @TypeInfo("ceylon.language::Integer") @Name("maxAgeSeconds") @DocAnnotation$annotation$(description = "todo") long maxAgeSeconds) {
    long arg_0 = maxAgeSeconds;
    FaviconHandler ret = io.vertx.ceylon.web.handler.FaviconHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.FaviconHandler.create(arg_0));
    return ret;
  }

}
