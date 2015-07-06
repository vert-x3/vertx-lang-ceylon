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

  Boolean isText_impl([] args) {
    throw Exception("implement me");
  }

  shared  Boolean(*<[]>) isText = flatten(isText_impl);

  Boolean isBinary_impl([] args) {
    throw Exception("implement me");
  }

  shared  Boolean(*<[]>) isBinary = flatten(isBinary_impl);

  Boolean isContinuation_impl([] args) {
    throw Exception("implement me");
  }

  shared  Boolean(*<[]>) isContinuation = flatten(isContinuation_impl);

  String textData_impl([] args) {
    throw Exception("implement me");
  }

  shared  String(*<[]>) textData = flatten(textData_impl);

  Buffer binaryData_impl([] args) {
    throw Exception("implement me");
  }

  shared  Buffer(*<[]>) binaryData = flatten(binaryData_impl);

  Boolean isFinal_impl([] args) {
    throw Exception("implement me");
  }

  shared  Boolean(*<[]>) isFinal = flatten(isFinal_impl);

}
