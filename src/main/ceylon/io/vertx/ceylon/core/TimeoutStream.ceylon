import java.lang {
  Void_=Void,
  Long_=Long
}
import io.vertx.core {
  TimeoutStream_=TimeoutStream,
  Handler_=Handler,
  AsyncResult_=AsyncResult
}
import io.vertx.core.streams {
  ReadStream_=ReadStream
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.ceylon.core.streams {
  ReadStream
}
/* Generated from io.vertx.core.TimeoutStream */
shared interface TimeoutStream satisfies ReadStream<Integer> {

  shared actual formal TimeoutStream(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal TimeoutStream(*<[Anything(Integer)]>) handler;
  shared actual formal TimeoutStream(*<[]>) pause;
  shared actual formal TimeoutStream(*<[]>) resume;
  shared actual formal TimeoutStream(*<[Anything()]>) endHandler;
  shared formal Anything(*<[]>) cancel;
}
/* Generated from io.vertx.core.TimeoutStream */

shared abstract class TimeoutStream_Impl(TimeoutStream_ delegate) satisfies TimeoutStream & Delegating<TimeoutStream_> {

  shared actual TimeoutStream(*<[Anything(Throwable)]>) exceptionHandler => flatten(exceptionHandler_impl);
  shared actual TimeoutStream(*<[Anything(Integer)]>) handler => flatten(handler_impl);
  shared actual TimeoutStream(*<[]>) pause => flatten(pause_impl);
  shared actual TimeoutStream(*<[]>) resume => flatten(resume_impl);
  shared actual TimeoutStream(*<[Anything()]>) endHandler => flatten(endHandler_impl);
  shared actual Anything(*<[]>) cancel => flatten(cancel_impl);

  TimeoutStream exceptionHandler_impl([Anything(Throwable)] args) {
    Handler_<Throwable> arg_0 = nothing;
    Anything v = delegate.exceptionHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  TimeoutStream handler_impl([Anything(Integer)] args) {
    Handler_<Long_> arg_0 = nothing;
    Anything v = delegate.handler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  TimeoutStream pause_impl([] args) {
    Anything v = delegate.pause();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  TimeoutStream resume_impl([] args) {
    Anything v = delegate.resume();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  TimeoutStream endHandler_impl([Anything()] args) {
    Handler_<Void_> arg_0 = nothing;
    Anything v = delegate.endHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything cancel_impl([] args) {
    Anything v = delegate.cancel();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
