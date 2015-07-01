import java.lang {
  String_=String
}
import io.vertx.ceylon.core.eventbus {
  Message
}
import io.vertx.ceylon.core.streams {
  ReadStream
}
/* Generated from io.vertx.core.eventbus.MessageConsumer<T> */
shared abstract class MessageConsumer<T>() satisfies ReadStream<Message<T>> {
  shared actual formal Anything(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal Anything(*<[Anything(Message<T>)]>) handler;
  shared actual formal Anything(*<[]>) pause;
  shared actual formal Anything(*<[]>) resume;
  shared actual formal Anything(*<[Anything()]>) endHandler;
  shared formal Anything(*<[]>) bodyStream;
  shared formal Anything(*<[]>) isRegistered;
  shared formal Anything(*<[]>) address;
  shared formal Anything(*<[Integer]>) setMaxBufferedMessages;
  shared formal Anything(*<[]>) getMaxBufferedMessages;
  shared formal Anything(*<[Anything(Throwable?)]>) completionHandler;
  shared formal Anything(*<[]|[Anything(Throwable?)]>) unregister;
}
