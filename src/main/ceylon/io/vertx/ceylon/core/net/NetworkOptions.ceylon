import ceylon.json {
  JsonObject=Object
}
import io.vertx.lang.ceylon {
  BaseDataObject
}
import io.vertx.core.net {
  NetworkOptions_=NetworkOptions
}
/* Generated from io.vertx.core.net.NetworkOptions */
shared class NetworkOptions(
  shared Integer? receiveBufferSize = null,
  shared Boolean? reuseAddress = null,
  shared Integer? sendBufferSize = null,
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
shared NetworkOptions toNetworkOptions(JsonObject json) {
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
