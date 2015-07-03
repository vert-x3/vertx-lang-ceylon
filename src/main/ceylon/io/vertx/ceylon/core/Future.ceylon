import java.lang {
  String_=String
}
/* Generated from io.vertx.core.Future<T> */
shared abstract class Future<T>() {
  shared formal Boolean(*<[]>) isComplete;
  shared formal Anything(*<[Anything(Throwable|T)]>) setHandler;
  shared formal Anything(*<[]|[T]>) complete;
  shared formal Anything(*<[String]>) fail;
}
