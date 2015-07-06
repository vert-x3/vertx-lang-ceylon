import java.lang {
  String_=String
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.dns {
  DnsClient_=DnsClient
}
import io.vertx.ceylon.core.dns {
  MxRecord,
  SrvRecord
}
/* Generated from io.vertx.core.dns.DnsClient */
shared abstract class DnsClient(DnsClient_ delegate) satisfies Delegating {

  DnsClient lookup_impl([String,Anything(Throwable|String)] args) {
    throw Exception("implement me");
  }

  shared  DnsClient(*<[String,Anything(Throwable|String)]>) lookup = flatten(lookup_impl);

  DnsClient lookup4_impl([String,Anything(Throwable|String)] args) {
    throw Exception("implement me");
  }

  shared  DnsClient(*<[String,Anything(Throwable|String)]>) lookup4 = flatten(lookup4_impl);

  DnsClient lookup6_impl([String,Anything(Throwable|String)] args) {
    throw Exception("implement me");
  }

  shared  DnsClient(*<[String,Anything(Throwable|String)]>) lookup6 = flatten(lookup6_impl);

  DnsClient resolveA_impl([String,Anything(Throwable|List<String>)] args) {
    throw Exception("implement me");
  }

  shared  DnsClient(*<[String,Anything(Throwable|List<String>)]>) resolveA = flatten(resolveA_impl);

  DnsClient resolveAAAA_impl([String,Anything(Throwable|List<String>)] args) {
    throw Exception("implement me");
  }

  shared  DnsClient(*<[String,Anything(Throwable|List<String>)]>) resolveAAAA = flatten(resolveAAAA_impl);

  DnsClient resolveCNAME_impl([String,Anything(Throwable|List<String>)] args) {
    throw Exception("implement me");
  }

  shared  DnsClient(*<[String,Anything(Throwable|List<String>)]>) resolveCNAME = flatten(resolveCNAME_impl);

  DnsClient resolveMX_impl([String,Anything(Throwable|List<MxRecord>)] args) {
    throw Exception("implement me");
  }

  shared  DnsClient(*<[String,Anything(Throwable|List<MxRecord>)]>) resolveMX = flatten(resolveMX_impl);

  DnsClient resolveTXT_impl([String,Anything(Throwable|List<String>)] args) {
    throw Exception("implement me");
  }

  shared  DnsClient(*<[String,Anything(Throwable|List<String>)]>) resolveTXT = flatten(resolveTXT_impl);

  DnsClient resolvePTR_impl([String,Anything(Throwable|String)] args) {
    throw Exception("implement me");
  }

  shared  DnsClient(*<[String,Anything(Throwable|String)]>) resolvePTR = flatten(resolvePTR_impl);

  DnsClient resolveNS_impl([String,Anything(Throwable|List<String>)] args) {
    throw Exception("implement me");
  }

  shared  DnsClient(*<[String,Anything(Throwable|List<String>)]>) resolveNS = flatten(resolveNS_impl);

  DnsClient resolveSRV_impl([String,Anything(Throwable|List<SrvRecord>)] args) {
    throw Exception("implement me");
  }

  shared  DnsClient(*<[String,Anything(Throwable|List<SrvRecord>)]>) resolveSRV = flatten(resolveSRV_impl);

  DnsClient reverseLookup_impl([String,Anything(Throwable|String)] args) {
    throw Exception("implement me");
  }

  shared  DnsClient(*<[String,Anything(Throwable|String)]>) reverseLookup = flatten(reverseLookup_impl);

}
