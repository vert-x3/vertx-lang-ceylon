package io.vertx.ceylon.core.dns;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;

@DocAnnotation$annotation$(description = "todo")
public class SrvRecord {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(SrvRecord.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.dns.SrvRecord, SrvRecord> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.dns.SrvRecord, SrvRecord>() {
    public SrvRecord convert(io.vertx.core.dns.SrvRecord src) {
      return new SrvRecord(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<SrvRecord, io.vertx.core.dns.SrvRecord> TO_JAVA = new io.vertx.lang.ceylon.Converter<SrvRecord, io.vertx.core.dns.SrvRecord>() {
    public io.vertx.core.dns.SrvRecord convert(SrvRecord src) {
      return src.delegate;
    }
  };

  @Ignore private final io.vertx.core.dns.SrvRecord delegate;

  public SrvRecord(io.vertx.core.dns.SrvRecord delegate) {
    this.delegate = delegate;
  }

  @Ignore
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
  @TypeInfo("ceylon.language::Integer")
  public long weight() {
    long ret = delegate.weight();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::Integer")
  public long port() {
    long ret = delegate.port();
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String name() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.convert(delegate.name());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String protocol() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.convert(delegate.protocol());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String service() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.convert(delegate.service());
    return ret;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String target() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.convert(delegate.target());
    return ret;
  }

}
