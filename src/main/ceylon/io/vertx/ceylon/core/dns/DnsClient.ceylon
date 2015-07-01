import java.lang {
  String_=String
}
import io.vertx.ceylon.core.dns {
  MxRecord,
  SrvRecord
}
/* Generated from io.vertx.core.dns.DnsClient */
shared abstract class DnsClient() {
  shared formal Anything(*<[String,Anything(Throwable|String)]>) lookup;
  shared formal Anything(*<[String,Anything(Throwable|String)]>) lookup4;
  shared formal Anything(*<[String,Anything(Throwable|String)]>) lookup6;
  shared formal Anything(*<[String,Anything(Throwable|List<String>)]>) resolveA;
  shared formal Anything(*<[String,Anything(Throwable|List<String>)]>) resolveAAAA;
  shared formal Anything(*<[String,Anything(Throwable|List<String>)]>) resolveCNAME;
  shared formal Anything(*<[String,Anything(Throwable|List<MxRecord>)]>) resolveMX;
  shared formal Anything(*<[String,Anything(Throwable|List<String>)]>) resolveTXT;
  shared formal Anything(*<[String,Anything(Throwable|String)]>) resolvePTR;
  shared formal Anything(*<[String,Anything(Throwable|List<String>)]>) resolveNS;
  shared formal Anything(*<[String,Anything(Throwable|List<SrvRecord>)]>) resolveSRV;
  shared formal Anything(*<[String,Anything(Throwable|String)]>) reverseLookup;
}
