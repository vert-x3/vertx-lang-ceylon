package io.vertx.ceylon.core.buffer;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.metadata.Name;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.core.shareddata.impl.ClusterSerializable;

@Name("buffer")
@com.redhat.ceylon.compiler.java.metadata.Object
public class buffer_ {

  private static final buffer_ instance = new buffer_();

  @Ignore
  @TypeInfo("io.vertx.ceylon.core.buffer::buffer")
  public static buffer_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public static Buffer buffer() {
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.safeConvert(io.vertx.core.buffer.Buffer.buffer());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public static Buffer buffer(
    final @TypeInfo("ceylon.language::Integer") @Name("initialSizeHint") @DocAnnotation$annotation$(description = "todo") long initialSizeHint) {
    int arg_0 = (int)initialSizeHint;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.safeConvert(io.vertx.core.buffer.Buffer.buffer(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public static Buffer buffer(
    final @TypeInfo("ceylon.language::String") @Name("string") @DocAnnotation$annotation$(description = "todo") ceylon.language.String string) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(string);
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.safeConvert(io.vertx.core.buffer.Buffer.buffer(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public static Buffer buffer(
    final @TypeInfo("ceylon.language::String") @Name("string") @DocAnnotation$annotation$(description = "todo") ceylon.language.String string, 
    final @TypeInfo("ceylon.language::String") @Name("enc") @DocAnnotation$annotation$(description = "todo") ceylon.language.String enc) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(string);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(enc);
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.safeConvert(io.vertx.core.buffer.Buffer.buffer(arg_0, arg_1));
    return ret;
  }

}
