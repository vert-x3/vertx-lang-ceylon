import ceylon.time.iso8601 {
  parseZoneDateTime
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
  OpenSSLEngineOptions_=OpenSSLEngineOptions
}
import ceylon.collection {
  HashMap
}
import ceylon.time {
  Instant
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.core.net.OpenSSLEngineOptions */
" Configures a [TCPSSLOptions](../net/TCPSSLOptions.type.html) to use OpenSsl.\n"
shared class OpenSSLEngineOptions(
  " Set whether session cache is enabled in open SSL session server context\n"
  shared Boolean? sessionCacheEnabled = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists sessionCacheEnabled) {
      json.put("sessionCacheEnabled", sessionCacheEnabled);
    }
    return json;
  }
}

shared object openSSLEngineOptions {

  shared OpenSSLEngineOptions fromJson(JsonObject json) {
    Boolean? sessionCacheEnabled = json.getBooleanOrNull("sessionCacheEnabled");
    return OpenSSLEngineOptions {
      sessionCacheEnabled = sessionCacheEnabled;
    };
  }

  shared object toCeylon extends Converter<OpenSSLEngineOptions_, OpenSSLEngineOptions>() {
    shared actual OpenSSLEngineOptions convert(OpenSSLEngineOptions_ src) {
      value json = parse(src.toJson().string);
      assert(is JsonObject json);
      return fromJson(json);
    }
  }

  shared object toJava extends Converter<OpenSSLEngineOptions, OpenSSLEngineOptions_>() {
    shared actual OpenSSLEngineOptions_ convert(OpenSSLEngineOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = OpenSSLEngineOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(OpenSSLEngineOptions obj) => obj.toJson();
}
