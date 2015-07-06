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

  Boolean isComplete_impl([] args) {
    throw Exception("implement me");
  }

  shared  Boolean(*<[]>) isComplete = flatten(isComplete_impl);

  Anything setHandler_impl([Anything(Throwable|T)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable|T)]>) setHandler = flatten(setHandler_impl);

  Anything complete_impl([]|[T] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[]|[T]>) complete = flatten(complete_impl);

  Anything fail_impl([String] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[String]>) fail = flatten(fail_impl);

}
