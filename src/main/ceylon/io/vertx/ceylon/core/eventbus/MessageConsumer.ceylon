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
shared class MessageConsumer<T>() satisfies ReadStream<Message<T>> {
  shared actual default void exceptionHandler() {
  }
  shared actual default void handler() {
  }
  shared actual default void pause() {
  }
  shared actual default void resume() {
  }
  shared actual default void endHandler() {
  }
  shared default void bodyStream() {
  }
  shared default void isRegistered() {
  }
  shared default void address() {
  }
  shared default void setMaxBufferedMessages() {
  }
  shared default void getMaxBufferedMessages() {
  }
  shared default void completionHandler() {
  }
  shared default void unregister() {
  }
}
