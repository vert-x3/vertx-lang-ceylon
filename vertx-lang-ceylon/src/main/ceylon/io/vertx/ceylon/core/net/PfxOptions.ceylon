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
  PfxOptions_=PfxOptions
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.core.net.PfxOptions */
shared class PfxOptions(
  shared String? password = null,
  shared String? path = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists password) {
      json.put("password", password);
    }
    if (exists path) {
      json.put("path", path);
    }
    return json;
  }
}

shared object pfxOptions {

  shared PfxOptions fromJson(JsonObject json) {
    String? password = json.getStringOrNull("password");
    String? path = json.getStringOrNull("path");
    return PfxOptions {
      password = password;
      path = path;
    };
  }

  shared object toJava extends Converter<PfxOptions, PfxOptions_>() {
    shared actual PfxOptions_ convert(PfxOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = PfxOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(PfxOptions obj) => obj.toJson();
}
