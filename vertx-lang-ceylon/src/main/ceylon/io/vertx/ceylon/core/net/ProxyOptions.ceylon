import io.vertx.ceylon.core.net {
  ProxyType,
  proxyType_=proxyType
}
import ceylon.json {
  JsonObject=Object,
  JsonArray=Array,
  parse
}
import io.vertx.lang.ceylon {
  BaseDataObject,
  Converter,
  ToJava
}
import io.vertx.core.net {
  ProxyOptions_=ProxyOptions
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.core.net.ProxyOptions */
" Proxy options for a net client or a net client.\n"
shared class ProxyOptions(
  " Set proxy host.\n"
  shared String? host = null,
  " Set proxy password.\n"
  shared String? password = null,
  " Set proxy port.\n"
  shared Integer? port = null,
  " Set proxy type.\n\n <p>ProxyType can be HTTP, SOCKS4 and SOCKS5\n"
  shared ProxyType? type = null,
  " Set proxy username.\n"
  shared String? username = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists host) {
      json.put("host", host);
    }
    if (exists password) {
      json.put("password", password);
    }
    if (exists port) {
      json.put("port", port);
    }
    if (exists type) {
      json.put("type", proxyType_.toString(type));
    }
    if (exists username) {
      json.put("username", username);
    }
    return json;
  }
}

shared object proxyOptions {

  shared ProxyOptions fromJson(JsonObject json) {
    String? host = json.getStringOrNull("host");
    String? password = json.getStringOrNull("password");
    Integer? port = json.getIntegerOrNull("port");
    ProxyType? type = if (exists tmp = json.getStringOrNull("type")) then proxyType_.fromString(tmp) else null;
    String? username = json.getStringOrNull("username");
    return ProxyOptions {
      host = host;
      password = password;
      port = port;
      type = type;
      username = username;
    };
  }

  shared object toJava extends Converter<ProxyOptions, ProxyOptions_>() {
    shared actual ProxyOptions_ convert(ProxyOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = ProxyOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(ProxyOptions obj) => obj.toJson();
}
