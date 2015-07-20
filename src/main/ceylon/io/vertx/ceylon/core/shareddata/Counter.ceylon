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

  shared  Anything(*<[Anything(Throwable|Integer)]>) get => flatten(get_impl);

  shared  Anything(*<[Anything(Throwable|Integer)]>) incrementAndGet => flatten(incrementAndGet_impl);

  shared  Anything(*<[Anything(Throwable|Integer)]>) getAndIncrement => flatten(getAndIncrement_impl);

  shared  Anything(*<[Anything(Throwable|Integer)]>) decrementAndGet => flatten(decrementAndGet_impl);

  shared  Anything(*<[Integer,Anything(Throwable|Integer)]>) addAndGet => flatten(addAndGet_impl);

  shared  Anything(*<[Integer,Anything(Throwable|Integer)]>) getAndAdd => flatten(getAndAdd_impl);

  shared  Anything(*<[Integer,Integer,Anything(Throwable|Boolean)]>) compareAndSet => flatten(compareAndSet_impl);

  Anything get_impl([Anything(Throwable|Integer)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything incrementAndGet_impl([Anything(Throwable|Integer)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything getAndIncrement_impl([Anything(Throwable|Integer)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything decrementAndGet_impl([Anything(Throwable|Integer)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything addAndGet_impl([Integer,Anything(Throwable|Integer)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything getAndAdd_impl([Integer,Anything(Throwable|Integer)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything compareAndSet_impl([Integer,Integer,Anything(Throwable|Boolean)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
