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
import io.vertx.core.http {
  Http2Settings_=Http2Settings
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
/* Generated from io.vertx.core.http.Http2Settings */
" HTTP2 settings, the settings is initialized with the default HTTP/2 values.<p>\n\n The settings expose the parameters defined by the HTTP/2 specification, as well as extra settings for\n protocol extensions.\n"
shared class Http2Settings(
  " Set  HTTP/2 setting.\n"
  shared Integer? headerTableSize = null,
  " Set the  HTTP/2 setting\n"
  shared Integer? initialWindowSize = null,
  " Set the  HTTP/2 setting\n"
  shared Integer? maxConcurrentStreams = null,
  " Set the  HTTP/2 setting\n"
  shared Integer? maxFrameSize = null,
  " Set the  HTTP/2 setting\n"
  shared Integer? maxHeaderListSize = null,
  " Set the  HTTP/2 setting\n"
  shared Boolean? pushEnabled = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists headerTableSize) {
      json.put("headerTableSize", headerTableSize);
    }
    if (exists initialWindowSize) {
      json.put("initialWindowSize", initialWindowSize);
    }
    if (exists maxConcurrentStreams) {
      json.put("maxConcurrentStreams", maxConcurrentStreams);
    }
    if (exists maxFrameSize) {
      json.put("maxFrameSize", maxFrameSize);
    }
    if (exists maxHeaderListSize) {
      json.put("maxHeaderListSize", maxHeaderListSize);
    }
    if (exists pushEnabled) {
      json.put("pushEnabled", pushEnabled);
    }
    return json;
  }
}

shared object http2Settings {

  shared Http2Settings fromJson(JsonObject json) {
    Integer? headerTableSize = json.getIntegerOrNull("headerTableSize");
    Integer? initialWindowSize = json.getIntegerOrNull("initialWindowSize");
    Integer? maxConcurrentStreams = json.getIntegerOrNull("maxConcurrentStreams");
    Integer? maxFrameSize = json.getIntegerOrNull("maxFrameSize");
    Integer? maxHeaderListSize = json.getIntegerOrNull("maxHeaderListSize");
    Boolean? pushEnabled = json.getBooleanOrNull("pushEnabled");
    return Http2Settings {
      headerTableSize = headerTableSize;
      initialWindowSize = initialWindowSize;
      maxConcurrentStreams = maxConcurrentStreams;
      maxFrameSize = maxFrameSize;
      maxHeaderListSize = maxHeaderListSize;
      pushEnabled = pushEnabled;
    };
  }

  shared object toCeylon extends Converter<Http2Settings_, Http2Settings>() {
    shared actual Http2Settings convert(Http2Settings_ src) {
      value json = parse(src.toJson().string);
      assert(is JsonObject json);
      return fromJson(json);
    }
  }

  shared object toJava extends Converter<Http2Settings, Http2Settings_>() {
    shared actual Http2Settings_ convert(Http2Settings src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = Http2Settings_(json);
      return ret;
    }
  }
  shared JsonObject toJson(Http2Settings obj) => obj.toJson();
}
