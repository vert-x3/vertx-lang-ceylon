import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.ceylon.core.streams {
  WriteStream
}
/* Generated from io.vertx.core.datagram.PacketWritestream */
shared abstract class PacketWritestream() satisfies WriteStream<Buffer> {
  shared actual formal Anything(*<[]>) exceptionHandler;
  shared actual formal Anything(*<[]>) write;
  shared actual formal Anything(*<[]>) setWriteQueueMaxSize;
  shared actual formal Anything(*<[]>) drainHandler;
}
