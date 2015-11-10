import io.vertx.lang.ceylon { Converter }
import io.vertx.core.dns { DnsResponseCode_=DnsResponseCode }

shared abstract class DnsResponseCode(shared String name) of \iNOERROR | \iFORMERROR | \iSERVFAIL | \iNXDOMAIN | \iNOTIMPL | \iREFUSED | \iYXDOMAIN | \iYXRRSET | \iNXRRSET | \iNOTAUTH | \iNOTZONE | \iBADVERS | \iBADSIG | \iBADKEY | \iBADTIME {
}

shared object \iNOERROR extends DnsResponseCode("NOERROR") {}
shared object \iFORMERROR extends DnsResponseCode("FORMERROR") {}
shared object \iSERVFAIL extends DnsResponseCode("SERVFAIL") {}
shared object \iNXDOMAIN extends DnsResponseCode("NXDOMAIN") {}
shared object \iNOTIMPL extends DnsResponseCode("NOTIMPL") {}
shared object \iREFUSED extends DnsResponseCode("REFUSED") {}
shared object \iYXDOMAIN extends DnsResponseCode("YXDOMAIN") {}
shared object \iYXRRSET extends DnsResponseCode("YXRRSET") {}
shared object \iNXRRSET extends DnsResponseCode("NXRRSET") {}
shared object \iNOTAUTH extends DnsResponseCode("NOTAUTH") {}
shared object \iNOTZONE extends DnsResponseCode("NOTZONE") {}
shared object \iBADVERS extends DnsResponseCode("BADVERS") {}
shared object \iBADSIG extends DnsResponseCode("BADSIG") {}
shared object \iBADKEY extends DnsResponseCode("BADKEY") {}
shared object \iBADTIME extends DnsResponseCode("BADTIME") {}

shared object dnsResponseCode {

  shared String toString(DnsResponseCode val) {
      switch (val)
      case(\iNOERROR) { return "NOERROR"; }
      case(\iFORMERROR) { return "FORMERROR"; }
      case(\iSERVFAIL) { return "SERVFAIL"; }
      case(\iNXDOMAIN) { return "NXDOMAIN"; }
      case(\iNOTIMPL) { return "NOTIMPL"; }
      case(\iREFUSED) { return "REFUSED"; }
      case(\iYXDOMAIN) { return "YXDOMAIN"; }
      case(\iYXRRSET) { return "YXRRSET"; }
      case(\iNXRRSET) { return "NXRRSET"; }
      case(\iNOTAUTH) { return "NOTAUTH"; }
      case(\iNOTZONE) { return "NOTZONE"; }
      case(\iBADVERS) { return "BADVERS"; }
      case(\iBADSIG) { return "BADSIG"; }
      case(\iBADKEY) { return "BADKEY"; }
      case(\iBADTIME) { return "BADTIME"; }
  }

  shared DnsResponseCode fromString(String val) {
      switch (val)
      case("NOERROR") { return \iNOERROR; }
      case("FORMERROR") { return \iFORMERROR; }
      case("SERVFAIL") { return \iSERVFAIL; }
      case("NXDOMAIN") { return \iNXDOMAIN; }
      case("NOTIMPL") { return \iNOTIMPL; }
      case("REFUSED") { return \iREFUSED; }
      case("YXDOMAIN") { return \iYXDOMAIN; }
      case("YXRRSET") { return \iYXRRSET; }
      case("NXRRSET") { return \iNXRRSET; }
      case("NOTAUTH") { return \iNOTAUTH; }
      case("NOTZONE") { return \iNOTZONE; }
      case("BADVERS") { return \iBADVERS; }
      case("BADSIG") { return \iBADSIG; }
      case("BADKEY") { return \iBADKEY; }
      case("BADTIME") { return \iBADTIME; }
      else {
        throw Exception("Invalid DnsResponseCode value ``val``");
      }
  }

  shared object toJava extends Converter<DnsResponseCode, DnsResponseCode_>() {
    shared actual DnsResponseCode_ convert(DnsResponseCode src) {
      switch (src)
      case(\iNOERROR) { return DnsResponseCode_.\iNOERROR; }
      case(\iFORMERROR) { return DnsResponseCode_.\iFORMERROR; }
      case(\iSERVFAIL) { return DnsResponseCode_.\iSERVFAIL; }
      case(\iNXDOMAIN) { return DnsResponseCode_.\iNXDOMAIN; }
      case(\iNOTIMPL) { return DnsResponseCode_.\iNOTIMPL; }
      case(\iREFUSED) { return DnsResponseCode_.\iREFUSED; }
      case(\iYXDOMAIN) { return DnsResponseCode_.\iYXDOMAIN; }
      case(\iYXRRSET) { return DnsResponseCode_.\iYXRRSET; }
      case(\iNXRRSET) { return DnsResponseCode_.\iNXRRSET; }
      case(\iNOTAUTH) { return DnsResponseCode_.\iNOTAUTH; }
      case(\iNOTZONE) { return DnsResponseCode_.\iNOTZONE; }
      case(\iBADVERS) { return DnsResponseCode_.\iBADVERS; }
      case(\iBADSIG) { return DnsResponseCode_.\iBADSIG; }
      case(\iBADKEY) { return DnsResponseCode_.\iBADKEY; }
      case(\iBADTIME) { return DnsResponseCode_.\iBADTIME; }
    }
  }

  shared object toCeylon extends Converter<DnsResponseCode_, DnsResponseCode>() {
    shared actual DnsResponseCode convert(DnsResponseCode_ src) {
      if (src == DnsResponseCode_.\iNOERROR) {
        return \iNOERROR;
      }
      if (src == DnsResponseCode_.\iFORMERROR) {
        return \iFORMERROR;
      }
      if (src == DnsResponseCode_.\iSERVFAIL) {
        return \iSERVFAIL;
      }
      if (src == DnsResponseCode_.\iNXDOMAIN) {
        return \iNXDOMAIN;
      }
      if (src == DnsResponseCode_.\iNOTIMPL) {
        return \iNOTIMPL;
      }
      if (src == DnsResponseCode_.\iREFUSED) {
        return \iREFUSED;
      }
      if (src == DnsResponseCode_.\iYXDOMAIN) {
        return \iYXDOMAIN;
      }
      if (src == DnsResponseCode_.\iYXRRSET) {
        return \iYXRRSET;
      }
      if (src == DnsResponseCode_.\iNXRRSET) {
        return \iNXRRSET;
      }
      if (src == DnsResponseCode_.\iNOTAUTH) {
        return \iNOTAUTH;
      }
      if (src == DnsResponseCode_.\iNOTZONE) {
        return \iNOTZONE;
      }
      if (src == DnsResponseCode_.\iBADVERS) {
        return \iBADVERS;
      }
      if (src == DnsResponseCode_.\iBADSIG) {
        return \iBADSIG;
      }
      if (src == DnsResponseCode_.\iBADKEY) {
        return \iBADKEY;
      }
      if (src == DnsResponseCode_.\iBADTIME) {
        return \iBADTIME;
      }
      throw Exception("Invalid enum value");
    }
  }
}
