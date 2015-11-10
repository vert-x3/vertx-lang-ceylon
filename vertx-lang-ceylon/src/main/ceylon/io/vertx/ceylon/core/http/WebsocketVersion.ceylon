import io.vertx.lang.ceylon { Converter }
import io.vertx.core.http { WebsocketVersion_=WebsocketVersion }

shared abstract class WebsocketVersion(shared String name) of \iV00 | \iV07 | \iV08 | \iV13 {
}

shared object \iV00 extends WebsocketVersion("V00") {}
shared object \iV07 extends WebsocketVersion("V07") {}
shared object \iV08 extends WebsocketVersion("V08") {}
shared object \iV13 extends WebsocketVersion("V13") {}

shared object websocketVersion {

  shared object toJava extends Converter<WebsocketVersion, WebsocketVersion_>() {
    shared actual WebsocketVersion_ convert(WebsocketVersion src) {
      switch (src)      case(\iV00) { return WebsocketVersion_.\iV00; }
      case(\iV07) { return WebsocketVersion_.\iV07; }
      case(\iV08) { return WebsocketVersion_.\iV08; }
      case(\iV13) { return WebsocketVersion_.\iV13; }
    }
  }

  shared object toCeylon extends Converter<WebsocketVersion_, WebsocketVersion>() {
    shared actual WebsocketVersion convert(WebsocketVersion_ src) {
      if (src == WebsocketVersion_.\iV00) {
        return \iV00;
      }
      if (src == WebsocketVersion_.\iV07) {
        return \iV07;
      }
      if (src == WebsocketVersion_.\iV08) {
        return \iV08;
      }
      if (src == WebsocketVersion_.\iV13) {
        return \iV13;
      }
      throw Exception("Invalid enum value");
    }
  }
}
