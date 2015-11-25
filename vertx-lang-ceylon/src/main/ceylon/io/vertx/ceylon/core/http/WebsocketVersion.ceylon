import io.vertx.lang.ceylon { Converter }
import io.vertx.core.http { WebsocketVersion_=WebsocketVersion }

" Represents the WebSocket version\n"
shared abstract class WebsocketVersion(shared String name) of v00 | v07 | v08 | v13 {
}

shared object v00 extends WebsocketVersion("V00") {}
shared object v07 extends WebsocketVersion("V07") {}
shared object v08 extends WebsocketVersion("V08") {}
shared object v13 extends WebsocketVersion("V13") {}

shared object websocketVersion {

  shared String toString(WebsocketVersion val) {
      switch (val)
      case(v00) { return "V00"; }
      case(v07) { return "V07"; }
      case(v08) { return "V08"; }
      case(v13) { return "V13"; }
  }

  shared WebsocketVersion fromString(String val) {
      switch (val)
      case("V00") { return v00; }
      case("V07") { return v07; }
      case("V08") { return v08; }
      case("V13") { return v13; }
      else {
        throw Exception("Invalid WebsocketVersion value ``val``");
      }
  }

  shared object toJava extends Converter<WebsocketVersion, WebsocketVersion_>() {
    shared actual WebsocketVersion_ convert(WebsocketVersion src) {
      switch (src)
      case(v00) { return WebsocketVersion_.\iV00; }
      case(v07) { return WebsocketVersion_.\iV07; }
      case(v08) { return WebsocketVersion_.\iV08; }
      case(v13) { return WebsocketVersion_.\iV13; }
    }
  }

  shared object toCeylon extends Converter<WebsocketVersion_, WebsocketVersion>() {
    shared actual WebsocketVersion convert(WebsocketVersion_ src) {
      if (src == WebsocketVersion_.\iV00) {
        return v00;
      }
      if (src == WebsocketVersion_.\iV07) {
        return v07;
      }
      if (src == WebsocketVersion_.\iV08) {
        return v08;
      }
      if (src == WebsocketVersion_.\iV13) {
        return v13;
      }
      throw Exception("Invalid enum value");
    }
  }
}
