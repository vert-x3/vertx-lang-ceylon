package io.vertx.ceylon.core.buffer;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import io.vertx.core.shareddata.impl.ClusterSerializable;

@DocAnnotation$annotation$(description = "todo")
public class Buffer {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(Buffer.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.buffer.Buffer, Buffer> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.buffer.Buffer, Buffer>() {
    public Buffer convert(io.vertx.core.buffer.Buffer src) {
      return new Buffer(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<Buffer, io.vertx.core.buffer.Buffer> TO_JAVA = new io.vertx.lang.ceylon.Converter<Buffer, io.vertx.core.buffer.Buffer>() {
    public io.vertx.core.buffer.Buffer convert(Buffer src) {
      return src.delegate;
    }
  };

  @Ignore
  private final io.vertx.core.buffer.Buffer delegate;

  public Buffer(io.vertx.core.buffer.Buffer delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public static Buffer buffer() {
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(io.vertx.core.buffer.Buffer.buffer());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public static Buffer buffer(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long initialSizeHint) {
    int arg_0 = (int)initialSizeHint;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(io.vertx.core.buffer.Buffer.buffer(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public static Buffer buffer(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String string) {
    java.lang.String arg_0 = string.toString();
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(io.vertx.core.buffer.Buffer.buffer(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public static Buffer buffer(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String string, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String enc) {
    java.lang.String arg_0 = string.toString();
    java.lang.String arg_1 = enc.toString();
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(io.vertx.core.buffer.Buffer.buffer(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String toString(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String enc) {
    java.lang.String arg_0 = enc.toString();
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.convert(delegate.toString(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Byte")
  public byte getByte(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long pos) {
    int arg_0 = (int)pos;
    byte ret = delegate.getByte(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long getUnsignedByte(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long pos) {
    int arg_0 = (int)pos;
    long ret = delegate.getUnsignedByte(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long getInt(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long pos) {
    int arg_0 = (int)pos;
    long ret = delegate.getInt(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long getUnsignedInt(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long pos) {
    int arg_0 = (int)pos;
    long ret = delegate.getUnsignedInt(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long getLong(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long pos) {
    int arg_0 = (int)pos;
    long ret = delegate.getLong(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Float")
  public double getDouble(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long pos) {
    int arg_0 = (int)pos;
    double ret = delegate.getDouble(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Float")
  public double getFloat(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long pos) {
    int arg_0 = (int)pos;
    double ret = delegate.getFloat(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long getShort(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long pos) {
    int arg_0 = (int)pos;
    long ret = delegate.getShort(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long getUnsignedShort(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long pos) {
    int arg_0 = (int)pos;
    long ret = delegate.getUnsignedShort(arg_0);
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer getBuffer(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long start, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long end) {
    int arg_0 = (int)start;
    int arg_1 = (int)end;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(delegate.getBuffer(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String getString(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long start, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long end, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String enc) {
    int arg_0 = (int)start;
    int arg_1 = (int)end;
    java.lang.String arg_2 = enc.toString();
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.convert(delegate.getString(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String getString(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long start, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long end) {
    int arg_0 = (int)start;
    int arg_1 = (int)end;
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.convert(delegate.getString(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer appendBuffer(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @DocAnnotation$annotation$(description = "todo") Buffer buff) {
    io.vertx.core.buffer.Buffer arg_0 = (io.vertx.core.buffer.Buffer)buff.getDelegate();
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(delegate.appendBuffer(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer appendBuffer(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @DocAnnotation$annotation$(description = "todo") Buffer buff, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long offset, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long len) {
    io.vertx.core.buffer.Buffer arg_0 = (io.vertx.core.buffer.Buffer)buff.getDelegate();
    int arg_1 = (int)offset;
    int arg_2 = (int)len;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(delegate.appendBuffer(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer appendByte(
    final @TypeInfo("ceylon.language::Byte") @DocAnnotation$annotation$(description = "todo") byte b) {
    byte arg_0 = b;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(delegate.appendByte(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer appendUnsignedByte(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long b) {
    short arg_0 = (short)b;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(delegate.appendUnsignedByte(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer appendInt(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long i) {
    int arg_0 = (int)i;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(delegate.appendInt(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer appendUnsignedInt(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long i) {
    long arg_0 = i;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(delegate.appendUnsignedInt(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer appendLong(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long l) {
    long arg_0 = l;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(delegate.appendLong(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer appendShort(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long s) {
    short arg_0 = (short)s;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(delegate.appendShort(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer appendUnsignedShort(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long s) {
    int arg_0 = (int)s;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(delegate.appendUnsignedShort(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer appendFloat(
    final @TypeInfo("ceylon.language::Float") @DocAnnotation$annotation$(description = "todo") double f) {
    float arg_0 = (float)f;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(delegate.appendFloat(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer appendDouble(
    final @TypeInfo("ceylon.language::Float") @DocAnnotation$annotation$(description = "todo") double d) {
    double arg_0 = d;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(delegate.appendDouble(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer appendString(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String str, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String enc) {
    java.lang.String arg_0 = str.toString();
    java.lang.String arg_1 = enc.toString();
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(delegate.appendString(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer appendString(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String str) {
    java.lang.String arg_0 = str.toString();
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(delegate.appendString(arg_0));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer setByte(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long pos, 
    final @TypeInfo("ceylon.language::Byte") @DocAnnotation$annotation$(description = "todo") byte b) {
    int arg_0 = (int)pos;
    byte arg_1 = b;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(delegate.setByte(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer setUnsignedByte(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long pos, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long b) {
    int arg_0 = (int)pos;
    short arg_1 = (short)b;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(delegate.setUnsignedByte(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer setInt(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long pos, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long i) {
    int arg_0 = (int)pos;
    int arg_1 = (int)i;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(delegate.setInt(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer setUnsignedInt(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long pos, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long i) {
    int arg_0 = (int)pos;
    long arg_1 = i;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(delegate.setUnsignedInt(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer setLong(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long pos, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long l) {
    int arg_0 = (int)pos;
    long arg_1 = l;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(delegate.setLong(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer setDouble(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long pos, 
    final @TypeInfo("ceylon.language::Float") @DocAnnotation$annotation$(description = "todo") double d) {
    int arg_0 = (int)pos;
    double arg_1 = d;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(delegate.setDouble(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer setFloat(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long pos, 
    final @TypeInfo("ceylon.language::Float") @DocAnnotation$annotation$(description = "todo") double f) {
    int arg_0 = (int)pos;
    float arg_1 = (float)f;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(delegate.setFloat(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer setShort(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long pos, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long s) {
    int arg_0 = (int)pos;
    short arg_1 = (short)s;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(delegate.setShort(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer setUnsignedShort(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long pos, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long s) {
    int arg_0 = (int)pos;
    int arg_1 = (int)s;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(delegate.setUnsignedShort(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer setBuffer(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long pos, 
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @DocAnnotation$annotation$(description = "todo") Buffer b) {
    int arg_0 = (int)pos;
    io.vertx.core.buffer.Buffer arg_1 = (io.vertx.core.buffer.Buffer)b.getDelegate();
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(delegate.setBuffer(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer setBuffer(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long pos, 
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @DocAnnotation$annotation$(description = "todo") Buffer b, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long offset, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long len) {
    int arg_0 = (int)pos;
    io.vertx.core.buffer.Buffer arg_1 = (io.vertx.core.buffer.Buffer)b.getDelegate();
    int arg_2 = (int)offset;
    int arg_3 = (int)len;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(delegate.setBuffer(arg_0, arg_1, arg_2, arg_3));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer setString(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long pos, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String str) {
    int arg_0 = (int)pos;
    java.lang.String arg_1 = str.toString();
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(delegate.setString(arg_0, arg_1));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer setString(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long pos, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String str, 
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String enc) {
    int arg_0 = (int)pos;
    java.lang.String arg_1 = str.toString();
    java.lang.String arg_2 = enc.toString();
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(delegate.setString(arg_0, arg_1, arg_2));
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long length() {
    long ret = delegate.length();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer copy() {
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(delegate.copy());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer slice() {
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(delegate.slice());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer slice(
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long start, 
    final @TypeInfo("ceylon.language::Integer") @DocAnnotation$annotation$(description = "todo") long end) {
    int arg_0 = (int)start;
    int arg_1 = (int)end;
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.convert(delegate.slice(arg_0, arg_1));
    return ret;
  }

}
