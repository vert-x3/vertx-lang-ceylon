import io.vertx.core.shareddata {
  LocalMap_=LocalMap
}
import io.vertx.lang.ceylon {
  Delegating
}
/* Generated from io.vertx.core.shareddata.LocalMap<K,V> */
shared abstract class LocalMap<K,V>(LocalMap_<Object, Object> delegate) satisfies Delegating {

  V get_impl([K] args) {
    throw Exception("implement me");
  }

  shared  V(*<[K]>) get = flatten(get_impl);

  V put_impl([K,V] args) {
    throw Exception("implement me");
  }

  shared  V(*<[K,V]>) put = flatten(put_impl);

  V remove_impl([K] args) {
    throw Exception("implement me");
  }

  shared  V(*<[K]>) remove = flatten(remove_impl);

  Anything clear_impl([] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[]>) clear = flatten(clear_impl);

  Integer size_impl([] args) {
    throw Exception("implement me");
  }

  shared  Integer(*<[]>) size = flatten(size_impl);

  Boolean isEmpty_impl([] args) {
    throw Exception("implement me");
  }

  shared  Boolean(*<[]>) isEmpty = flatten(isEmpty_impl);

  V putIfAbsent_impl([K,V] args) {
    throw Exception("implement me");
  }

  shared  V(*<[K,V]>) putIfAbsent = flatten(putIfAbsent_impl);

  Boolean removeIfPresent_impl([K,V] args) {
    throw Exception("implement me");
  }

  shared  Boolean(*<[K,V]>) removeIfPresent = flatten(removeIfPresent_impl);

  Boolean replaceIfPresent_impl([K,V,V] args) {
    throw Exception("implement me");
  }

  shared  Boolean(*<[K,V,V]>) replaceIfPresent = flatten(replaceIfPresent_impl);

  V replace_impl([K,V] args) {
    throw Exception("implement me");
  }

  shared  V(*<[K,V]>) replace = flatten(replace_impl);

  Anything close_impl([] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[]>) close = flatten(close_impl);

}
