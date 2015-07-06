import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.http {
  WebSocketFrame_=WebSocketFrame
}
/* Generated from io.vertx.core.http.WebSocketFrame */
shared abstract class WebSocketFrame(WebSocketFrame_ delegate) satisfies Delegating {
  shared formal Boolean(*<[]>) isText;
  shared formal Boolean(*<[]>) isBinary;
  shared formal Boolean(*<[]>) isContinuation;
  shared formal String(*<[]>) textData;
  shared formal Buffer(*<[]>) binaryData;
  shared formal Boolean(*<[]>) isFinal;
}
