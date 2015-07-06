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

  EventBus send_impl([String,Object]|[String,Object,Anything(Throwable|Message<Object>)]|[String,Object,DeliveryOptions]|[String,Object,DeliveryOptions,Anything(Throwable|Message<Object>)] args) {
    throw Exception("implement me");
  }

  shared  EventBus(*<[String,Object]|[String,Object,Anything(Throwable|Message<Object>)]|[String,Object,DeliveryOptions]|[String,Object,DeliveryOptions,Anything(Throwable|Message<Object>)]>) send = flatten(send_impl);

  EventBus publish_impl([String,Object]|[String,Object,DeliveryOptions] args) {
    throw Exception("implement me");
  }

  shared  EventBus(*<[String,Object]|[String,Object,DeliveryOptions]>) publish = flatten(publish_impl);

  MessageConsumer<Object> consumer_impl([String]|[String,Anything(Message<Object>)] args) {
    throw Exception("implement me");
  }

  shared  MessageConsumer<Object>(*<[String]|[String,Anything(Message<Object>)]>) consumer = flatten(consumer_impl);

  MessageConsumer<Object> localConsumer_impl([String]|[String,Anything(Message<Object>)] args) {
    throw Exception("implement me");
  }

  shared  MessageConsumer<Object>(*<[String]|[String,Anything(Message<Object>)]>) localConsumer = flatten(localConsumer_impl);

  MessageProducer<Object> sender_impl([String]|[String,DeliveryOptions] args) {
    throw Exception("implement me");
  }

  shared  MessageProducer<Object>(*<[String]|[String,DeliveryOptions]>) sender = flatten(sender_impl);

  MessageProducer<Object> publisher_impl([String]|[String,DeliveryOptions] args) {
    throw Exception("implement me");
  }

  shared  MessageProducer<Object>(*<[String]|[String,DeliveryOptions]>) publisher = flatten(publisher_impl);

  Anything close_impl([Anything(Throwable?)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable?)]>) close = flatten(close_impl);

}
