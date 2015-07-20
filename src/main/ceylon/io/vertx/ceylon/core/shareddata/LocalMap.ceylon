import io.vertx.core.shareddata {
  LocalMap_=LocalMap
}
import io.vertx.lang.ceylon {
  Delegating
}
/* Generated from io.vertx.core.shareddata.LocalMap<K,V> */
shared abstract class LocalMap<K,V>(LocalMap_<Object, Object> delegate) satisfies Delegating {

  shared  V(*<[K]>) get => flatten(get_impl);

  shared  V(*<[K,V]>) put => flatten(put_impl);

  shared  V(*<[K]>) remove => flatten(remove_impl);

  shared  Anything(*<[]>) clear => flatten(clear_impl);

  shared  Integer(*<[]>) size => flatten(size_impl);

  shared  Boolean(*<[]>) isEmpty => flatten(isEmpty_impl);

  shared  V(*<[K,V]>) putIfAbsent => flatten(putIfAbsent_impl);

  shared  Boolean(*<[K,V]>) removeIfPresent => flatten(removeIfPresent_impl);

  shared  Boolean(*<[K,V,V]>) replaceIfPresent => flatten(replaceIfPresent_impl);

  shared  V(*<[K,V]>) replace => flatten(replace_impl);

  shared  Anything(*<[]>) close => flatten(close_impl);

  V get_impl([K] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  V put_impl([K,V] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  V remove_impl([K] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything clear_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer size_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isEmpty_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  V putIfAbsent_impl([K,V] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean removeIfPresent_impl([K,V] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean replaceIfPresent_impl([K,V,V] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  V replace_impl([K,V] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything close_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
