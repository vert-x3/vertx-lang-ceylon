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
  shared actual formal Anything(*<[]>) exceptionHandler;
  shared actual formal Anything(*<[]>) write;
  shared actual formal Anything(*<[]>) setWriteQueueMaxSize;
  shared actual formal Anything(*<[]>) drainHandler;
  shared formal Anything(*<[]>) deliveryOptions;
  shared formal Anything(*<[]>) address;
}
