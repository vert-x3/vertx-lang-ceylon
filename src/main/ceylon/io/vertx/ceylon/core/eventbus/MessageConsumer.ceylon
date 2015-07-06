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

  MessageConsumer<T> exceptionHandler_impl([Anything(Throwable)] args) {
    throw Exception("implement me");
  }

  shared actual MessageConsumer<T>(*<[Anything(Throwable)]>) exceptionHandler = flatten(exceptionHandler_impl);

  MessageConsumer<T> handler_impl([Anything(Message<T>)] args) {
    throw Exception("implement me");
  }

  shared actual MessageConsumer<T>(*<[Anything(Message<T>)]>) handler = flatten(handler_impl);

  MessageConsumer<T> pause_impl([] args) {
    throw Exception("implement me");
  }

  shared actual MessageConsumer<T>(*<[]>) pause = flatten(pause_impl);

  MessageConsumer<T> resume_impl([] args) {
    throw Exception("implement me");
  }

  shared actual MessageConsumer<T>(*<[]>) resume = flatten(resume_impl);

  MessageConsumer<T> endHandler_impl([Anything()] args) {
    throw Exception("implement me");
  }

  shared actual MessageConsumer<T>(*<[Anything()]>) endHandler = flatten(endHandler_impl);

  ReadStream<T> bodyStream_impl([] args) {
    throw Exception("implement me");
  }

  shared  ReadStream<T>(*<[]>) bodyStream = flatten(bodyStream_impl);

  Boolean isRegistered_impl([] args) {
    throw Exception("implement me");
  }

  shared  Boolean(*<[]>) isRegistered = flatten(isRegistered_impl);

  String address_impl([] args) {
    throw Exception("implement me");
  }

  shared  String(*<[]>) address = flatten(address_impl);

  MessageConsumer<T> setMaxBufferedMessages_impl([Integer] args) {
    throw Exception("implement me");
  }

  shared  MessageConsumer<T>(*<[Integer]>) setMaxBufferedMessages = flatten(setMaxBufferedMessages_impl);

  Integer getMaxBufferedMessages_impl([] args) {
    throw Exception("implement me");
  }

  shared  Integer(*<[]>) getMaxBufferedMessages = flatten(getMaxBufferedMessages_impl);

  Anything completionHandler_impl([Anything(Throwable?)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable?)]>) completionHandler = flatten(completionHandler_impl);

  Anything unregister_impl([]|[Anything(Throwable?)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[]|[Anything(Throwable?)]>) unregister = flatten(unregister_impl);

}
