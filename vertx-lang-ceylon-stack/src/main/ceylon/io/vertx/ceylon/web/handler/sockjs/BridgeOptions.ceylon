import io.vertx.ceylon.bridge.common {
  PermittedOptions,
  permittedOptions_=permittedOptions
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
import io.vertx.ext.web.handler.sockjs {
  BridgeOptions_=BridgeOptions
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.ext.web.handler.sockjs.BridgeOptions */
" Options for configuring the event bus bridge.\n"
shared class BridgeOptions(
  shared {PermittedOptions*}? inboundPermitted = null,
  shared {PermittedOptions*}? inboundPermitteds = null,
  shared Integer? maxAddressLength = null,
  shared Integer? maxHandlersPerSocket = null,
  shared {PermittedOptions*}? outboundPermitted = null,
  shared {PermittedOptions*}? outboundPermitteds = null,
  shared Integer? pingTimeout = null,
  shared Integer? replyTimeout = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists inboundPermitted) {
      json.put("inboundPermitted", JsonArray(inboundPermitted.map(permittedOptions_.toJson)));
    }
    if (exists inboundPermitteds) {
      json.put("inboundPermitteds", JsonArray(inboundPermitteds.map(permittedOptions_.toJson)));
    }
    if (exists maxAddressLength) {
      json.put("maxAddressLength", maxAddressLength);
    }
    if (exists maxHandlersPerSocket) {
      json.put("maxHandlersPerSocket", maxHandlersPerSocket);
    }
    if (exists outboundPermitted) {
      json.put("outboundPermitted", JsonArray(outboundPermitted.map(permittedOptions_.toJson)));
    }
    if (exists outboundPermitteds) {
      json.put("outboundPermitteds", JsonArray(outboundPermitteds.map(permittedOptions_.toJson)));
    }
    if (exists pingTimeout) {
      json.put("pingTimeout", pingTimeout);
    }
    if (exists replyTimeout) {
      json.put("replyTimeout", replyTimeout);
    }
    return json;
  }
}

shared object bridgeOptions {

  shared BridgeOptions fromJson(JsonObject json) {
    {PermittedOptions*}? inboundPermitted = json.getArrayOrNull("inboundPermitted")?.objects?.map(permittedOptions_.fromJson);
    {PermittedOptions*}? inboundPermitteds = json.getArrayOrNull("inboundPermitteds")?.objects?.map(permittedOptions_.fromJson);
    Integer? maxAddressLength = json.getIntegerOrNull("maxAddressLength");
    Integer? maxHandlersPerSocket = json.getIntegerOrNull("maxHandlersPerSocket");
    {PermittedOptions*}? outboundPermitted = json.getArrayOrNull("outboundPermitted")?.objects?.map(permittedOptions_.fromJson);
    {PermittedOptions*}? outboundPermitteds = json.getArrayOrNull("outboundPermitteds")?.objects?.map(permittedOptions_.fromJson);
    Integer? pingTimeout = json.getIntegerOrNull("pingTimeout");
    Integer? replyTimeout = json.getIntegerOrNull("replyTimeout");
    return BridgeOptions {
      inboundPermitted = inboundPermitted;
      inboundPermitteds = inboundPermitteds;
      maxAddressLength = maxAddressLength;
      maxHandlersPerSocket = maxHandlersPerSocket;
      outboundPermitted = outboundPermitted;
      outboundPermitteds = outboundPermitteds;
      pingTimeout = pingTimeout;
      replyTimeout = replyTimeout;
    };
  }

  shared object toJava extends Converter<BridgeOptions, BridgeOptions_>() {
    shared actual BridgeOptions_ convert(BridgeOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = BridgeOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(BridgeOptions obj) => obj.toJson();
}
