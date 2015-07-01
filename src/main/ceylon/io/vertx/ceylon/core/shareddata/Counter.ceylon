import java.lang {
  Long_=Long,
  Boolean_=Boolean
}
/* Generated from io.vertx.core.shareddata.Counter */
shared abstract class Counter() {
  shared formal Anything(*<[Anything(Throwable|Integer)]>) get;
  shared formal Anything(*<[Anything(Throwable|Integer)]>) incrementAndGet;
  shared formal Anything(*<[Anything(Throwable|Integer)]>) getAndIncrement;
  shared formal Anything(*<[Anything(Throwable|Integer)]>) decrementAndGet;
  shared formal Anything(*<[Integer,Anything(Throwable|Integer)]>) addAndGet;
  shared formal Anything(*<[Integer,Anything(Throwable|Integer)]>) getAndAdd;
  shared formal Anything(*<[Integer,Integer,Anything(Throwable|Boolean)]>) compareAndSet;
}
