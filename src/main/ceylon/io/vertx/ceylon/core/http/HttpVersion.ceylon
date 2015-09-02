import io.vertx.lang.ceylon { Converter }
import io.vertx.core.http { HttpVersion_=HttpVersion }

shared abstract class HttpVersion(shared String name) of \iHTTP_1_0 | \iHTTP_1_1 {
}

shared object \iHTTP_1_0 extends HttpVersion("HTTP_1_0") {}
shared object \iHTTP_1_1 extends HttpVersion("HTTP_1_1") {}

shared object toJavaHttpVersion satisfies Converter<HttpVersion, HttpVersion_> {
  shared actual HttpVersion_ convert(HttpVersion src) {
    switch (src)    case(\iHTTP_1_0) { return HttpVersion_.\iHTTP_1_0; }
    case(\iHTTP_1_1) { return HttpVersion_.\iHTTP_1_1; }
  }
}

shared object toCeylonHttpVersion satisfies Converter<HttpVersion_, HttpVersion> {
  shared actual HttpVersion convert(HttpVersion_ src) {
    if (src == HttpVersion_.\iHTTP_1_0) {
      return \iHTTP_1_0;
    }
    if (src == HttpVersion_.\iHTTP_1_1) {
      return \iHTTP_1_1;
    }
    throw Exception("Invalid enum value");
  }
}
