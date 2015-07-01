/* Generated from io.vertx.core.streams.WriteStream<T> */
shared interface WriteStream<T> satisfies StreamBase {
  shared actual formal Anything(*<[]>) exceptionHandler;
  shared formal Anything(*<[]>) write;
  shared formal Anything(*<[]>) setWriteQueueMaxSize;
  shared formal Anything(*<[]>) writeQueueFull;
  shared formal Anything(*<[]>) drainHandler;
}
