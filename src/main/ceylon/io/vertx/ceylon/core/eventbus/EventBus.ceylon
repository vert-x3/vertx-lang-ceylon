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

  shared  EventBus(*<[String,Object]|[String,Object,Anything(Throwable|Message<Object>)]|[String,Object,DeliveryOptions]|[String,Object,DeliveryOptions,Anything(Throwable|Message<Object>)]>) send => flatten(send_impl);

  shared  EventBus(*<[String,Object]|[String,Object,DeliveryOptions]>) publish => flatten(publish_impl);

  shared  MessageConsumer<Object>(*<[String]|[String,Anything(Message<Object>)]>) consumer => flatten(consumer_impl);

  shared  MessageConsumer<Object>(*<[String]|[String,Anything(Message<Object>)]>) localConsumer => flatten(localConsumer_impl);

  shared  MessageProducer<Object>(*<[String]|[String,DeliveryOptions]>) sender => flatten(sender_impl);

  shared  MessageProducer<Object>(*<[String]|[String,DeliveryOptions]>) publisher => flatten(publisher_impl);

  shared  Anything(*<[Anything(Throwable?)]>) close => flatten(close_impl);

  EventBus send_impl([String,Object]|[String,Object,Anything(Throwable|Message<Object>)]|[String,Object,DeliveryOptions]|[String,Object,DeliveryOptions,Anything(Throwable|Message<Object>)] args) {
    if (is [String,Object] args) {
      // Invoke method
    }
    if (is [String,Object,Anything(Throwable|Message<Object>)] args) {
      // Invoke method
    }
    if (is [String,Object,DeliveryOptions] args) {
      // Invoke method
    }
    if (is [String,Object,DeliveryOptions,Anything(Throwable|Message<Object>)] args) {
      // Invoke method
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  EventBus publish_impl([String,Object]|[String,Object,DeliveryOptions] args) {
    if (is [String,Object] args) {
      // Invoke method
    }
    if (is [String,Object,DeliveryOptions] args) {
      // Invoke method
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MessageConsumer<Object> consumer_impl([String]|[String,Anything(Message<Object>)] args) {
    if (is [String] args) {
      // Invoke method
    }
    if (is [String,Anything(Message<Object>)] args) {
      // Invoke method
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MessageConsumer<Object> localConsumer_impl([String]|[String,Anything(Message<Object>)] args) {
    if (is [String] args) {
      // Invoke method
    }
    if (is [String,Anything(Message<Object>)] args) {
      // Invoke method
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MessageProducer<Object> sender_impl([String]|[String,DeliveryOptions] args) {
    if (is [String] args) {
      // Invoke method
    }
    if (is [String,DeliveryOptions] args) {
      // Invoke method
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MessageProducer<Object> publisher_impl([String]|[String,DeliveryOptions] args) {
    if (is [String] args) {
      // Invoke method
    }
    if (is [String,DeliveryOptions] args) {
      // Invoke method
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything close_impl([Anything(Throwable?)] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
