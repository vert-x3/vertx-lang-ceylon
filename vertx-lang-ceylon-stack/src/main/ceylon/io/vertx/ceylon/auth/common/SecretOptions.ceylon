import io.vertx.ext.auth {
  SecretOptions_=SecretOptions
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
/* Generated from io.vertx.ext.auth.SecretOptions */
" Options describing a secret.\n"
shared class SecretOptions(
  shared String? secret = null,
  shared String? type = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists secret) {
      json.put("secret", secret);
    }
    if (exists type) {
      json.put("type", type);
    }
    return json;
  }
}

shared object secretOptions {

  shared SecretOptions fromJson(JsonObject json) {
    String? secret = json.getStringOrNull("secret");
    String? type = json.getStringOrNull("type");
    return SecretOptions {
      secret = secret;
      type = type;
    };
  }

  shared object toJava extends Converter<SecretOptions, SecretOptions_>() {
    shared actual SecretOptions_ convert(SecretOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = SecretOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(SecretOptions obj) => obj.toJson();
}
