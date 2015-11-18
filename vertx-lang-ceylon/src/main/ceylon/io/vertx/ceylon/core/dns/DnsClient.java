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
import java.util.List;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@Ceylon(major = 8)
@DocAnnotation$annotation$(description = " Provides a way to asynchronously lookup information from DNS servers.\n <p>\n Please consult the documentation for more information on DNS clients.\n")
public class DnsClient implements ReifiedType {

  @Ignore
  public static final io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.dns.DnsClient, DnsClient> TO_CEYLON = new io.vertx.lang.ceylon.ConverterFactory<io.vertx.core.dns.DnsClient, DnsClient>() {
    public io.vertx.lang.ceylon.Converter<io.vertx.core.dns.DnsClient, DnsClient> converter(final TypeDescriptor... descriptors) {
      return new io.vertx.lang.ceylon.Converter<io.vertx.core.dns.DnsClient, DnsClient>() {
        public DnsClient convert(io.vertx.core.dns.DnsClient src) {
          return new DnsClient(src);
        }
      };
    }
  };

  @Ignore
  public static final io.vertx.lang.ceylon.Converter<DnsClient, io.vertx.core.dns.DnsClient> TO_JAVA = new io.vertx.lang.ceylon.Converter<DnsClient, io.vertx.core.dns.DnsClient>() {
    public io.vertx.core.dns.DnsClient convert(DnsClient src) {
      return src.delegate;
    }
  };

  @Ignore public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(DnsClient.class);
  @Ignore private final io.vertx.core.dns.DnsClient delegate;

