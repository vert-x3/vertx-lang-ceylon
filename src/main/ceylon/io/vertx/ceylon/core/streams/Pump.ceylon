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
shared interface Pump  {

  shared formal Pump(*<[Integer]>) setWriteQueueMaxSize;
  shared formal Pump(*<[]>) start;
  shared formal Pump(*<[]>) stop;
  shared formal Integer(*<[]>) numberPumped;
}
/* Generated from io.vertx.core.streams.Pump */

shared abstract class Pump_Impl(Pump delegate) satisfies Pump & Delegating<Pump> {

  shared actual Pump(*<[Integer]>) setWriteQueueMaxSize => flatten(setWriteQueueMaxSize_impl);
  shared actual Pump(*<[]>) start => flatten(start_impl);
  shared actual Pump(*<[]>) stop => flatten(stop_impl);
  shared actual Integer(*<[]>) numberPumped => flatten(numberPumped_impl);

  Pump setWriteQueueMaxSize_impl([Integer] args) {
    Anything v = delegate.setWriteQueueMaxSize(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Pump start_impl([] args) {
    Anything v = delegate.start();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Pump stop_impl([] args) {
    Anything v = delegate.stop();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer numberPumped_impl([] args) {
    Anything v = delegate.numberPumped();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
