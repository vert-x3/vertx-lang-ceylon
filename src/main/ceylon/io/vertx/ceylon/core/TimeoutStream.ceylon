import java.lang {
  Long_=Long
}
import io.vertx.core {
  TimeoutStream_=TimeoutStream
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.ceylon.core.streams {
  ReadStream
}
/* Generated from io.vertx.core.TimeoutStream */
shared abstract class TimeoutStream(TimeoutStream_ delegate) satisfies Delegating
  & ReadStream<Integer> {

  TimeoutStream exceptionHandler_impl([Anything(Throwable)] args) {
    throw Exception("implement me");
  }

  shared actual TimeoutStream(*<[Anything(Throwable)]>) exceptionHandler = flatten(exceptionHandler_impl);

  TimeoutStream handler_impl([Anything(Integer)] args) {
    throw Exception("implement me");
  }

  shared actual TimeoutStream(*<[Anything(Integer)]>) handler = flatten(handler_impl);

  TimeoutStream pause_impl([] args) {
    throw Exception("implement me");
  }

  shared actual TimeoutStream(*<[]>) pause = flatten(pause_impl);

  TimeoutStream resume_impl([] args) {
    throw Exception("implement me");
  }

  shared actual TimeoutStream(*<[]>) resume = flatten(resume_impl);

  TimeoutStream endHandler_impl([Anything()] args) {
    throw Exception("implement me");
  }

  shared actual TimeoutStream(*<[Anything()]>) endHandler = flatten(endHandler_impl);

  Anything cancel_impl([] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[]>) cancel = flatten(cancel_impl);

}
