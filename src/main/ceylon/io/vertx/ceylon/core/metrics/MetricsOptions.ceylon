import ceylon.json {
  JsonObject=Object
}
import io.vertx.lang.ceylon {
  BaseDataObject
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
