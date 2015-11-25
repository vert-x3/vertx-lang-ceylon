import io.vertx.lang.ceylon { Converter }
import io.vertx.core.dns { DnsResponseCode_=DnsResponseCode }

" Represents the possible response codes a server may send after receiving a\n query. A response code of 0 indicates no error.\n\n"
shared abstract class DnsResponseCode(shared String name) of noerror | formerror | servfail | nxdomain | notimpl | refused | yxdomain | yxrrset | nxrrset | notauth | notzone | badvers | badsig | badkey | badtime {
}

" ID 0, no error\n"
shared object noerror extends DnsResponseCode("NOERROR") {}
" ID 1, format error\n"
shared object formerror extends DnsResponseCode("FORMERROR") {}
" ID 2, server failure\n"
shared object servfail extends DnsResponseCode("SERVFAIL") {}
" ID 3, name error\n"
shared object nxdomain extends DnsResponseCode("NXDOMAIN") {}
" ID 4, not implemented\n"
shared object notimpl extends DnsResponseCode("NOTIMPL") {}
" ID 5, operation refused\n"
shared object refused extends DnsResponseCode("REFUSED") {}
" ID 6, domain name should not exist\n"
shared object yxdomain extends DnsResponseCode("YXDOMAIN") {}
" ID 7, resource record set should not exist\n"
shared object yxrrset extends DnsResponseCode("YXRRSET") {}
" ID 8, rrset does not exist\n"
shared object nxrrset extends DnsResponseCode("NXRRSET") {}
" ID 9, not authoritative for zone\n"
shared object notauth extends DnsResponseCode("NOTAUTH") {}
" ID 10, name not in zone\n"
shared object notzone extends DnsResponseCode("NOTZONE") {}
" ID 11, bad extension mechanism for version\n"
shared object badvers extends DnsResponseCode("BADVERS") {}
" ID 12, bad signature\n"
shared object badsig extends DnsResponseCode("BADSIG") {}
" ID 13, bad key\n"
shared object badkey extends DnsResponseCode("BADKEY") {}
" ID 14, bad timestamp\n"
shared object badtime extends DnsResponseCode("BADTIME") {}

shared object dnsResponseCode {

  shared String toString(DnsResponseCode val) {
      switch (val)
      case(noerror) { return "NOERROR"; }
      case(formerror) { return "FORMERROR"; }
      case(servfail) { return "SERVFAIL"; }
      case(nxdomain) { return "NXDOMAIN"; }
      case(notimpl) { return "NOTIMPL"; }
      case(refused) { return "REFUSED"; }
      case(yxdomain) { return "YXDOMAIN"; }
      case(yxrrset) { return "YXRRSET"; }
      case(nxrrset) { return "NXRRSET"; }
      case(notauth) { return "NOTAUTH"; }
      case(notzone) { return "NOTZONE"; }
      case(badvers) { return "BADVERS"; }
      case(badsig) { return "BADSIG"; }
      case(badkey) { return "BADKEY"; }
      case(badtime) { return "BADTIME"; }
  }

  shared DnsResponseCode fromString(String val) {
      switch (val)
      case("NOERROR") { return noerror; }
      case("FORMERROR") { return formerror; }
      case("SERVFAIL") { return servfail; }
      case("NXDOMAIN") { return nxdomain; }
      case("NOTIMPL") { return notimpl; }
      case("REFUSED") { return refused; }
      case("YXDOMAIN") { return yxdomain; }
      case("YXRRSET") { return yxrrset; }
      case("NXRRSET") { return nxrrset; }
      case("NOTAUTH") { return notauth; }
      case("NOTZONE") { return notzone; }
      case("BADVERS") { return badvers; }
      case("BADSIG") { return badsig; }
      case("BADKEY") { return badkey; }
      case("BADTIME") { return badtime; }
      else {
        throw Exception("Invalid DnsResponseCode value ``val``");
      }
  }

  shared object toJava extends Converter<DnsResponseCode, DnsResponseCode_>() {
    shared actual DnsResponseCode_ convert(DnsResponseCode src) {
      switch (src)
      case(noerror) { return DnsResponseCode_.\iNOERROR; }
      case(formerror) { return DnsResponseCode_.\iFORMERROR; }
      case(servfail) { return DnsResponseCode_.\iSERVFAIL; }
      case(nxdomain) { return DnsResponseCode_.\iNXDOMAIN; }
      case(notimpl) { return DnsResponseCode_.\iNOTIMPL; }
      case(refused) { return DnsResponseCode_.\iREFUSED; }
      case(yxdomain) { return DnsResponseCode_.\iYXDOMAIN; }
      case(yxrrset) { return DnsResponseCode_.\iYXRRSET; }
      case(nxrrset) { return DnsResponseCode_.\iNXRRSET; }
      case(notauth) { return DnsResponseCode_.\iNOTAUTH; }
      case(notzone) { return DnsResponseCode_.\iNOTZONE; }
      case(badvers) { return DnsResponseCode_.\iBADVERS; }
      case(badsig) { return DnsResponseCode_.\iBADSIG; }
      case(badkey) { return DnsResponseCode_.\iBADKEY; }
      case(badtime) { return DnsResponseCode_.\iBADTIME; }
    }
  }

  shared object toCeylon extends Converter<DnsResponseCode_, DnsResponseCode>() {
    shared actual DnsResponseCode convert(DnsResponseCode_ src) {
      if (src == DnsResponseCode_.\iNOERROR) {
        return noerror;
      }
      if (src == DnsResponseCode_.\iFORMERROR) {
        return formerror;
      }
      if (src == DnsResponseCode_.\iSERVFAIL) {
        return servfail;
      }
      if (src == DnsResponseCode_.\iNXDOMAIN) {
        return nxdomain;
      }
      if (src == DnsResponseCode_.\iNOTIMPL) {
        return notimpl;
      }
      if (src == DnsResponseCode_.\iREFUSED) {
        return refused;
      }
      if (src == DnsResponseCode_.\iYXDOMAIN) {
        return yxdomain;
      }
      if (src == DnsResponseCode_.\iYXRRSET) {
        return yxrrset;
      }
      if (src == DnsResponseCode_.\iNXRRSET) {
        return nxrrset;
      }
      if (src == DnsResponseCode_.\iNOTAUTH) {
        return notauth;
      }
      if (src == DnsResponseCode_.\iNOTZONE) {
        return notzone;
      }
      if (src == DnsResponseCode_.\iBADVERS) {
        return badvers;
      }
      if (src == DnsResponseCode_.\iBADSIG) {
        return badsig;
      }
      if (src == DnsResponseCode_.\iBADKEY) {
        return badkey;
      }
      if (src == DnsResponseCode_.\iBADTIME) {
        return badtime;
      }
      throw Exception("Invalid enum value");
    }
  }
}
