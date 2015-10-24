package io.vertx.ceylon.core.net;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.metadata.Name;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;

@DocAnnotation$annotation$(description = "todo")
public class SocketAddress {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(SocketAddress.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.net.SocketAddress, SocketAddress> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.net.SocketAddress, SocketAddress>() {
    public SocketAddress convert(io.vertx.core.net.SocketAddress src) {
      return new SocketAddress(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<SocketAddress, io.vertx.core.net.SocketAddress> TO_JAVA = new io.vertx.lang.ceylon.Converter<SocketAddress, io.vertx.core.net.SocketAddress>() {
    public io.vertx.core.net.SocketAddress convert(SocketAddress src) {
      return src.delegate;
    }
  };

  @Ignore private final io.vertx.core.net.SocketAddress delegate;

  public SocketAddress(io.vertx.core.net.SocketAddress delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String host() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.host());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long port() {
    long ret = delegate.port();
    return ret;
  }

}
