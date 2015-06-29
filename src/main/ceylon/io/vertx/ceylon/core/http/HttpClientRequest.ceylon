import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.ceylon.core {
  MultiMap
}
import io.vertx.ceylon.core.http {
  HttpClientResponse
}
import io.vertx.ceylon.core.streams {
  WriteStream,
  ReadStream
}
/* Generated from io.vertx.core.http.HttpClientRequest */
shared class HttpClientRequest() satisfies WriteStream<Buffer> & ReadStream<HttpClientResponse> {
  shared actual default void exceptionHandler() {
  }
  shared actual default void write() {
  }
  shared actual default void setWriteQueueMaxSize() {
  }
  shared actual default void drainHandler() {
  }
  shared actual default void handler() {
  }
  shared actual default void pause() {
  }
  shared actual default void resume() {
  }
  shared actual default void endHandler() {
  }
  shared default void setChunked() {
  }
  shared default void isChunked() {
  }
  shared default void method() {
  }
  shared default void uri() {
  }
  shared default void headers() {
  }
  shared default void putHeader() {
  }
  shared default void continueHandler() {
  }
  shared default void sendHead() {
  }
  shared default void end() {
  }
  shared default void setTimeout() {
  }
}
