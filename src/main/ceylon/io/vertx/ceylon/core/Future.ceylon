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
shared abstract class Future<T>(Future_<Object> delegate) satisfies Delegating {

  shared  Boolean(*<[]>) isComplete => flatten(isComplete_impl);

  shared  Anything(*<[Anything(Throwable|T)]>) setHandler => flatten(setHandler_impl);

  shared  Anything(*<[]|[T]>) complete => flatten(complete_impl);

  shared  Anything(*<[String]>) fail => flatten(fail_impl);

  Boolean isComplete_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything setHandler_impl([Anything(Throwable|T)] args) {
    // Invoke method
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
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
