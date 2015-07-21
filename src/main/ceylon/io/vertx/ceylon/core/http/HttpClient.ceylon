import java.lang {
  String_=String
}
import io.vertx.ceylon.core {
  MultiMap
}
import io.vertx.core {
  Handler_=Handler,
  AsyncResult_=AsyncResult,
  MultiMap_=MultiMap
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.metrics {
  Measured_=Measured
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
  HttpClient_=HttpClient,
  HttpClientRequest_=HttpClientRequest,
  HttpClientResponse_=HttpClientResponse,
  HttpMethod_=HttpMethod,
  WebSocketStream_=WebSocketStream,
  WebSocket_=WebSocket,
  WebsocketVersion_=WebsocketVersion
}
/* Generated from io.vertx.core.http.HttpClient */
shared interface HttpClient satisfies Measured {

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
/* Generated from io.vertx.core.http.HttpClient */

shared abstract class HttpClient_Impl(HttpClient_ delegate) satisfies HttpClient & Delegating<HttpClient_> {

  shared actual HttpClientRequest(*<[String,String]|[String,String,String]|[String,String,Anything(HttpClientResponse)]|[String,Integer,String,String]|[String,String,String,Anything(HttpClientResponse)]|[String,Integer,String,String,Anything(HttpClientResponse)]>) request => flatten(request_impl);
  shared actual HttpClientRequest(*<[String,String]|[String,String,Anything(HttpClientResponse)]>) requestAbs => flatten(requestAbs_impl);
  shared actual HttpClientRequest(*<[String]|[String,String]|[String,Anything(HttpClientResponse)]|[Integer,String,String]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)]>) get => flatten(get_impl);
  shared actual HttpClientRequest(*<[String]|[String,Anything(HttpClientResponse)]>) getAbs => flatten(getAbs_impl);
  shared actual HttpClient(*<[String,Anything(HttpClientResponse)]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)]>) getNow => flatten(getNow_impl);
  shared actual HttpClientRequest(*<[String]|[String,String]|[String,Anything(HttpClientResponse)]|[Integer,String,String]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)]>) post => flatten(post_impl);
  shared actual HttpClientRequest(*<[String]|[String,Anything(HttpClientResponse)]>) postAbs => flatten(postAbs_impl);
  shared actual HttpClientRequest(*<[String]|[String,String]|[String,Anything(HttpClientResponse)]|[Integer,String,String]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)]>) head => flatten(head_impl);
  shared actual HttpClientRequest(*<[String]|[String,Anything(HttpClientResponse)]>) headAbs => flatten(headAbs_impl);
  shared actual HttpClient(*<[String,Anything(HttpClientResponse)]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)]>) headNow => flatten(headNow_impl);
  shared actual HttpClientRequest(*<[String]|[String,String]|[String,Anything(HttpClientResponse)]|[Integer,String,String]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)]>) options => flatten(options_impl);
  shared actual HttpClientRequest(*<[String]|[String,Anything(HttpClientResponse)]>) optionsAbs => flatten(optionsAbs_impl);
  shared actual HttpClient(*<[String,Anything(HttpClientResponse)]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)]>) optionsNow => flatten(optionsNow_impl);
  shared actual HttpClientRequest(*<[String]|[String,String]|[String,Anything(HttpClientResponse)]|[Integer,String,String]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)]>) put => flatten(put_impl);
  shared actual HttpClientRequest(*<[String]|[String,Anything(HttpClientResponse)]>) putAbs => flatten(putAbs_impl);
  shared actual HttpClientRequest(*<[String]|[String,String]|[String,Anything(HttpClientResponse)]|[Integer,String,String]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)]>) delete => flatten(delete_impl);
  shared actual HttpClientRequest(*<[String]|[String,Anything(HttpClientResponse)]>) deleteAbs => flatten(deleteAbs_impl);
  shared actual HttpClient(*<[String,Anything(WebSocket)]|[String,String,Anything(WebSocket)]|[String,MultiMap,Anything(WebSocket)]|[Integer,String,String,Anything(WebSocket)]|[String,String,MultiMap,Anything(WebSocket)]|[String,MultiMap,String,Anything(WebSocket)]|[Integer,String,String,MultiMap,Anything(WebSocket)]|[String,String,MultiMap,String,Anything(WebSocket)]|[String,MultiMap,String,String,Anything(WebSocket)]|[Integer,String,String,MultiMap,String,Anything(WebSocket)]|[String,String,MultiMap,String,String,Anything(WebSocket)]|[Integer,String,String,MultiMap,String,String,Anything(WebSocket)]>) websocket => flatten(websocket_impl);
  shared actual WebSocketStream(*<[String]|[String,String]|[String,MultiMap]|[Integer,String,String]|[String,String,MultiMap]|[String,MultiMap,String]|[Integer,String,String,MultiMap]|[String,String,MultiMap,String]|[String,MultiMap,String,String]|[Integer,String,String,MultiMap,String]|[String,String,MultiMap,String,String]|[Integer,String,String,MultiMap,String,String]>) websocketStream => flatten(websocketStream_impl);
  shared actual Anything(*<[]>) close => flatten(close_impl);

  HttpClientRequest request_impl([String,String]|[String,String,String]|[String,String,Anything(HttpClientResponse)]|[String,Integer,String,String]|[String,String,String,Anything(HttpClientResponse)]|[String,Integer,String,String,Anything(HttpClientResponse)] args) {
    if (is [String,String] args) {
      HttpMethod_ arg_0 = nothing;
      String arg_1 = args[1];
      Anything v = delegate.request(arg_0,arg_1);
    }
    if (is [String,String,String] args) {
      HttpMethod_ arg_0 = nothing;
      String arg_1 = args[1];
      String arg_2 = args[2];
      Anything v = delegate.request(arg_0,arg_1,arg_2);
    }
    if (is [String,String,Anything(HttpClientResponse)] args) {
      HttpMethod_ arg_0 = nothing;
      String arg_1 = args[1];
      Handler_<HttpClientResponse_> arg_2 = nothing;
      Anything v = delegate.request(arg_0,arg_1,arg_2);
    }
    if (is [String,Integer,String,String] args) {
      HttpMethod_ arg_0 = nothing;
      Integer arg_1 = args[1];
      String arg_2 = args[2];
      String arg_3 = args[3];
      Anything v = delegate.request(arg_0,arg_1,arg_2,arg_3);
    }
    if (is [String,String,String,Anything(HttpClientResponse)] args) {
      HttpMethod_ arg_0 = nothing;
      String arg_1 = args[1];
      String arg_2 = args[2];
      Handler_<HttpClientResponse_> arg_3 = nothing;
      Anything v = delegate.request(arg_0,arg_1,arg_2,arg_3);
    }
    if (is [String,Integer,String,String,Anything(HttpClientResponse)] args) {
      HttpMethod_ arg_0 = nothing;
      Integer arg_1 = args[1];
      String arg_2 = args[2];
      String arg_3 = args[3];
      Handler_<HttpClientResponse_> arg_4 = nothing;
      Anything v = delegate.request(arg_0,arg_1,arg_2,arg_3,arg_4);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest requestAbs_impl([String,String]|[String,String,Anything(HttpClientResponse)] args) {
    if (is [String,String] args) {
      HttpMethod_ arg_0 = nothing;
      String arg_1 = args[1];
      Anything v = delegate.requestAbs(arg_0,arg_1);
    }
    if (is [String,String,Anything(HttpClientResponse)] args) {
      HttpMethod_ arg_0 = nothing;
      String arg_1 = args[1];
      Handler_<HttpClientResponse_> arg_2 = nothing;
      Anything v = delegate.requestAbs(arg_0,arg_1,arg_2);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest get_impl([String]|[String,String]|[String,Anything(HttpClientResponse)]|[Integer,String,String]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)] args) {
    if (is [String] args) {
      String arg_0 = args[0];
      Anything v = delegate.get(arg_0);
    }
    if (is [String,String] args) {
      String arg_0 = args[0];
      String arg_1 = args[1];
      Anything v = delegate.get(arg_0,arg_1);
    }
    if (is [String,Anything(HttpClientResponse)] args) {
      String arg_0 = args[0];
      Handler_<HttpClientResponse_> arg_1 = nothing;
      Anything v = delegate.get(arg_0,arg_1);
    }
    if (is [Integer,String,String] args) {
      Integer arg_0 = args[0];
      String arg_1 = args[1];
      String arg_2 = args[2];
      Anything v = delegate.get(arg_0,arg_1,arg_2);
    }
    if (is [String,String,Anything(HttpClientResponse)] args) {
      String arg_0 = args[0];
      String arg_1 = args[1];
      Handler_<HttpClientResponse_> arg_2 = nothing;
      Anything v = delegate.get(arg_0,arg_1,arg_2);
    }
    if (is [Integer,String,String,Anything(HttpClientResponse)] args) {
      Integer arg_0 = args[0];
      String arg_1 = args[1];
      String arg_2 = args[2];
      Handler_<HttpClientResponse_> arg_3 = nothing;
      Anything v = delegate.get(arg_0,arg_1,arg_2,arg_3);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest getAbs_impl([String]|[String,Anything(HttpClientResponse)] args) {
    if (is [String] args) {
      String arg_0 = args[0];
      Anything v = delegate.getAbs(arg_0);
    }
    if (is [String,Anything(HttpClientResponse)] args) {
      String arg_0 = args[0];
      Handler_<HttpClientResponse_> arg_1 = nothing;
      Anything v = delegate.getAbs(arg_0,arg_1);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClient getNow_impl([String,Anything(HttpClientResponse)]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)] args) {
    if (is [String,Anything(HttpClientResponse)] args) {
      String arg_0 = args[0];
      Handler_<HttpClientResponse_> arg_1 = nothing;
      Anything v = delegate.getNow(arg_0,arg_1);
    }
    if (is [String,String,Anything(HttpClientResponse)] args) {
      String arg_0 = args[0];
      String arg_1 = args[1];
      Handler_<HttpClientResponse_> arg_2 = nothing;
      Anything v = delegate.getNow(arg_0,arg_1,arg_2);
    }
    if (is [Integer,String,String,Anything(HttpClientResponse)] args) {
      Integer arg_0 = args[0];
      String arg_1 = args[1];
      String arg_2 = args[2];
      Handler_<HttpClientResponse_> arg_3 = nothing;
      Anything v = delegate.getNow(arg_0,arg_1,arg_2,arg_3);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest post_impl([String]|[String,String]|[String,Anything(HttpClientResponse)]|[Integer,String,String]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)] args) {
    if (is [String] args) {
      String arg_0 = args[0];
      Anything v = delegate.post(arg_0);
    }
    if (is [String,String] args) {
      String arg_0 = args[0];
      String arg_1 = args[1];
      Anything v = delegate.post(arg_0,arg_1);
    }
    if (is [String,Anything(HttpClientResponse)] args) {
      String arg_0 = args[0];
      Handler_<HttpClientResponse_> arg_1 = nothing;
      Anything v = delegate.post(arg_0,arg_1);
    }
    if (is [Integer,String,String] args) {
      Integer arg_0 = args[0];
      String arg_1 = args[1];
      String arg_2 = args[2];
      Anything v = delegate.post(arg_0,arg_1,arg_2);
    }
    if (is [String,String,Anything(HttpClientResponse)] args) {
      String arg_0 = args[0];
      String arg_1 = args[1];
      Handler_<HttpClientResponse_> arg_2 = nothing;
      Anything v = delegate.post(arg_0,arg_1,arg_2);
    }
    if (is [Integer,String,String,Anything(HttpClientResponse)] args) {
      Integer arg_0 = args[0];
      String arg_1 = args[1];
      String arg_2 = args[2];
      Handler_<HttpClientResponse_> arg_3 = nothing;
      Anything v = delegate.post(arg_0,arg_1,arg_2,arg_3);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest postAbs_impl([String]|[String,Anything(HttpClientResponse)] args) {
    if (is [String] args) {
      String arg_0 = args[0];
      Anything v = delegate.postAbs(arg_0);
    }
    if (is [String,Anything(HttpClientResponse)] args) {
      String arg_0 = args[0];
      Handler_<HttpClientResponse_> arg_1 = nothing;
      Anything v = delegate.postAbs(arg_0,arg_1);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest head_impl([String]|[String,String]|[String,Anything(HttpClientResponse)]|[Integer,String,String]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)] args) {
    if (is [String] args) {
      String arg_0 = args[0];
      Anything v = delegate.head(arg_0);
    }
    if (is [String,String] args) {
      String arg_0 = args[0];
      String arg_1 = args[1];
      Anything v = delegate.head(arg_0,arg_1);
    }
    if (is [String,Anything(HttpClientResponse)] args) {
      String arg_0 = args[0];
      Handler_<HttpClientResponse_> arg_1 = nothing;
      Anything v = delegate.head(arg_0,arg_1);
    }
    if (is [Integer,String,String] args) {
      Integer arg_0 = args[0];
      String arg_1 = args[1];
      String arg_2 = args[2];
      Anything v = delegate.head(arg_0,arg_1,arg_2);
    }
    if (is [String,String,Anything(HttpClientResponse)] args) {
      String arg_0 = args[0];
      String arg_1 = args[1];
      Handler_<HttpClientResponse_> arg_2 = nothing;
      Anything v = delegate.head(arg_0,arg_1,arg_2);
    }
    if (is [Integer,String,String,Anything(HttpClientResponse)] args) {
      Integer arg_0 = args[0];
      String arg_1 = args[1];
      String arg_2 = args[2];
      Handler_<HttpClientResponse_> arg_3 = nothing;
      Anything v = delegate.head(arg_0,arg_1,arg_2,arg_3);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest headAbs_impl([String]|[String,Anything(HttpClientResponse)] args) {
    if (is [String] args) {
      String arg_0 = args[0];
      Anything v = delegate.headAbs(arg_0);
    }
    if (is [String,Anything(HttpClientResponse)] args) {
      String arg_0 = args[0];
      Handler_<HttpClientResponse_> arg_1 = nothing;
      Anything v = delegate.headAbs(arg_0,arg_1);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClient headNow_impl([String,Anything(HttpClientResponse)]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)] args) {
    if (is [String,Anything(HttpClientResponse)] args) {
      String arg_0 = args[0];
      Handler_<HttpClientResponse_> arg_1 = nothing;
      Anything v = delegate.headNow(arg_0,arg_1);
    }
    if (is [String,String,Anything(HttpClientResponse)] args) {
      String arg_0 = args[0];
      String arg_1 = args[1];
      Handler_<HttpClientResponse_> arg_2 = nothing;
      Anything v = delegate.headNow(arg_0,arg_1,arg_2);
    }
    if (is [Integer,String,String,Anything(HttpClientResponse)] args) {
      Integer arg_0 = args[0];
      String arg_1 = args[1];
      String arg_2 = args[2];
      Handler_<HttpClientResponse_> arg_3 = nothing;
      Anything v = delegate.headNow(arg_0,arg_1,arg_2,arg_3);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest options_impl([String]|[String,String]|[String,Anything(HttpClientResponse)]|[Integer,String,String]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)] args) {
    if (is [String] args) {
      String arg_0 = args[0];
      Anything v = delegate.options(arg_0);
    }
    if (is [String,String] args) {
      String arg_0 = args[0];
      String arg_1 = args[1];
      Anything v = delegate.options(arg_0,arg_1);
    }
    if (is [String,Anything(HttpClientResponse)] args) {
      String arg_0 = args[0];
      Handler_<HttpClientResponse_> arg_1 = nothing;
      Anything v = delegate.options(arg_0,arg_1);
    }
    if (is [Integer,String,String] args) {
      Integer arg_0 = args[0];
      String arg_1 = args[1];
      String arg_2 = args[2];
      Anything v = delegate.options(arg_0,arg_1,arg_2);
    }
    if (is [String,String,Anything(HttpClientResponse)] args) {
      String arg_0 = args[0];
      String arg_1 = args[1];
      Handler_<HttpClientResponse_> arg_2 = nothing;
      Anything v = delegate.options(arg_0,arg_1,arg_2);
    }
    if (is [Integer,String,String,Anything(HttpClientResponse)] args) {
      Integer arg_0 = args[0];
      String arg_1 = args[1];
      String arg_2 = args[2];
      Handler_<HttpClientResponse_> arg_3 = nothing;
      Anything v = delegate.options(arg_0,arg_1,arg_2,arg_3);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest optionsAbs_impl([String]|[String,Anything(HttpClientResponse)] args) {
    if (is [String] args) {
      String arg_0 = args[0];
      Anything v = delegate.optionsAbs(arg_0);
    }
    if (is [String,Anything(HttpClientResponse)] args) {
      String arg_0 = args[0];
      Handler_<HttpClientResponse_> arg_1 = nothing;
      Anything v = delegate.optionsAbs(arg_0,arg_1);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClient optionsNow_impl([String,Anything(HttpClientResponse)]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)] args) {
    if (is [String,Anything(HttpClientResponse)] args) {
      String arg_0 = args[0];
      Handler_<HttpClientResponse_> arg_1 = nothing;
      Anything v = delegate.optionsNow(arg_0,arg_1);
    }
    if (is [String,String,Anything(HttpClientResponse)] args) {
      String arg_0 = args[0];
      String arg_1 = args[1];
      Handler_<HttpClientResponse_> arg_2 = nothing;
      Anything v = delegate.optionsNow(arg_0,arg_1,arg_2);
    }
    if (is [Integer,String,String,Anything(HttpClientResponse)] args) {
      Integer arg_0 = args[0];
      String arg_1 = args[1];
      String arg_2 = args[2];
      Handler_<HttpClientResponse_> arg_3 = nothing;
      Anything v = delegate.optionsNow(arg_0,arg_1,arg_2,arg_3);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest put_impl([String]|[String,String]|[String,Anything(HttpClientResponse)]|[Integer,String,String]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)] args) {
    if (is [String] args) {
      String arg_0 = args[0];
      Anything v = delegate.put(arg_0);
    }
    if (is [String,String] args) {
      String arg_0 = args[0];
      String arg_1 = args[1];
      Anything v = delegate.put(arg_0,arg_1);
    }
    if (is [String,Anything(HttpClientResponse)] args) {
      String arg_0 = args[0];
      Handler_<HttpClientResponse_> arg_1 = nothing;
      Anything v = delegate.put(arg_0,arg_1);
    }
    if (is [Integer,String,String] args) {
      Integer arg_0 = args[0];
      String arg_1 = args[1];
      String arg_2 = args[2];
      Anything v = delegate.put(arg_0,arg_1,arg_2);
    }
    if (is [String,String,Anything(HttpClientResponse)] args) {
      String arg_0 = args[0];
      String arg_1 = args[1];
      Handler_<HttpClientResponse_> arg_2 = nothing;
      Anything v = delegate.put(arg_0,arg_1,arg_2);
    }
    if (is [Integer,String,String,Anything(HttpClientResponse)] args) {
      Integer arg_0 = args[0];
      String arg_1 = args[1];
      String arg_2 = args[2];
      Handler_<HttpClientResponse_> arg_3 = nothing;
      Anything v = delegate.put(arg_0,arg_1,arg_2,arg_3);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest putAbs_impl([String]|[String,Anything(HttpClientResponse)] args) {
    if (is [String] args) {
      String arg_0 = args[0];
      Anything v = delegate.putAbs(arg_0);
    }
    if (is [String,Anything(HttpClientResponse)] args) {
      String arg_0 = args[0];
      Handler_<HttpClientResponse_> arg_1 = nothing;
      Anything v = delegate.putAbs(arg_0,arg_1);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest delete_impl([String]|[String,String]|[String,Anything(HttpClientResponse)]|[Integer,String,String]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)] args) {
    if (is [String] args) {
      String arg_0 = args[0];
      Anything v = delegate.delete(arg_0);
    }
    if (is [String,String] args) {
      String arg_0 = args[0];
      String arg_1 = args[1];
      Anything v = delegate.delete(arg_0,arg_1);
    }
    if (is [String,Anything(HttpClientResponse)] args) {
      String arg_0 = args[0];
      Handler_<HttpClientResponse_> arg_1 = nothing;
      Anything v = delegate.delete(arg_0,arg_1);
    }
    if (is [Integer,String,String] args) {
      Integer arg_0 = args[0];
      String arg_1 = args[1];
      String arg_2 = args[2];
      Anything v = delegate.delete(arg_0,arg_1,arg_2);
    }
    if (is [String,String,Anything(HttpClientResponse)] args) {
      String arg_0 = args[0];
      String arg_1 = args[1];
      Handler_<HttpClientResponse_> arg_2 = nothing;
      Anything v = delegate.delete(arg_0,arg_1,arg_2);
    }
    if (is [Integer,String,String,Anything(HttpClientResponse)] args) {
      Integer arg_0 = args[0];
      String arg_1 = args[1];
      String arg_2 = args[2];
      Handler_<HttpClientResponse_> arg_3 = nothing;
      Anything v = delegate.delete(arg_0,arg_1,arg_2,arg_3);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest deleteAbs_impl([String]|[String,Anything(HttpClientResponse)] args) {
    if (is [String] args) {
      String arg_0 = args[0];
      Anything v = delegate.deleteAbs(arg_0);
    }
    if (is [String,Anything(HttpClientResponse)] args) {
      String arg_0 = args[0];
      Handler_<HttpClientResponse_> arg_1 = nothing;
      Anything v = delegate.deleteAbs(arg_0,arg_1);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClient websocket_impl([String,Anything(WebSocket)]|[String,String,Anything(WebSocket)]|[String,MultiMap,Anything(WebSocket)]|[Integer,String,String,Anything(WebSocket)]|[String,String,MultiMap,Anything(WebSocket)]|[String,MultiMap,String,Anything(WebSocket)]|[Integer,String,String,MultiMap,Anything(WebSocket)]|[String,String,MultiMap,String,Anything(WebSocket)]|[String,MultiMap,String,String,Anything(WebSocket)]|[Integer,String,String,MultiMap,String,Anything(WebSocket)]|[String,String,MultiMap,String,String,Anything(WebSocket)]|[Integer,String,String,MultiMap,String,String,Anything(WebSocket)] args) {
    if (is [String,Anything(WebSocket)] args) {
      String arg_0 = args[0];
      Handler_<WebSocket_> arg_1 = nothing;
      Anything v = delegate.websocket(arg_0,arg_1);
    }
    if (is [String,String,Anything(WebSocket)] args) {
      String arg_0 = args[0];
      String arg_1 = args[1];
      Handler_<WebSocket_> arg_2 = nothing;
      Anything v = delegate.websocket(arg_0,arg_1,arg_2);
    }
    if (is [String,MultiMap,Anything(WebSocket)] args) {
      String arg_0 = args[0];
      assert(is Delegating<MultiMap_> arg_1 = args[1]);
      Handler_<WebSocket_> arg_2 = nothing;
      Anything v = delegate.websocket(arg_0,arg_1.delegate,arg_2);
    }
    if (is [Integer,String,String,Anything(WebSocket)] args) {
      Integer arg_0 = args[0];
      String arg_1 = args[1];
      String arg_2 = args[2];
      Handler_<WebSocket_> arg_3 = nothing;
      Anything v = delegate.websocket(arg_0,arg_1,arg_2,arg_3);
    }
    if (is [String,String,MultiMap,Anything(WebSocket)] args) {
      String arg_0 = args[0];
      String arg_1 = args[1];
      assert(is Delegating<MultiMap_> arg_2 = args[2]);
      Handler_<WebSocket_> arg_3 = nothing;
      Anything v = delegate.websocket(arg_0,arg_1,arg_2.delegate,arg_3);
    }
    if (is [String,MultiMap,String,Anything(WebSocket)] args) {
      String arg_0 = args[0];
      assert(is Delegating<MultiMap_> arg_1 = args[1]);
      WebsocketVersion_ arg_2 = nothing;
      Handler_<WebSocket_> arg_3 = nothing;
      Anything v = delegate.websocket(arg_0,arg_1.delegate,arg_2,arg_3);
    }
    if (is [Integer,String,String,MultiMap,Anything(WebSocket)] args) {
      Integer arg_0 = args[0];
      String arg_1 = args[1];
      String arg_2 = args[2];
      assert(is Delegating<MultiMap_> arg_3 = args[3]);
      Handler_<WebSocket_> arg_4 = nothing;
      Anything v = delegate.websocket(arg_0,arg_1,arg_2,arg_3.delegate,arg_4);
    }
    if (is [String,String,MultiMap,String,Anything(WebSocket)] args) {
      String arg_0 = args[0];
      String arg_1 = args[1];
      assert(is Delegating<MultiMap_> arg_2 = args[2]);
      WebsocketVersion_ arg_3 = nothing;
      Handler_<WebSocket_> arg_4 = nothing;
      Anything v = delegate.websocket(arg_0,arg_1,arg_2.delegate,arg_3,arg_4);
    }
    if (is [String,MultiMap,String,String,Anything(WebSocket)] args) {
      String arg_0 = args[0];
      assert(is Delegating<MultiMap_> arg_1 = args[1]);
      WebsocketVersion_ arg_2 = nothing;
      String arg_3 = args[3];
      Handler_<WebSocket_> arg_4 = nothing;
      Anything v = delegate.websocket(arg_0,arg_1.delegate,arg_2,arg_3,arg_4);
    }
    if (is [Integer,String,String,MultiMap,String,Anything(WebSocket)] args) {
      Integer arg_0 = args[0];
      String arg_1 = args[1];
      String arg_2 = args[2];
      assert(is Delegating<MultiMap_> arg_3 = args[3]);
      WebsocketVersion_ arg_4 = nothing;
      Handler_<WebSocket_> arg_5 = nothing;
      Anything v = delegate.websocket(arg_0,arg_1,arg_2,arg_3.delegate,arg_4,arg_5);
    }
    if (is [String,String,MultiMap,String,String,Anything(WebSocket)] args) {
      String arg_0 = args[0];
      String arg_1 = args[1];
      assert(is Delegating<MultiMap_> arg_2 = args[2]);
      WebsocketVersion_ arg_3 = nothing;
      String arg_4 = args[4];
      Handler_<WebSocket_> arg_5 = nothing;
      Anything v = delegate.websocket(arg_0,arg_1,arg_2.delegate,arg_3,arg_4,arg_5);
    }
    if (is [Integer,String,String,MultiMap,String,String,Anything(WebSocket)] args) {
      Integer arg_0 = args[0];
      String arg_1 = args[1];
      String arg_2 = args[2];
      assert(is Delegating<MultiMap_> arg_3 = args[3]);
      WebsocketVersion_ arg_4 = nothing;
      String arg_5 = args[5];
      Handler_<WebSocket_> arg_6 = nothing;
      Anything v = delegate.websocket(arg_0,arg_1,arg_2,arg_3.delegate,arg_4,arg_5,arg_6);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  WebSocketStream websocketStream_impl([String]|[String,String]|[String,MultiMap]|[Integer,String,String]|[String,String,MultiMap]|[String,MultiMap,String]|[Integer,String,String,MultiMap]|[String,String,MultiMap,String]|[String,MultiMap,String,String]|[Integer,String,String,MultiMap,String]|[String,String,MultiMap,String,String]|[Integer,String,String,MultiMap,String,String] args) {
    if (is [String] args) {
      String arg_0 = args[0];
      Anything v = delegate.websocketStream(arg_0);
    }
    if (is [String,String] args) {
      String arg_0 = args[0];
      String arg_1 = args[1];
      Anything v = delegate.websocketStream(arg_0,arg_1);
    }
    if (is [String,MultiMap] args) {
      String arg_0 = args[0];
      assert(is Delegating<MultiMap_> arg_1 = args[1]);
      Anything v = delegate.websocketStream(arg_0,arg_1.delegate);
    }
    if (is [Integer,String,String] args) {
      Integer arg_0 = args[0];
      String arg_1 = args[1];
      String arg_2 = args[2];
      Anything v = delegate.websocketStream(arg_0,arg_1,arg_2);
    }
    if (is [String,String,MultiMap] args) {
      String arg_0 = args[0];
      String arg_1 = args[1];
      assert(is Delegating<MultiMap_> arg_2 = args[2]);
      Anything v = delegate.websocketStream(arg_0,arg_1,arg_2.delegate);
    }
    if (is [String,MultiMap,String] args) {
      String arg_0 = args[0];
      assert(is Delegating<MultiMap_> arg_1 = args[1]);
      WebsocketVersion_ arg_2 = nothing;
      Anything v = delegate.websocketStream(arg_0,arg_1.delegate,arg_2);
    }
    if (is [Integer,String,String,MultiMap] args) {
      Integer arg_0 = args[0];
      String arg_1 = args[1];
      String arg_2 = args[2];
      assert(is Delegating<MultiMap_> arg_3 = args[3]);
      Anything v = delegate.websocketStream(arg_0,arg_1,arg_2,arg_3.delegate);
    }
    if (is [String,String,MultiMap,String] args) {
      String arg_0 = args[0];
      String arg_1 = args[1];
      assert(is Delegating<MultiMap_> arg_2 = args[2]);
      WebsocketVersion_ arg_3 = nothing;
      Anything v = delegate.websocketStream(arg_0,arg_1,arg_2.delegate,arg_3);
    }
    if (is [String,MultiMap,String,String] args) {
      String arg_0 = args[0];
      assert(is Delegating<MultiMap_> arg_1 = args[1]);
      WebsocketVersion_ arg_2 = nothing;
      String arg_3 = args[3];
      Anything v = delegate.websocketStream(arg_0,arg_1.delegate,arg_2,arg_3);
    }
    if (is [Integer,String,String,MultiMap,String] args) {
      Integer arg_0 = args[0];
      String arg_1 = args[1];
      String arg_2 = args[2];
      assert(is Delegating<MultiMap_> arg_3 = args[3]);
      WebsocketVersion_ arg_4 = nothing;
      Anything v = delegate.websocketStream(arg_0,arg_1,arg_2,arg_3.delegate,arg_4);
    }
    if (is [String,String,MultiMap,String,String] args) {
      String arg_0 = args[0];
      String arg_1 = args[1];
      assert(is Delegating<MultiMap_> arg_2 = args[2]);
      WebsocketVersion_ arg_3 = nothing;
      String arg_4 = args[4];
      Anything v = delegate.websocketStream(arg_0,arg_1,arg_2.delegate,arg_3,arg_4);
    }
    if (is [Integer,String,String,MultiMap,String,String] args) {
      Integer arg_0 = args[0];
      String arg_1 = args[1];
      String arg_2 = args[2];
      assert(is Delegating<MultiMap_> arg_3 = args[3]);
      WebsocketVersion_ arg_4 = nothing;
      String arg_5 = args[5];
      Anything v = delegate.websocketStream(arg_0,arg_1,arg_2,arg_3.delegate,arg_4,arg_5);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything close_impl([] args) {
    Anything v = delegate.close();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
