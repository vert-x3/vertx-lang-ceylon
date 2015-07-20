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

  shared  Pump(*<[Integer]>) setWriteQueueMaxSize => flatten(setWriteQueueMaxSize_impl);

  shared  Pump(*<[]>) start => flatten(start_impl);

  shared  Pump(*<[]>) stop => flatten(stop_impl);

  shared  Integer(*<[]>) numberPumped => flatten(numberPumped_impl);

  Pump setWriteQueueMaxSize_impl([Integer] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Pump start_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Pump stop_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer numberPumped_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
