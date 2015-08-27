package io.vertx.ceylon.core.dns;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;

@DocAnnotation$annotation$(description = "todo")
public class MxRecord {

  private final io.vertx.core.dns.MxRecord delegate;

  public MxRecord(io.vertx.core.dns.MxRecord delegate) {
    this.delegate = delegate;
  }

  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long priority() {
    long ret = delegate.priority();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String name() {
    ceylon.language.String ret = new ceylon.language.String(delegate.name());
    return ret;
  }

}
