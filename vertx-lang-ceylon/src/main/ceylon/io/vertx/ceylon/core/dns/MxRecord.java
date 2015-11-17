package io.vertx.ceylon.core.dns;

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
@DocAnnotation$annotation$(description = " Represent a Mail-Exchange-Record (MX) which was resolved for a domain.\n")
public class MxRecord implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.dns.MxRecord, MxRecord> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.dns.MxRecord, MxRecord>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.dns.MxRecord, MxRecord> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.dns.MxRecord, MxRecord>() {
        public MxRecord convert(io.vertx.core.dns.MxRecord src) {
          return new MxRecord(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<MxRecord, io.vertx.core.dns.MxRecord> TO_JAVA = new io.vertx.lang.ceylon.Converter<MxRecord, io.vertx.core.dns.MxRecord>() {
    public io.vertx.core.dns.MxRecord convert(MxRecord src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(MxRecord.class);
  @Ignore private final io.vertx.core.dns.MxRecord delegate;

  public MxRecord(io.vertx.core.dns.MxRecord delegate) {
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

  @DocAnnotation$annotation$(description = " The priority of the MX record.\n")
  @TypeInfo("ceylon.language::Integer")
  public long priority() {
    long ret = delegate.priority();
    return ret;
  }

  @DocAnnotation$annotation$(description = " The name of the MX record\n")
  @TypeInfo("ceylon.language::String")
  public ceylon.language.String name() {
    ceylon.language.String ret = io.vertx.lang.ceylon.ToCeylon.String.safeConvert(delegate.name());
    return ret;
  }

}
