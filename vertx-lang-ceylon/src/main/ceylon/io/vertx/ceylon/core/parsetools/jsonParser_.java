package io.vertx.ceylon.core.parsetools;

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
import io.vertx.ceylon.core.buffer.Buffer;
import io.vertx.ceylon.core.streams.ReadStream;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@Name("jsonParser")
@com.redhat.ceylon.compiler.java.metadata.Object
public class jsonParser_ implements ReifiedType {

  private static final jsonParser_ instance = new jsonParser_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(jsonParser_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.core.parsetools::jsonParser")
  public static jsonParser_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a new <code>JsonParser</code> instance.\n")
  @TypeInfo("io.vertx.ceylon.core.parsetools::JsonParser")
  public JsonParser newParser() {
    JsonParser ret = io.vertx.ceylon.core.parsetools.JsonParser.TO_CEYLON.converter().safeConvert(io.vertx.core.parsetools.JsonParser.newParser());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a new <code>JsonParser</code> instance.\n")
  @TypeInfo("io.vertx.ceylon.core.parsetools::JsonParser")
  public JsonParser newParser(
    final @TypeInfo("io.vertx.ceylon.core.streams::ReadStream<io.vertx.ceylon.core.buffer::Buffer>") @Name("stream") ReadStream<Buffer> stream) {
    io.vertx.core.streams.ReadStream<io.vertx.core.buffer.Buffer> arg_0 = io.vertx.ceylon.core.streams.ReadStream.TO_JAVA.safeConvert(stream);
    JsonParser ret = io.vertx.ceylon.core.parsetools.JsonParser.TO_CEYLON.converter().safeConvert(io.vertx.core.parsetools.JsonParser.newParser(arg_0));
    return ret;
  }

}
