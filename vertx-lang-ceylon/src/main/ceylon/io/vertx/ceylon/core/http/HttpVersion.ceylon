import io.vertx.lang.ceylon { Converter }
import io.vertx.core.http { HttpVersion_=HttpVersion }

" Represents the version of the HTTP protocol.\n"
shared abstract class HttpVersion(shared String name) of http_1_0 | http_1_1 | http_2 {
}

shared object http_1_0 extends HttpVersion("HTTP_1_0") {}
shared object http_1_1 extends HttpVersion("HTTP_1_1") {}
shared object http_2 extends HttpVersion("HTTP_2") {}

shared object httpVersion {

  shared String toString(HttpVersion val) {
      switch (val)
      case(http_1_0) { return "HTTP_1_0"; }
      case(http_1_1) { return "HTTP_1_1"; }
      case(http_2) { return "HTTP_2"; }
  }

  shared HttpVersion fromString(String val) {
      switch (val)
      case("HTTP_1_0") { return http_1_0; }
      case("HTTP_1_1") { return http_1_1; }
      case("HTTP_2") { return http_2; }
      else {
        throw Exception("Invalid HttpVersion value ``val``");
      }
  }

  shared object toJava extends Converter<HttpVersion, HttpVersion_>() {
    shared actual HttpVersion_ convert(HttpVersion src) {
      switch (src)
      case(http_1_0) { return HttpVersion_.\iHTTP_1_0; }
      case(http_1_1) { return HttpVersion_.\iHTTP_1_1; }
      case(http_2) { return HttpVersion_.\iHTTP_2; }
    }
  }

  shared object toCeylon extends Converter<HttpVersion_, HttpVersion>() {
    shared actual HttpVersion convert(HttpVersion_ src) {
      if (src == HttpVersion_.\iHTTP_1_0) {
        return http_1_0;
      }
      if (src == HttpVersion_.\iHTTP_1_1) {
        return http_1_1;
      }
      if (src == HttpVersion_.\iHTTP_2) {
        return http_2;
      }
      throw Exception("Invalid enum value");
    }
  }
}
