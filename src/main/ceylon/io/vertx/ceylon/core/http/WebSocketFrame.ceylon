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
import io.vertx.core.buffer {
  Buffer_=Buffer
}
/* Generated from io.vertx.core.http.WebSocketFrame */
shared interface WebSocketFrame  {

  shared formal Boolean(*<[]>) isText;
  shared formal Boolean(*<[]>) isBinary;
  shared formal Boolean(*<[]>) isContinuation;
  shared formal String(*<[]>) textData;
  shared formal Buffer(*<[]>) binaryData;
  shared formal Boolean(*<[]>) isFinal;
}
/* Generated from io.vertx.core.http.WebSocketFrame */

shared abstract class WebSocketFrame_Impl(WebSocketFrame_ delegate) satisfies WebSocketFrame & Delegating<WebSocketFrame_> {

  shared actual Boolean(*<[]>) isText => flatten(isText_impl);
  shared actual Boolean(*<[]>) isBinary => flatten(isBinary_impl);
  shared actual Boolean(*<[]>) isContinuation => flatten(isContinuation_impl);
  shared actual String(*<[]>) textData => flatten(textData_impl);
  shared actual Buffer(*<[]>) binaryData => flatten(binaryData_impl);
  shared actual Boolean(*<[]>) isFinal => flatten(isFinal_impl);

  Boolean isText_impl([] args) {
Anything v = delegate.text;
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isBinary_impl([] args) {
Anything v = delegate.binary;
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isContinuation_impl([] args) {
Anything v = delegate.continuation;
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String textData_impl([] args) {
    Anything v = delegate.textData();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer binaryData_impl([] args) {
    Anything v = delegate.binaryData();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isFinal_impl([] args) {
Anything v = delegate.final;
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
