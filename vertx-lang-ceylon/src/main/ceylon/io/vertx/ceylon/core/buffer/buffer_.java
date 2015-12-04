package io.vertx.ceylon.core.buffer;

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
import io.vertx.core.json.JsonArray;
import io.vertx.core.shareddata.impl.ClusterSerializable;
import io.vertx.core.json.JsonObject;

@Ceylon(major = 8)
@Name("buffer")
@com.redhat.ceylon.compiler.java.metadata.Object
public class buffer_ implements ReifiedType {

  private static final buffer_ instance = new buffer_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(buffer_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.core.buffer::buffer")
  public static buffer_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a new, empty buffer.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer buffer() {
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(io.vertx.core.buffer.Buffer.buffer());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a new buffer given the initial size hint.\n <p>\n If you know the buffer will require a certain size, providing the hint can prevent unnecessary re-allocations\n as the buffer is written to and resized.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer buffer(
    final @TypeInfo("ceylon.language::Integer") @Name("initialSizeHint") @DocAnnotation$annotation$(description = "the hint, in bytes\n") long initialSizeHint) {
    int arg_0 = (int)initialSizeHint;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(io.vertx.core.buffer.Buffer.buffer(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a new buffer from a string. The string will be UTF-8 encoded into the buffer.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer buffer(
    final @TypeInfo("ceylon.language::String") @Name("string") @DocAnnotation$annotation$(description = "the string\n") ceylon.language.String string) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(string);
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(io.vertx.core.buffer.Buffer.buffer(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a new buffer from a string and using the specified encoding.\n The string will be encoded into the buffer using the specified encoding.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer buffer(
    final @TypeInfo("ceylon.language::String") @Name("string") @DocAnnotation$annotation$(description = "the string\n") ceylon.language.String string, 
    final @TypeInfo("ceylon.language::String") @Name("enc")  ceylon.language.String enc) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(string);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(enc);
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(io.vertx.core.buffer.Buffer.buffer(arg_0, arg_1));
    return ret;
  }

}
