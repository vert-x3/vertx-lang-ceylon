package io.vertx.ceylon.core.dns;

import com.redhat.ceylon.compiler.java.metadata.TypeInfo;
import com.redhat.ceylon.compiler.java.metadata.TypeParameter;
import com.redhat.ceylon.compiler.java.metadata.TypeParameters;
import com.redhat.ceylon.compiler.java.metadata.Variance;
import com.redhat.ceylon.compiler.java.metadata.Ignore;
import com.redhat.ceylon.compiler.java.runtime.model.TypeDescriptor;
import ceylon.language.Callable;
import ceylon.language.DocAnnotation$annotation$;
import java.util.List;
import io.vertx.core.AsyncResult;
import io.vertx.core.Handler;

@DocAnnotation$annotation$(description = "todo")
public class DnsClient {

  public static final TypeDescriptor $TypeDescriptor$ = TypeDescriptor.klass(DnsClient.class);

  public static final io.vertx.lang.ceylon.Converter<io.vertx.core.dns.DnsClient, DnsClient> TO_CEYLON = new io.vertx.lang.ceylon.Converter<io.vertx.core.dns.DnsClient, DnsClient>() {
    public DnsClient convert(io.vertx.core.dns.DnsClient src) {
      return new DnsClient(src);
    }
  };

  public static final io.vertx.lang.ceylon.Converter<DnsClient, io.vertx.core.dns.DnsClient> TO_JAVA = new io.vertx.lang.ceylon.Converter<DnsClient, io.vertx.core.dns.DnsClient>() {
    public io.vertx.core.dns.DnsClient convert(DnsClient src) {
      return src.delegate;
    }
  };

  @Ignore
  private final io.vertx.core.dns.DnsClient delegate;

  public DnsClient(io.vertx.core.dns.DnsClient delegate) {
    this.delegate = delegate;
  }

