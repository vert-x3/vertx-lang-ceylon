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
import io.vertx.ext.web.handler.sockjs {
  SockJSHandlerOptions_=SockJSHandlerOptions
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.ext.web.handler.sockjs.SockJSHandlerOptions */
shared class SockJSHandlerOptions(
  shared {String*}? disabledTransports = null,
  shared Integer? heartbeatInterval = null,
  shared Boolean? insertJSESSIONID = null,
  shared String? libraryURL = null,
  shared Integer? maxBytesStreaming = null,
  shared Integer? sessionTimeout = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists disabledTransports) {
      json.put("disabledTransports", JsonArray(disabledTransports));
    }
    if (exists heartbeatInterval) {
      json.put("heartbeatInterval", heartbeatInterval);
    }
    if (exists insertJSESSIONID) {
      json.put("insertJSESSIONID", insertJSESSIONID);
    }
    if (exists libraryURL) {
      json.put("libraryURL", libraryURL);
    }
    if (exists maxBytesStreaming) {
      json.put("maxBytesStreaming", maxBytesStreaming);
    }
    if (exists sessionTimeout) {
      json.put("sessionTimeout", sessionTimeout);
    }
    return json;
  }
}

shared object sockJSHandlerOptions {

  shared SockJSHandlerOptions fromJson(JsonObject json) {
    {String*}? disabledTransports = json.getArrayOrNull("disabledTransports")?.strings;
    Integer? heartbeatInterval = json.getIntegerOrNull("heartbeatInterval");
    Boolean? insertJSESSIONID = json.getBooleanOrNull("insertJSESSIONID");
    String? libraryURL = json.getStringOrNull("libraryURL");
    Integer? maxBytesStreaming = json.getIntegerOrNull("maxBytesStreaming");
    Integer? sessionTimeout = json.getIntegerOrNull("sessionTimeout");
    return SockJSHandlerOptions {
      disabledTransports = disabledTransports;
      heartbeatInterval = heartbeatInterval;
      insertJSESSIONID = insertJSESSIONID;
      libraryURL = libraryURL;
      maxBytesStreaming = maxBytesStreaming;
      sessionTimeout = sessionTimeout;
    };
  }

  shared object toJava extends Converter<SockJSHandlerOptions, SockJSHandlerOptions_>() {
    shared actual SockJSHandlerOptions_ convert(SockJSHandlerOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = SockJSHandlerOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(SockJSHandlerOptions obj) => obj.toJson();
}
