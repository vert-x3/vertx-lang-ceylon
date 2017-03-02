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
  RequestOptions_=RequestOptions
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.core.http.RequestOptions */
" Options describing how an [HttpClient](../http/HttpClient.type.html) will make connect to make a request.\n"
shared class RequestOptions(
  " Set the host name to be used by the client request.\n"
  shared String? host = null,
  " Set the port to be used by the client request.\n"
  shared Integer? port = null,
  " Set whether SSL/TLS is enabled\n"
  shared Boolean? ssl = null,
  " Set the request relative URI\n"
  shared String? uri = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists host) {
      json.put("host", host);
    }
    if (exists port) {
      json.put("port", port);
    }
    if (exists ssl) {
      json.put("ssl", ssl);
    }
    if (exists uri) {
      json.put("uri", uri);
    }
    return json;
  }
}

shared object requestOptions {

  shared RequestOptions fromJson(JsonObject json) {
    String? host = json.getStringOrNull("host");
    Integer? port = json.getIntegerOrNull("port");
    Boolean? ssl = json.getBooleanOrNull("ssl");
    String? uri = json.getStringOrNull("uri");
    return RequestOptions {
      host = host;
      port = port;
      ssl = ssl;
      uri = uri;
    };
  }

  shared object toJava extends Converter<RequestOptions, RequestOptions_>() {
    shared actual RequestOptions_ convert(RequestOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = RequestOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(RequestOptions obj) => obj.toJson();
}
