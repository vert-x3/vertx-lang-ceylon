import io.vertx.lang.ceylon { Converter }
import io.vertx.core.http { HttpMethod_=HttpMethod }

shared abstract class HttpMethod(shared String name) of \iOPTIONS | \iGET | \iHEAD | \iPOST | \iPUT | \iDELETE | \iTRACE | \iCONNECT | \iPATCH {
}

shared object \iOPTIONS extends HttpMethod("OPTIONS") {}
shared object \iGET extends HttpMethod("GET") {}
shared object \iHEAD extends HttpMethod("HEAD") {}
shared object \iPOST extends HttpMethod("POST") {}
shared object \iPUT extends HttpMethod("PUT") {}
shared object \iDELETE extends HttpMethod("DELETE") {}
shared object \iTRACE extends HttpMethod("TRACE") {}
shared object \iCONNECT extends HttpMethod("CONNECT") {}
shared object \iPATCH extends HttpMethod("PATCH") {}

shared object httpMethod {

  shared String toString(HttpMethod val) {
      switch (val)
      case(\iOPTIONS) { return "OPTIONS"; }
      case(\iGET) { return "GET"; }
      case(\iHEAD) { return "HEAD"; }
      case(\iPOST) { return "POST"; }
      case(\iPUT) { return "PUT"; }
      case(\iDELETE) { return "DELETE"; }
      case(\iTRACE) { return "TRACE"; }
      case(\iCONNECT) { return "CONNECT"; }
      case(\iPATCH) { return "PATCH"; }
  }

  shared HttpMethod fromString(String val) {
      switch (val)
      case("OPTIONS") { return \iOPTIONS; }
      case("GET") { return \iGET; }
      case("HEAD") { return \iHEAD; }
      case("POST") { return \iPOST; }
      case("PUT") { return \iPUT; }
      case("DELETE") { return \iDELETE; }
      case("TRACE") { return \iTRACE; }
      case("CONNECT") { return \iCONNECT; }
      case("PATCH") { return \iPATCH; }
      else {
        throw Exception("Invalid HttpMethod value ``val``");
      }
  }

  shared object toJava extends Converter<HttpMethod, HttpMethod_>() {
    shared actual HttpMethod_ convert(HttpMethod src) {
      switch (src)
      case(\iOPTIONS) { return HttpMethod_.\iOPTIONS; }
      case(\iGET) { return HttpMethod_.\iGET; }
      case(\iHEAD) { return HttpMethod_.\iHEAD; }
      case(\iPOST) { return HttpMethod_.\iPOST; }
      case(\iPUT) { return HttpMethod_.\iPUT; }
      case(\iDELETE) { return HttpMethod_.\iDELETE; }
      case(\iTRACE) { return HttpMethod_.\iTRACE; }
      case(\iCONNECT) { return HttpMethod_.\iCONNECT; }
      case(\iPATCH) { return HttpMethod_.\iPATCH; }
    }
  }

  shared object toCeylon extends Converter<HttpMethod_, HttpMethod>() {
    shared actual HttpMethod convert(HttpMethod_ src) {
      if (src == HttpMethod_.\iOPTIONS) {
        return \iOPTIONS;
      }
      if (src == HttpMethod_.\iGET) {
        return \iGET;
      }
      if (src == HttpMethod_.\iHEAD) {
        return \iHEAD;
      }
      if (src == HttpMethod_.\iPOST) {
        return \iPOST;
      }
      if (src == HttpMethod_.\iPUT) {
        return \iPUT;
      }
      if (src == HttpMethod_.\iDELETE) {
        return \iDELETE;
      }
      if (src == HttpMethod_.\iTRACE) {
        return \iTRACE;
      }
      if (src == HttpMethod_.\iCONNECT) {
        return \iCONNECT;
      }
      if (src == HttpMethod_.\iPATCH) {
        return \iPATCH;
      }
      throw Exception("Invalid enum value");
    }
  }
}
