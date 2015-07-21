import java.lang {
  String_=String
}
import io.vertx.ceylon.core {
  MultiMap
}
import io.vertx.core {
  Handler_=Handler,
  AsyncResult_=AsyncResult,
  MultiMap_=MultiMap
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.eventbus {
  DeliveryOptions_=DeliveryOptions
}
/* Generated from io.vertx.core.eventbus.DeliveryOptions */
shared class DeliveryOptions(
  shared String codecName,
  shared MultiMap headers,
  shared Integer sendTimeout) {
}
