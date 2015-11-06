package io.vertx.ceylon.core.parsetools;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.metadata.Name;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.ceylon.core.buffer.Buffer;
import io.vertx.core.Handler;

@Name("recordParser")
@com.redhat.ceylon.compiler.java.metadata.Object
public class recordParser_ {

  private static final recordParser_ instance = new recordParser_();

  @Ignore
  @TypeInfo("io.vertx.ceylon.core.parsetools::recordParser")
  public static recordParser_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.parsetools::RecordParser")
  public static RecordParser newDelimited(
    final @TypeInfo("ceylon.language::String") @Name("delim") @DocAnnotation$annotation$(description = "todo") ceylon.language.String delim, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)") @Name("output") @DocAnnotation$annotation$(description = "todo") Callable<?> output) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(delim);
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_1 = output == null ? null : new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        output.$call$((Object)io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.safeConvert(event));
      }
    };
    RecordParser ret = io.vertx.ceylon.core.parsetools.RecordParser.TO_CEYLON.safeConvert(io.vertx.core.parsetools.RecordParser.newDelimited(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.parsetools::RecordParser")
  public static RecordParser newDelimited(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("delim") @DocAnnotation$annotation$(description = "todo") Buffer delim, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)") @Name("output") @DocAnnotation$annotation$(description = "todo") Callable<?> output) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(delim);
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_1 = output == null ? null : new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        output.$call$((Object)io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.safeConvert(event));
      }
    };
    RecordParser ret = io.vertx.ceylon.core.parsetools.RecordParser.TO_CEYLON.safeConvert(io.vertx.core.parsetools.RecordParser.newDelimited(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.parsetools::RecordParser")
  public static RecordParser newFixed(
    final @TypeInfo("ceylon.language::Integer") @Name("size") @DocAnnotation$annotation$(description = "todo") long size, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)") @Name("output") @DocAnnotation$annotation$(description = "todo") Callable<?> output) {
    int arg_0 = (int)size;
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_1 = output == null ? null : new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        output.$call$((Object)io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.safeConvert(event));
      }
    };
    RecordParser ret = io.vertx.ceylon.core.parsetools.RecordParser.TO_CEYLON.safeConvert(io.vertx.core.parsetools.RecordParser.newFixed(arg_0, arg_1));
    return ret;
  }

}
