import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.ceylon.core {
  MultiMap,
  Future
}
import io.vertx.ceylon.core.streams {
  WriteStream
}
/* Generated from io.vertx.core.http.HttpServerResponse */
shared class HttpServerResponse() satisfies WriteStream<Buffer> {
  shared actual default void exceptionHandler() {
  }
  shared actual default void write() {
  }
  shared actual default void setWriteQueueMaxSize() {
  }
  shared actual default void drainHandler() {
  }
  shared default void getStatusCode() {
  }
  shared default void setStatusCode() {
  }
  shared default void getStatusMessage() {
  }
  shared default void setStatusMessage() {
  }
  shared default void setChunked() {
  }
  shared default void isChunked() {
  }
  shared default void headers() {
  }
  shared default void putHeader() {
  }
  shared default void trailers() {
  }
  shared default void putTrailer() {
  }
  shared default void closeHandler() {
  }
  shared default void end() {
  }
  shared default void sendFile() {
  }
  shared default void close() {
  }
  shared default void ended() {
  }
  shared default void headWritten() {
  }
  shared default void headersEndHandler() {
  }
  shared default void bodyEndHandler() {
  }
}
