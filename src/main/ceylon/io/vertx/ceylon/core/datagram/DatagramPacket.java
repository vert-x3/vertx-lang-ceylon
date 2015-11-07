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
import io.vertx.ceylon.core.net.SocketAddress;

@Ceylon(major = 8)@DocAnnotation$annotation$(description = "todo")
public class DatagramPacket implements ReifiedType {

  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.datagram.DatagramPacket, DatagramPacket> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.datagram.DatagramPacket, DatagramPacket>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.datagram.DatagramPacket, DatagramPacket> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.datagram.DatagramPacket, DatagramPacket>() {
        public DatagramPacket convert(io.vertx.core.datagram.DatagramPacket src) {
          return new DatagramPacket(src);
        }
      };
    }
  };

  public static final io.vertx.lang.ceylon.Converter<DatagramPacket, io.vertx.core.datagram.DatagramPacket> TO_JAVA = new io.vertx.lang.ceylon.Converter<DatagramPacket, io.vertx.core.datagram.DatagramPacket>() {
    public io.vertx.core.datagram.DatagramPacket convert(DatagramPacket src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(DatagramPacket.class);
  @Ignore private final io.vertx.core.datagram.DatagramPacket delegate;

  public DatagramPacket(io.vertx.core.datagram.DatagramPacket delegate) {
    this.delegate = delegate;
  }

  public TypeDescriptor $getType$() {
    return $TypeDescriptor$;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.net::SocketAddress")
  public SocketAddress sender() {
    SocketAddress ret = io.vertx.ceylon.core.net.SocketAddress.TO_CEYLON.converter().safeConvert(delegate.sender());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.buffer::Buffer")
  public Buffer data() {
    Buffer ret = io.vertx.ceylon.core.buffer.Buffer.TO_CEYLON.converter().safeConvert(delegate.data());
    return ret;
  }

}
