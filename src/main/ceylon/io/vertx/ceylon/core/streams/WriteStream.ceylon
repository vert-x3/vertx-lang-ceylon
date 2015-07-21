import java.lang {
  Void_=Void
}
import io.vertx.core.streams {
  WriteStream_=WriteStream,
  StreamBase_=StreamBase
}
import io.vertx.core {
  Handler_=Handler,
  AsyncResult_=AsyncResult
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.ceylon.core.streams {
  StreamBase
}
/* Generated from io.vertx.core.streams.WriteStream<T> */
shared interface WriteStream<T> satisfies StreamBase {

  shared actual formal WriteStream<T>(*<[Anything(Throwable)]>) exceptionHandler;
  shared formal WriteStream<T>(*<[T]>) write;
  shared formal WriteStream<T>(*<[Integer]>) setWriteQueueMaxSize;
  shared formal Boolean(*<[]>) writeQueueFull;
  shared formal WriteStream<T>(*<[Anything()]>) drainHandler;
}
/* Generated from io.vertx.core.streams.WriteStream<T> */
