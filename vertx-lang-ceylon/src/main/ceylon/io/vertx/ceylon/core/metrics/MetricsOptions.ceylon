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
import io.vertx.core.metrics {
  MetricsOptions_=MetricsOptions
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.core.metrics.MetricsOptions */
" Vert.x metrics base configuration, this class can be extended by provider implementations to configure\n those specific implementations.\n"
shared class MetricsOptions(
  shared Boolean? enabled = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists enabled) {
      json.put("enabled", enabled);
    }
    return json;
  }
}

shared object metricsOptions {

  shared MetricsOptions fromJson(JsonObject json) {
    Boolean? enabled = json.getBooleanOrNull("enabled");
    return MetricsOptions {
      enabled = enabled;
    };
  }

  shared object toCeylon extends Converter<MetricsOptions_, MetricsOptions>() {
    shared actual MetricsOptions convert(MetricsOptions_ src) {
      value json = parse(src.toJson().string);
      assert(is JsonObject json);
      return fromJson(json);
    }
  }

  shared object toJava extends Converter<MetricsOptions, MetricsOptions_>() {
    shared actual MetricsOptions_ convert(MetricsOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = MetricsOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(MetricsOptions obj) => obj.toJson();
}
