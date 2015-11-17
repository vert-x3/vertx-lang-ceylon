package io.vertx.ceylon.core;

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
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

@Name("multiMap")
@com.redhat.ceylon.compiler.java.metadata.Object
public class multiMap_ {

  private static final multiMap_ instance = new multiMap_();

  @Ignore
  @TypeInfo("io.vertx.ceylon.core::multiMap")
  public static multiMap_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a multi-map implementation with case insensitive keys, for instance it can be used to hold some HTTP headers.\n")
  @TypeInfo("io.vertx.ceylon.core::MultiMap")
  public static MultiMap caseInsensitiveMultiMap() {
    MultiMap ret = io.vertx.ceylon.core.MultiMap.TO_CEYLON.converter().safeConvert(io.vertx.core.MultiMap.caseInsensitiveMultiMap());
    return ret;
  }

}
