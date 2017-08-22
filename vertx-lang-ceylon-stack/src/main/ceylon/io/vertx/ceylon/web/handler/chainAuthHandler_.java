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
import io.vertx.ceylon.auth.common.User;
import java.util.Set;
import io.vertx.core.json.JsonObject;
import io.vertx.ceylon.web.RoutingContext;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@Name("chainAuthHandler")
@com.redhat.ceylon.compiler.java.metadata.Object
public class chainAuthHandler_ implements ReifiedType {

  private static final chainAuthHandler_ instance = new chainAuthHandler_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(chainAuthHandler_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.web.handler::chainAuthHandler")
  public static chainAuthHandler_ get_() {
    return instance;
  }


  @TypeInfo("io.vertx.ceylon.web.handler::ChainAuthHandler")
  public ChainAuthHandler create() {
    ChainAuthHandler ret = io.vertx.ceylon.web.handler.ChainAuthHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.ChainAuthHandler.create());
    return ret;
  }

}
