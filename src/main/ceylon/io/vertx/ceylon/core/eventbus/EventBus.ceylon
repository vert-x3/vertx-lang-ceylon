import java.lang {
  String_=String
}
import io.vertx.ceylon.core.eventbus {
  DeliveryOptions,
  Message,
  MessageConsumer,
  MessageProducer
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.ceylon.core.metrics {
  Measured
}
import io.vertx.core.eventbus {
  EventBus_=EventBus
}
/* Generated from io.vertx.core.eventbus.EventBus */
shared abstract class EventBus(EventBus_ delegate) satisfies Delegating
  & Measured {
  shared formal EventBus(*<[String,Object]|[String,Object,Anything(Throwable|Message<Object>)]|[String,Object,DeliveryOptions]|[String,Object,DeliveryOptions,Anything(Throwable|Message<Object>)]>) send;
  shared formal EventBus(*<[String,Object]|[String,Object,DeliveryOptions]>) publish;
  shared formal MessageConsumer<Object>(*<[String]|[String,Anything(Message<Object>)]>) consumer;
  shared formal MessageConsumer<Object>(*<[String]|[String,Anything(Message<Object>)]>) localConsumer;
  shared formal MessageProducer<Object>(*<[String]|[String,DeliveryOptions]>) sender;
  shared formal MessageProducer<Object>(*<[String]|[String,DeliveryOptions]>) publisher;
  shared formal Anything(*<[Anything(Throwable?)]>) close;
}
