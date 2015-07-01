import java.lang {
  String_=String
}
import io.vertx.ceylon.core.dns {
  MxRecord,
  SrvRecord
}
/* Generated from io.vertx.core.dns.DnsClient */
shared abstract class DnsClient() {
  shared formal Anything(*<[]>) lookup;
  shared formal Anything(*<[]>) lookup4;
  shared formal Anything(*<[]>) lookup6;
  shared formal Anything(*<[]>) resolveA;
  shared formal Anything(*<[]>) resolveAAAA;
  shared formal Anything(*<[]>) resolveCNAME;
  shared formal Anything(*<[]>) resolveMX;
  shared formal Anything(*<[]>) resolveTXT;
  shared formal Anything(*<[]>) resolvePTR;
  shared formal Anything(*<[]>) resolveNS;
  shared formal Anything(*<[]>) resolveSRV;
  shared formal Anything(*<[]>) reverseLookup;
}
