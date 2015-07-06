import io.vertx.core.streams {
  WriteStream_=WriteStream
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.ceylon.core.streams {
  StreamBase
}
/* Generated from io.vertx.core.streams.WriteStream<T> */
shared interface WriteStream<T> satisfies Delegating
  & StreamBase {
  shared actual formal WriteStream<T>(*<[Anything(Throwable)]>) exceptionHandler;
  shared formal WriteStream<T>(*<[T]>) write;
  shared formal WriteStream<T>(*<[Integer]>) setWriteQueueMaxSize;
  shared formal Boolean(*<[]>) writeQueueFull;
  shared formal WriteStream<T>(*<[Anything()]>) drainHandler;
}