  @Ignore
  public Object getDelegate() {
    return delegate;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.dns::DnsClient")
  public DnsClient lookup(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::String)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = name.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.String>(handler) { public Object toCeylon(java.lang.String event) { return io.vertx.lang.ceylon.ToCeylon.String.convert(event); } };
    DnsClient ret = io.vertx.ceylon.core.dns.DnsClient.TO_CEYLON.convert(delegate.lookup(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.dns::DnsClient")
  public DnsClient lookup4(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::String)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = name.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.String>(handler) { public Object toCeylon(java.lang.String event) { return io.vertx.lang.ceylon.ToCeylon.String.convert(event); } };
    DnsClient ret = io.vertx.ceylon.core.dns.DnsClient.TO_CEYLON.convert(delegate.lookup4(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.dns::DnsClient")
  public DnsClient lookup6(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::String)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = name.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.String>(handler) { public Object toCeylon(java.lang.String event) { return io.vertx.lang.ceylon.ToCeylon.String.convert(event); } };
    DnsClient ret = io.vertx.ceylon.core.dns.DnsClient.TO_CEYLON.convert(delegate.lookup6(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.dns::DnsClient")
  public DnsClient resolveA(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::String>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = name.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<java.lang.String>>(handler) { public Object toCeylon(java.util.List<java.lang.String> event) { return io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String); } };
    DnsClient ret = io.vertx.ceylon.core.dns.DnsClient.TO_CEYLON.convert(delegate.resolveA(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.dns::DnsClient")
  public DnsClient resolveAAAA(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::String>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = name.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<java.lang.String>>(handler) { public Object toCeylon(java.util.List<java.lang.String> event) { return io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String); } };
    DnsClient ret = io.vertx.ceylon.core.dns.DnsClient.TO_CEYLON.convert(delegate.resolveAAAA(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.dns::DnsClient")
  public DnsClient resolveCNAME(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::String>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = name.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<java.lang.String>>(handler) { public Object toCeylon(java.util.List<java.lang.String> event) { return io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String); } };
    DnsClient ret = io.vertx.ceylon.core.dns.DnsClient.TO_CEYLON.convert(delegate.resolveCNAME(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.dns::DnsClient")
  public DnsClient resolveMX(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<io.vertx.ceylon.core.dns::MxRecord>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = name.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.dns.MxRecord>>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.core.dns.MxRecord>>(handler) { public Object toCeylon(java.util.List<io.vertx.core.dns.MxRecord> event) { return io.vertx.lang.ceylon.ToCeylon.list(io.vertx.ceylon.core.dns.MxRecord.$TypeDescriptor$, event, io.vertx.ceylon.core.dns.MxRecord.TO_CEYLON); } };
    DnsClient ret = io.vertx.ceylon.core.dns.DnsClient.TO_CEYLON.convert(delegate.resolveMX(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.dns::DnsClient")
  public DnsClient resolveTXT(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::String>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = name.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<java.lang.String>>(handler) { public Object toCeylon(java.util.List<java.lang.String> event) { return io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String); } };
    DnsClient ret = io.vertx.ceylon.core.dns.DnsClient.TO_CEYLON.convert(delegate.resolveTXT(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.dns::DnsClient")
  public DnsClient resolvePTR(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::String)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = name.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.String>(handler) { public Object toCeylon(java.lang.String event) { return io.vertx.lang.ceylon.ToCeylon.String.convert(event); } };
    DnsClient ret = io.vertx.ceylon.core.dns.DnsClient.TO_CEYLON.convert(delegate.resolvePTR(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.dns::DnsClient")
  public DnsClient resolveNS(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<ceylon.language::String>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = name.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<java.lang.String>>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<java.lang.String>>(handler) { public Object toCeylon(java.util.List<java.lang.String> event) { return io.vertx.lang.ceylon.ToCeylon.list(ceylon.language.String.$TypeDescriptor$, event, io.vertx.lang.ceylon.ToCeylon.String); } };
    DnsClient ret = io.vertx.ceylon.core.dns.DnsClient.TO_CEYLON.convert(delegate.resolveNS(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.dns::DnsClient")
  public DnsClient resolveSRV(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String name, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::List<io.vertx.ceylon.core.dns::SrvRecord>)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = name.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.util.List<io.vertx.core.dns.SrvRecord>>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.util.List<io.vertx.core.dns.SrvRecord>>(handler) { public Object toCeylon(java.util.List<io.vertx.core.dns.SrvRecord> event) { return io.vertx.lang.ceylon.ToCeylon.list(io.vertx.ceylon.core.dns.SrvRecord.$TypeDescriptor$, event, io.vertx.ceylon.core.dns.SrvRecord.TO_CEYLON); } };
    DnsClient ret = io.vertx.ceylon.core.dns.DnsClient.TO_CEYLON.convert(delegate.resolveSRV(arg_0, arg_1));
    return this;
  }

  @DocAnnotation$annotation$(description = "todo")
  @TypeInfo("io.vertx.ceylon.core.dns::DnsClient")
  public DnsClient reverseLookup(
    final @TypeInfo("ceylon.language::String") @DocAnnotation$annotation$(description = "todo") ceylon.language.String ipaddress, 
    final @TypeInfo("ceylon.language::Anything(ceylon.language::Throwable|ceylon.language::String)") @DocAnnotation$annotation$(description = "todo") Callable<?> handler) {
    java.lang.String arg_0 = ipaddress.toString();
    io.vertx.core.Handler<io.vertx.core.AsyncResult<java.lang.String>> arg_1 = new io.vertx.lang.ceylon.AsyncResultAdapter<java.lang.String>(handler) { public Object toCeylon(java.lang.String event) { return io.vertx.lang.ceylon.ToCeylon.String.convert(event); } };
    DnsClient ret = io.vertx.ceylon.core.dns.DnsClient.TO_CEYLON.convert(delegate.reverseLookup(arg_0, arg_1));
    return this;
  }

}
