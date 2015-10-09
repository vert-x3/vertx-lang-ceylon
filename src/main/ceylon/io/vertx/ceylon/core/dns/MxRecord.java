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
public class MxRecord {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(MxRecord.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.dns.MxRecord, MxRecord> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.dns.MxRecord, MxRecord>() {
    public MxRecord convert(io.vertx.core.dns.MxRecord src) {
      return new MxRecord(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<MxRecord, io.vertx.core.dns.MxRecord> TO_JAVA = new io.vertx.lang.ceylon.Converter<MxRecord, io.vertx.core.dns.MxRecord>() {
    public io.vertx.core.dns.MxRecord convert(MxRecord src) {
      return src.delegate;
    }
  };

  @Ignore private final io.vertx.core.dns.MxRecord delegate;

  public MxRecord(io.vertx.core.dns.MxRecord delegate) {
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
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String name() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.name());
    return ret;
  }

}
