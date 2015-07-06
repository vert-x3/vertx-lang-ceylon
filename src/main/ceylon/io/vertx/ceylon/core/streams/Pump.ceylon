import io.vertx.core.streams {
  Pump_=Pump
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.ceylon.core.streams {
  WriteStream,
  ReadStream
}
/* Generated from io.vertx.core.streams.Pump */
shared abstract class Pump(Pump_ delegate) satisfies Delegating {
  shared formal Pump(*<[Integer]>) setWriteQueueMaxSize;
  shared formal Pump(*<[]>) start;
  shared formal Pump(*<[]>) stop;
  shared formal Integer(*<[]>) numberPumped;
}
