import java.lang {
  String_=String
}
import io.vertx.ceylon.core.eventbus {
  Message
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.eventbus {
  MessageConsumer_=MessageConsumer
}
import io.vertx.ceylon.core.streams {
  ReadStream
}
/* Generated from io.vertx.core.eventbus.MessageConsumer<T> */
shared abstract class MessageConsumer<T>(MessageConsumer_<Object> delegate) satisfies Delegating
  & ReadStream<Message<T>> {
  shared actual formal MessageConsumer<T>(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal MessageConsumer<T>(*<[Anything(Message<T>)]>) handler;
  shared actual formal MessageConsumer<T>(*<[]>) pause;
  shared actual formal MessageConsumer<T>(*<[]>) resume;
  shared actual formal MessageConsumer<T>(*<[Anything()]>) endHandler;
  shared formal ReadStream<T>(*<[]>) bodyStream;
  shared formal Boolean(*<[]>) isRegistered;
  shared formal String(*<[]>) address;
  shared formal MessageConsumer<T>(*<[Integer]>) setMaxBufferedMessages;
  shared formal Integer(*<[]>) getMaxBufferedMessages;
  shared formal Anything(*<[Anything(Throwable?)]>) completionHandler;
  shared formal Anything(*<[]|[Anything(Throwable?)]>) unregister;
}
