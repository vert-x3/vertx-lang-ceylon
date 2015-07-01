import java.lang {
  String_=String
}
import io.vertx.ceylon.core.eventbus {
  DeliveryOptions
}
import io.vertx.ceylon.core.streams {
  WriteStream
}
/* Generated from io.vertx.core.eventbus.MessageProducer<T> */
shared abstract class MessageProducer<T>() satisfies WriteStream<T> {
  shared actual formal Anything(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal Anything(*<[T]>) write;
  shared actual formal Anything(*<[Integer]>) setWriteQueueMaxSize;
  shared actual formal Anything(*<[Anything()]>) drainHandler;
  shared formal Anything(*<[DeliveryOptions]>) deliveryOptions;
  shared formal Anything(*<[]>) address;
}
