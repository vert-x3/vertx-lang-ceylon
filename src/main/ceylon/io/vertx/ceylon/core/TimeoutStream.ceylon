import java.lang {
  Long_=Long
}
import io.vertx.ceylon.core.streams {
  ReadStream
}
/* Generated from io.vertx.core.TimeoutStream */
shared abstract class TimeoutStream() satisfies ReadStream<Integer> {
  shared actual formal Anything(*<[]>) exceptionHandler;
  shared actual formal Anything(*<[]>) handler;
  shared actual formal Anything(*<[]>) pause;
  shared actual formal Anything(*<[]>) resume;
  shared actual formal Anything(*<[]>) endHandler;
  shared formal Anything(*<[]>) cancel;
}
