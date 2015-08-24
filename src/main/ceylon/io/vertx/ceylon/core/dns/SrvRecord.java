package io.vertx.ceylon.core.dns;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;

public class SrvRecord {

  private final io.vertx.core.dns.SrvRecord delegate;

  public SrvRecord(io.vertx.core.dns.SrvRecord delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  @TypeInfo("ceylon.language::Integer")
  public long priority() {
    long ret = delegate.priority();
    return ret;
  }

  @TypeInfo("ceylon.language::Integer")
  public long weight() {
    long ret = delegate.weight();
    return ret;
  }

  @TypeInfo("ceylon.language::Integer")
  public long port() {
    long ret = delegate.port();
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String name() {
    ceylon.language.String ret = new ceylon.language.String(delegate.name());
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String protocol() {
    ceylon.language.String ret = new ceylon.language.String(delegate.protocol());
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String service() {
    ceylon.language.String ret = new ceylon.language.String(delegate.service());
    return ret;
  }

  @TypeInfo("ceylon.language::String")
  public ceylon.language.String target() {
    ceylon.language.String ret = new ceylon.language.String(delegate.target());
    return ret;
  }

}
