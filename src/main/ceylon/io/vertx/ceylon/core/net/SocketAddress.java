package io.vertx.ceylon.core.net;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;

public class SocketAddress {

  private final io.vertx.core.net.SocketAddress delegate;

  public SocketAddress(io.vertx.core.net.SocketAddress delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String host() {
    ceylon.language.String ret = new ceylon.language.String(delegate.host());
    return ret;
  }

  @TypeInfo("ceylon.language::Integer")
  public long port() {
    long ret = delegate.port();
    return ret;
  }

}
