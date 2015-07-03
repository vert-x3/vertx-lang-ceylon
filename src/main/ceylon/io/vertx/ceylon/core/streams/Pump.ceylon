import io.vertx.ceylon.core.streams {
  WriteStream,
  ReadStream
}
/* Generated from io.vertx.core.streams.Pump */
shared abstract class Pump() {
  shared formal Pump(*<[Integer]>) setWriteQueueMaxSize;
  shared formal Pump(*<[]>) start;
  shared formal Pump(*<[]>) stop;
  shared formal Integer(*<[]>) numberPumped;
}
