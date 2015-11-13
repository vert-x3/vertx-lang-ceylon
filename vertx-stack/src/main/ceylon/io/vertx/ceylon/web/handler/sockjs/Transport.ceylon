import io.vertx.lang.ceylon { Converter }
import io.vertx.ext.web.handler.sockjs { Transport_=Transport }

shared abstract class Transport(shared String name) of \iWEBSOCKET | \iEVENT_SOURCE | \iHTML_FILE | \iJSON_P | \iXHR {
}

shared object \iWEBSOCKET extends Transport("WEBSOCKET") {}
shared object \iEVENT_SOURCE extends Transport("EVENT_SOURCE") {}
shared object \iHTML_FILE extends Transport("HTML_FILE") {}
shared object \iJSON_P extends Transport("JSON_P") {}
shared object \iXHR extends Transport("XHR") {}

shared object transport {

  shared String toString(Transport val) {
      switch (val)
      case(\iWEBSOCKET) { return "WEBSOCKET"; }
      case(\iEVENT_SOURCE) { return "EVENT_SOURCE"; }
      case(\iHTML_FILE) { return "HTML_FILE"; }
      case(\iJSON_P) { return "JSON_P"; }
      case(\iXHR) { return "XHR"; }
  }

  shared Transport fromString(String val) {
      switch (val)
      case("WEBSOCKET") { return \iWEBSOCKET; }
      case("EVENT_SOURCE") { return \iEVENT_SOURCE; }
      case("HTML_FILE") { return \iHTML_FILE; }
      case("JSON_P") { return \iJSON_P; }
      case("XHR") { return \iXHR; }
      else {
        throw Exception("Invalid Transport value ``val``");
      }
  }

  shared object toJava extends Converter<Transport, Transport_>() {
    shared actual Transport_ convert(Transport src) {
      switch (src)
      case(\iWEBSOCKET) { return Transport_.\iWEBSOCKET; }
      case(\iEVENT_SOURCE) { return Transport_.\iEVENT_SOURCE; }
      case(\iHTML_FILE) { return Transport_.\iHTML_FILE; }
      case(\iJSON_P) { return Transport_.\iJSON_P; }
      case(\iXHR) { return Transport_.\iXHR; }
    }
  }

  shared object toCeylon extends Converter<Transport_, Transport>() {
    shared actual Transport convert(Transport_ src) {
      if (src == Transport_.\iWEBSOCKET) {
        return \iWEBSOCKET;
      }
      if (src == Transport_.\iEVENT_SOURCE) {
        return \iEVENT_SOURCE;
      }
      if (src == Transport_.\iHTML_FILE) {
        return \iHTML_FILE;
      }
      if (src == Transport_.\iJSON_P) {
        return \iJSON_P;
      }
      if (src == Transport_.\iXHR) {
        return \iXHR;
      }
      throw Exception("Invalid enum value");
    }
  }
}
