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
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.core.datagram.DatagramSocketOptions */
" Options used to configure a datagram socket.\n"
shared class DatagramSocketOptions(
  " Set if the socket can receive broadcast packets\n"
  shared Boolean? broadcast = null,
  " Set if IP v6 should be used\n"
  shared Boolean? ipV6 = null,
  Boolean? logActivity = null,
  " Set if loopback mode is disabled\n"
  shared Boolean? loopbackModeDisabled = null,
  " Set the multicast network interface address\n"
  shared String? multicastNetworkInterface = null,
  " Set the multicast ttl value\n"
  shared Integer? multicastTimeToLive = null,
  Integer? receiveBufferSize = null,
  Boolean? reuseAddress = null,
  Integer? sendBufferSize = null,
  Integer? trafficClass = null) extends NetworkOptions(
  logActivity,
  receiveBufferSize,
  reuseAddress,
  sendBufferSize,
  trafficClass) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = super.toJson();
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

shared object datagramSocketOptions {

  shared DatagramSocketOptions fromJson(JsonObject json) {
    Boolean? broadcast = json.getBooleanOrNull("broadcast");
    Boolean? ipV6 = json.getBooleanOrNull("ipV6");
    Boolean? logActivity = json.getBooleanOrNull("logActivity");
    Boolean? loopbackModeDisabled = json.getBooleanOrNull("loopbackModeDisabled");
    String? multicastNetworkInterface = json.getStringOrNull("multicastNetworkInterface");
    Integer? multicastTimeToLive = json.getIntegerOrNull("multicastTimeToLive");
    Integer? receiveBufferSize = json.getIntegerOrNull("receiveBufferSize");
    Boolean? reuseAddress = json.getBooleanOrNull("reuseAddress");
    Integer? sendBufferSize = json.getIntegerOrNull("sendBufferSize");
    Integer? trafficClass = json.getIntegerOrNull("trafficClass");
    return DatagramSocketOptions {
      broadcast = broadcast;
      ipV6 = ipV6;
      logActivity = logActivity;
      loopbackModeDisabled = loopbackModeDisabled;
      multicastNetworkInterface = multicastNetworkInterface;
      multicastTimeToLive = multicastTimeToLive;
      receiveBufferSize = receiveBufferSize;
      reuseAddress = reuseAddress;
      sendBufferSize = sendBufferSize;
      trafficClass = trafficClass;
    };
  }

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
