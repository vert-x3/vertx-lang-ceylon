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
@Name("bodyHandler")
@com.redhat.ceylon.compiler.java.metadata.Object
public class bodyHandler_ implements ReifiedType {

  private static final bodyHandler_ instance = new bodyHandler_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(bodyHandler_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.web.handler::bodyHandler")
  public static bodyHandler_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a body handler with defaults\n")
  @TypeInfo("io.vertx.ceylon.web.handler::BodyHandler")
  public BodyHandler create() {
    BodyHandler ret = io.vertx.ceylon.web.handler.BodyHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.BodyHandler.create());
    return ret;
  }

}
