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
shared interface MessageConsumer<T> satisfies ReadStream<Message<T>> {

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
/* Generated from io.vertx.core.eventbus.MessageConsumer<T> */

shared abstract class MessageConsumer_Impl<T>(MessageConsumer<T> delegate) satisfies MessageConsumer<T> & Delegating<MessageConsumer<T>> {

  shared actual MessageConsumer<T>(*<[Anything(Throwable)]>) exceptionHandler => flatten(exceptionHandler_impl);
  shared actual MessageConsumer<T>(*<[Anything(Message<T>)]>) handler => flatten(handler_impl);
  shared actual MessageConsumer<T>(*<[]>) pause => flatten(pause_impl);
  shared actual MessageConsumer<T>(*<[]>) resume => flatten(resume_impl);
  shared actual MessageConsumer<T>(*<[Anything()]>) endHandler => flatten(endHandler_impl);
  shared actual ReadStream<T>(*<[]>) bodyStream => flatten(bodyStream_impl);
  shared actual Boolean(*<[]>) isRegistered => flatten(isRegistered_impl);
  shared actual String(*<[]>) address => flatten(address_impl);
  shared actual MessageConsumer<T>(*<[Integer]>) setMaxBufferedMessages => flatten(setMaxBufferedMessages_impl);
  shared actual Integer(*<[]>) getMaxBufferedMessages => flatten(getMaxBufferedMessages_impl);
  shared actual Anything(*<[Anything(Throwable?)]>) completionHandler => flatten(completionHandler_impl);
  shared actual Anything(*<[]|[Anything(Throwable?)]>) unregister => flatten(unregister_impl);

  MessageConsumer<T> exceptionHandler_impl([Anything(Throwable)] args) {
    Anything v = delegate.exceptionHandler(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MessageConsumer<T> handler_impl([Anything(Message<T>)] args) {
    Anything v = delegate.handler(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MessageConsumer<T> pause_impl([] args) {
    Anything v = delegate.pause();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MessageConsumer<T> resume_impl([] args) {
    Anything v = delegate.resume();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MessageConsumer<T> endHandler_impl([Anything()] args) {
    Anything v = delegate.endHandler(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ReadStream<T> bodyStream_impl([] args) {
    Anything v = delegate.bodyStream();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isRegistered_impl([] args) {
    Anything v = delegate.isRegistered();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String address_impl([] args) {
    Anything v = delegate.address();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MessageConsumer<T> setMaxBufferedMessages_impl([Integer] args) {
    Anything v = delegate.setMaxBufferedMessages(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer getMaxBufferedMessages_impl([] args) {
    Anything v = delegate.getMaxBufferedMessages();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything completionHandler_impl([Anything(Throwable?)] args) {
    Anything v = delegate.completionHandler(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything unregister_impl([]|[Anything(Throwable?)] args) {
    if (is [] args) {
      // Invoke method
    }
    if (is [Anything(Throwable?)] args) {
      // Invoke method
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
