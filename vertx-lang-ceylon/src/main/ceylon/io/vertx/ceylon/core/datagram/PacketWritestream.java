package io.vertx.ceylon.core.datagram;

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
import io.vertx.ceylon.core.streams.WriteStream;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " A [WriteStream](../streams/WriteStream.type.html) for sending packets to a [SocketAddress](../net/SocketAddress.type.html).\n The stream  is called when the write fails.\n")
public class PacketWritestream implements ReifiedType,  WriteStream<Buffer> {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.datagram.PacketWritestream, PacketWritestream> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.datagram.PacketWritestream, PacketWritestream>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.datagram.PacketWritestream, PacketWritestream> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.datagram.PacketWritestream, PacketWritestream>() {
        public PacketWritestream convert(io.vertx.core.datagram.PacketWritestream src) {
          return new PacketWritestream(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<PacketWritestream, io.vertx.core.datagram.PacketWritestream> TO_JAVA = new io.vertx.lang.ceylon.Converter<PacketWritestream, io.vertx.core.datagram.PacketWritestream>() {
    public io.vertx.core.datagram.PacketWritestream convert(PacketWritestream src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(PacketWritestream.class);
  @Ignore private final io.vertx.core.datagram.PacketWritestream delegate;

  public PacketWritestream(io.vertx.core.datagram.PacketWritestream delegate) {
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

  @DocAnnotation$annotation$(description = " This will return <code>true</code> if there are more bytes in the write queue than the value set using [PacketWritestream](../datagram/PacketWritestream.type.html)\n")
  @TypeInfo("ceylon.language::Boolean")
  public boolean writeQueueFull() {
    boolean ret = delegate.writeQueueFull();
    return ret;
  }

  @TypeInfo("io.vertx.ceylon.core.datagram::PacketWritestream")
  public PacketWritestream exceptionHandler(
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable)?") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Throwable> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Throwable>() {
      public void handle(java.lang.Throwable event) {
        handler.$call$((Object)event);
      }
    };
    PacketWritestream ret = io.vertx.ceylon.core.datagram.PacketWritestream.TO_CEYLON.converter().safeConvert(delegate.exceptionHandler(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.datagram::PacketWritestream")
  public PacketWritestream write(
    final @TypeInfo("io.vertx.ceylon.core.buffer::Buffer") @Name("data") @DocAnnotation$annotation$(description = "todo") Buffer data) {
    io.vertx.core.buffer.Buffer arg_0 = io.vertx.ceylon.core.buffer.Buffer.TO_JAVA.safeConvert(data);
    PacketWritestream ret = io.vertx.ceylon.core.datagram.PacketWritestream.TO_CEYLON.converter().safeConvert(delegate.write(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.datagram::PacketWritestream")
  public PacketWritestream setWriteQueueMaxSize(
    final @TypeInfo("ceylon.language::Integer") @Name("maxSize") @DocAnnotation$annotation$(description = "todo") long maxSize) {
    int arg_0 = (int)maxSize;
    PacketWritestream ret = io.vertx.ceylon.core.datagram.PacketWritestream.TO_CEYLON.converter().safeConvert(delegate.setWriteQueueMaxSize(arg_0));
    return this;
  }

  @TypeInfo("io.vertx.ceylon.core.datagram::PacketWritestream")
  public PacketWritestream drainHandler(
    final @TypeInfo("ceylon.language::Anything()?") @Name("handler") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    io.vertx.core.Handler<java.lang.Void> arg_0 = handler == null ? null : new io.vertx.core.Handler<java.lang.Void>() {
      public void handle(java.lang.Void event) {
        handler.$call$();
      }
    };
    PacketWritestream ret = io.vertx.ceylon.core.datagram.PacketWritestream.TO_CEYLON.converter().safeConvert(delegate.drainHandler(arg_0));
    return this;
  }

}
