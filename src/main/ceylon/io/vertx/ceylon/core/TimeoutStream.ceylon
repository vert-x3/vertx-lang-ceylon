import java.lang {
  Long_=Long
}
import io.vertx.ceylon.core.streams {
  ReadStream
}
/* Generated from io.vertx.core.TimeoutStream */
shared abstract class TimeoutStream() satisfies ReadStream<Integer> {
  shared actual formal TimeoutStream(*<[Anything(Throwable)]>) exceptionHandler;
  shared actual formal TimeoutStream(*<[Anything(Integer)]>) handler;
  shared actual formal TimeoutStream(*<[]>) pause;
  shared actual formal TimeoutStream(*<[]>) resume;
  shared actual formal TimeoutStream(*<[Anything()]>) endHandler;
  shared formal Anything(*<[]>) cancel;
}