  public DnsClient(io.vertx.core.dns.DnsClient delegate) {
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

  @DocAnnotation$annotation$(description = " Try to lookup the A (ipv4) or AAAA (ipv6) record for the given name. The first found will be used.\n")
  @TypeInfo("io.vertx.ceylon.core.dns::DnsClient")
  public DnsClient lookup(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "the name to resolve\n") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::String?)") @Name("handler") @DocAnnotation$annotation$(description = "the `io.vertx.core.Handler` to notify with the `io.vertx.core.AsyncResult`. The handler will get notified with the resolved address if a record was found. If non was found it will get notifed with <code>null</code>. If an error accours it will get failed.\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.String>(handler) {
      public Object toCeylon(java.lang.String event) {
        return io.vertx.lang.ceylon.ToCeylon.String.safeConvert(event);
      }
    };
    DnsClient ret = io.vertx.ceylon.core.dns.DnsClient.TO_CEYLON.converter().safeConvert(delegate.lookup(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Try to lookup the A (ipv4) record for the given name. The first found will be used.\n")
  @TypeInfo("io.vertx.ceylon.core.dns::DnsClient")
  public DnsClient lookup4(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "the name to resolve\n") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::String?)") @Name("handler") @DocAnnotation$annotation$(description = "the  to notify with the `io.vertx.core.AsyncResult`. The handler will get notified with the resolved `java.net.Inet4Address` if a record was found. If non was found it will get notifed with <code>null</code>. If an error accours it will get failed.\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.String>(handler) {
      public Object toCeylon(java.lang.String event) {
        return io.vertx.lang.ceylon.ToCeylon.String.safeConvert(event);
      }
    };
    DnsClient ret = io.vertx.ceylon.core.dns.DnsClient.TO_CEYLON.converter().safeConvert(delegate.lookup4(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Try to lookup the AAAA (ipv6) record for the given name. The first found will be used.\n")
  @TypeInfo("io.vertx.ceylon.core.dns::DnsClient")
  public DnsClient lookup6(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "the name to resolve\n") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::String?)") @Name("handler") @DocAnnotation$annotation$(description = "the  to notify with the . The handler will get notified with the resolved `java.net.Inet6Address` if a record was found. If non was found it will get notifed with <code>null</code>. If an error accours it will get failed.\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.String>(handler) {
      public Object toCeylon(java.lang.String event) {
        return io.vertx.lang.ceylon.ToCeylon.String.safeConvert(event);
      }
    };
    DnsClient ret = io.vertx.ceylon.core.dns.DnsClient.TO_CEYLON.converter().safeConvert(delegate.lookup6(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Try to resolve all A (ipv4) records for the given name.\n")
  @TypeInfo("io.vertx.ceylon.core.dns::DnsClient")
  public DnsClient resolveA(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "the name to resolve\n") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::String>)") @Name("handler") @DocAnnotation$annotation$(description = "the `io.vertx.core.Handler` to notify with the `io.vertx.core.AsyncResult`. The handler will get notified with a `java.util.List` that contains all the resolved `java.net.Inet4Address`es. If none was found an empty `java.util.List` will be used. If an error accours it will get failed.\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<java.lang.String>>(handler) {
      public Object toCeylon(java.util.List<java.lang.String> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String);
      }
    };
    DnsClient ret = io.vertx.ceylon.core.dns.DnsClient.TO_CEYLON.converter().safeConvert(delegate.resolveA(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Try to resolve all AAAA (ipv6) records for the given name.\n")
  @TypeInfo("io.vertx.ceylon.core.dns::DnsClient")
  public DnsClient resolveAAAA(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "the name to resolve\n") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::String>)") @Name("handler") @DocAnnotation$annotation$(description = "the `io.vertx.core.Handler` to notify with the `io.vertx.core.AsyncResult`. The handler will get notified with a `java.util.List` that contains all the resolved `java.net.Inet6Address`es. If none was found an empty `java.util.List` will be used. If an error accours it will get failed.\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<java.lang.String>>(handler) {
      public Object toCeylon(java.util.List<java.lang.String> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String);
      }
    };
    DnsClient ret = io.vertx.ceylon.core.dns.DnsClient.TO_CEYLON.converter().safeConvert(delegate.resolveAAAA(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Try to resolve the CNAME record for the given name.\n")
  @TypeInfo("io.vertx.ceylon.core.dns::DnsClient")
  public DnsClient resolveCNAME(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "the name to resolve the CNAME for\n") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::String>)") @Name("handler") @DocAnnotation$annotation$(description = "the  to notify with the . The handler will get notified with the resolved `java.lang.String` if a record was found. If none was found it will get notified with <code>null</code>. If an error accours it will get failed.\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<java.lang.String>>(handler) {
      public Object toCeylon(java.util.List<java.lang.String> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String);
      }
    };
    DnsClient ret = io.vertx.ceylon.core.dns.DnsClient.TO_CEYLON.converter().safeConvert(delegate.resolveCNAME(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Try to resolve the MX records for the given name.\n")
  @TypeInfo("io.vertx.ceylon.core.dns::DnsClient")
  public DnsClient resolveMX(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "the name for which the MX records should be resolved\n") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<io.vertx.ceylon.core.dns::MxRecord>)") @Name("handler") @DocAnnotation$annotation$(description = "the `io.vertx.core.Handler` to notify with the `io.vertx.core.AsyncResult`. The handler will get notified with a List that contains all resolved [MxRecord](../dns/MxRecord.type.html)s, sorted by their [priority](../dns/MxRecord.type.html#priority). If non was found it will get notified with an empty `java.util.List`. If an error accours it will get failed.\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.dns.MxRecord>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.core.dns.MxRecord>>(handler) {
      public Object toCeylon(java.util.List<io.vertx.core.dns.MxRecord> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertList(io.vertx.ceylon.core.dns.MxRecord.$TypeDescriptor$, event, io.vertx.ceylon.core.dns.MxRecord.TO_CEYLON.converter());
      }
    };
    DnsClient ret = io.vertx.ceylon.core.dns.DnsClient.TO_CEYLON.converter().safeConvert(delegate.resolveMX(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Try to resolve the TXT records for the given name.\n")
  @TypeInfo("io.vertx.ceylon.core.dns::DnsClient")
  public DnsClient resolveTXT(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "the name for which the TXT records should be resolved\n") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::String>)") @Name("handler") @DocAnnotation$annotation$(description = "the  to notify with the . The handler will get notified with a List that contains all resolved `java.lang.String`s. If none was found it will get notified with an empty `java.util.List`. If an error accours it will get failed.\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<java.lang.String>>(handler) {
      public Object toCeylon(java.util.List<java.lang.String> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String);
      }
    };
    DnsClient ret = io.vertx.ceylon.core.dns.DnsClient.TO_CEYLON.converter().safeConvert(delegate.resolveTXT(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Try to resolve the PTR record for the given name.\n")
  @TypeInfo("io.vertx.ceylon.core.dns::DnsClient")
  public DnsClient resolvePTR(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "the name to resolve the PTR for\n") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::String?)") @Name("handler") @DocAnnotation$annotation$(description = "the  to notify with the . The handler will get notified with the resolved `java.lang.String` if a record was found. If none was found it will get notified with <code>null</code>. If an error accours it will get failed.\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.String>(handler) {
      public Object toCeylon(java.lang.String event) {
        return io.vertx.lang.ceylon.ToCeylon.String.safeConvert(event);
      }
    };
    DnsClient ret = io.vertx.ceylon.core.dns.DnsClient.TO_CEYLON.converter().safeConvert(delegate.resolvePTR(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Try to resolve the NS records for the given name.\n")
  @TypeInfo("io.vertx.ceylon.core.dns::DnsClient")
  public DnsClient resolveNS(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "the name for which the NS records should be resolved\n") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::String>)") @Name("handler") @DocAnnotation$annotation$(description = "the  to notify with the . The handler will get notified with a List that contains all resolved `java.lang.String`s. If none was found it will get notified with an empty `java.util.List`. If an error accours it will get failed.\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<java.lang.String>>(handler) {
      public Object toCeylon(java.util.List<java.lang.String> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertList(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String);
      }
    };
    DnsClient ret = io.vertx.ceylon.core.dns.DnsClient.TO_CEYLON.converter().safeConvert(delegate.resolveNS(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Try to resolve the SRV records for the given name.\n")
  @TypeInfo("io.vertx.ceylon.core.dns::DnsClient")
  public DnsClient resolveSRV(
    final @TypeInfo("ceylon.language::String") @Name("name") @DocAnnotation$annotation$(description = "the name for which the SRV records should be resolved\n") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<io.vertx.ceylon.core.dns::SrvRecord>)") @Name("handler") @DocAnnotation$annotation$(description = "the  to notify with the . The handler will get notified with a List that contains all resolved [SrvRecord](../dns/SrvRecord.type.html)s. If none was found it will get notified with an empty `java.util.List`. If an error accours it will get failed.\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(name);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.dns.SrvRecord>>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.core.dns.SrvRecord>>(handler) {
      public Object toCeylon(java.util.List<io.vertx.core.dns.SrvRecord> event) {
        return io.vertx.lang.ceylon.ToCeylon.convertList(io.vertx.ceylon.core.dns.SrvRecord.$TypeDescriptor$, event, io.vertx.ceylon.core.dns.SrvRecord.TO_CEYLON.converter());
      }
    };
    DnsClient ret = io.vertx.ceylon.core.dns.DnsClient.TO_CEYLON.converter().safeConvert(delegate.resolveSRV(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = " Try to do a reverse lookup of an IP address. This is basically the same as doing trying to resolve a PTR record\n but allows you to just pass in the IP address and not a valid ptr query string.\n")
  @TypeInfo("io.vertx.ceylon.core.dns::DnsClient")
  public DnsClient reverseLookup(
    final @TypeInfo("ceylon.language::String") @Name("ipaddress") @DocAnnotation$annotation$(description = "the IP address to resolve the PTR for\n") ceylon.language.String ipaddress, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::String?)") @Name("handler") @DocAnnotation$annotation$(description = "the  to notify with the . The handler will get notified with the resolved `java.lang.String` if a record was found. If none was found it will get notified with <code>null</code>. If an error accours it will get failed.\n") Callable<?> handler) {
    java.lang.String arg_0 = io.vertx.lang.ceylon.ToJava.String.safeConvert(ipaddress);
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> arg_1 = handler == null ? null : new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.String>(handler) {
      public Object toCeylon(java.lang.String event) {
        return io.vertx.lang.ceylon.ToCeylon.String.safeConvert(event);
      }
    };
    DnsClient ret = io.vertx.ceylon.core.dns.DnsClient.TO_CEYLON.converter().safeConvert(delegate.reverseLookup(arg_0, arg_1));
    return this;
  }

}
