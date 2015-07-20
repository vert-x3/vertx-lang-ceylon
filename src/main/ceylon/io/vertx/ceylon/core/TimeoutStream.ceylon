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

  shared actual TimeoutStream(*<[Anything(Throwable)]>) exceptionHandler => flatten(exceptionHandler_impl);

  shared actual TimeoutStream(*<[Anything(Integer)]>) handler => flatten(handler_impl);

  shared actual TimeoutStream(*<[]>) pause => flatten(pause_impl);

  shared actual TimeoutStream(*<[]>) resume => flatten(resume_impl);

  shared actual TimeoutStream(*<[Anything()]>) endHandler => flatten(endHandler_impl);

  shared  Anything(*<[]>) cancel => flatten(cancel_impl);

  TimeoutStream exceptionHandler_impl([Anything(Throwable)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  TimeoutStream handler_impl([Anything(Integer)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  TimeoutStream pause_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  TimeoutStream resume_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  TimeoutStream endHandler_impl([Anything()] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything cancel_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
