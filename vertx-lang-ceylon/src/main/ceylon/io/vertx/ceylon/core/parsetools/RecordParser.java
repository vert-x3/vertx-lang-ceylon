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
@DocAnnotation$annotation$(description = " A helper class which allows you to easily parse protocols which are delimited by a sequence of bytes, or fixed\n size records.\n <p>\n Instances of this class take as input [Buffer](../buffer/Buffer.type.html) instances containing raw bytes,\n and output records.\n <p>\n For example, if I had a simple ASCII text protocol delimited by '\n' and the input was the following:\n <p>\n <pre>\n buffer1:HELLO\nHOW ARE Y\n buffer2:OU?\nI AM\n buffer3: DOING OK\n buffer4:\n\n </pre>\n Then the output would be:<p>\n <pre>\n buffer1:HELLO\n buffer2:HOW ARE YOU?\n buffer3:I AM DOING OK\n </pre>\n Instances of this class can be changed between delimited mode and fixed size record mode on the fly as\n individual records are read, this allows you to parse protocols where, for example, the first 5 records might\n all be fixed size (of potentially different sizes), followed by some delimited records, followed by more fixed\n size records.\n <p>\n Instances of this class can't currently be used for protocols where the text is encoded with something other than\n a 1-1 byte-char mapping.\n <p>\n Please see the documentation for more information.\n")
public class RecordParser implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.parsetools.RecordParser, RecordParser> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.parsetools.RecordParser, RecordParser>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.parsetools.RecordParser, RecordParser> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.parsetools.RecordParser, RecordParser>() {
        public RecordParser convert(io.vertx.core.parsetools.RecordParser src) {
          return new RecordParser(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<RecordParser, io.vertx.core.parsetools.RecordParser> TO_JAVA = new io.vertx.lang.ceylon.Converter<RecordParser, io.vertx.core.parsetools.RecordParser>() {
    public io.vertx.core.parsetools.RecordParser convert(RecordParser src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(RecordParser.class);
  @Ignore private final io.vertx.core.parsetools.RecordParser delegate;

  public RecordParser(io.vertx.core.parsetools.RecordParser delegate) {
    this.delegate = delegate;
  }

  @Ignore 
  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @TypeInfo("ceylon.language::Anything")
  public void setOutput(
    final @TypeInfo("ceylon.language::Anything(io.vertx.ceylon.core.buffer::Buffer)") @Name("output")  Callable<?> output) {
    io.vertx.core.Handler<io.vertx.core.buffer.Buffer> arg_0 = output == null ? null : new io.vertx.core.Handler<io.vertx.core.buffer.Buffer>() {
      public void handle(io.vertx.core.buffer.Buffer event) {
        output.$call$((Object)io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(event));
      }
    };
    delegate.setOutput(arg_0);
  }

  @DocAnnotation$annotation$(description = " Flip the parser into delimited mode, and where the delimiter can be represented\n by the String <code>delim</code> encoded in latin-1 . Don't use this if your String contains other than latin-1 characters.\n <p>\n This method can be called multiple times with different values of delim while data is being parsed.\n")
  @TypeInfo("ceylon.language::Anything")
  public void delimitedMode(
    final @TypeInfo("ceylon.language::String") @Name("delim") @DocAnnotation$annotation$(description = "the new delimeter\n") ceylon.language.String delim) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(delim);
    delegate.delimitedMode(arg_0);
  }

  @DocAnnotation$annotation$(description = " Flip the parser into delimited mode, and where the delimiter can be represented\n by the delimiter <code>delim</code>.\n <p>\n This method can be called multiple times with different values of delim while data is being parsed.\n")
  @TypeInfo("ceylon.language::Anything")
  public void delimitedMode(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("delim") @DocAnnotation$annotation$(description = "the new delimiter\n") Buffer delim) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(delim);
    delegate.delimitedMode(arg_0);
  }

  @DocAnnotation$annotation$(description = " Flip the parser into fixed size mode, where the record size is specified by <code>size</code> in bytes.\n <p>\n This method can be called multiple times with different values of size while data is being parsed.\n")
  @TypeInfo("ceylon.language::Anything")
  public void fixedSizeMode(
    final @TypeInfo("ceylon.language::Integer") @Name("size") @DocAnnotation$annotation$(description = "the new record size\n") long size) {
    int arg_0 = (int)size;
    delegate.fixedSizeMode(arg_0);
  }

  @DocAnnotation$annotation$(description = " This method is called to provide the parser with data.\n")
  @TypeInfo("ceylon.language::Anything")
  public void handle(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("buffer") @DocAnnotation$annotation$(description = "a chunk of data\n") Buffer buffer) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(buffer);
    delegate.handle(arg_0);
  }

}
