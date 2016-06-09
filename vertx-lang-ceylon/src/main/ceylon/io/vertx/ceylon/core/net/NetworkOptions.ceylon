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
  " Set to true to enabled network activity logging: Netty's pipeline is configured for logging on Netty's logger.\n"
  shared Boolean? logActivity = null,
  " Set the TCP receive buffer size\n"
  shared Integer? receiveBufferSize = null,
  " Set the value of reuse address\n"
  shared Boolean? reuseAddress = null,
  " Set the TCP send buffer size\n"
  shared Integer? sendBufferSize = null,
  " Set the value of traffic class\n"
  shared Integer? trafficClass = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists logActivity) {
      json.put("logActivity", logActivity);
    }
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
    Boolean? logActivity = json.getBooleanOrNull("logActivity");
    Integer? receiveBufferSize = json.getIntegerOrNull("receiveBufferSize");
    Boolean? reuseAddress = json.getBooleanOrNull("reuseAddress");
    Integer? sendBufferSize = json.getIntegerOrNull("sendBufferSize");
    Integer? trafficClass = json.getIntegerOrNull("trafficClass");
    return NetworkOptions {
      logActivity = logActivity;
      receiveBufferSize = receiveBufferSize;
      reuseAddress = reuseAddress;
      sendBufferSize = sendBufferSize;
      trafficClass = trafficClass;
    };
  }
}
