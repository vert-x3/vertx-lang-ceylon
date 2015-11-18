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
import io.vertx.core.eventbus {
  DeliveryOptions_=DeliveryOptions
}
import ceylon.collection {
  HashMap
}
import io.vertx.core.json {
  JsonObject_=JsonObject,
  JsonArray_=JsonArray
}
/* Generated from io.vertx.core.eventbus.DeliveryOptions */
" Delivery options are used to configure message delivery.\n <p>\n Delivery options allow to configure delivery timeout and message codec name, and to provide any headers\n that you wish to send with the message.\n"
shared class DeliveryOptions(
  " Get the codec name.\n <p>\n When sending or publishing a message a codec name can be provided. This must correspond with a previously registered\n message codec. This allows you to send arbitrary objects on the event bus (e.g. POJOs).\n"
  shared String? codecName = null,
  " Get the send timeout.\n <p>\n When sending a message with a response handler a send timeout can be provided. If no response is received\n within the timeout the handler will be called with a failure.\n"
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

shared object deliveryOptions {

  shared DeliveryOptions fromJson(JsonObject json) {
    String? codecName = json.getStringOrNull("codecName");
    Integer? sendTimeout = json.getIntegerOrNull("sendTimeout");
    return DeliveryOptions {
      codecName = codecName;
      sendTimeout = sendTimeout;
    };
  }

  shared object toJava extends Converter<DeliveryOptions, DeliveryOptions_>() {
    shared actual DeliveryOptions_ convert(DeliveryOptions src) {
      // Todo : make optimized version without json
      value json = JsonObject_(src.toJson().string);
      value ret = DeliveryOptions_(json);
      return ret;
    }
  }
  shared JsonObject toJson(DeliveryOptions obj) => obj.toJson();
}
