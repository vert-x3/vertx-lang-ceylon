import java.lang {
  String_=String
}
import io.vertx.ceylon.core {
  MultiMap
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.ceylon.core.http {
  HttpClientRequest,
  HttpClientResponse,
  WebSocketStream,
  WebSocket
}
import io.vertx.ceylon.core.metrics {
  Measured
}
import io.vertx.core.http {
  HttpClient_=HttpClient
}
/* Generated from io.vertx.core.http.HttpClient */
shared abstract class HttpClient(HttpClient_ delegate) satisfies Delegating
  & Measured {

  HttpClientRequest request_impl([String,String]|[String,String,String]|[String,String,Anything(HttpClientResponse)]|[String,Integer,String,String]|[String,String,String,Anything(HttpClientResponse)]|[String,Integer,String,String,Anything(HttpClientResponse)] args) {
    throw Exception("implement me");
  }

  shared  HttpClientRequest(*<[String,String]|[String,String,String]|[String,String,Anything(HttpClientResponse)]|[String,Integer,String,String]|[String,String,String,Anything(HttpClientResponse)]|[String,Integer,String,String,Anything(HttpClientResponse)]>) request = flatten(request_impl);

  HttpClientRequest requestAbs_impl([String,String]|[String,String,Anything(HttpClientResponse)] args) {
    throw Exception("implement me");
  }

  shared  HttpClientRequest(*<[String,String]|[String,String,Anything(HttpClientResponse)]>) requestAbs = flatten(requestAbs_impl);

  HttpClientRequest get_impl([String]|[String,String]|[String,Anything(HttpClientResponse)]|[Integer,String,String]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)] args) {
    throw Exception("implement me");
  }

  shared  HttpClientRequest(*<[String]|[String,String]|[String,Anything(HttpClientResponse)]|[Integer,String,String]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)]>) get = flatten(get_impl);

  HttpClientRequest getAbs_impl([String]|[String,Anything(HttpClientResponse)] args) {
    throw Exception("implement me");
  }

  shared  HttpClientRequest(*<[String]|[String,Anything(HttpClientResponse)]>) getAbs = flatten(getAbs_impl);

  HttpClient getNow_impl([String,Anything(HttpClientResponse)]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)] args) {
    throw Exception("implement me");
  }

  shared  HttpClient(*<[String,Anything(HttpClientResponse)]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)]>) getNow = flatten(getNow_impl);

  HttpClientRequest post_impl([String]|[String,String]|[String,Anything(HttpClientResponse)]|[Integer,String,String]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)] args) {
    throw Exception("implement me");
  }

  shared  HttpClientRequest(*<[String]|[String,String]|[String,Anything(HttpClientResponse)]|[Integer,String,String]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)]>) post = flatten(post_impl);

  HttpClientRequest postAbs_impl([String]|[String,Anything(HttpClientResponse)] args) {
    throw Exception("implement me");
  }

  shared  HttpClientRequest(*<[String]|[String,Anything(HttpClientResponse)]>) postAbs = flatten(postAbs_impl);

  HttpClientRequest head_impl([String]|[String,String]|[String,Anything(HttpClientResponse)]|[Integer,String,String]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)] args) {
    throw Exception("implement me");
  }

  shared  HttpClientRequest(*<[String]|[String,String]|[String,Anything(HttpClientResponse)]|[Integer,String,String]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)]>) head = flatten(head_impl);

  HttpClientRequest headAbs_impl([String]|[String,Anything(HttpClientResponse)] args) {
    throw Exception("implement me");
  }

  shared  HttpClientRequest(*<[String]|[String,Anything(HttpClientResponse)]>) headAbs = flatten(headAbs_impl);

  HttpClient headNow_impl([String,Anything(HttpClientResponse)]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)] args) {
    throw Exception("implement me");
  }

  shared  HttpClient(*<[String,Anything(HttpClientResponse)]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)]>) headNow = flatten(headNow_impl);

  HttpClientRequest options_impl([String]|[String,String]|[String,Anything(HttpClientResponse)]|[Integer,String,String]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)] args) {
    throw Exception("implement me");
  }

  shared  HttpClientRequest(*<[String]|[String,String]|[String,Anything(HttpClientResponse)]|[Integer,String,String]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)]>) options = flatten(options_impl);

  HttpClientRequest optionsAbs_impl([String]|[String,Anything(HttpClientResponse)] args) {
    throw Exception("implement me");
  }

  shared  HttpClientRequest(*<[String]|[String,Anything(HttpClientResponse)]>) optionsAbs = flatten(optionsAbs_impl);

  HttpClient optionsNow_impl([String,Anything(HttpClientResponse)]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)] args) {
    throw Exception("implement me");
  }

  shared  HttpClient(*<[String,Anything(HttpClientResponse)]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)]>) optionsNow = flatten(optionsNow_impl);

  HttpClientRequest put_impl([String]|[String,String]|[String,Anything(HttpClientResponse)]|[Integer,String,String]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)] args) {
    throw Exception("implement me");
  }

  shared  HttpClientRequest(*<[String]|[String,String]|[String,Anything(HttpClientResponse)]|[Integer,String,String]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)]>) put = flatten(put_impl);

  HttpClientRequest putAbs_impl([String]|[String,Anything(HttpClientResponse)] args) {
    throw Exception("implement me");
  }

  shared  HttpClientRequest(*<[String]|[String,Anything(HttpClientResponse)]>) putAbs = flatten(putAbs_impl);

  HttpClientRequest delete_impl([String]|[String,String]|[String,Anything(HttpClientResponse)]|[Integer,String,String]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)] args) {
    throw Exception("implement me");
  }

  shared  HttpClientRequest(*<[String]|[String,String]|[String,Anything(HttpClientResponse)]|[Integer,String,String]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)]>) delete = flatten(delete_impl);

  HttpClientRequest deleteAbs_impl([String]|[String,Anything(HttpClientResponse)] args) {
    throw Exception("implement me");
  }

  shared  HttpClientRequest(*<[String]|[String,Anything(HttpClientResponse)]>) deleteAbs = flatten(deleteAbs_impl);

  HttpClient websocket_impl([String,Anything(WebSocket)]|[String,String,Anything(WebSocket)]|[String,MultiMap,Anything(WebSocket)]|[Integer,String,String,Anything(WebSocket)]|[String,String,MultiMap,Anything(WebSocket)]|[String,MultiMap,String,Anything(WebSocket)]|[Integer,String,String,MultiMap,Anything(WebSocket)]|[String,String,MultiMap,String,Anything(WebSocket)]|[String,MultiMap,String,String,Anything(WebSocket)]|[Integer,String,String,MultiMap,String,Anything(WebSocket)]|[String,String,MultiMap,String,String,Anything(WebSocket)]|[Integer,String,String,MultiMap,String,String,Anything(WebSocket)] args) {
    throw Exception("implement me");
  }

  shared  HttpClient(*<[String,Anything(WebSocket)]|[String,String,Anything(WebSocket)]|[String,MultiMap,Anything(WebSocket)]|[Integer,String,String,Anything(WebSocket)]|[String,String,MultiMap,Anything(WebSocket)]|[String,MultiMap,String,Anything(WebSocket)]|[Integer,String,String,MultiMap,Anything(WebSocket)]|[String,String,MultiMap,String,Anything(WebSocket)]|[String,MultiMap,String,String,Anything(WebSocket)]|[Integer,String,String,MultiMap,String,Anything(WebSocket)]|[String,String,MultiMap,String,String,Anything(WebSocket)]|[Integer,String,String,MultiMap,String,String,Anything(WebSocket)]>) websocket = flatten(websocket_impl);

  WebSocketStream websocketStream_impl([String]|[String,String]|[String,MultiMap]|[Integer,String,String]|[String,String,MultiMap]|[String,MultiMap,String]|[Integer,String,String,MultiMap]|[String,String,MultiMap,String]|[String,MultiMap,String,String]|[Integer,String,String,MultiMap,String]|[String,String,MultiMap,String,String]|[Integer,String,String,MultiMap,String,String] args) {
    throw Exception("implement me");
  }

  shared  WebSocketStream(*<[String]|[String,String]|[String,MultiMap]|[Integer,String,String]|[String,String,MultiMap]|[String,MultiMap,String]|[Integer,String,String,MultiMap]|[String,String,MultiMap,String]|[String,MultiMap,String,String]|[Integer,String,String,MultiMap,String]|[String,String,MultiMap,String,String]|[Integer,String,String,MultiMap,String,String]>) websocketStream = flatten(websocketStream_impl);

  Anything close_impl([] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[]>) close = flatten(close_impl);

}
