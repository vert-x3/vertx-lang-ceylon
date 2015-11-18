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
import io.vertx.ceylon.web.sstore.SessionStore;
import io.vertx.ceylon.web.RoutingContext;
import io.vertx.core.Handler;

@Name("sessionHandler")
@com.redhat.ceylon.compiler.java.metadata.Object
public class sessionHandler_ {

  private static final sessionHandler_ instance = new sessionHandler_();

  @Ignore
  @TypeInfo("io.vertx.ceylon.web.handler::sessionHandler")
  public static sessionHandler_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a session handler\n")
  @TypeInfo("io.vertx.ceylon.web.handler::SessionHandler")
  public static SessionHandler create(
    final @TypeInfo("io.vertx.ceylon.web.sstore::SessionStore") @Name("sessionStore") @DocAnnotation$annotation$(description = "todo") SessionStore sessionStore) {
    io.vertx.ext.web.sstore.SessionStore arg_0 = io.vertx.ceylon.web.sstore.SessionStore.TO_JAVA.safeConvert(sessionStore);
    SessionHandler ret = io.vertx.ceylon.web.handler.SessionHandler.TO_CEYLON.converter().safeConvert(io.vertx.ext.web.handler.SessionHandler.create(arg_0));
    return ret;
  }

}
