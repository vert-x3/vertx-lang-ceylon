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
  shared actual formal PacketWritestream(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal PacketWritestream(*<[Buffer]>) write;
  shared actual formal PacketWritestream(*<[Integer]>) setWriteQueueMaxSize;
  shared actual formal PacketWritestream(*<[Anything()]>) drainHandler;
}
