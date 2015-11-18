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
  NetworkOptions_=NetworkOptions
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.core.net.NetworkOptions */
" @author <a href=\"http://tfox.org\">Tim Fox</a>\n"
shared class NetworkOptions(
  " Return the TCP receive buffer size, in bytes\n"
  shared Integer? receiveBufferSize = null,
  " @return  the value of reuse address\n"
  shared Boolean? reuseAddress = null,
  " Return the TCP send buffer size, in bytes.\n"
  shared Integer? sendBufferSize = null,
  " @return  the value of traffic class\n"
  shared Integer? trafficClass = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists receiveBufferSize) {
      json.put("receiveBufferSize", receiveBufferSize);
    }
    if (exists reuseAddress) {
      json.put("reuseAddress", reuseAddress);
    }
    if (exists sendBufferSize) {
      json.put("sendBufferSize", sendBufferSize);
    }
    if (exists trafficClass) {
      json.put("trafficClass", trafficClass);
    }
    return json;
  }
}

shared object networkOptions {

  shared NetworkOptions fromJson(JsonObject json) {
    Integer? receiveBufferSize = json.getIntegerOrNull("receiveBufferSize");
    Boolean? reuseAddress = json.getBooleanOrNull("reuseAddress");
    Integer? sendBufferSize = json.getIntegerOrNull("sendBufferSize");
    Integer? trafficClass = json.getIntegerOrNull("trafficClass");
    return NetworkOptions {
      receiveBufferSize = receiveBufferSize;
      reuseAddress = reuseAddress;
      sendBufferSize = sendBufferSize;
      trafficClass = trafficClass;
    };
  }
}
