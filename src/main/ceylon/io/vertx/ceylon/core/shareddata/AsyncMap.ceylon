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
shared abstract class AsyncMap<K,V>(AsyncMap_<Object, Object> delegate) satisfies Delegating {

  Anything get_impl([K,Anything(Throwable|V)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[K,Anything(Throwable|V)]>) get = flatten(get_impl);

  Anything put_impl([K,V,Anything(Throwable?)]|[K,V,Integer,Anything(Throwable?)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[K,V,Anything(Throwable?)]|[K,V,Integer,Anything(Throwable?)]>) put = flatten(put_impl);

  Anything putIfAbsent_impl([K,V,Anything(Throwable|V)]|[K,V,Integer,Anything(Throwable|V)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[K,V,Anything(Throwable|V)]|[K,V,Integer,Anything(Throwable|V)]>) putIfAbsent = flatten(putIfAbsent_impl);

  Anything remove_impl([K,Anything(Throwable|V)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[K,Anything(Throwable|V)]>) remove = flatten(remove_impl);

  Anything removeIfPresent_impl([K,V,Anything(Throwable|Boolean)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[K,V,Anything(Throwable|Boolean)]>) removeIfPresent = flatten(removeIfPresent_impl);

  Anything replace_impl([K,V,Anything(Throwable|V)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[K,V,Anything(Throwable|V)]>) replace = flatten(replace_impl);

  Anything replaceIfPresent_impl([K,V,V,Anything(Throwable|Boolean)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[K,V,V,Anything(Throwable|Boolean)]>) replaceIfPresent = flatten(replaceIfPresent_impl);

  Anything clear_impl([Anything(Throwable?)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable?)]>) clear = flatten(clear_impl);

  Anything size_impl([Anything(Throwable|Integer)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Throwable|Integer)]>) size = flatten(size_impl);

}
