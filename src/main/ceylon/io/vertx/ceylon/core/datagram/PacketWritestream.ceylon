import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.ceylon.core.streams {
  WriteStream
}
/* Generated from io.vertx.core.datagram.PacketWritestream */
shared abstract class PacketWritestream() satisfies WriteStream<Buffer> {
  shared actual formal PacketWritestream(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal PacketWritestream(*<[Buffer]>) write;
  shared actual formal PacketWritestream(*<[Integer]>) setWriteQueueMaxSize;
  shared actual formal PacketWritestream(*<[Anything()]>) drainHandler;
}
