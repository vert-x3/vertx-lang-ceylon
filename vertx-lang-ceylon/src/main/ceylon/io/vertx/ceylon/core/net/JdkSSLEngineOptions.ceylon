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
  JdkSSLEngineOptions_=JdkSSLEngineOptions
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.core.net.JdkSSLEngineOptions */
" Configures a [TCPSSLOptions](../net/TCPSSLOptions.type.html) to use the JDK ssl engine implementation.\n"
shared class JdkSSLEngineOptions() satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    return json;
  }
}

shared object jdkSSLEngineOptions {

  shared JdkSSLEngineOptions fromJson(JsonObject json) {
    return JdkSSLEngineOptions {
    };
  }

  shared object toCeylon extends Converter<JdkSSLEngineOptions_, JdkSSLEngineOptions>() {
    shared actual JdkSSLEngineOptions convert(JdkSSLEngineOptions_ src) {
      value json = parse(src.toJson().string);
      assert(is JsonObject json);
      return fromJson(json);
    }
  }

  shared object toJava extends Converter<JdkSSLEngineOptions, JdkSSLEngineOptions_>() {
    shared actual JdkSSLEngineOptions_ convert(JdkSSLEngineOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = JdkSSLEngineOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(JdkSSLEngineOptions obj) => obj.toJson();
}
