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
  " Set the codec name.\n"
  shared String? codecName = null,
  " Add a message header.\n <p>\n Message headers can be sent with any message and will be accessible with [headers](../eventbus/Message.type.html#headers)\n at the recipient.\n"
  shared Map<String, String>? headers = null,
  " Set the send timeout.\n"
  shared Integer? sendTimeout = null) satisfies BaseDataObject {
  shared actual default JsonObject toJson() {
    value json = JsonObject();
    if (exists codecName) {
      json.put("codecName", codecName);
    }
    if (exists headers) {
      json.put("headers", JsonObject(headers));
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
    Map<String, String>? headers = if (exists tmp = json.getObjectOrNull("headers")) then HashMap { for(key->val in tmp) if (is String val) key->val } else null;
    Integer? sendTimeout = json.getIntegerOrNull("sendTimeout");
    return DeliveryOptions {
      codecName = codecName;
      headers = headers;
      sendTimeout = sendTimeout;
    };
  }

  shared object toCeylon extends Converter<DeliveryOptions_, DeliveryOptions>() {
    shared actual DeliveryOptions convert(DeliveryOptions_ src) {
      value json = parse(src.toJson().string);
      assert(is JsonObject json);
      return fromJson(json);
    }
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
