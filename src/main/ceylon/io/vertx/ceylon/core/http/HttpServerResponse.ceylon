import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.ceylon.core {
  MultiMap,
  Future
}
import io.vertx.core.streams {
  WriteStream_=WriteStream
}
import io.vertx.core {
  MultiMap_=MultiMap,
  Future_=Future
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.ceylon.core.streams {
  WriteStream
}
import io.vertx.core.http {
  HttpServerResponse_=HttpServerResponse
}
import io.vertx.core.buffer {
  Buffer_=Buffer
}
/* Generated from io.vertx.core.http.HttpServerResponse */
shared interface HttpServerResponse satisfies WriteStream<Buffer> {

  shared actual formal HttpServerResponse(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal HttpServerResponse(*<[Buffer]|[String]|[String,String]>) write;
  shared actual formal HttpServerResponse(*<[Integer]>) setWriteQueueMaxSize;
  shared actual formal HttpServerResponse(*<[Anything()]>) drainHandler;
  shared formal Integer(*<[]>) getStatusCode;
  shared formal HttpServerResponse(*<[Integer]>) setStatusCode;
  shared formal String(*<[]>) getStatusMessage;
  shared formal HttpServerResponse(*<[String]>) setStatusMessage;
  shared formal HttpServerResponse(*<[Boolean]>) setChunked;
  shared formal Boolean(*<[]>) isChunked;
  shared formal MultiMap(*<[]>) headers;
  shared formal HttpServerResponse(*<[String,String]>) putHeader;
  shared formal MultiMap(*<[]>) trailers;
  shared formal HttpServerResponse(*<[String,String]>) putTrailer;
  shared formal HttpServerResponse(*<[Anything()]>) closeHandler;
  shared formal HttpServerResponse(*<[]>) writeContinue;
  shared formal Anything(*<[]|[String]|[Buffer]|[String,String]>) end;
  shared formal HttpServerResponse(*<[String]|[String,Anything(Throwable?)]>) sendFile;
  shared formal Anything(*<[]>) close;
  shared formal Boolean(*<[]>) ended;
  shared formal Boolean(*<[]>) headWritten;
  shared formal HttpServerResponse(*<[Anything(Future<Null>)]>) headersEndHandler;
  shared formal HttpServerResponse(*<[Anything()]>) bodyEndHandler;
}
/* Generated from io.vertx.core.http.HttpServerResponse */

shared abstract class HttpServerResponse_Impl(HttpServerResponse_ delegate) satisfies HttpServerResponse & Delegating<HttpServerResponse_> {

  shared actual HttpServerResponse(*<[Anything(Throwable)]>) exceptionHandler => flatten(exceptionHandler_impl);
  shared actual HttpServerResponse(*<[Buffer]|[String]|[String,String]>) write => flatten(write_impl);
  shared actual HttpServerResponse(*<[Integer]>) setWriteQueueMaxSize => flatten(setWriteQueueMaxSize_impl);
  shared actual HttpServerResponse(*<[Anything()]>) drainHandler => flatten(drainHandler_impl);
  shared actual Integer(*<[]>) getStatusCode => flatten(getStatusCode_impl);
  shared actual HttpServerResponse(*<[Integer]>) setStatusCode => flatten(setStatusCode_impl);
  shared actual String(*<[]>) getStatusMessage => flatten(getStatusMessage_impl);
  shared actual HttpServerResponse(*<[String]>) setStatusMessage => flatten(setStatusMessage_impl);
  shared actual HttpServerResponse(*<[Boolean]>) setChunked => flatten(setChunked_impl);
  shared actual Boolean(*<[]>) isChunked => flatten(isChunked_impl);
  shared actual MultiMap(*<[]>) headers => flatten(headers_impl);
  shared actual HttpServerResponse(*<[String,String]>) putHeader => flatten(putHeader_impl);
  shared actual MultiMap(*<[]>) trailers => flatten(trailers_impl);
  shared actual HttpServerResponse(*<[String,String]>) putTrailer => flatten(putTrailer_impl);
  shared actual HttpServerResponse(*<[Anything()]>) closeHandler => flatten(closeHandler_impl);
  shared actual HttpServerResponse(*<[]>) writeContinue => flatten(writeContinue_impl);
  shared actual Anything(*<[]|[String]|[Buffer]|[String,String]>) end => flatten(end_impl);
  shared actual HttpServerResponse(*<[String]|[String,Anything(Throwable?)]>) sendFile => flatten(sendFile_impl);
  shared actual Anything(*<[]>) close => flatten(close_impl);
  shared actual Boolean(*<[]>) ended => flatten(ended_impl);
  shared actual Boolean(*<[]>) headWritten => flatten(headWritten_impl);
  shared actual HttpServerResponse(*<[Anything(Future<Null>)]>) headersEndHandler => flatten(headersEndHandler_impl);
  shared actual HttpServerResponse(*<[Anything()]>) bodyEndHandler => flatten(bodyEndHandler_impl);

  HttpServerResponse exceptionHandler_impl([Anything(Throwable)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.exceptionHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerResponse write_impl([Buffer]|[String]|[String,String] args) {
    if (is [Buffer] args) {
    }
    if (is [String] args) {
    }
    if (is [String,String] args) {
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerResponse setWriteQueueMaxSize_impl([Integer] args) {
    Integer arg_0 = args[0];
    Anything v = delegate.setWriteQueueMaxSize(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerResponse drainHandler_impl([Anything()] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.drainHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer getStatusCode_impl([] args) {
Anything v = delegate.statusCode;
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerResponse setStatusCode_impl([Integer] args) {
    Integer arg_0 = args[0];
    Anything v = delegate.setStatusCode(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String getStatusMessage_impl([] args) {
Anything v = delegate.statusMessage;
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerResponse setStatusMessage_impl([String] args) {
    String arg_0 = args[0];
    Anything v = delegate.setStatusMessage(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerResponse setChunked_impl([Boolean] args) {
    Boolean arg_0 = args[0];
    Anything v = delegate.setChunked(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isChunked_impl([] args) {
Anything v = delegate.chunked;
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MultiMap headers_impl([] args) {
    Anything v = delegate.headers();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerResponse putHeader_impl([String,String] args) {
    String arg_0 = args[0];
    String arg_1 = args[1];
    Anything v = delegate.putHeader(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MultiMap trailers_impl([] args) {
    Anything v = delegate.trailers();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerResponse putTrailer_impl([String,String] args) {
    String arg_0 = args[0];
    String arg_1 = args[1];
    Anything v = delegate.putTrailer(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerResponse closeHandler_impl([Anything()] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.closeHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerResponse writeContinue_impl([] args) {
    Anything v = delegate.writeContinue();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything end_impl([]|[String]|[Buffer]|[String,String] args) {
    if (is [] args) {
    }
    if (is [String] args) {
    }
    if (is [Buffer] args) {
    }
    if (is [String,String] args) {
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerResponse sendFile_impl([String]|[String,Anything(Throwable?)] args) {
    if (is [String] args) {
    }
    if (is [String,Anything(Throwable?)] args) {
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything close_impl([] args) {
    Anything v = delegate.close();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean ended_impl([] args) {
    Anything v = delegate.ended();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean headWritten_impl([] args) {
    Anything v = delegate.headWritten();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerResponse headersEndHandler_impl([Anything(Future<Null>)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.headersEndHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  HttpServerResponse bodyEndHandler_impl([Anything()] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.bodyEndHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
