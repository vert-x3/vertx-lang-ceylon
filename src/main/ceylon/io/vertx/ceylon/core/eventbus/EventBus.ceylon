import java.lang {
  Void_=Void,
  String_=String
}
import io.vertx.ceylon.core.eventbus {
  DeliveryOptions,
  Message,
  MessageConsumer,
  MessageProducer
}
import io.vertx.core {
  Handler_=Handler,
  AsyncResult_=AsyncResult
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.metrics {
  Measured_=Measured
}
import io.vertx.ceylon.core.metrics {
  Measured
}
import io.vertx.core.eventbus {
  EventBus_=EventBus,
  DeliveryOptions_=DeliveryOptions,
  Message_=Message,
  MessageConsumer_=MessageConsumer,
  MessageProducer_=MessageProducer
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

shared abstract class EventBus_Impl(EventBus_ delegate) satisfies EventBus & Delegating<EventBus_> {

  shared actual EventBus(*<[String,Object]|[String,Object,Anything(Throwable|Message<Object>)]|[String,Object,DeliveryOptions]|[String,Object,DeliveryOptions,Anything(Throwable|Message<Object>)]>) send => flatten(send_impl);
  shared actual EventBus(*<[String,Object]|[String,Object,DeliveryOptions]>) publish => flatten(publish_impl);
  shared actual MessageConsumer<Object>(*<[String]|[String,Anything(Message<Object>)]>) consumer => flatten(consumer_impl);
  shared actual MessageConsumer<Object>(*<[String]|[String,Anything(Message<Object>)]>) localConsumer => flatten(localConsumer_impl);
  shared actual MessageProducer<Object>(*<[String]|[String,DeliveryOptions]>) sender => flatten(sender_impl);
  shared actual MessageProducer<Object>(*<[String]|[String,DeliveryOptions]>) publisher => flatten(publisher_impl);
  shared actual Anything(*<[Anything(Throwable?)]>) close => flatten(close_impl);

  EventBus send_impl([String,Object]|[String,Object,Anything(Throwable|Message<Object>)]|[String,Object,DeliveryOptions]|[String,Object,DeliveryOptions,Anything(Throwable|Message<Object>)] args) {
    if (is [String,Object] args) {
      String arg_0 = args[0];
      Object arg_1 = args[1];
      Anything v = delegate.send(arg_0,arg_1);
    }
    if (is [String,Object,Anything(Throwable|Message<Object>)] args) {
      String arg_0 = args[0];
      Object arg_1 = args[1];
      Handler_<AsyncResult_<Message_<Object>>> arg_2 = nothing;
      Anything v = delegate.send(arg_0,arg_1,arg_2);
    }
    if (is [String,Object,DeliveryOptions] args) {
      String arg_0 = args[0];
      Object arg_1 = args[1];
      DeliveryOptions_ arg_2 = DeliveryOptions_();
      Anything v = delegate.send(arg_0,arg_1,arg_2);
    }
    if (is [String,Object,DeliveryOptions,Anything(Throwable|Message<Object>)] args) {
      String arg_0 = args[0];
      Object arg_1 = args[1];
      DeliveryOptions_ arg_2 = DeliveryOptions_();
      Handler_<AsyncResult_<Message_<Object>>> arg_3 = nothing;
      Anything v = delegate.send(arg_0,arg_1,arg_2,arg_3);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  EventBus publish_impl([String,Object]|[String,Object,DeliveryOptions] args) {
    if (is [String,Object] args) {
      String arg_0 = args[0];
      Object arg_1 = args[1];
      Anything v = delegate.publish(arg_0,arg_1);
    }
    if (is [String,Object,DeliveryOptions] args) {
      String arg_0 = args[0];
      Object arg_1 = args[1];
      DeliveryOptions_ arg_2 = DeliveryOptions_();
      Anything v = delegate.publish(arg_0,arg_1,arg_2);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MessageConsumer<Object> consumer_impl([String]|[String,Anything(Message<Object>)] args) {
    if (is [String] args) {
      String arg_0 = args[0];
      Anything v = delegate.consumer(arg_0);
    }
    if (is [String,Anything(Message<Object>)] args) {
      String arg_0 = args[0];
      Handler_<Message_<Object>> arg_1 = nothing;
      Anything v = delegate.consumer(arg_0,arg_1);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MessageConsumer<Object> localConsumer_impl([String]|[String,Anything(Message<Object>)] args) {
    if (is [String] args) {
      String arg_0 = args[0];
      Anything v = delegate.localConsumer(arg_0);
    }
    if (is [String,Anything(Message<Object>)] args) {
      String arg_0 = args[0];
      Handler_<Message_<Object>> arg_1 = nothing;
      Anything v = delegate.localConsumer(arg_0,arg_1);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MessageProducer<Object> sender_impl([String]|[String,DeliveryOptions] args) {
    if (is [String] args) {
      String arg_0 = args[0];
      Anything v = delegate.sender(arg_0);
    }
    if (is [String,DeliveryOptions] args) {
      String arg_0 = args[0];
      DeliveryOptions_ arg_1 = DeliveryOptions_();
      Anything v = delegate.sender(arg_0,arg_1);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MessageProducer<Object> publisher_impl([String]|[String,DeliveryOptions] args) {
    if (is [String] args) {
      String arg_0 = args[0];
      Anything v = delegate.publisher(arg_0);
    }
    if (is [String,DeliveryOptions] args) {
      String arg_0 = args[0];
      DeliveryOptions_ arg_1 = DeliveryOptions_();
      Anything v = delegate.publisher(arg_0,arg_1);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything close_impl([Anything(Throwable?)] args) {
    Handler_<AsyncResult_<Void_>> arg_0 = nothing;
    Anything v = delegate.close(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
