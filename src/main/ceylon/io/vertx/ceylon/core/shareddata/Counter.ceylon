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

  Anything get_impl([Anything(Throwable|Integer)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable|Integer)]>) get = flatten(get_impl);

  Anything incrementAndGet_impl([Anything(Throwable|Integer)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable|Integer)]>) incrementAndGet = flatten(incrementAndGet_impl);

  Anything getAndIncrement_impl([Anything(Throwable|Integer)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable|Integer)]>) getAndIncrement = flatten(getAndIncrement_impl);

  Anything decrementAndGet_impl([Anything(Throwable|Integer)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable|Integer)]>) decrementAndGet = flatten(decrementAndGet_impl);

  Anything addAndGet_impl([Integer,Anything(Throwable|Integer)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Integer,Anything(Throwable|Integer)]>) addAndGet = flatten(addAndGet_impl);

  Anything getAndAdd_impl([Integer,Anything(Throwable|Integer)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Integer,Anything(Throwable|Integer)]>) getAndAdd = flatten(getAndAdd_impl);

  Anything compareAndSet_impl([Integer,Integer,Anything(Throwable|Boolean)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Integer,Integer,Anything(Throwable|Boolean)]>) compareAndSet = flatten(compareAndSet_impl);

}
