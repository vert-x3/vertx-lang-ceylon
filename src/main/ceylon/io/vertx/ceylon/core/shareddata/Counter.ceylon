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
shared interface Counter  {

  shared formal Anything(*<[Anything(Throwable|Integer)]>) get;
  shared formal Anything(*<[Anything(Throwable|Integer)]>) incrementAndGet;
  shared formal Anything(*<[Anything(Throwable|Integer)]>) getAndIncrement;
  shared formal Anything(*<[Anything(Throwable|Integer)]>) decrementAndGet;
  shared formal Anything(*<[Integer,Anything(Throwable|Integer)]>) addAndGet;
  shared formal Anything(*<[Integer,Anything(Throwable|Integer)]>) getAndAdd;
  shared formal Anything(*<[Integer,Integer,Anything(Throwable|Boolean)]>) compareAndSet;
}
/* Generated from io.vertx.core.shareddata.Counter */

shared abstract class Counter_Impl(Counter_ delegate) satisfies Counter & Delegating<Counter_> {

  shared actual Anything(*<[Anything(Throwable|Integer)]>) get => flatten(get_impl);
  shared actual Anything(*<[Anything(Throwable|Integer)]>) incrementAndGet => flatten(incrementAndGet_impl);
  shared actual Anything(*<[Anything(Throwable|Integer)]>) getAndIncrement => flatten(getAndIncrement_impl);
  shared actual Anything(*<[Anything(Throwable|Integer)]>) decrementAndGet => flatten(decrementAndGet_impl);
  shared actual Anything(*<[Integer,Anything(Throwable|Integer)]>) addAndGet => flatten(addAndGet_impl);
  shared actual Anything(*<[Integer,Anything(Throwable|Integer)]>) getAndAdd => flatten(getAndAdd_impl);
  shared actual Anything(*<[Integer,Integer,Anything(Throwable|Boolean)]>) compareAndSet => flatten(compareAndSet_impl);

  Anything get_impl([Anything(Throwable|Integer)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.get(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything incrementAndGet_impl([Anything(Throwable|Integer)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.incrementAndGet(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything getAndIncrement_impl([Anything(Throwable|Integer)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.getAndIncrement(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything decrementAndGet_impl([Anything(Throwable|Integer)] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.decrementAndGet(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything addAndGet_impl([Integer,Anything(Throwable|Integer)] args) {
    Integer arg_0 = args[0];
    Nothing arg_1 = nothing;
    Anything v = delegate.addAndGet(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything getAndAdd_impl([Integer,Anything(Throwable|Integer)] args) {
    Integer arg_0 = args[0];
    Nothing arg_1 = nothing;
    Anything v = delegate.getAndAdd(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything compareAndSet_impl([Integer,Integer,Anything(Throwable|Boolean)] args) {
    Integer arg_0 = args[0];
    Integer arg_1 = args[1];
    Nothing arg_2 = nothing;
    Anything v = delegate.compareAndSet(arg_0,arg_1,arg_2);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
