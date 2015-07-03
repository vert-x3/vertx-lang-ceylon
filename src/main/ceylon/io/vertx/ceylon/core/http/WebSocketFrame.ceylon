import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
/* Generated from io.vertx.core.http.WebSocketFrame */
shared abstract class WebSocketFrame() {
  shared formal Boolean(*<[]>) isText;
  shared formal Boolean(*<[]>) isBinary;
  shared formal Boolean(*<[]>) isContinuation;
  shared formal String(*<[]>) textData;
  shared formal Buffer(*<[]>) binaryData;
  shared formal Boolean(*<[]>) isFinal;
}
