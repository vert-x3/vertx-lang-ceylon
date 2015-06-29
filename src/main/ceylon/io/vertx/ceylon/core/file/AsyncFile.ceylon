import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.ceylon.core.streams {
  WriteStream,
  ReadStream
}
/* Generated from io.vertx.core.file.AsyncFile */
shared class AsyncFile() satisfies ReadStream<Buffer> & WriteStream<Buffer> {
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
  shared actual default void exceptionHandler() {
  }
  shared default void close() {
  }
  shared default void read() {
  }
  shared default void flush() {
  }
  shared default void setReadPos() {
  }
  shared default void setWritePos() {
  }
}
