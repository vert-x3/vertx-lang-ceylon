/* Generated from io.vertx.core.streams.WriteStream<T> */
shared interface WriteStream<T> satisfies StreamBase {
  shared actual formal Anything(*<[Anything(Throwable)]>) exceptionHandler;
  shared formal Anything(*<[T]>) write;
  shared formal Anything(*<[Integer]>) setWriteQueueMaxSize;
  shared formal Anything(*<[]>) writeQueueFull;
  shared formal Anything(*<[Anything()]>) drainHandler;
}
