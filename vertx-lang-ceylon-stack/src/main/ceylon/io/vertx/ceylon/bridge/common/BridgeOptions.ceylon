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
import io.vertx.ext.bridge {
  BridgeOptions_=BridgeOptions
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.ext.bridge.BridgeOptions */
" Specify the event bus bridge options.\n"
shared class BridgeOptions(
  " Sets the list of inbound permitted options.\n"
  shared {PermittedOptions*}? inboundPermitteds = null,
  " Sets the list of outbound permitted options.\n"
  shared {PermittedOptions*}? outboundPermitteds = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists inboundPermitteds) {
      json.put("inboundPermitteds", JsonArray(inboundPermitteds.map(permittedOptions_.toJson)));
    }
    if (exists outboundPermitteds) {
      json.put("outboundPermitteds", JsonArray(outboundPermitteds.map(permittedOptions_.toJson)));
    }
    return json;
  }
}

shared object bridgeOptions {

  shared BridgeOptions fromJson(JsonObject json) {
    {PermittedOptions*}? inboundPermitteds = json.getArrayOrNull("inboundPermitteds")?.objects?.map(permittedOptions_.fromJson);
    {PermittedOptions*}? outboundPermitteds = json.getArrayOrNull("outboundPermitteds")?.objects?.map(permittedOptions_.fromJson);
    return BridgeOptions {
      inboundPermitteds = inboundPermitteds;
      outboundPermitteds = outboundPermitteds;
    };
  }

  shared object toCeylon extends Converter<BridgeOptions_, BridgeOptions>() {
    shared actual BridgeOptions convert(BridgeOptions_ src) {
      value json = parse(src.toJson().string);
      assert(is JsonObject json);
      return fromJson(json);
    }
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
