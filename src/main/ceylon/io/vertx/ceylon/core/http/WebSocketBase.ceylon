import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.ceylon.core.net {
  SocketAddress
}
import io.vertx.ceylon.core.http {
  WebSocketFrame
}
import io.vertx.ceylon.core.streams {
  WriteStream,
  ReadStream
}
/* Generated from io.vertx.core.http.WebSocketBase */
shared interface WebSocketBase satisfies ReadStream<Buffer> & WriteStream<Buffer> {
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
  shared actual default void write() {
  }
  shared actual default void setWriteQueueMaxSize() {
  }
  shared actual default void drainHandler() {
  }
  shared default void binaryHandlerID() {
  }
  shared default void textHandlerID() {
  }
  shared default void writeFrame() {
  }
  shared default void writeFinalTextFrame() {
  }
  shared default void writeFinalBinaryFrame() {
  }
  shared default void writeBinaryMessage() {
  }
  shared default void closeHandler() {
  }
  shared default void frameHandler() {
  }
  shared default void close() {
  }
  shared default void remoteAddress() {
  }
  shared default void localAddress() {
  }
}
