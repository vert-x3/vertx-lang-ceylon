import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
/* Generated from io.vertx.core.http.WebSocketFrame */
shared abstract class WebSocketFrame() {
  shared formal Anything(*<[]>) isText;
  shared formal Anything(*<[]>) isBinary;
  shared formal Anything(*<[]>) isContinuation;
  shared formal Anything(*<[]>) textData;
  shared formal Anything(*<[]>) binaryData;
  shared formal Anything(*<[]>) isFinal;
}
