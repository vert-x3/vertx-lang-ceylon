import io.vertx.core.datagram {
  DatagramSocketOptions_=DatagramSocketOptions
}
import io.vertx.ceylon.core.net {
  NetworkOptions
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
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.core.datagram.DatagramSocketOptions */
shared class DatagramSocketOptions(
  shared Boolean? broadcast = null,
  shared Boolean? ipV6 = null,
  shared Boolean? loopbackModeDisabled = null,
  shared String? multicastNetworkInterface = null,
  shared Integer? multicastTimeToLive = null,
  Integer? receiveBufferSize = null,
  Boolean? reuseAddress = null,
  Integer? sendBufferSize = null,
  Integer? trafficClass = null) extends NetworkOptions(
  receiveBufferSize,
  reuseAddress,
  sendBufferSize,
  trafficClass) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists broadcast) {
      json.put("broadcast", broadcast);
    }
    if (exists ipV6) {
      json.put("ipV6", ipV6);
    }
    if (exists loopbackModeDisabled) {
      json.put("loopbackModeDisabled", loopbackModeDisabled);
    }
    if (exists multicastNetworkInterface) {
      json.put("multicastNetworkInterface", multicastNetworkInterface);
    }
    if (exists multicastTimeToLive) {
      json.put("multicastTimeToLive", multicastTimeToLive);
    }
    return json;
  }
}

shared object datagramSocket {

  shared object toJava extends Converter<DatagramSocketOptions, DatagramSocketOptions_>() {
    shared actual DatagramSocketOptions_ convert(DatagramSocketOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = DatagramSocketOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(DatagramSocketOptions obj) => obj.toJson();
}
