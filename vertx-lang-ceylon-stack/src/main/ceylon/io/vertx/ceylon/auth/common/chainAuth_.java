package io.vertx.ceylon.auth.common;

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
import io.vertx.core.json.JsonObject;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@Name("chainAuth")
@com.redhat.ceylon.compiler.java.metadata.Object
public class chainAuth_ implements ReifiedType {

  private static final chainAuth_ instance = new chainAuth_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(chainAuth_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.auth.common::chainAuth")
  public static chainAuth_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a Chainable Auth Provider auth provider\n")
  @TypeInfo("io.vertx.ceylon.auth.common::ChainAuth")
  public ChainAuth create() {
    ChainAuth ret = io.vertx.ceylon.auth.common.ChainAuth.TO_CEYLON.converter().safeConvert(io.vertx.ext.auth.ChainAuth.create());
    return ret;
  }

}
