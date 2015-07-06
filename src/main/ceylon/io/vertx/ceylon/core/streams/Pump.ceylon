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

  Pump setWriteQueueMaxSize_impl([Integer] args) {
    throw Exception("implement me");
  }

  shared  Pump(*<[Integer]>) setWriteQueueMaxSize = flatten(setWriteQueueMaxSize_impl);

  Pump start_impl([] args) {
    throw Exception("implement me");
  }

  shared  Pump(*<[]>) start = flatten(start_impl);

  Pump stop_impl([] args) {
    throw Exception("implement me");
  }

  shared  Pump(*<[]>) stop = flatten(stop_impl);

  Integer numberPumped_impl([] args) {
    throw Exception("implement me");
  }

  shared  Integer(*<[]>) numberPumped = flatten(numberPumped_impl);

}
