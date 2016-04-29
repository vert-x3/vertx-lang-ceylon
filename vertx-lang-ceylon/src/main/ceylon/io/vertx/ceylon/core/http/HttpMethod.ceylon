import io.vertx.lang.ceylon { Converter }
import io.vertx.core.http { HttpMethod_=HttpMethod }

" Represents an HTTP method\n"
shared abstract class HttpMethod(shared String name) of options | get | head | post | put | delete | trace | connect | patch | other {
}

shared object options extends HttpMethod("OPTIONS") {}
shared object get extends HttpMethod("GET") {}
shared object head extends HttpMethod("HEAD") {}
shared object post extends HttpMethod("POST") {}
shared object put extends HttpMethod("PUT") {}
shared object delete extends HttpMethod("DELETE") {}
shared object trace extends HttpMethod("TRACE") {}
shared object connect extends HttpMethod("CONNECT") {}
shared object patch extends HttpMethod("PATCH") {}
shared object other extends HttpMethod("OTHER") {}

shared object httpMethod {

  shared String toString(HttpMethod val) {
      switch (val)
      case(options) { return "OPTIONS"; }
      case(get) { return "GET"; }
      case(head) { return "HEAD"; }
      case(post) { return "POST"; }
      case(put) { return "PUT"; }
      case(delete) { return "DELETE"; }
      case(trace) { return "TRACE"; }
      case(connect) { return "CONNECT"; }
      case(patch) { return "PATCH"; }
      case(other) { return "OTHER"; }
  }

  shared HttpMethod fromString(String val) {
      switch (val)
      case("OPTIONS") { return options; }
      case("GET") { return get; }
      case("HEAD") { return head; }
      case("POST") { return post; }
      case("PUT") { return put; }
      case("DELETE") { return delete; }
      case("TRACE") { return trace; }
      case("CONNECT") { return connect; }
      case("PATCH") { return patch; }
      case("OTHER") { return other; }
      else {
        throw Exception("Invalid HttpMethod value ``val``");
      }
  }

  shared object toJava extends Converter<HttpMethod, HttpMethod_>() {
    shared actual HttpMethod_ convert(HttpMethod src) {
      switch (src)
      case(options) { return HttpMethod_.\iOPTIONS; }
      case(get) { return HttpMethod_.\iGET; }
      case(head) { return HttpMethod_.\iHEAD; }
      case(post) { return HttpMethod_.\iPOST; }
      case(put) { return HttpMethod_.\iPUT; }
      case(delete) { return HttpMethod_.\iDELETE; }
      case(trace) { return HttpMethod_.\iTRACE; }
      case(connect) { return HttpMethod_.\iCONNECT; }
      case(patch) { return HttpMethod_.\iPATCH; }
      case(other) { return HttpMethod_.\iOTHER; }
    }
  }

  shared object toCeylon extends Converter<HttpMethod_, HttpMethod>() {
    shared actual HttpMethod convert(HttpMethod_ src) {
      if (src == HttpMethod_.\iOPTIONS) {
        return options;
      }
      if (src == HttpMethod_.\iGET) {
        return get;
      }
      if (src == HttpMethod_.\iHEAD) {
        return head;
      }
      if (src == HttpMethod_.\iPOST) {
        return post;
      }
      if (src == HttpMethod_.\iPUT) {
        return put;
      }
      if (src == HttpMethod_.\iDELETE) {
        return delete;
      }
      if (src == HttpMethod_.\iTRACE) {
        return trace;
      }
      if (src == HttpMethod_.\iCONNECT) {
        return connect;
      }
      if (src == HttpMethod_.\iPATCH) {
        return patch;
      }
      if (src == HttpMethod_.\iOTHER) {
        return other;
      }
      throw Exception("Invalid enum value");
    }
  }
}
