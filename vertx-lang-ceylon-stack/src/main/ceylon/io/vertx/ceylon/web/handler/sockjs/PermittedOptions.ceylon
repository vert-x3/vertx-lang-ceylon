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
shared class PermittedOptions(
  shared String? address = null,
  shared String? addressRegex = null,
  shared JsonObject? match = null,
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
