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
@DocAnnotation$annotation$(description = " Most data is shuffled around inside Vert.x using buffers.\n <p>\n A buffer is a sequence of zero or more bytes that can read from or written to and which expands automatically as\n necessary to accommodate any bytes written to it. You can perhaps think of a buffer as smart byte array.\n <p>\n Please consult the documentation for more information on buffers.\n")
public class Buffer implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.buffer.Buffer, Buffer> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.buffer.Buffer, Buffer>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.buffer.Buffer, Buffer> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.buffer.Buffer, Buffer>() {
        public Buffer convert(io.vertx.core.buffer.Buffer src) {
          return new Buffer(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<Buffer, io.vertx.core.buffer.Buffer> TO_JAVA = new io.vertx.lang.ceylon.Converter<Buffer, io.vertx.core.buffer.Buffer>() {
    public io.vertx.core.buffer.Buffer convert(Buffer src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(Buffer.class);
  @Ignore private final io.vertx.core.buffer.Buffer delegate;

  public Buffer(io.vertx.core.buffer.Buffer delegate) {
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

  public java.lang.String toString() {
    return delegate.toString();
  }

  @DocAnnotation$annotation$(description = " Returns a <code>String</code> representation of the Buffer with the encoding specified by <code>enc</code>\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String toString(
    final @TypeInfo("ceylon.language::String") @Name("enc")  ceylon.language.String enc) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(enc);
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.toString(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Returns a Json object representation of the Buffer\n")
  @TypeInfo("ceylon.json::Object")
  public ceylon.json.Object toJsonObject() {
    ceylon.json.Object ret = io.vertx.lang.ceylon.ToCeylon.JsonObject.safeConvert(delegate.toJsonObject());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Returns a Json array representation of the Buffer\n")
  @TypeInfo("ceylon.json::Array")
  public ceylon.json.Array toJsonArray() {
    ceylon.json.Array ret = io.vertx.lang.ceylon.ToCeylon.JsonArray.safeConvert(delegate.toJsonArray());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Returns the <code>byte</code> at position <code>pos</code> in the Buffer.\n")
  @TypeInfo("ceylon.language::Byte")
  public byte getByte(
    final @TypeInfo("ceylon.language::Integer") @Name("pos")  long pos) {
    int arg_0 = (int)pos;
    byte ret = delegate.getByte(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Returns the unsigned <code>byte</code> at position <code>pos</code> in the Buffer, as a <code>short</code>.\n")
  @TypeInfo("ceylon.language::Integer")
  public long getUnsignedByte(
    final @TypeInfo("ceylon.language::Integer") @Name("pos")  long pos) {
    int arg_0 = (int)pos;
    long ret = delegate.getUnsignedByte(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Returns the <code>int</code> at position <code>pos</code> in the Buffer.\n")
  @TypeInfo("ceylon.language::Integer")
  public long getInt(
    final @TypeInfo("ceylon.language::Integer") @Name("pos")  long pos) {
    int arg_0 = (int)pos;
    long ret = delegate.getInt(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Gets a 32-bit integer at the specified absolute <code>index</code> in this buffer with Little Endian Byte Order.\n")
  @TypeInfo("ceylon.language::Integer")
  public long getIntLE(
    final @TypeInfo("ceylon.language::Integer") @Name("pos")  long pos) {
    int arg_0 = (int)pos;
    long ret = delegate.getIntLE(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Returns the unsigned <code>int</code> at position <code>pos</code> in the Buffer, as a <code>long</code>.\n")
  @TypeInfo("ceylon.language::Integer")
  public long getUnsignedInt(
    final @TypeInfo("ceylon.language::Integer") @Name("pos")  long pos) {
    int arg_0 = (int)pos;
    long ret = delegate.getUnsignedInt(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Returns the unsigned <code>int</code> at position <code>pos</code> in the Buffer, as a <code>long</code> in Little Endian Byte Order.\n")
  @TypeInfo("ceylon.language::Integer")
  public long getUnsignedIntLE(
    final @TypeInfo("ceylon.language::Integer") @Name("pos")  long pos) {
    int arg_0 = (int)pos;
    long ret = delegate.getUnsignedIntLE(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Returns the <code>long</code> at position <code>pos</code> in the Buffer.\n")
  @TypeInfo("ceylon.language::Integer")
  public long getLong(
    final @TypeInfo("ceylon.language::Integer") @Name("pos")  long pos) {
    int arg_0 = (int)pos;
    long ret = delegate.getLong(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Gets a 64-bit long integer at the specified absolute <code>index</code> in this buffer in Little Endian Byte Order.\n")
  @TypeInfo("ceylon.language::Integer")
  public long getLongLE(
    final @TypeInfo("ceylon.language::Integer") @Name("pos")  long pos) {
    int arg_0 = (int)pos;
    long ret = delegate.getLongLE(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Returns the <code>double</code> at position <code>pos</code> in the Buffer.\n")
  @TypeInfo("ceylon.language::Float")
  public double getDouble(
    final @TypeInfo("ceylon.language::Integer") @Name("pos")  long pos) {
    int arg_0 = (int)pos;
    double ret = delegate.getDouble(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Returns the <code>float</code> at position <code>pos</code> in the Buffer.\n")
  @TypeInfo("ceylon.language::Float")
  public double getFloat(
    final @TypeInfo("ceylon.language::Integer") @Name("pos")  long pos) {
    int arg_0 = (int)pos;
    double ret = delegate.getFloat(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Returns the <code>short</code> at position <code>pos</code> in the Buffer.\n")
  @TypeInfo("ceylon.language::Integer")
  public long getShort(
    final @TypeInfo("ceylon.language::Integer") @Name("pos")  long pos) {
    int arg_0 = (int)pos;
    long ret = delegate.getShort(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Gets a 16-bit short integer at the specified absolute <code>index</code> in this buffer in Little Endian Byte Order.\n")
  @TypeInfo("ceylon.language::Integer")
  public long getShortLE(
    final @TypeInfo("ceylon.language::Integer") @Name("pos")  long pos) {
    int arg_0 = (int)pos;
    long ret = delegate.getShortLE(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Returns the unsigned <code>short</code> at position <code>pos</code> in the Buffer, as an <code>int</code>.\n")
  @TypeInfo("ceylon.language::Integer")
  public long getUnsignedShort(
    final @TypeInfo("ceylon.language::Integer") @Name("pos")  long pos) {
    int arg_0 = (int)pos;
    long ret = delegate.getUnsignedShort(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Gets an unsigned 16-bit short integer at the specified absolute <code>index</code> in this buffer in Little Endian Byte Order.\n")
  @TypeInfo("ceylon.language::Integer")
  public long getUnsignedShortLE(
    final @TypeInfo("ceylon.language::Integer") @Name("pos")  long pos) {
    int arg_0 = (int)pos;
    long ret = delegate.getUnsignedShortLE(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Gets a 24-bit medium integer at the specified absolute <code>index</code> in this buffer.\n")
  @TypeInfo("ceylon.language::Integer")
  public long getMedium(
    final @TypeInfo("ceylon.language::Integer") @Name("pos")  long pos) {
    int arg_0 = (int)pos;
    long ret = delegate.getMedium(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Gets a 24-bit medium integer at the specified absolute <code>index</code> in this buffer in the Little Endian Byte Order.\n")
  @TypeInfo("ceylon.language::Integer")
  public long getMediumLE(
    final @TypeInfo("ceylon.language::Integer") @Name("pos")  long pos) {
    int arg_0 = (int)pos;
    long ret = delegate.getMediumLE(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Gets an unsigned 24-bit medium integer at the specified absolute <code>index</code> in this buffer.\n")
  @TypeInfo("ceylon.language::Integer")
  public long getUnsignedMedium(
    final @TypeInfo("ceylon.language::Integer") @Name("pos")  long pos) {
    int arg_0 = (int)pos;
    long ret = delegate.getUnsignedMedium(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Gets an unsigned 24-bit medium integer at the specified absolute <code>index</code> in this buffer in Little Endian Byte Order.\n")
  @TypeInfo("ceylon.language::Integer")
  public long getUnsignedMediumLE(
    final @TypeInfo("ceylon.language::Integer") @Name("pos")  long pos) {
    int arg_0 = (int)pos;
    long ret = delegate.getUnsignedMediumLE(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = " Returns a copy of a sub-sequence the Buffer as a [Buffer](../buffer/Buffer.type.html) starting at position <code>start</code>\n and ending at position <code>end - 1</code>\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer getBuffer(
    final @TypeInfo("ceylon.language::Integer") @Name("start")  long start, 
    final @TypeInfo("ceylon.language::Integer") @Name("end")  long end) {
    int arg_0 = (int)start;
    int arg_1 = (int)end;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.getBuffer(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Returns a copy of a sub-sequence the Buffer as a <code>String</code> starting at position <code>start</code>\n and ending at position <code>end - 1</code> interpreted as a String in the specified encoding\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String getString(
    final @TypeInfo("ceylon.language::Integer") @Name("start")  long start, 
    final @TypeInfo("ceylon.language::Integer") @Name("end")  long end, 
    final @TypeInfo("ceylon.language::String") @Name("enc")  ceylon.language.String enc) {
    int arg_0 = (int)start;
    int arg_1 = (int)end;
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(enc);
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.getString(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Returns a copy of a sub-sequence the Buffer as a <code>String</code> starting at position <code>start</code>\n and ending at position <code>end - 1</code> interpreted as a String in UTF-8 encoding\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String getString(
    final @TypeInfo("ceylon.language::Integer") @Name("start")  long start, 
    final @TypeInfo("ceylon.language::Integer") @Name("end")  long end) {
    int arg_0 = (int)start;
    int arg_1 = (int)end;
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.getString(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = " Appends the specified <code>Buffer</code> to the end of this Buffer. The buffer will expand as necessary to accommodate\n any bytes written.<p>\n Returns a reference to <code>this</code> so multiple operations can be appended together.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer appendBuffer(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("buff")  Buffer buff) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(buff);
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.appendBuffer(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Appends the specified <code>Buffer</code> starting at the <code>offset</code> using <code>len</code> to the end of this Buffer. The buffer will expand as necessary to accommodate\n any bytes written.<p>\n Returns a reference to <code>this</code> so multiple operations can be appended together.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer appendBuffer(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("buff")  Buffer buff, 
    final @TypeInfo("ceylon.language::Integer") @Name("offset")  long offset, 
    final @TypeInfo("ceylon.language::Integer") @Name("len")  long len) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(buff);
    int arg_1 = (int)offset;
    int arg_2 = (int)len;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.appendBuffer(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Appends the specified <code>byte</code> to the end of the Buffer. The buffer will expand as necessary to accommodate any bytes written.<p>\n Returns a reference to <code>this</code> so multiple operations can be appended together.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer appendByte(
    final @TypeInfo("ceylon.language::Byte") @Name("b")  byte b) {
    byte arg_0 = b;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.appendByte(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Appends the specified unsigned <code>byte</code> to the end of the Buffer. The buffer will expand as necessary to accommodate any bytes written.<p>\n Returns a reference to <code>this</code> so multiple operations can be appended together.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer appendUnsignedByte(
    final @TypeInfo("ceylon.language::Integer") @Name("b")  long b) {
    short arg_0 = (short)b;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.appendUnsignedByte(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Appends the specified <code>int</code> to the end of the Buffer. The buffer will expand as necessary to accommodate any bytes written.<p>\n Returns a reference to <code>this</code> so multiple operations can be appended together.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer appendInt(
    final @TypeInfo("ceylon.language::Integer") @Name("i")  long i) {
    int arg_0 = (int)i;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.appendInt(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Appends the specified <code>int</code> to the end of the Buffer in the Little Endian Byte Order. The buffer will expand as necessary to accommodate any bytes written.<p>\n Returns a reference to <code>this</code> so multiple operations can be appended together.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer appendIntLE(
    final @TypeInfo("ceylon.language::Integer") @Name("i")  long i) {
    int arg_0 = (int)i;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.appendIntLE(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Appends the specified unsigned <code>int</code> to the end of the Buffer. The buffer will expand as necessary to accommodate any bytes written.<p>\n Returns a reference to <code>this</code> so multiple operations can be appended together.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer appendUnsignedInt(
    final @TypeInfo("ceylon.language::Integer") @Name("i")  long i) {
    long arg_0 = i;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.appendUnsignedInt(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Appends the specified unsigned <code>int</code> to the end of the Buffer in the Little Endian Byte Order. The buffer will expand as necessary to accommodate any bytes written.<p>\n Returns a reference to <code>this</code> so multiple operations can be appended together.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer appendUnsignedIntLE(
    final @TypeInfo("ceylon.language::Integer") @Name("i")  long i) {
    long arg_0 = i;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.appendUnsignedIntLE(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Appends the specified 24bit <code>int</code> to the end of the Buffer. The buffer will expand as necessary to accommodate any bytes written.<p>\n Returns a reference to <code>this</code> so multiple operations can be appended together.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer appendMedium(
    final @TypeInfo("ceylon.language::Integer") @Name("i")  long i) {
    int arg_0 = (int)i;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.appendMedium(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Appends the specified 24bit <code>int</code> to the end of the Buffer in the Little Endian Byte Order. The buffer will expand as necessary to accommodate any bytes written.<p>\n Returns a reference to <code>this</code> so multiple operations can be appended together.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer appendMediumLE(
    final @TypeInfo("ceylon.language::Integer") @Name("i")  long i) {
    int arg_0 = (int)i;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.appendMediumLE(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Appends the specified <code>long</code> to the end of the Buffer. The buffer will expand as necessary to accommodate any bytes written.<p>\n Returns a reference to <code>this</code> so multiple operations can be appended together.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer appendLong(
    final @TypeInfo("ceylon.language::Integer") @Name("l")  long l) {
    long arg_0 = l;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.appendLong(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Appends the specified <code>long</code> to the end of the Buffer in the Little Endian Byte Order. The buffer will expand as necessary to accommodate any bytes written.<p>\n Returns a reference to <code>this</code> so multiple operations can be appended together.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer appendLongLE(
    final @TypeInfo("ceylon.language::Integer") @Name("l")  long l) {
    long arg_0 = l;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.appendLongLE(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Appends the specified <code>short</code> to the end of the Buffer.The buffer will expand as necessary to accommodate any bytes written.<p>\n Returns a reference to <code>this</code> so multiple operations can be appended together.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer appendShort(
    final @TypeInfo("ceylon.language::Integer") @Name("s")  long s) {
    short arg_0 = (short)s;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.appendShort(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Appends the specified <code>short</code> to the end of the Buffer in the Little Endian Byte Order.The buffer will expand as necessary to accommodate any bytes written.<p>\n Returns a reference to <code>this</code> so multiple operations can be appended together.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer appendShortLE(
    final @TypeInfo("ceylon.language::Integer") @Name("s")  long s) {
    short arg_0 = (short)s;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.appendShortLE(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Appends the specified unsigned <code>short</code> to the end of the Buffer.The buffer will expand as necessary to accommodate any bytes written.<p>\n Returns a reference to <code>this</code> so multiple operations can be appended together.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer appendUnsignedShort(
    final @TypeInfo("ceylon.language::Integer") @Name("s")  long s) {
    int arg_0 = (int)s;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.appendUnsignedShort(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Appends the specified unsigned <code>short</code> to the end of the Buffer in the Little Endian Byte Order.The buffer will expand as necessary to accommodate any bytes written.<p>\n Returns a reference to <code>this</code> so multiple operations can be appended together.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer appendUnsignedShortLE(
    final @TypeInfo("ceylon.language::Integer") @Name("s")  long s) {
    int arg_0 = (int)s;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.appendUnsignedShortLE(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Appends the specified <code>float</code> to the end of the Buffer. The buffer will expand as necessary to accommodate any bytes written.<p>\n Returns a reference to <code>this</code> so multiple operations can be appended together.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer appendFloat(
    final @TypeInfo("ceylon.language::Float") @Name("f")  double f) {
    float arg_0 = (float)f;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.appendFloat(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Appends the specified <code>double</code> to the end of the Buffer. The buffer will expand as necessary to accommodate any bytes written.<p>\n Returns a reference to <code>this</code> so multiple operations can be appended together.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer appendDouble(
    final @TypeInfo("ceylon.language::Float") @Name("d")  double d) {
    double arg_0 = d;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.appendDouble(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Appends the specified <code>String</code> to the end of the Buffer with the encoding as specified by <code>enc</code>.<p>\n The buffer will expand as necessary to accommodate any bytes written.<p>\n Returns a reference to <code>this</code> so multiple operations can be appended together.<p>\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer appendString(
    final @TypeInfo("ceylon.language::String") @Name("str")  ceylon.language.String str, 
    final @TypeInfo("ceylon.language::String") @Name("enc")  ceylon.language.String enc) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(str);
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(enc);
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.appendString(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Appends the specified <code>String str</code> to the end of the Buffer with UTF-8 encoding.<p>\n The buffer will expand as necessary to accommodate any bytes written.<p>\n Returns a reference to <code>this</code> so multiple operations can be appended together<p>\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer appendString(
    final @TypeInfo("ceylon.language::String") @Name("str")  ceylon.language.String str) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(str);
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.appendString(arg_0));
    return this;
  }

  @DocAnnotation$annotation$(description = " Sets the <code>byte</code> at position <code>pos</code> in the Buffer to the value <code>b</code>.<p>\n The buffer will expand as necessary to accommodate any value written.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer setByte(
    final @TypeInfo("ceylon.language::Integer") @Name("pos")  long pos, 
    final @TypeInfo("ceylon.language::Byte") @Name("b")  byte b) {
    int arg_0 = (int)pos;
    byte arg_1 = b;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.setByte(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Sets the unsigned <code>byte</code> at position <code>pos</code> in the Buffer to the value <code>b</code>.<p>\n The buffer will expand as necessary to accommodate any value written.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer setUnsignedByte(
    final @TypeInfo("ceylon.language::Integer") @Name("pos")  long pos, 
    final @TypeInfo("ceylon.language::Integer") @Name("b")  long b) {
    int arg_0 = (int)pos;
    short arg_1 = (short)b;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.setUnsignedByte(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Sets the <code>int</code> at position <code>pos</code> in the Buffer to the value <code>i</code>.<p>\n The buffer will expand as necessary to accommodate any value written.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer setInt(
    final @TypeInfo("ceylon.language::Integer") @Name("pos")  long pos, 
    final @TypeInfo("ceylon.language::Integer") @Name("i")  long i) {
    int arg_0 = (int)pos;
    int arg_1 = (int)i;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.setInt(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Sets the <code>int</code> at position <code>pos</code> in the Buffer to the value <code>i</code> in the Little Endian Byte Order.<p>\n The buffer will expand as necessary to accommodate any value written.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer setIntLE(
    final @TypeInfo("ceylon.language::Integer") @Name("pos")  long pos, 
    final @TypeInfo("ceylon.language::Integer") @Name("i")  long i) {
    int arg_0 = (int)pos;
    int arg_1 = (int)i;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.setIntLE(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Sets the unsigned <code>int</code> at position <code>pos</code> in the Buffer to the value <code>i</code>.<p>\n The buffer will expand as necessary to accommodate any value written.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer setUnsignedInt(
    final @TypeInfo("ceylon.language::Integer") @Name("pos")  long pos, 
    final @TypeInfo("ceylon.language::Integer") @Name("i")  long i) {
    int arg_0 = (int)pos;
    long arg_1 = i;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.setUnsignedInt(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Sets the unsigned <code>int</code> at position <code>pos</code> in the Buffer to the value <code>i</code> in the Little Endian Byte Order.<p>\n The buffer will expand as necessary to accommodate any value written.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer setUnsignedIntLE(
    final @TypeInfo("ceylon.language::Integer") @Name("pos")  long pos, 
    final @TypeInfo("ceylon.language::Integer") @Name("i")  long i) {
    int arg_0 = (int)pos;
    long arg_1 = i;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.setUnsignedIntLE(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Sets the 24bit <code>int</code> at position <code>pos</code> in the Buffer to the value <code>i</code>.<p>\n The buffer will expand as necessary to accommodate any value written.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer setMedium(
    final @TypeInfo("ceylon.language::Integer") @Name("pos")  long pos, 
    final @TypeInfo("ceylon.language::Integer") @Name("i")  long i) {
    int arg_0 = (int)pos;
    int arg_1 = (int)i;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.setMedium(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Sets the 24bit <code>int</code> at position <code>pos</code> in the Buffer to the value <code>i</code>. in the Little Endian Byte Order<p>\n The buffer will expand as necessary to accommodate any value written.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer setMediumLE(
    final @TypeInfo("ceylon.language::Integer") @Name("pos")  long pos, 
    final @TypeInfo("ceylon.language::Integer") @Name("i")  long i) {
    int arg_0 = (int)pos;
    int arg_1 = (int)i;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.setMediumLE(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Sets the <code>long</code> at position <code>pos</code> in the Buffer to the value <code>l</code>.<p>\n The buffer will expand as necessary to accommodate any value written.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer setLong(
    final @TypeInfo("ceylon.language::Integer") @Name("pos")  long pos, 
    final @TypeInfo("ceylon.language::Integer") @Name("l")  long l) {
    int arg_0 = (int)pos;
    long arg_1 = l;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.setLong(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Sets the <code>long</code> at position <code>pos</code> in the Buffer to the value <code>l</code> in the Little Endian Byte Order.<p>\n The buffer will expand as necessary to accommodate any value written.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer setLongLE(
    final @TypeInfo("ceylon.language::Integer") @Name("pos")  long pos, 
    final @TypeInfo("ceylon.language::Integer") @Name("l")  long l) {
    int arg_0 = (int)pos;
    long arg_1 = l;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.setLongLE(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Sets the <code>double</code> at position <code>pos</code> in the Buffer to the value <code>d</code>.<p>\n The buffer will expand as necessary to accommodate any value written.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer setDouble(
    final @TypeInfo("ceylon.language::Integer") @Name("pos")  long pos, 
    final @TypeInfo("ceylon.language::Float") @Name("d")  double d) {
    int arg_0 = (int)pos;
    double arg_1 = d;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.setDouble(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Sets the <code>float</code> at position <code>pos</code> in the Buffer to the value <code>f</code>.<p>\n The buffer will expand as necessary to accommodate any value written.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer setFloat(
    final @TypeInfo("ceylon.language::Integer") @Name("pos")  long pos, 
    final @TypeInfo("ceylon.language::Float") @Name("f")  double f) {
    int arg_0 = (int)pos;
    float arg_1 = (float)f;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.setFloat(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Sets the <code>short</code> at position <code>pos</code> in the Buffer to the value <code>s</code>.<p>\n The buffer will expand as necessary to accommodate any value written.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer setShort(
    final @TypeInfo("ceylon.language::Integer") @Name("pos")  long pos, 
    final @TypeInfo("ceylon.language::Integer") @Name("s")  long s) {
    int arg_0 = (int)pos;
    short arg_1 = (short)s;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.setShort(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Sets the <code>short</code> at position <code>pos</code> in the Buffer to the value <code>s</code> in the Little Endian Byte Order.<p>\n The buffer will expand as necessary to accommodate any value written.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer setShortLE(
    final @TypeInfo("ceylon.language::Integer") @Name("pos")  long pos, 
    final @TypeInfo("ceylon.language::Integer") @Name("s")  long s) {
    int arg_0 = (int)pos;
    short arg_1 = (short)s;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.setShortLE(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Sets the unsigned <code>short</code> at position <code>pos</code> in the Buffer to the value <code>s</code>.<p>\n The buffer will expand as necessary to accommodate any value written.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer setUnsignedShort(
    final @TypeInfo("ceylon.language::Integer") @Name("pos")  long pos, 
    final @TypeInfo("ceylon.language::Integer") @Name("s")  long s) {
    int arg_0 = (int)pos;
    int arg_1 = (int)s;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.setUnsignedShort(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Sets the unsigned <code>short</code> at position <code>pos</code> in the Buffer to the value <code>s</code> in the Little Endian Byte Order.<p>\n The buffer will expand as necessary to accommodate any value written.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer setUnsignedShortLE(
    final @TypeInfo("ceylon.language::Integer") @Name("pos")  long pos, 
    final @TypeInfo("ceylon.language::Integer") @Name("s")  long s) {
    int arg_0 = (int)pos;
    int arg_1 = (int)s;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.setUnsignedShortLE(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Sets the bytes at position <code>pos</code> in the Buffer to the bytes represented by the <code>Buffer b</code>.<p>\n The buffer will expand as necessary to accommodate any value written.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer setBuffer(
    final @TypeInfo("ceylon.language::Integer") @Name("pos")  long pos, 
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("b")  Buffer b) {
    int arg_0 = (int)pos;
    io.vertx.core.buffer.Buffer arg_1 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(b);
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.setBuffer(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Sets the bytes at position <code>pos</code> in the Buffer to the bytes represented by the <code>Buffer b</code> on the given <code>offset</code> and <code>len</code>.<p>\n The buffer will expand as necessary to accommodate any value written.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer setBuffer(
    final @TypeInfo("ceylon.language::Integer") @Name("pos")  long pos, 
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("b")  Buffer b, 
    final @TypeInfo("ceylon.language::Integer") @Name("offset")  long offset, 
    final @TypeInfo("ceylon.language::Integer") @Name("len")  long len) {
    int arg_0 = (int)pos;
    io.vertx.core.buffer.Buffer arg_1 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(b);
    int arg_2 = (int)offset;
    int arg_3 = (int)len;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.setBuffer(arg_0, arg_1, arg_2, arg_3));
    return this;
  }

  @DocAnnotation$annotation$(description = " Sets the bytes at position <code>pos</code> in the Buffer to the value of <code>str</code> encoded in UTF-8.<p>\n The buffer will expand as necessary to accommodate any value written.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer setString(
    final @TypeInfo("ceylon.language::Integer") @Name("pos")  long pos, 
    final @TypeInfo("ceylon.language::String") @Name("str")  ceylon.language.String str) {
    int arg_0 = (int)pos;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(str);
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.setString(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Sets the bytes at position <code>pos</code> in the Buffer to the value of <code>str</code> encoded in encoding <code>enc</code>.<p>\n The buffer will expand as necessary to accommodate any value written.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer setString(
    final @TypeInfo("ceylon.language::Integer") @Name("pos")  long pos, 
    final @TypeInfo("ceylon.language::String") @Name("str")  ceylon.language.String str, 
    final @TypeInfo("ceylon.language::String") @Name("enc")  ceylon.language.String enc) {
    int arg_0 = (int)pos;
    java.lang.String arg_1 = io.vertx.lang.ceylon.ToJava.String.safeConvert(str);
    java.lang.String arg_2 = io.vertx.lang.ceylon.ToJava.String.safeConvert(enc);
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.setString(arg_0, arg_1, arg_2));
    return this;
  }

  @DocAnnotation$annotation$(description = " Returns the length of the buffer, measured in bytes.\n All positions are indexed from zero.\n")
  @TypeInfo("ceylon.language::Integer")
  public long length() {
    long ret = delegate.length();
    return ret;
  }

  @DocAnnotation$annotation$(description = " Returns a copy of the entire Buffer.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer copy() {
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.copy());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Returns a slice of this buffer. Modifying the content\n of the returned buffer or this buffer affects each other's content\n while they maintain separate indexes and marks.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer slice() {
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.slice());
    return ret;
  }

  @DocAnnotation$annotation$(description = " Returns a slice of this buffer. Modifying the content\n of the returned buffer or this buffer affects each other's content\n while they maintain separate indexes and marks.\n")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer slice(
    final @TypeInfo("ceylon.language::Integer") @Name("start")  long start, 
    final @TypeInfo("ceylon.language::Integer") @Name("end")  long end) {
    int arg_0 = (int)start;
    int arg_1 = (int)end;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.slice(arg_0, arg_1));
    return ret;
  }

}
