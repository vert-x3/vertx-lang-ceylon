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
  PermittedOptions_=PermittedOptions
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.ext.bridge.PermittedOptions */
" Represents a match to allow for inbound and outbound traffic.\n"
shared class PermittedOptions(
  " The exact address the message is being sent to. If you want to allow messages based on\n an exact address you use this field.\n"
  shared String? address = null,
  " A regular expression that will be matched against the address. If you want to allow messages\n based on a regular expression you use this field. If the [setAddress](PermittedOptions.type.html#setAddress) value is specified\n this will be ignored.\n"
  shared String? addressRegex = null,
  " This allows you to allow messages based on their structure. Any fields in the match must exist in the\n message with the same values for them to be allowed. This currently only works with JSON messages.\n"
  shared JsonObject? match = null,
  " Declare a specific authority that user must have in order to allow messages\n"
  shared String? requiredAuthority = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists address) {
      json.put("address", address);
    }
    if (exists addressRegex) {
      json.put("addressRegex", addressRegex);
    }
    if (exists match) {
      json.put("match", match);
    }
    if (exists requiredAuthority) {
      json.put("requiredAuthority", requiredAuthority);
    }
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
