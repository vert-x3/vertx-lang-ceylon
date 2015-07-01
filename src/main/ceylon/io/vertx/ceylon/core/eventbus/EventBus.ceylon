import java.lang {
  String_=String
}
import io.vertx.ceylon.core.eventbus {
  DeliveryOptions,
  Message,
  MessageConsumer,
  MessageProducer
}
import io.vertx.ceylon.core.metrics {
  Measured
}
/* Generated from io.vertx.core.eventbus.EventBus */
shared abstract class EventBus() satisfies Measured {
  shared formal Anything(*<[String,Object]|[String,Object,Anything(Throwable|Message<Object>)]|[String,Object,DeliveryOptions]|[String,Object,DeliveryOptions,Anything(Throwable|Message<Object>)]>) send;
  shared formal Anything(*<[String,Object]|[String,Object,DeliveryOptions]>) publish;
  shared formal Anything(*<[String]|[String,Anything(Message<Object>)]>) consumer;
  shared formal Anything(*<[String]|[String,Anything(Message<Object>)]>) localConsumer;
  shared formal Anything(*<[String]|[String,DeliveryOptions]>) sender;
  shared formal Anything(*<[String]|[String,DeliveryOptions]>) publisher;
  shared formal Anything(*<[Anything(Throwable?)]>) close;
}
