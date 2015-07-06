import java.lang {
  String_=String
}
import io.vertx.ceylon.core.eventbus {
  DeliveryOptions
}
import io.vertx.ceylon.core {
  MultiMap
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.eventbus {
  Message_=Message
}
/* Generated from io.vertx.core.eventbus.Message<T> */
shared abstract class Message<T>(Message_<Object> delegate) satisfies Delegating {
  shared formal String(*<[]>) address;
  shared formal MultiMap(*<[]>) headers;
  shared formal T(*<[]>) body;
  shared formal String(*<[]>) replyAddress;
  shared formal Anything(*<[Object]|[Object,Anything(Throwable|Message<Object>)]|[Object,DeliveryOptions]|[Object,DeliveryOptions,Anything(Throwable|Message<Object>)]>) reply;
  shared formal Anything(*<[Integer,String]>) fail;
}
