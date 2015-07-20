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

  shared actual MessageConsumer<T>(*<[Anything(Throwable)]>) exceptionHandler => flatten(exceptionHandler_impl);

  shared actual MessageConsumer<T>(*<[Anything(Message<T>)]>) handler => flatten(handler_impl);

  shared actual MessageConsumer<T>(*<[]>) pause => flatten(pause_impl);

  shared actual MessageConsumer<T>(*<[]>) resume => flatten(resume_impl);

  shared actual MessageConsumer<T>(*<[Anything()]>) endHandler => flatten(endHandler_impl);

  shared  ReadStream<T>(*<[]>) bodyStream => flatten(bodyStream_impl);

  shared  Boolean(*<[]>) isRegistered => flatten(isRegistered_impl);

  shared  String(*<[]>) address => flatten(address_impl);

  shared  MessageConsumer<T>(*<[Integer]>) setMaxBufferedMessages => flatten(setMaxBufferedMessages_impl);

  shared  Integer(*<[]>) getMaxBufferedMessages => flatten(getMaxBufferedMessages_impl);

  shared  Anything(*<[Anything(Throwable?)]>) completionHandler => flatten(completionHandler_impl);

  shared  Anything(*<[]|[Anything(Throwable?)]>) unregister => flatten(unregister_impl);

  MessageConsumer<T> exceptionHandler_impl([Anything(Throwable)] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MessageConsumer<T> handler_impl([Anything(Message<T>)] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MessageConsumer<T> pause_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MessageConsumer<T> resume_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MessageConsumer<T> endHandler_impl([Anything()] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  ReadStream<T> bodyStream_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isRegistered_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String address_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MessageConsumer<T> setMaxBufferedMessages_impl([Integer] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer getMaxBufferedMessages_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything completionHandler_impl([Anything(Throwable?)] args) {
    // Invoke method
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
