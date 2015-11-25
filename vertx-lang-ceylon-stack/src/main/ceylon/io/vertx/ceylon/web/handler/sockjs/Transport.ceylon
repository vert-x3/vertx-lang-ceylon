import io.vertx.lang.ceylon { Converter }
import io.vertx.ext.web.handler.sockjs { Transport_=Transport }

" The available SockJS transports\n"
shared abstract class Transport(shared String name) of websocket | event_source | html_file | json_p | xhr {
}

" <a href=\"http://www.rfc-editor.org/rfc/rfc6455.txt\">rfc 6455</a>\n"
shared object websocket extends Transport("WEBSOCKET") {}
" <a href=\"http://dev.w3.org/html5/eventsource/\">Event source</a>\n"
shared object event_source extends Transport("EVENT_SOURCE") {}
" <a href=\"http://cometdaily.com/2007/11/18/ie-activexhtmlfile-transport-part-ii/\">HtmlFile</a>.\n"
shared object html_file extends Transport("HTML_FILE") {}
" Slow and old fashioned <a hred=\"https://developer.mozilla.org/en/DOM/window.postMessage\">JSONP polling</a>.\n This transport will show \"busy indicator\" (aka: \"spinning wheel\") when sending data.\n"
shared object json_p extends Transport("JSON_P") {}
" Long-polling using <a hred=\"https://secure.wikimedia.org/wikipedia/en/wiki/XMLHttpRequest#Cross-domain_requests\">cross domain XHR</a>\n"
shared object xhr extends Transport("XHR") {}

shared object transport {

  shared String toString(Transport val) {
      switch (val)
      case(websocket) { return "WEBSOCKET"; }
      case(event_source) { return "EVENT_SOURCE"; }
      case(html_file) { return "HTML_FILE"; }
      case(json_p) { return "JSON_P"; }
      case(xhr) { return "XHR"; }
  }

  shared Transport fromString(String val) {
      switch (val)
      case("WEBSOCKET") { return websocket; }
      case("EVENT_SOURCE") { return event_source; }
      case("HTML_FILE") { return html_file; }
      case("JSON_P") { return json_p; }
      case("XHR") { return xhr; }
      else {
        throw Exception("Invalid Transport value ``val``");
      }
  }

  shared object toJava extends Converter<Transport, Transport_>() {
    shared actual Transport_ convert(Transport src) {
      switch (src)
      case(websocket) { return Transport_.\iWEBSOCKET; }
      case(event_source) { return Transport_.\iEVENT_SOURCE; }
      case(html_file) { return Transport_.\iHTML_FILE; }
      case(json_p) { return Transport_.\iJSON_P; }
      case(xhr) { return Transport_.\iXHR; }
    }
  }

  shared object toCeylon extends Converter<Transport_, Transport>() {
    shared actual Transport convert(Transport_ src) {
      if (src == Transport_.\iWEBSOCKET) {
        return websocket;
      }
      if (src == Transport_.\iEVENT_SOURCE) {
        return event_source;
      }
      if (src == Transport_.\iHTML_FILE) {
        return html_file;
      }
      if (src == Transport_.\iJSON_P) {
        return json_p;
      }
      if (src == Transport_.\iXHR) {
        return xhr;
      }
      throw Exception("Invalid enum value");
    }
  }
}
