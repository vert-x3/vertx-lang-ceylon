import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.ceylon.core {
  MultiMap
}
import io.vertx.ceylon.core.net {
  NetSocket
}
import io.vertx.ceylon.core.streams {
  ReadStream
}
/* Generated from io.vertx.core.http.HttpClientResponse */
shared class HttpClientResponse() satisfies ReadStream<Buffer> {
  shared actual default void resume() {
  }
  shared actual default void exceptionHandler() {
  }
  shared actual default void handler() {
  }
  shared actual default void pause() {
  }
  shared actual default void endHandler() {
  }
  shared default void statusCode() {
  }
  shared default void statusMessage() {
  }
  shared default void headers() {
  }
  shared default void getHeader() {
  }
  shared default void getTrailer() {
  }
  shared default void trailers() {
  }
  shared default void cookies() {
  }
  shared default void bodyHandler() {
  }
  shared default void netSocket() {
  }
}
