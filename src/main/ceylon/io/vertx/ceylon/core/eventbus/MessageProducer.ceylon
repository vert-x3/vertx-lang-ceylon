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
shared interface MessageProducer<T> satisfies WriteStream<T> {

  shared actual formal MessageProducer<T>(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal MessageProducer<T>(*<[T]>) write;
  shared actual formal MessageProducer<T>(*<[Integer]>) setWriteQueueMaxSize;
  shared actual formal MessageProducer<T>(*<[Anything()]>) drainHandler;
  shared formal MessageProducer<T>(*<[DeliveryOptions]>) deliveryOptions;
  shared formal String(*<[]>) address;
}
/* Generated from io.vertx.core.eventbus.MessageProducer<T> */

shared abstract class MessageProducer_Impl<T>(MessageProducer<T> delegate) satisfies MessageProducer<T> & Delegating<MessageProducer<T>> {

  shared actual MessageProducer<T>(*<[Anything(Throwable)]>) exceptionHandler => flatten(exceptionHandler_impl);
  shared actual MessageProducer<T>(*<[T]>) write => flatten(write_impl);
  shared actual MessageProducer<T>(*<[Integer]>) setWriteQueueMaxSize => flatten(setWriteQueueMaxSize_impl);
  shared actual MessageProducer<T>(*<[Anything()]>) drainHandler => flatten(drainHandler_impl);
  shared actual MessageProducer<T>(*<[DeliveryOptions]>) deliveryOptions => flatten(deliveryOptions_impl);
  shared actual String(*<[]>) address => flatten(address_impl);

  MessageProducer<T> exceptionHandler_impl([Anything(Throwable)] args) {
    Anything v = delegate.exceptionHandler(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MessageProducer<T> write_impl([T] args) {
    Anything v = delegate.write(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MessageProducer<T> setWriteQueueMaxSize_impl([Integer] args) {
    Anything v = delegate.setWriteQueueMaxSize(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MessageProducer<T> drainHandler_impl([Anything()] args) {
    Anything v = delegate.drainHandler(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MessageProducer<T> deliveryOptions_impl([DeliveryOptions] args) {
    Anything v = delegate.deliveryOptions(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String address_impl([] args) {
    Anything v = delegate.address();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
