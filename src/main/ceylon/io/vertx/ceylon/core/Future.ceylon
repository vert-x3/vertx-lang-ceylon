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
  shared formal Boolean(*<[]>) isComplete;
  shared formal Anything(*<[Anything(Throwable|T)]>) setHandler;
  shared formal Anything(*<[]|[T]>) complete;
  shared formal Anything(*<[String]>) fail;
}
