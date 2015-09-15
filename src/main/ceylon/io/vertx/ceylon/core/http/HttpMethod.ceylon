import io.vertx.lang.ceylon { Converter }
import io.vertx.core.http { HttpMethod_=HttpMethod }

shared abstract class HttpMethod(shared String name) of \iOPTIONS | \iGET | \iHEAD | \iPOST | \iPUT | \iDELETE | \iTRACE | \iCONNECT | \iPATCH {
}

shared object \iOPTIONS extends HttpMethod("io.vertx.codegen.EnumValueInfo@529d8508") {}
shared object \iGET extends HttpMethod("io.vertx.codegen.EnumValueInfo@424ea768") {}
shared object \iHEAD extends HttpMethod("io.vertx.codegen.EnumValueInfo@2961aad6") {}
shared object \iPOST extends HttpMethod("io.vertx.codegen.EnumValueInfo@1a1885a6") {}
shared object \iPUT extends HttpMethod("io.vertx.codegen.EnumValueInfo@2413f628") {}
shared object \iDELETE extends HttpMethod("io.vertx.codegen.EnumValueInfo@13d17025") {}
shared object \iTRACE extends HttpMethod("io.vertx.codegen.EnumValueInfo@37425f93") {}
shared object \iCONNECT extends HttpMethod("io.vertx.codegen.EnumValueInfo@69a9c968") {}
shared object \iPATCH extends HttpMethod("io.vertx.codegen.EnumValueInfo@5230d0c3") {}

shared object toJavaHttpMethod satisfies Converter<HttpMethod, HttpMethod_> {
  shared actual HttpMethod_ convert(HttpMethod src) {
    switch (src)    case(\iOPTIONS) { return HttpMethod_.\iOPTIONS; }
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

shared object toCeylonHttpMethod satisfies Converter<HttpMethod_, HttpMethod> {
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
