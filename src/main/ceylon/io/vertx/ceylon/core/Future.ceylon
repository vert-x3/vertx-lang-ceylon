import java.lang {
  String_=String
}
import io.vertx.core {
  Future_=Future
}
import io.vertx.lang.ceylon {
  Delegating
}
/* Generated from io.vertx.core.Future<T> */
shared interface Future<T>  {

  shared formal Boolean(*<[]>) isComplete;
  shared formal Anything(*<[Anything(Throwable|T)]>) setHandler;
  shared formal Anything(*<[]|[T]>) complete;
  shared formal Anything(*<[String]>) fail;
}
/* Generated from io.vertx.core.Future<T> */

shared abstract class Future_Impl<T>(Future_<Object> delegate) satisfies Future<T> & Delegating<Future_<Object>> {

  shared actual Boolean(*<[]>) isComplete => flatten(isComplete_impl);
  shared actual Anything(*<[Anything(Throwable|T)]>) setHandler => flatten(setHandler_impl);
  shared actual Anything(*<[]|[T]>) complete => flatten(complete_impl);
  shared actual Anything(*<[String]>) fail => flatten(fail_impl);

  Boolean isComplete_impl([] args) {
Anything v = delegate.complete;
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything setHandler_impl([Anything(Throwable|T)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.setHandler(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything complete_impl([]|[T] args) {
    if (is [] args) {
    }
    if (is [T] args) {
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything fail_impl([String] args) {
    String arg_0 = args[0];
    Anything v = delegate.fail(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
