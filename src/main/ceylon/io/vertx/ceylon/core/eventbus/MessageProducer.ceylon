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

  MessageProducer<T> exceptionHandler_impl([Anything(Throwable)] args) {
    throw Exception("implement me");
  }

  shared actual MessageProducer<T>(*<[Anything(Throwable)]>) exceptionHandler = flatten(exceptionHandler_impl);

  MessageProducer<T> write_impl([T] args) {
    throw Exception("implement me");
  }

  shared actual MessageProducer<T>(*<[T]>) write = flatten(write_impl);

  MessageProducer<T> setWriteQueueMaxSize_impl([Integer] args) {
    throw Exception("implement me");
  }

  shared actual MessageProducer<T>(*<[Integer]>) setWriteQueueMaxSize = flatten(setWriteQueueMaxSize_impl);

  MessageProducer<T> drainHandler_impl([Anything()] args) {
    throw Exception("implement me");
  }

  shared actual MessageProducer<T>(*<[Anything()]>) drainHandler = flatten(drainHandler_impl);

  MessageProducer<T> deliveryOptions_impl([DeliveryOptions] args) {
    throw Exception("implement me");
  }

  shared  MessageProducer<T>(*<[DeliveryOptions]>) deliveryOptions = flatten(deliveryOptions_impl);

  String address_impl([] args) {
    throw Exception("implement me");
  }

  shared  String(*<[]>) address = flatten(address_impl);

}
