import java.lang {
  Void_=Void,
  String_=String
}
import io.vertx.ceylon.core.eventbus {
  DeliveryOptions
}
import io.vertx.core {
  Handler_=Handler,
  AsyncResult_=AsyncResult
}
import io.vertx.core.streams {
  WriteStream_=WriteStream
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.eventbus {
  MessageProducer_=MessageProducer,
  DeliveryOptions_=DeliveryOptions
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

shared abstract class MessageProducer_Impl<T>(MessageProducer_<Object> delegate) satisfies MessageProducer<T> & Delegating<MessageProducer_<Object>> {

  shared actual MessageProducer<T>(*<[Anything(Throwable)]>) exceptionHandler => flatten(exceptionHandler_impl);
  shared actual MessageProducer<T>(*<[T]>) write => flatten(write_impl);
  shared actual MessageProducer<T>(*<[Integer]>) setWriteQueueMaxSize => flatten(setWriteQueueMaxSize_impl);
  shared actual MessageProducer<T>(*<[Anything()]>) drainHandler => flatten(drainHandler_impl);
  shared actual MessageProducer<T>(*<[DeliveryOptions]>) deliveryOptions => flatten(deliveryOptions_impl);
  shared actual String(*<[]>) address => flatten(address_impl);

  MessageProducer<T> exceptionHandler_impl([Anything(Throwable)] args) {
    Handler_<Throwable> arg_0 = nothing;
    Anything v = delegate.exceptionHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MessageProducer<T> write_impl([T] args) {
    assert(is Object arg_0 = args[0]);
    Anything v = delegate.write(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MessageProducer<T> setWriteQueueMaxSize_impl([Integer] args) {
    Integer arg_0 = args[0];
    Anything v = delegate.setWriteQueueMaxSize(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MessageProducer<T> drainHandler_impl([Anything()] args) {
    Handler_<Void_> arg_0 = nothing;
    Anything v = delegate.drainHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MessageProducer<T> deliveryOptions_impl([DeliveryOptions] args) {
    DeliveryOptions_ arg_0 = DeliveryOptions_();
    Anything v = delegate.deliveryOptions(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String address_impl([] args) {
    Anything v = delegate.address();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
