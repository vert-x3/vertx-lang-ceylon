import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.core.datagram {
  PacketWritestream_=PacketWritestream
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.ceylon.core.streams {
  WriteStream
}
/* Generated from io.vertx.core.datagram.PacketWritestream */
shared abstract class PacketWritestream(PacketWritestream_ delegate) satisfies Delegating
  & WriteStream<Buffer> {

  shared actual PacketWritestream(*<[Anything(Throwable)]>) exceptionHandler => flatten(exceptionHandler_impl);

  shared actual PacketWritestream(*<[Buffer]>) write => flatten(write_impl);

  shared actual PacketWritestream(*<[Integer]>) setWriteQueueMaxSize => flatten(setWriteQueueMaxSize_impl);

  shared actual PacketWritestream(*<[Anything()]>) drainHandler => flatten(drainHandler_impl);

  PacketWritestream exceptionHandler_impl([Anything(Throwable)] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  PacketWritestream write_impl([Buffer] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  PacketWritestream setWriteQueueMaxSize_impl([Integer] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  PacketWritestream drainHandler_impl([Anything()] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
