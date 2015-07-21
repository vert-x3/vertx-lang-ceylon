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

shared abstract class HttpClient_Impl(HttpClient delegate) satisfies HttpClient & Delegating<HttpClient> {

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
      Anything v = delegate.request(nothing,args[1]);
    }
    if (is [String,String,String] args) {
      Anything v = delegate.request(nothing,args[1],args[2]);
    }
    if (is [String,String,Anything(HttpClientResponse)] args) {
      Anything v = delegate.request(nothing,args[1],nothing);
    }
    if (is [String,Integer,String,String] args) {
      Anything v = delegate.request(nothing,args[1],args[2],args[3]);
    }
    if (is [String,String,String,Anything(HttpClientResponse)] args) {
      Anything v = delegate.request(nothing,args[1],args[2],nothing);
    }
    if (is [String,Integer,String,String,Anything(HttpClientResponse)] args) {
      Anything v = delegate.request(nothing,args[1],args[2],args[3],nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest requestAbs_impl([String,String]|[String,String,Anything(HttpClientResponse)] args) {
    if (is [String,String] args) {
      Anything v = delegate.requestAbs(nothing,args[1]);
    }
    if (is [String,String,Anything(HttpClientResponse)] args) {
      Anything v = delegate.requestAbs(nothing,args[1],nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest get_impl([String]|[String,String]|[String,Anything(HttpClientResponse)]|[Integer,String,String]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)] args) {
    if (is [String] args) {
      Anything v = delegate.get(args[0]);
    }
    if (is [String,String] args) {
      Anything v = delegate.get(args[0],args[1]);
    }
    if (is [String,Anything(HttpClientResponse)] args) {
      Anything v = delegate.get(args[0],nothing);
    }
    if (is [Integer,String,String] args) {
      Anything v = delegate.get(args[0],args[1],args[2]);
    }
    if (is [String,String,Anything(HttpClientResponse)] args) {
      Anything v = delegate.get(args[0],args[1],nothing);
    }
    if (is [Integer,String,String,Anything(HttpClientResponse)] args) {
      Anything v = delegate.get(args[0],args[1],args[2],nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest getAbs_impl([String]|[String,Anything(HttpClientResponse)] args) {
    if (is [String] args) {
      Anything v = delegate.getAbs(args[0]);
    }
    if (is [String,Anything(HttpClientResponse)] args) {
      Anything v = delegate.getAbs(args[0],nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClient getNow_impl([String,Anything(HttpClientResponse)]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)] args) {
    if (is [String,Anything(HttpClientResponse)] args) {
      Anything v = delegate.getNow(args[0],nothing);
    }
    if (is [String,String,Anything(HttpClientResponse)] args) {
      Anything v = delegate.getNow(args[0],args[1],nothing);
    }
    if (is [Integer,String,String,Anything(HttpClientResponse)] args) {
      Anything v = delegate.getNow(args[0],args[1],args[2],nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest post_impl([String]|[String,String]|[String,Anything(HttpClientResponse)]|[Integer,String,String]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)] args) {
    if (is [String] args) {
      Anything v = delegate.post(args[0]);
    }
    if (is [String,String] args) {
      Anything v = delegate.post(args[0],args[1]);
    }
    if (is [String,Anything(HttpClientResponse)] args) {
      Anything v = delegate.post(args[0],nothing);
    }
    if (is [Integer,String,String] args) {
      Anything v = delegate.post(args[0],args[1],args[2]);
    }
    if (is [String,String,Anything(HttpClientResponse)] args) {
      Anything v = delegate.post(args[0],args[1],nothing);
    }
    if (is [Integer,String,String,Anything(HttpClientResponse)] args) {
      Anything v = delegate.post(args[0],args[1],args[2],nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest postAbs_impl([String]|[String,Anything(HttpClientResponse)] args) {
    if (is [String] args) {
      Anything v = delegate.postAbs(args[0]);
    }
    if (is [String,Anything(HttpClientResponse)] args) {
      Anything v = delegate.postAbs(args[0],nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest head_impl([String]|[String,String]|[String,Anything(HttpClientResponse)]|[Integer,String,String]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)] args) {
    if (is [String] args) {
      Anything v = delegate.head(args[0]);
    }
    if (is [String,String] args) {
      Anything v = delegate.head(args[0],args[1]);
    }
    if (is [String,Anything(HttpClientResponse)] args) {
      Anything v = delegate.head(args[0],nothing);
    }
    if (is [Integer,String,String] args) {
      Anything v = delegate.head(args[0],args[1],args[2]);
    }
    if (is [String,String,Anything(HttpClientResponse)] args) {
      Anything v = delegate.head(args[0],args[1],nothing);
    }
    if (is [Integer,String,String,Anything(HttpClientResponse)] args) {
      Anything v = delegate.head(args[0],args[1],args[2],nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest headAbs_impl([String]|[String,Anything(HttpClientResponse)] args) {
    if (is [String] args) {
      Anything v = delegate.headAbs(args[0]);
    }
    if (is [String,Anything(HttpClientResponse)] args) {
      Anything v = delegate.headAbs(args[0],nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClient headNow_impl([String,Anything(HttpClientResponse)]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)] args) {
    if (is [String,Anything(HttpClientResponse)] args) {
      Anything v = delegate.headNow(args[0],nothing);
    }
    if (is [String,String,Anything(HttpClientResponse)] args) {
      Anything v = delegate.headNow(args[0],args[1],nothing);
    }
    if (is [Integer,String,String,Anything(HttpClientResponse)] args) {
      Anything v = delegate.headNow(args[0],args[1],args[2],nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest options_impl([String]|[String,String]|[String,Anything(HttpClientResponse)]|[Integer,String,String]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)] args) {
    if (is [String] args) {
      Anything v = delegate.options(args[0]);
    }
    if (is [String,String] args) {
      Anything v = delegate.options(args[0],args[1]);
    }
    if (is [String,Anything(HttpClientResponse)] args) {
      Anything v = delegate.options(args[0],nothing);
    }
    if (is [Integer,String,String] args) {
      Anything v = delegate.options(args[0],args[1],args[2]);
    }
    if (is [String,String,Anything(HttpClientResponse)] args) {
      Anything v = delegate.options(args[0],args[1],nothing);
    }
    if (is [Integer,String,String,Anything(HttpClientResponse)] args) {
      Anything v = delegate.options(args[0],args[1],args[2],nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest optionsAbs_impl([String]|[String,Anything(HttpClientResponse)] args) {
    if (is [String] args) {
      Anything v = delegate.optionsAbs(args[0]);
    }
    if (is [String,Anything(HttpClientResponse)] args) {
      Anything v = delegate.optionsAbs(args[0],nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClient optionsNow_impl([String,Anything(HttpClientResponse)]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)] args) {
    if (is [String,Anything(HttpClientResponse)] args) {
      Anything v = delegate.optionsNow(args[0],nothing);
    }
    if (is [String,String,Anything(HttpClientResponse)] args) {
      Anything v = delegate.optionsNow(args[0],args[1],nothing);
    }
    if (is [Integer,String,String,Anything(HttpClientResponse)] args) {
      Anything v = delegate.optionsNow(args[0],args[1],args[2],nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest put_impl([String]|[String,String]|[String,Anything(HttpClientResponse)]|[Integer,String,String]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)] args) {
    if (is [String] args) {
      Anything v = delegate.put(args[0]);
    }
    if (is [String,String] args) {
      Anything v = delegate.put(args[0],args[1]);
    }
    if (is [String,Anything(HttpClientResponse)] args) {
      Anything v = delegate.put(args[0],nothing);
    }
    if (is [Integer,String,String] args) {
      Anything v = delegate.put(args[0],args[1],args[2]);
    }
    if (is [String,String,Anything(HttpClientResponse)] args) {
      Anything v = delegate.put(args[0],args[1],nothing);
    }
    if (is [Integer,String,String,Anything(HttpClientResponse)] args) {
      Anything v = delegate.put(args[0],args[1],args[2],nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest putAbs_impl([String]|[String,Anything(HttpClientResponse)] args) {
    if (is [String] args) {
      Anything v = delegate.putAbs(args[0]);
    }
    if (is [String,Anything(HttpClientResponse)] args) {
      Anything v = delegate.putAbs(args[0],nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest delete_impl([String]|[String,String]|[String,Anything(HttpClientResponse)]|[Integer,String,String]|[String,String,Anything(HttpClientResponse)]|[Integer,String,String,Anything(HttpClientResponse)] args) {
    if (is [String] args) {
      Anything v = delegate.delete(args[0]);
    }
    if (is [String,String] args) {
      Anything v = delegate.delete(args[0],args[1]);
    }
    if (is [String,Anything(HttpClientResponse)] args) {
      Anything v = delegate.delete(args[0],nothing);
    }
    if (is [Integer,String,String] args) {
      Anything v = delegate.delete(args[0],args[1],args[2]);
    }
    if (is [String,String,Anything(HttpClientResponse)] args) {
      Anything v = delegate.delete(args[0],args[1],nothing);
    }
    if (is [Integer,String,String,Anything(HttpClientResponse)] args) {
      Anything v = delegate.delete(args[0],args[1],args[2],nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest deleteAbs_impl([String]|[String,Anything(HttpClientResponse)] args) {
    if (is [String] args) {
      Anything v = delegate.deleteAbs(args[0]);
    }
    if (is [String,Anything(HttpClientResponse)] args) {
      Anything v = delegate.deleteAbs(args[0],nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClient websocket_impl([String,Anything(WebSocket)]|[String,String,Anything(WebSocket)]|[String,MultiMap,Anything(WebSocket)]|[Integer,String,String,Anything(WebSocket)]|[String,String,MultiMap,Anything(WebSocket)]|[String,MultiMap,String,Anything(WebSocket)]|[Integer,String,String,MultiMap,Anything(WebSocket)]|[String,String,MultiMap,String,Anything(WebSocket)]|[String,MultiMap,String,String,Anything(WebSocket)]|[Integer,String,String,MultiMap,String,Anything(WebSocket)]|[String,String,MultiMap,String,String,Anything(WebSocket)]|[Integer,String,String,MultiMap,String,String,Anything(WebSocket)] args) {
    if (is [String,Anything(WebSocket)] args) {
      Anything v = delegate.websocket(args[0],nothing);
    }
    if (is [String,String,Anything(WebSocket)] args) {
      Anything v = delegate.websocket(args[0],args[1],nothing);
    }
    if (is [String,MultiMap,Anything(WebSocket)] args) {
      assert(is Delegating<MultiMap> arg_1 = args[1]);
      Anything v = delegate.websocket(args[0],arg_1.delegate,nothing);
    }
    if (is [Integer,String,String,Anything(WebSocket)] args) {
      Anything v = delegate.websocket(args[0],args[1],args[2],nothing);
    }
    if (is [String,String,MultiMap,Anything(WebSocket)] args) {
      assert(is Delegating<MultiMap> arg_2 = args[2]);
      Anything v = delegate.websocket(args[0],args[1],arg_2.delegate,nothing);
    }
    if (is [String,MultiMap,String,Anything(WebSocket)] args) {
      assert(is Delegating<MultiMap> arg_1 = args[1]);
      Anything v = delegate.websocket(args[0],arg_1.delegate,nothing,nothing);
    }
    if (is [Integer,String,String,MultiMap,Anything(WebSocket)] args) {
      assert(is Delegating<MultiMap> arg_3 = args[3]);
      Anything v = delegate.websocket(args[0],args[1],args[2],arg_3.delegate,nothing);
    }
    if (is [String,String,MultiMap,String,Anything(WebSocket)] args) {
      assert(is Delegating<MultiMap> arg_2 = args[2]);
      Anything v = delegate.websocket(args[0],args[1],arg_2.delegate,nothing,nothing);
    }
    if (is [String,MultiMap,String,String,Anything(WebSocket)] args) {
      assert(is Delegating<MultiMap> arg_1 = args[1]);
      Anything v = delegate.websocket(args[0],arg_1.delegate,nothing,args[3],nothing);
    }
    if (is [Integer,String,String,MultiMap,String,Anything(WebSocket)] args) {
      assert(is Delegating<MultiMap> arg_3 = args[3]);
      Anything v = delegate.websocket(args[0],args[1],args[2],arg_3.delegate,nothing,nothing);
    }
    if (is [String,String,MultiMap,String,String,Anything(WebSocket)] args) {
      assert(is Delegating<MultiMap> arg_2 = args[2]);
      Anything v = delegate.websocket(args[0],args[1],arg_2.delegate,nothing,args[4],nothing);
    }
    if (is [Integer,String,String,MultiMap,String,String,Anything(WebSocket)] args) {
      assert(is Delegating<MultiMap> arg_3 = args[3]);
      Anything v = delegate.websocket(args[0],args[1],args[2],arg_3.delegate,nothing,args[5],nothing);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  WebSocketStream websocketStream_impl([String]|[String,String]|[String,MultiMap]|[Integer,String,String]|[String,String,MultiMap]|[String,MultiMap,String]|[Integer,String,String,MultiMap]|[String,String,MultiMap,String]|[String,MultiMap,String,String]|[Integer,String,String,MultiMap,String]|[String,String,MultiMap,String,String]|[Integer,String,String,MultiMap,String,String] args) {
    if (is [String] args) {
      Anything v = delegate.websocketStream(args[0]);
    }
    if (is [String,String] args) {
      Anything v = delegate.websocketStream(args[0],args[1]);
    }
    if (is [String,MultiMap] args) {
      assert(is Delegating<MultiMap> arg_1 = args[1]);
      Anything v = delegate.websocketStream(args[0],arg_1.delegate);
    }
    if (is [Integer,String,String] args) {
      Anything v = delegate.websocketStream(args[0],args[1],args[2]);
    }
    if (is [String,String,MultiMap] args) {
      assert(is Delegating<MultiMap> arg_2 = args[2]);
      Anything v = delegate.websocketStream(args[0],args[1],arg_2.delegate);
    }
    if (is [String,MultiMap,String] args) {
      assert(is Delegating<MultiMap> arg_1 = args[1]);
      Anything v = delegate.websocketStream(args[0],arg_1.delegate,nothing);
    }
    if (is [Integer,String,String,MultiMap] args) {
      assert(is Delegating<MultiMap> arg_3 = args[3]);
      Anything v = delegate.websocketStream(args[0],args[1],args[2],arg_3.delegate);
    }
    if (is [String,String,MultiMap,String] args) {
      assert(is Delegating<MultiMap> arg_2 = args[2]);
      Anything v = delegate.websocketStream(args[0],args[1],arg_2.delegate,nothing);
    }
    if (is [String,MultiMap,String,String] args) {
      assert(is Delegating<MultiMap> arg_1 = args[1]);
      Anything v = delegate.websocketStream(args[0],arg_1.delegate,nothing,args[3]);
    }
    if (is [Integer,String,String,MultiMap,String] args) {
      assert(is Delegating<MultiMap> arg_3 = args[3]);
      Anything v = delegate.websocketStream(args[0],args[1],args[2],arg_3.delegate,nothing);
    }
    if (is [String,String,MultiMap,String,String] args) {
      assert(is Delegating<MultiMap> arg_2 = args[2]);
      Anything v = delegate.websocketStream(args[0],args[1],arg_2.delegate,nothing,args[4]);
    }
    if (is [Integer,String,String,MultiMap,String,String] args) {
      assert(is Delegating<MultiMap> arg_3 = args[3]);
      Anything v = delegate.websocketStream(args[0],args[1],args[2],arg_3.delegate,nothing,args[5]);
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
