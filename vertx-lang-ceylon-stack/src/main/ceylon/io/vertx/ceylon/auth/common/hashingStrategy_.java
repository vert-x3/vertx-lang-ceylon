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
import java.util.Map;

@Ceylon(major = 8)
@Name("hashingStrategy")
@com.redhat.ceylon.compiler.java.metadata.Object
public class hashingStrategy_ implements ReifiedType {

  private static final hashingStrategy_ instance = new hashingStrategy_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(hashingStrategy_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.auth.common::hashingStrategy")
  public static hashingStrategy_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Factory method to load the algorithms from the system\n")
  @TypeInfo("io.vertx.ceylon.auth.common::HashingStrategy")
  public HashingStrategy load() {
    HashingStrategy ret = io.vertx.ceylon.auth.common.HashingStrategy.TO_CEYLON.converter().safeConvert(io.vertx.ext.auth.HashingStrategy.load());
    return ret;
  }

}
