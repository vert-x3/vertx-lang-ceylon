import java.lang {
  String_=String
}
import io.vertx.ceylon.core.dns {
  MxRecord,
  SrvRecord
}
/* Generated from io.vertx.core.dns.DnsClient */
shared abstract class DnsClient() {
  shared formal DnsClient(*<[String,Anything(Throwable|String)]>) lookup;
  shared formal DnsClient(*<[String,Anything(Throwable|String)]>) lookup4;
  shared formal DnsClient(*<[String,Anything(Throwable|String)]>) lookup6;
  shared formal DnsClient(*<[String,Anything(Throwable|List<String>)]>) resolveA;
  shared formal DnsClient(*<[String,Anything(Throwable|List<String>)]>) resolveAAAA;
  shared formal DnsClient(*<[String,Anything(Throwable|List<String>)]>) resolveCNAME;
  shared formal DnsClient(*<[String,Anything(Throwable|List<MxRecord>)]>) resolveMX;
  shared formal DnsClient(*<[String,Anything(Throwable|List<String>)]>) resolveTXT;
  shared formal DnsClient(*<[String,Anything(Throwable|String)]>) resolvePTR;
  shared formal DnsClient(*<[String,Anything(Throwable|List<String>)]>) resolveNS;
  shared formal DnsClient(*<[String,Anything(Throwable|List<SrvRecord>)]>) resolveSRV;
  shared formal DnsClient(*<[String,Anything(Throwable|String)]>) reverseLookup;
}
