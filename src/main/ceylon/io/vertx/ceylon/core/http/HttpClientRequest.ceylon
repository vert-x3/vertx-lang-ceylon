import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.ceylon.core {
  MultiMap
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.ceylon.core.http {
  HttpClientResponse
}
import io.vertx.ceylon.core.streams {
  WriteStream,
  ReadStream
}
import io.vertx.core.http {
  HttpClientRequest_=HttpClientRequest
}
/* Generated from io.vertx.core.http.HttpClientRequest */
shared interface HttpClientRequest satisfies WriteStream<Buffer>& ReadStream<HttpClientResponse> {

  shared actual formal HttpClientRequest(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal HttpClientRequest(*<[Buffer]|[String]|[String,String]>) write;
  shared actual formal HttpClientRequest(*<[Integer]>) setWriteQueueMaxSize;
  shared actual formal HttpClientRequest(*<[Anything()]>) drainHandler;
  shared actual formal HttpClientRequest(*<[Anything(HttpClientResponse)]>) handler;
  shared actual formal HttpClientRequest(*<[]>) pause;
  shared actual formal HttpClientRequest(*<[]>) resume;
  shared actual formal HttpClientRequest(*<[Anything()]>) endHandler;
  shared formal HttpClientRequest(*<[Boolean]>) setChunked;
  shared formal Boolean(*<[]>) isChunked;
  shared formal String(*<[]>) method;
  shared formal String(*<[]>) uri;
  shared formal MultiMap(*<[]>) headers;
  shared formal HttpClientRequest(*<[String,String]>) putHeader;
  shared formal HttpClientRequest(*<[Anything()]>) continueHandler;
  shared formal HttpClientRequest(*<[]>) sendHead;
  shared formal Anything(*<[]|[String]|[Buffer]|[String,String]>) end;
  shared formal HttpClientRequest(*<[Integer]>) setTimeout;
}
/* Generated from io.vertx.core.http.HttpClientRequest */

shared abstract class HttpClientRequest_Impl(HttpClientRequest delegate) satisfies HttpClientRequest & Delegating<HttpClientRequest> {

  shared actual HttpClientRequest(*<[Anything(Throwable)]>) exceptionHandler => flatten(exceptionHandler_impl);
  shared actual HttpClientRequest(*<[Buffer]|[String]|[String,String]>) write => flatten(write_impl);
  shared actual HttpClientRequest(*<[Integer]>) setWriteQueueMaxSize => flatten(setWriteQueueMaxSize_impl);
  shared actual HttpClientRequest(*<[Anything()]>) drainHandler => flatten(drainHandler_impl);
  shared actual HttpClientRequest(*<[Anything(HttpClientResponse)]>) handler => flatten(handler_impl);
  shared actual HttpClientRequest(*<[]>) pause => flatten(pause_impl);
  shared actual HttpClientRequest(*<[]>) resume => flatten(resume_impl);
  shared actual HttpClientRequest(*<[Anything()]>) endHandler => flatten(endHandler_impl);
  shared actual HttpClientRequest(*<[Boolean]>) setChunked => flatten(setChunked_impl);
  shared actual Boolean(*<[]>) isChunked => flatten(isChunked_impl);
  shared actual String(*<[]>) method => flatten(method_impl);
  shared actual String(*<[]>) uri => flatten(uri_impl);
  shared actual MultiMap(*<[]>) headers => flatten(headers_impl);
  shared actual HttpClientRequest(*<[String,String]>) putHeader => flatten(putHeader_impl);
  shared actual HttpClientRequest(*<[Anything()]>) continueHandler => flatten(continueHandler_impl);
  shared actual HttpClientRequest(*<[]>) sendHead => flatten(sendHead_impl);
  shared actual Anything(*<[]|[String]|[Buffer]|[String,String]>) end => flatten(end_impl);
  shared actual HttpClientRequest(*<[Integer]>) setTimeout => flatten(setTimeout_impl);

  HttpClientRequest exceptionHandler_impl([Anything(Throwable)] args) {
    Anything v = delegate.exceptionHandler(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest write_impl([Buffer]|[String]|[String,String] args) {
    if (is [Buffer] args) {
      assert(is Delegating<Buffer> arg_0 = args[0]);
      Anything v = delegate.write(arg_0.delegate);
    }
    if (is [String] args) {
      Anything v = delegate.write(args[0]);
    }
    if (is [String,String] args) {
      Anything v = delegate.write(args[0],args[1]);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest setWriteQueueMaxSize_impl([Integer] args) {
    Anything v = delegate.setWriteQueueMaxSize(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest drainHandler_impl([Anything()] args) {
    Anything v = delegate.drainHandler(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest handler_impl([Anything(HttpClientResponse)] args) {
    Anything v = delegate.handler(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest pause_impl([] args) {
    Anything v = delegate.pause();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest resume_impl([] args) {
    Anything v = delegate.resume();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest endHandler_impl([Anything()] args) {
    Anything v = delegate.endHandler(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest setChunked_impl([Boolean] args) {
    Anything v = delegate.setChunked(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isChunked_impl([] args) {
    Anything v = delegate.isChunked();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String method_impl([] args) {
    Anything v = delegate.method();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String uri_impl([] args) {
    Anything v = delegate.uri();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MultiMap headers_impl([] args) {
    Anything v = delegate.headers();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest putHeader_impl([String,String] args) {
    Anything v = delegate.putHeader(args[0],args[1]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest continueHandler_impl([Anything()] args) {
    Anything v = delegate.continueHandler(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest sendHead_impl([] args) {
    Anything v = delegate.sendHead();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything end_impl([]|[String]|[Buffer]|[String,String] args) {
    if (is [] args) {
      Anything v = delegate.end();
    }
    if (is [String] args) {
      Anything v = delegate.end(args[0]);
    }
    if (is [Buffer] args) {
      assert(is Delegating<Buffer> arg_0 = args[0]);
      Anything v = delegate.end(arg_0.delegate);
    }
    if (is [String,String] args) {
      Anything v = delegate.end(args[0],args[1]);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpClientRequest setTimeout_impl([Integer] args) {
    Anything v = delegate.setTimeout(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
