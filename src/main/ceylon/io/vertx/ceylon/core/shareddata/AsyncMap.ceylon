import io.vertx.core.shareddata {
  AsyncMap_=AsyncMap
}
import java.lang {
  Boolean_=Boolean,
  Integer_=Integer
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

shared abstract class AsyncMap_Impl<K,V>(AsyncMap<K,V> delegate) satisfies AsyncMap<K,V> & Delegating<AsyncMap<K,V>> {

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
    Anything v = delegate.get(nothing,nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything put_impl([K,V,Anything(Throwable?)]|[K,V,Integer,Anything(Throwable?)] args) {
    if (is [K,V,Anything(Throwable?)] args) {
      // Invoke method
    }
    if (is [K,V,Integer,Anything(Throwable?)] args) {
      // Invoke method
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything putIfAbsent_impl([K,V,Anything(Throwable|V)]|[K,V,Integer,Anything(Throwable|V)] args) {
    if (is [K,V,Anything(Throwable|V)] args) {
      // Invoke method
    }
    if (is [K,V,Integer,Anything(Throwable|V)] args) {
      // Invoke method
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything remove_impl([K,Anything(Throwable|V)] args) {
    Anything v = delegate.remove(nothing,nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything removeIfPresent_impl([K,V,Anything(Throwable|Boolean)] args) {
    Anything v = delegate.removeIfPresent(nothing,nothing,nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything replace_impl([K,V,Anything(Throwable|V)] args) {
    Anything v = delegate.replace(nothing,nothing,nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything replaceIfPresent_impl([K,V,V,Anything(Throwable|Boolean)] args) {
    Anything v = delegate.replaceIfPresent(nothing,nothing,nothing,nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything clear_impl([Anything(Throwable?)] args) {
    Anything v = delegate.clear(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything size_impl([Anything(Throwable|Integer)] args) {
    Anything v = delegate.size(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
