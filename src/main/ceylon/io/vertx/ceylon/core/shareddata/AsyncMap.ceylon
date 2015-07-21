import io.vertx.core.shareddata {
  AsyncMap_=AsyncMap
}
import java.lang {
  Void_=Void,
  Boolean_=Boolean,
  Integer_=Integer
}
import io.vertx.core {
  Handler_=Handler,
  AsyncResult_=AsyncResult
}
import io.vertx.lang.ceylon {
  Delegating
}
/* Generated from io.vertx.core.shareddata.AsyncMap<K,V> */
shared interface AsyncMap<K,V>  {

  shared formal Anything(*<[K,Anything(Throwable|V)]>) get;
  shared formal Anything(*<[K,V,Anything(Throwable?)]|[K,V,Integer,Anything(Throwable?)]>) put;
  shared formal Anything(*<[K,V,Anything(Throwable|V)]|[K,V,Integer,Anything(Throwable|V)]>) putIfAbsent;
  shared formal Anything(*<[K,Anything(Throwable|V)]>) remove;
  shared formal Anything(*<[K,V,Anything(Throwable|Boolean)]>) removeIfPresent;
  shared formal Anything(*<[K,V,Anything(Throwable|V)]>) replace;
  shared formal Anything(*<[K,V,V,Anything(Throwable|Boolean)]>) replaceIfPresent;
  shared formal Anything(*<[Anything(Throwable?)]>) clear;
  shared formal Anything(*<[Anything(Throwable|Integer)]>) size;
}
/* Generated from io.vertx.core.shareddata.AsyncMap<K,V> */

shared abstract class AsyncMap_Impl<K,V>(AsyncMap_<Object,Object> delegate) satisfies AsyncMap<K,V> & Delegating<AsyncMap_<Object,Object>> {

  shared actual Anything(*<[K,Anything(Throwable|V)]>) get => flatten(get_impl);
  shared actual Anything(*<[K,V,Anything(Throwable?)]|[K,V,Integer,Anything(Throwable?)]>) put => flatten(put_impl);
  shared actual Anything(*<[K,V,Anything(Throwable|V)]|[K,V,Integer,Anything(Throwable|V)]>) putIfAbsent => flatten(putIfAbsent_impl);
  shared actual Anything(*<[K,Anything(Throwable|V)]>) remove => flatten(remove_impl);
  shared actual Anything(*<[K,V,Anything(Throwable|Boolean)]>) removeIfPresent => flatten(removeIfPresent_impl);
  shared actual Anything(*<[K,V,Anything(Throwable|V)]>) replace => flatten(replace_impl);
  shared actual Anything(*<[K,V,V,Anything(Throwable|Boolean)]>) replaceIfPresent => flatten(replaceIfPresent_impl);
  shared actual Anything(*<[Anything(Throwable?)]>) clear => flatten(clear_impl);
  shared actual Anything(*<[Anything(Throwable|Integer)]>) size => flatten(size_impl);

  Anything get_impl([K,Anything(Throwable|V)] args) {
    assert(is Object arg_0 = args[0]);
    Handler_<AsyncResult_<Object>> arg_1 = nothing;
    Anything v = delegate.get(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything put_impl([K,V,Anything(Throwable?)]|[K,V,Integer,Anything(Throwable?)] args) {
    if (is [K,V,Anything(Throwable?)] args) {
      assert(is Object arg_0 = args[0]);
      assert(is Object arg_1 = args[1]);
      Handler_<AsyncResult_<Void_>> arg_2 = nothing;
      Anything v = delegate.put(arg_0,arg_1,arg_2);
    }
    if (is [K,V,Integer,Anything(Throwable?)] args) {
      assert(is Object arg_0 = args[0]);
      assert(is Object arg_1 = args[1]);
      Integer arg_2 = args[2];
      Handler_<AsyncResult_<Void_>> arg_3 = nothing;
      Anything v = delegate.put(arg_0,arg_1,arg_2,arg_3);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything putIfAbsent_impl([K,V,Anything(Throwable|V)]|[K,V,Integer,Anything(Throwable|V)] args) {
    if (is [K,V,Anything(Throwable|V)] args) {
      assert(is Object arg_0 = args[0]);
      assert(is Object arg_1 = args[1]);
      Handler_<AsyncResult_<Object>> arg_2 = nothing;
      Anything v = delegate.putIfAbsent(arg_0,arg_1,arg_2);
    }
    if (is [K,V,Integer,Anything(Throwable|V)] args) {
      assert(is Object arg_0 = args[0]);
      assert(is Object arg_1 = args[1]);
      Integer arg_2 = args[2];
      Handler_<AsyncResult_<Object>> arg_3 = nothing;
      Anything v = delegate.putIfAbsent(arg_0,arg_1,arg_2,arg_3);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything remove_impl([K,Anything(Throwable|V)] args) {
    assert(is Object arg_0 = args[0]);
    Handler_<AsyncResult_<Object>> arg_1 = nothing;
    Anything v = delegate.remove(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything removeIfPresent_impl([K,V,Anything(Throwable|Boolean)] args) {
    assert(is Object arg_0 = args[0]);
    assert(is Object arg_1 = args[1]);
    Handler_<AsyncResult_<Boolean_>> arg_2 = nothing;
    Anything v = delegate.removeIfPresent(arg_0,arg_1,arg_2);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything replace_impl([K,V,Anything(Throwable|V)] args) {
    assert(is Object arg_0 = args[0]);
    assert(is Object arg_1 = args[1]);
    Handler_<AsyncResult_<Object>> arg_2 = nothing;
    Anything v = delegate.replace(arg_0,arg_1,arg_2);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything replaceIfPresent_impl([K,V,V,Anything(Throwable|Boolean)] args) {
    assert(is Object arg_0 = args[0]);
    assert(is Object arg_1 = args[1]);
    assert(is Object arg_2 = args[2]);
    Handler_<AsyncResult_<Boolean_>> arg_3 = nothing;
    Anything v = delegate.replaceIfPresent(arg_0,arg_1,arg_2,arg_3);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything clear_impl([Anything(Throwable?)] args) {
    Handler_<AsyncResult_<Void_>> arg_0 = nothing;
    Anything v = delegate.clear(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything size_impl([Anything(Throwable|Integer)] args) {
    Handler_<AsyncResult_<Integer_>> arg_0 = nothing;
    Anything v = delegate.size(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
