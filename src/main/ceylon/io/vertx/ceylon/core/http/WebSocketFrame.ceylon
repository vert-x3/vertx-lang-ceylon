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

  shared  Boolean(*<[]>) isText => flatten(isText_impl);

  shared  Boolean(*<[]>) isBinary => flatten(isBinary_impl);

  shared  Boolean(*<[]>) isContinuation => flatten(isContinuation_impl);

  shared  String(*<[]>) textData => flatten(textData_impl);

  shared  Buffer(*<[]>) binaryData => flatten(binaryData_impl);

  shared  Boolean(*<[]>) isFinal => flatten(isFinal_impl);

  Boolean isText_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isBinary_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isContinuation_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String textData_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer binaryData_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isFinal_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
