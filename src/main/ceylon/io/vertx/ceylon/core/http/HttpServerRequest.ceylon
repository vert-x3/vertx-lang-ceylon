import java.lang {
  String_=String
}
import io.vertx.ceylon.core {
  MultiMap
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.ceylon.core.net {
  SocketAddress,
  NetSocket
}
import io.vertx.ceylon.core.http {
  ServerWebSocket,
  HttpServerFileUpload,
  HttpServerResponse
}
import io.vertx.ceylon.core.streams {
  ReadStream
}
/* Generated from io.vertx.core.http.HttpServerRequest */
shared class HttpServerRequest() satisfies ReadStream<Buffer> {
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
  shared default void version() {
  }
  shared default void method() {
  }
  shared default void uri() {
  }
  shared default void path() {
  }
  shared default void query() {
  }
  shared default void response() {
  }
  shared default void headers() {
  }
  shared default void getHeader() {
  }
  shared default void params() {
  }
  shared default void getParam() {
  }
  shared default void remoteAddress() {
  }
  shared default void localAddress() {
  }
  shared default void absoluteURI() {
  }
  shared default void bodyHandler() {
  }
  shared default void netSocket() {
  }
  shared default void setExpectMultipart() {
  }
  shared default void isExpectMultipart() {
  }
  shared default void uploadHandler() {
  }
  shared default void formAttributes() {
  }
  shared default void getFormAttribute() {
  }
  shared default void upgrade() {
  }
  shared default void isEnded() {
  }
}
