import io.vertx.core.streams {
  ReadStream_=ReadStream
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.ceylon.core.streams {
  StreamBase
}
/* Generated from io.vertx.core.streams.ReadStream<T> */
shared interface ReadStream<T> satisfies Delegating
  & StreamBase {

  shared actual formal ReadStream<T>(*<[Anything(Throwable)]>) exceptionHandler;
  shared formal ReadStream<T>(*<[Anything(T)]>) handler;
  shared formal ReadStream<T>(*<[]>) pause;
  shared formal ReadStream<T>(*<[]>) resume;
  shared formal ReadStream<T>(*<[Anything()]>) endHandler;
}
