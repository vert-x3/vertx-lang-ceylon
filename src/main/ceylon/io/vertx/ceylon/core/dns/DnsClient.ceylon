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

  shared  DnsClient(*<[String,Anything(Throwable|String)]>) lookup => flatten(lookup_impl);

  shared  DnsClient(*<[String,Anything(Throwable|String)]>) lookup4 => flatten(lookup4_impl);

  shared  DnsClient(*<[String,Anything(Throwable|String)]>) lookup6 => flatten(lookup6_impl);

  shared  DnsClient(*<[String,Anything(Throwable|List<String>)]>) resolveA => flatten(resolveA_impl);

  shared  DnsClient(*<[String,Anything(Throwable|List<String>)]>) resolveAAAA => flatten(resolveAAAA_impl);

  shared  DnsClient(*<[String,Anything(Throwable|List<String>)]>) resolveCNAME => flatten(resolveCNAME_impl);

  shared  DnsClient(*<[String,Anything(Throwable|List<MxRecord>)]>) resolveMX => flatten(resolveMX_impl);

  shared  DnsClient(*<[String,Anything(Throwable|List<String>)]>) resolveTXT => flatten(resolveTXT_impl);

  shared  DnsClient(*<[String,Anything(Throwable|String)]>) resolvePTR => flatten(resolvePTR_impl);

  shared  DnsClient(*<[String,Anything(Throwable|List<String>)]>) resolveNS => flatten(resolveNS_impl);

  shared  DnsClient(*<[String,Anything(Throwable|List<SrvRecord>)]>) resolveSRV => flatten(resolveSRV_impl);

  shared  DnsClient(*<[String,Anything(Throwable|String)]>) reverseLookup => flatten(reverseLookup_impl);

  DnsClient lookup_impl([String,Anything(Throwable|String)] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DnsClient lookup4_impl([String,Anything(Throwable|String)] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DnsClient lookup6_impl([String,Anything(Throwable|String)] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DnsClient resolveA_impl([String,Anything(Throwable|List<String>)] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DnsClient resolveAAAA_impl([String,Anything(Throwable|List<String>)] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DnsClient resolveCNAME_impl([String,Anything(Throwable|List<String>)] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DnsClient resolveMX_impl([String,Anything(Throwable|List<MxRecord>)] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DnsClient resolveTXT_impl([String,Anything(Throwable|List<String>)] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DnsClient resolvePTR_impl([String,Anything(Throwable|String)] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DnsClient resolveNS_impl([String,Anything(Throwable|List<String>)] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DnsClient resolveSRV_impl([String,Anything(Throwable|List<SrvRecord>)] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DnsClient reverseLookup_impl([String,Anything(Throwable|String)] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
