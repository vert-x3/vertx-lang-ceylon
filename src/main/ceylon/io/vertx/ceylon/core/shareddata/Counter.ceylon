import io.vertx.core.shareddata {
  Counter_=Counter
}
import java.lang {
  Long_=Long,
  Boolean_=Boolean
}
import io.vertx.lang.ceylon {
  Delegating
}
/* Generated from io.vertx.core.shareddata.Counter */
shared abstract class Counter(Counter_ delegate) satisfies Delegating {
  shared formal Anything(*<[Anything(Throwable|Integer)]>) get;
  shared formal Anything(*<[Anything(Throwable|Integer)]>) incrementAndGet;
  shared formal Anything(*<[Anything(Throwable|Integer)]>) getAndIncrement;
  shared formal Anything(*<[Anything(Throwable|Integer)]>) decrementAndGet;
  shared formal Anything(*<[Integer,Anything(Throwable|Integer)]>) addAndGet;
  shared formal Anything(*<[Integer,Anything(Throwable|Integer)]>) getAndAdd;
  shared formal Anything(*<[Integer,Integer,Anything(Throwable|Boolean)]>) compareAndSet;
}
