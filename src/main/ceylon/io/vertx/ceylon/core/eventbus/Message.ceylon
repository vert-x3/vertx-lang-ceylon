import java.lang {
  String_=String
}
import io.vertx.ceylon.core.eventbus {
  DeliveryOptions
}
import io.vertx.ceylon.core {
  MultiMap
}
/* Generated from io.vertx.core.eventbus.Message<T> */
shared abstract class Message<T>() {
  shared formal Anything(*<[]>) address;
  shared formal Anything(*<[]>) headers;
  shared formal Anything(*<[]>) body;
  shared formal Anything(*<[]>) replyAddress;
  shared formal Anything(*<[]|[]|[]|[]>) reply;
  shared formal Anything(*<[]>) fail;
}
