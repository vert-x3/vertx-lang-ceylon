import io.vertx.ceylon.bridge.common {
  Io_vertx_ext_bridge_PermittedOptions=PermittedOptions
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
  PermittedOptions_=PermittedOptions
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.ext.web.handler.sockjs.PermittedOptions */
" Specify a match to allow for inbound and outbound traffic using the\n [BridgeOptions](../../handler/sockjs/BridgeOptions.type.html).\n"
shared class PermittedOptions(
  String? address = null,
  String? addressRegex = null,
  JsonObject? match = null,
  String? requiredAuthority = null) extends Io_vertx_ext_bridge_PermittedOptions(
  address,
  addressRegex,
  match,
  requiredAuthority) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = super.toJson();
    return json;
  }
}

shared object permittedOptions {

  shared PermittedOptions fromJson(JsonObject json) {
    String? address = json.getStringOrNull("address");
    String? addressRegex = json.getStringOrNull("addressRegex");
    JsonObject? match = json.getObjectOrNull("match");
    String? requiredAuthority = json.getStringOrNull("requiredAuthority");
    return PermittedOptions {
      address = address;
      addressRegex = addressRegex;
      match = match;
      requiredAuthority = requiredAuthority;
    };
  }

  shared object toCeylon extends Converter<PermittedOptions_, PermittedOptions>() {
    shared actual PermittedOptions convert(PermittedOptions_ src) {
      value json = parse(src.toJson().string);
      assert(is JsonObject json);
      return fromJson(json);
    }
  }

  shared object toJava extends Converter<PermittedOptions, PermittedOptions_>() {
    shared actual PermittedOptions_ convert(PermittedOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = PermittedOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(PermittedOptions obj) => obj.toJson();
}
