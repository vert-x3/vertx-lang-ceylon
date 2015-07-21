import java.lang {
  Void_=Void,
  String_=String
}
import io.vertx.ceylon.core.eventbus {
  Message
}
import io.vertx.core {
  Handler_=Handler,
  AsyncResult_=AsyncResult
}
import io.vertx.core.streams {
  ReadStream_=ReadStream
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.eventbus {
  MessageConsumer_=MessageConsumer,
  Message_=Message
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

shared abstract class MessageConsumer_Impl<T>(MessageConsumer_<Object> delegate) satisfies MessageConsumer<T> & Delegating<MessageConsumer_<Object>> {

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
    Handler_<Throwable> arg_0 = nothing;
    Anything v = delegate.exceptionHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MessageConsumer<T> handler_impl([Anything(Message<T>)] args) {
    Handler_<Message_<Object>> arg_0 = nothing;
    Anything v = delegate.handler(arg_0);
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
    Handler_<Void_> arg_0 = nothing;
    Anything v = delegate.endHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ReadStream<T> bodyStream_impl([] args) {
    Anything v = delegate.bodyStream();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isRegistered_impl([] args) {
    Anything v = delegate.registered;
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String address_impl([] args) {
    Anything v = delegate.address();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MessageConsumer<T> setMaxBufferedMessages_impl([Integer] args) {
    Integer arg_0 = args[0];
    Anything v = delegate.setMaxBufferedMessages(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer getMaxBufferedMessages_impl([] args) {
    Anything v = delegate.maxBufferedMessages;
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything completionHandler_impl([Anything(Throwable?)] args) {
    Handler_<AsyncResult_<Void_>> arg_0 = nothing;
    Anything v = delegate.completionHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything unregister_impl([]|[Anything(Throwable?)] args) {
    if (is [] args) {
      Anything v = delegate.unregister();
    }
    if (is [Anything(Throwable?)] args) {
      Handler_<AsyncResult_<Void_>> arg_0 = nothing;
      Anything v = delegate.unregister(arg_0);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
