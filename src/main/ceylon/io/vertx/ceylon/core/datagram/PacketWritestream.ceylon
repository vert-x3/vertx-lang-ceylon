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

  PacketWritestream exceptionHandler_impl([Anything(Throwable)] args) {
    throw Exception("implement me");
  }

  shared actual PacketWritestream(*<[Anything(Throwable)]>) exceptionHandler = flatten(exceptionHandler_impl);

  PacketWritestream write_impl([Buffer] args) {
    throw Exception("implement me");
  }

  shared actual PacketWritestream(*<[Buffer]>) write = flatten(write_impl);

  PacketWritestream setWriteQueueMaxSize_impl([Integer] args) {
    throw Exception("implement me");
  }

  shared actual PacketWritestream(*<[Integer]>) setWriteQueueMaxSize = flatten(setWriteQueueMaxSize_impl);

  PacketWritestream drainHandler_impl([Anything()] args) {
    throw Exception("implement me");
  }

  shared actual PacketWritestream(*<[Anything()]>) drainHandler = flatten(drainHandler_impl);

}
