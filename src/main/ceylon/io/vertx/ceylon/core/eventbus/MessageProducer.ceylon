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
  shared actual formal MessageProducer<T>(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal MessageProducer<T>(*<[T]>) write;
  shared actual formal MessageProducer<T>(*<[Integer]>) setWriteQueueMaxSize;
  shared actual formal MessageProducer<T>(*<[Anything()]>) drainHandler;
  shared formal MessageProducer<T>(*<[DeliveryOptions]>) deliveryOptions;
  shared formal String(*<[]>) address;
}
