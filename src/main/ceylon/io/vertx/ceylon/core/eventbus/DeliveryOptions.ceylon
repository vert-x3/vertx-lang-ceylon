import ceylon.json {
  JsonObject=Object
}
import io.vertx.lang.ceylon {
  BaseDataObject
}
import io.vertx.core.eventbus {
  DeliveryOptions_=DeliveryOptions
}
/* Generated from io.vertx.core.eventbus.DeliveryOptions */
shared class DeliveryOptions(
  shared String? codecName = null,
  shared Integer? sendTimeout = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists codecName) {
      json.put("codecName", codecName);
    }
    if (exists sendTimeout) {
      json.put("sendTimeout", sendTimeout);
    }
    return json;
  }
}
shared DeliveryOptions toDeliveryOptions(JsonObject json) {
  String? codecName = json.getStringOrNull("codecName");
  Integer? sendTimeout = json.getIntegerOrNull("sendTimeout");
  return DeliveryOptions {
    codecName = codecName;
    sendTimeout = sendTimeout;
  };
}
