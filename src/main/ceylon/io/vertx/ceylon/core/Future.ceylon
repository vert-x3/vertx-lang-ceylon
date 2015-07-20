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

shared abstract class Future_Impl<T>(Future<T> delegate) satisfies Future<T> & Delegating<Future<T>> {

  shared actual Boolean(*<[]>) isComplete => flatten(isComplete_impl);
  shared actual Anything(*<[Anything(Throwable|T)]>) setHandler => flatten(setHandler_impl);
  shared actual Anything(*<[]|[T]>) complete => flatten(complete_impl);
  shared actual Anything(*<[String]>) fail => flatten(fail_impl);

  Boolean isComplete_impl([] args) {
    Anything v = delegate.isComplete();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything setHandler_impl([Anything(Throwable|T)] args) {
    Anything v = delegate.setHandler(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything complete_impl([]|[T] args) {
    if (is [] args) {
      // Invoke method
    }
    if (is [T] args) {
      // Invoke method
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything fail_impl([String] args) {
    Anything v = delegate.fail(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
