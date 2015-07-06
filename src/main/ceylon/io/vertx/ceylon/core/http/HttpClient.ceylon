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
  shared formal HttpClientRequest(*<[String,String]|[String,String,String]|[String,String,Anything(HttpClientResponse)]|[String,Integer,String,String]|[String,String,String,Anything(HttpClientResponse)]|[String,Integer,String,String,Anything(HttpClientResponse)]>) request;
  shared formal HttpClientRequest(*<[String,String]|[String,String,Anything(HttpClientResponse)]>) requestAbs;
  shared formal HttpClientRequest(*<[String]|[String,String]|[String,Anything(HttpClientResponse)]|[Integer,String,String]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)]>) get;
  shared formal HttpClientRequest(*<[String]|[String,Anything(HttpClientResponse)]>) getAbs;
  shared formal HttpClient(*<[String,Anything(HttpClientResponse)]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)]>) getNow;
  shared formal HttpClientRequest(*<[String]|[String,String]|[String,Anything(HttpClientResponse)]|[Integer,String,String]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)]>) post;
  shared formal HttpClientRequest(*<[String]|[String,Anything(HttpClientResponse)]>) postAbs;
  shared formal HttpClientRequest(*<[String]|[String,String]|[String,Anything(HttpClientResponse)]|[Integer,String,String]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)]>) head;
  shared formal HttpClientRequest(*<[String]|[String,Anything(HttpClientResponse)]>) headAbs;
  shared formal HttpClient(*<[String,Anything(HttpClientResponse)]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)]>) headNow;
  shared formal HttpClientRequest(*<[String]|[String,String]|[String,Anything(HttpClientResponse)]|[Integer,String,String]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)]>) options;
  shared formal HttpClientRequest(*<[String]|[String,Anything(HttpClientResponse)]>) optionsAbs;
  shared formal HttpClient(*<[String,Anything(HttpClientResponse)]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)]>) optionsNow;
  shared formal HttpClientRequest(*<[String]|[String,String]|[String,Anything(HttpClientResponse)]|[Integer,String,String]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)]>) put;
  shared formal HttpClientRequest(*<[String]|[String,Anything(HttpClientResponse)]>) putAbs;
  shared formal HttpClientRequest(*<[String]|[String,String]|[String,Anything(HttpClientResponse)]|[Integer,String,String]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)]>) delete;
  shared formal HttpClientRequest(*<[String]|[String,Anything(HttpClientResponse)]>) deleteAbs;
  shared formal HttpClient(*<[String,Anything(WebSocket)]|[String,String,Anything(WebSocket)]|[String,MultiMap,Anything(WebSocket)]|[Integer,String,String,Anything(WebSocket)]|[String,String,MultiMap,Anything(WebSocket)]|[String,MultiMap,String,Anything(WebSocket)]|[Integer,String,String,MultiMap,Anything(WebSocket)]|[String,String,MultiMap,String,Anything(WebSocket)]|[String,MultiMap,String,String,Anything(WebSocket)]|[Integer,String,String,MultiMap,String,Anything(WebSocket)]|[String,String,MultiMap,String,String,Anything(WebSocket)]|[Integer,String,String,MultiMap,String,String,Anything(WebSocket)]>) websocket;
  shared formal WebSocketStream(*<[String]|[String,String]|[String,MultiMap]|[Integer,String,String]|[String,String,MultiMap]|[String,MultiMap,String]|[Integer,String,String,MultiMap]|[String,String,MultiMap,String]|[String,MultiMap,String,String]|[Integer,String,String,MultiMap,String]|[String,String,MultiMap,String,String]|[Integer,String,String,MultiMap,String,String]>) websocketStream;
  shared formal Anything(*<[]>) close;
}
