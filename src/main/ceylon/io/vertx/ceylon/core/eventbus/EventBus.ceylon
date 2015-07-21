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
shared interface EventBus satisfies Measured {

  shared formal EventBus(*<[String,Object]|[String,Object,Anything(Throwable|Message<Object>)]|[String,Object,DeliveryOptions]|[String,Object,DeliveryOptions,Anything(Throwable|Message<Object>)]>) send;
  shared formal EventBus(*<[String,Object]|[String,Object,DeliveryOptions]>) publish;
  shared formal MessageConsumer<Object>(*<[String]|[String,Anything(Message<Object>)]>) consumer;
  shared formal MessageConsumer<Object>(*<[String]|[String,Anything(Message<Object>)]>) localConsumer;
  shared formal MessageProducer<Object>(*<[String]|[String,DeliveryOptions]>) sender;
  shared formal MessageProducer<Object>(*<[String]|[String,DeliveryOptions]>) publisher;
  shared formal Anything(*<[Anything(Throwable?)]>) close;
}
/* Generated from io.vertx.core.eventbus.EventBus */

shared abstract class EventBus_Impl(EventBus delegate) satisfies EventBus & Delegating<EventBus> {

  shared actual EventBus(*<[String,Object]|[String,Object,Anything(Throwable|Message<Object>)]|[String,Object,DeliveryOptions]|[String,Object,DeliveryOptions,Anything(Throwable|Message<Object>)]>) send => flatten(send_impl);
  shared actual EventBus(*<[String,Object]|[String,Object,DeliveryOptions]>) publish => flatten(publish_impl);
  shared actual MessageConsumer<Object>(*<[String]|[String,Anything(Message<Object>)]>) consumer => flatten(consumer_impl);
  shared actual MessageConsumer<Object>(*<[String]|[String,Anything(Message<Object>)]>) localConsumer => flatten(localConsumer_impl);
  shared actual MessageProducer<Object>(*<[String]|[String,DeliveryOptions]>) sender => flatten(sender_impl);
  shared actual MessageProducer<Object>(*<[String]|[String,DeliveryOptions]>) publisher => flatten(publisher_impl);
  shared actual Anything(*<[Anything(Throwable?)]>) close => flatten(close_impl);

  EventBus send_impl([String,Object]|[String,Object,Anything(Throwable|Message<Object>)]|[String,Object,DeliveryOptions]|[String,Object,DeliveryOptions,Anything(Throwable|Message<Object>)] args) {
    if (is [String,Object] args) {
      Anything v = delegate.send(args[0],nothing);
    }
    if (is [String,Object,Anything(Throwable|Message<Object>)] args) {
      Anything v = delegate.send(args[0],nothing,nothing);
    }
    if (is [String,Object,DeliveryOptions] args) {
      Anything v = delegate.send(args[0],nothing,nothing);
    }
    if (is [String,Object,DeliveryOptions,Anything(Throwable|Message<Object>)] args) {
      Anything v = delegate.send(args[0],nothing,nothing,nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  EventBus publish_impl([String,Object]|[String,Object,DeliveryOptions] args) {
    if (is [String,Object] args) {
      Anything v = delegate.publish(args[0],nothing);
    }
    if (is [String,Object,DeliveryOptions] args) {
      Anything v = delegate.publish(args[0],nothing,nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MessageConsumer<Object> consumer_impl([String]|[String,Anything(Message<Object>)] args) {
    if (is [String] args) {
      Anything v = delegate.consumer(args[0]);
    }
    if (is [String,Anything(Message<Object>)] args) {
      Anything v = delegate.consumer(args[0],nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MessageConsumer<Object> localConsumer_impl([String]|[String,Anything(Message<Object>)] args) {
    if (is [String] args) {
      Anything v = delegate.localConsumer(args[0]);
    }
    if (is [String,Anything(Message<Object>)] args) {
      Anything v = delegate.localConsumer(args[0],nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MessageProducer<Object> sender_impl([String]|[String,DeliveryOptions] args) {
    if (is [String] args) {
      Anything v = delegate.sender(args[0]);
    }
    if (is [String,DeliveryOptions] args) {
      Anything v = delegate.sender(args[0],nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MessageProducer<Object> publisher_impl([String]|[String,DeliveryOptions] args) {
    if (is [String] args) {
      Anything v = delegate.publisher(args[0]);
    }
    if (is [String,DeliveryOptions] args) {
      Anything v = delegate.publisher(args[0],nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything close_impl([Anything(Throwable?)] args) {
    Anything v = delegate.close(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
