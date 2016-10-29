package io.vertx.ceylon.core.net;

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

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " The address of a socket\n")
public class SocketAddress implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.net.SocketAddress, SocketAddress> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.net.SocketAddress, SocketAddress>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.net.SocketAddress, SocketAddress> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.net.SocketAddress, SocketAddress>() {
        public SocketAddress convert(io.vertx.core.net.SocketAddress src) {
          return new SocketAddress(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<SocketAddress, io.vertx.core.net.SocketAddress> TO_JAVA = new io.vertx.lang.ceylon.Converter<SocketAddress, io.vertx.core.net.SocketAddress>() {
    public io.vertx.core.net.SocketAddress convert(SocketAddress src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = new io.vertx.lang.ceylon.VertxTypeDescriptor(TypeDescriptor.klass(SocketAddress.class), io.vertx.core.net.SocketAddress.class, TO_JAVA, TO_CEYLON);
  @Ignore private final io.vertx.core.net.SocketAddress delegate;

  public SocketAddress(io.vertx.core.net.SocketAddress delegate) {
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

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String host() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.host());
    return ret;
  }

  @TypeInfo("ceylon.language::Integer")
  public long port() {
    long ret = delegate.port();
    return ret;
  }

}
