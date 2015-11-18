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
import io.vertx.core.Handler;

@Ceylon(major = 8)
@Name("recordParser")
@com.redhat.ceylon.compiler.java.metadata.Object
public class recordParser_ implements ReifiedType {

  private static final recordParser_ instance = new recordParser_();
  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(recordParser_.class);

  @Ignore
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  @TypeInfo("io.vertx.ceylon.core.parsetools::recordParser")
  public static recordParser_ get_() {
    return instance;
  }


  @DocAnnotation$annotation$(description = " Create a new <code>RecordParser</code> instance, initially in delimited mode, and where the delimiter can be represented\n by the String <code></code> delim endcoded in latin-1 . Don't use this if your String contains other than latin-1 characters.\n <p>\n <code>output</code> Will receive whole records which have been parsed.\n")
  @TypeInfo("io.vertx.ceylon.core.parsetools::RecordParser")
  public RecordParser newDelimited(
    final @TypeInfo("ceylon.language::String") @Name("delim") @DocAnnotation$annotation$(description = "the initial delimiter string\n") ceylon.language.String delim, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)") @Name("output") @DocAnnotation$annotation$(description = "handler that will receive the output\n") Callable<?> output) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(delim);
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_1 = output == null ? null : new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        output.$call$((Object)io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(event));
      }
    };
    RecordParser ret = io.vertx.ceylon.core.parsetools.RecordParser.TO_CEYLON.converter().safeConvert(io.vertx.core.parsetools.RecordParser.newDelimited(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a new <code>RecordParser</code> instance, initially in delimited mode, and where the delimiter can be represented\n by the <code>Buffer</code> delim.\n <p>\n <code>output</code> Will receive whole records which have been parsed.\n")
  @TypeInfo("io.vertx.ceylon.core.parsetools::RecordParser")
  public RecordParser newDelimited(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("delim") @DocAnnotation$annotation$(description = "the initial delimiter buffer\n") Buffer delim, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)") @Name("output") @DocAnnotation$annotation$(description = "handler that will receive the output\n") Callable<?> output) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(delim);
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_1 = output == null ? null : new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        output.$call$((Object)io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(event));
      }
    };
    RecordParser ret = io.vertx.ceylon.core.parsetools.RecordParser.TO_CEYLON.converter().safeConvert(io.vertx.core.parsetools.RecordParser.newDelimited(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Create a new <code>RecordParser</code> instance, initially in fixed size mode, and where the record size is specified\n by the <code>size</code> parameter.\n <p>\n <code>output</code> Will receive whole records which have been parsed.\n")
  @TypeInfo("io.vertx.ceylon.core.parsetools::RecordParser")
  public RecordParser newFixed(
    final @TypeInfo("ceylon.language::Integer") @Name("size") @DocAnnotation$annotation$(description = "the initial record size\n") long size, 
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)") @Name("output") @DocAnnotation$annotation$(description = "handler that will receive the output\n") Callable<?> output) {
    int arg_0 = (int)size;
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_1 = output == null ? null : new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        output.$call$((Object)io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(event));
      }
    };
    RecordParser ret = io.vertx.ceylon.core.parsetools.RecordParser.TO_CEYLON.converter().safeConvert(io.vertx.core.parsetools.RecordParser.newFixed(arg_0, arg_1));
    return ret;
  }

}
