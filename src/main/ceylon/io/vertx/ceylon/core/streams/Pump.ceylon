import io.vertx.ceylon.core.streams {
  WriteStream,
  ReadStream
}
/* Generated from io.vertx.core.streams.Pump */
shared abstract class Pump() {
  shared formal Anything(*<[Integer]>) setWriteQueueMaxSize;
  shared formal Anything(*<[]>) start;
  shared formal Anything(*<[]>) stop;
  shared formal Anything(*<[]>) numberPumped;
}
