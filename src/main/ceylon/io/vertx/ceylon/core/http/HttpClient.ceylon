import java.lang {
  String_=String
}
import io.vertx.ceylon.core {
  MultiMap
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
/* Generated from io.vertx.core.http.HttpClient */
shared abstract class HttpClient() satisfies Measured {
  shared formal Anything(*<[]|[]|[]|[]|[]|[]>) request;
  shared formal Anything(*<[]|[]>) requestAbs;
  shared formal Anything(*<[]|[]|[]|[]|[]|[]>) get;
  shared formal Anything(*<[]|[]>) getAbs;
  shared formal Anything(*<[]|[]|[]>) getNow;
  shared formal Anything(*<[]|[]|[]|[]|[]|[]>) post;
  shared formal Anything(*<[]|[]>) postAbs;
  shared formal Anything(*<[]|[]|[]|[]|[]|[]>) head;
  shared formal Anything(*<[]|[]>) headAbs;
  shared formal Anything(*<[]|[]|[]>) headNow;
  shared formal Anything(*<[]|[]|[]|[]|[]|[]>) options;
  shared formal Anything(*<[]|[]>) optionsAbs;
  shared formal Anything(*<[]|[]|[]>) optionsNow;
  shared formal Anything(*<[]|[]|[]|[]|[]|[]>) put;
  shared formal Anything(*<[]|[]>) putAbs;
  shared formal Anything(*<[]|[]|[]|[]|[]|[]>) delete;
  shared formal Anything(*<[]|[]>) deleteAbs;
  shared formal Anything(*<[]|[]|[]|[]|[]|[]|[]|[]|[]|[]|[]|[]>) websocket;
  shared formal Anything(*<[]|[]|[]|[]|[]|[]|[]|[]|[]|[]|[]|[]>) websocketStream;
  shared formal Anything(*<[]>) close;
}
