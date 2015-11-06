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

@DocAnnotation$annotation$(description = "todo")
public class RecordParser {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(RecordParser.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.parsetools.RecordParser, RecordParser> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.parsetools.RecordParser, RecordParser>() {
    public RecordParser convert(io.vertx.core.parsetools.RecordParser src) {
      return new RecordParser(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<RecordParser, io.vertx.core.parsetools.RecordParser> TO_JAVA = new io.vertx.lang.ceylon.Converter<RecordParser, io.vertx.core.parsetools.RecordParser>() {
    public io.vertx.core.parsetools.RecordParser convert(RecordParser src) {
      return src.delegate;
    }
  };

  @Ignore private final io.vertx.core.parsetools.RecordParser delegate;

  public RecordParser(io.vertx.core.parsetools.RecordParser delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void setOutput(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)") @Name("output") @DocAnnotation$annotation$(description = "todo") Callable<?> output) {
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_0 = output == null ? null : new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        output.$call$((Object)io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.safeConvert(event));
      }
    };
    delegate.setOutput(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void delimitedMode(
    final @TypeInfo("ceylon.language::String") @Name("delim") @DocAnnotation$annotation$(description = "todo") ceylon.language.String delim) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(delim);
    delegate.delimitedMode(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void delimitedMode(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("delim") @DocAnnotation$annotation$(description = "todo") Buffer delim) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(delim);
    delegate.delimitedMode(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void fixedSizeMode(
    final @TypeInfo("ceylon.language::Integer") @Name("size") @DocAnnotation$annotation$(description = "todo") long size) {
    int arg_0 = (int)size;
    delegate.fixedSizeMode(arg_0);
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Anything")
  public void handle(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("buffer") @DocAnnotation$annotation$(description = "todo") Buffer buffer) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(buffer);
    delegate.handle(arg_0);
  }

}
