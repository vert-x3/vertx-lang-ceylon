import ceylon.json {
  JsonObject=Object,
  parse
}
import io.vertx.lang.ceylon {
  BaseDataObject,
  Converter
}
import io.vertx.core.metrics {
  MetricsOptions_=MetricsOptions
}
/* Generated from io.vertx.core.metrics.MetricsOptions */
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

shared object toMetricsOptions satisfies Converter<MetricsOptions_, MetricsOptions> {
  shared actual MetricsOptions convert(MetricsOptions_ src) {
    value json = parse(src.toJson().string);
    assert(is JsonObject json);
    Boolean? enabled = json.getBooleanOrNull("enabled");
    return MetricsOptions {
      enabled = enabled;
    };
  }
}
