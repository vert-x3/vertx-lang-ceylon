import java.lang {
  String_=String
}
import io.vertx.ceylon.core.eventbus {
  DeliveryOptions
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.eventbus {
  MessageProducer_=MessageProducer
}
import io.vertx.ceylon.core.streams {
  WriteStream
}
/* Generated from io.vertx.core.eventbus.MessageProducer<T> */
shared abstract class MessageProducer<T>(MessageProducer_<Object> delegate) satisfies Delegating
  & WriteStream<T> {

  shared actual MessageProducer<T>(*<[Anything(Throwable)]>) exceptionHandler => flatten(exceptionHandler_impl);

  shared actual MessageProducer<T>(*<[T]>) write => flatten(write_impl);

  shared actual MessageProducer<T>(*<[Integer]>) setWriteQueueMaxSize => flatten(setWriteQueueMaxSize_impl);

  shared actual MessageProducer<T>(*<[Anything()]>) drainHandler => flatten(drainHandler_impl);

  shared  MessageProducer<T>(*<[DeliveryOptions]>) deliveryOptions => flatten(deliveryOptions_impl);

  shared  String(*<[]>) address => flatten(address_impl);

  MessageProducer<T> exceptionHandler_impl([Anything(Throwable)] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MessageProducer<T> write_impl([T] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MessageProducer<T> setWriteQueueMaxSize_impl([Integer] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MessageProducer<T> drainHandler_impl([Anything()] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MessageProducer<T> deliveryOptions_impl([DeliveryOptions] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String address_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
