import io.vertx.core.shareddata {
  LocalMap_=LocalMap
}
import io.vertx.core {
  Handler_=Handler,
  AsyncResult_=AsyncResult
}
import io.vertx.lang.ceylon {
  Delegating
}
/* Generated from io.vertx.core.shareddata.LocalMap<K,V> */
shared interface LocalMap<K,V>  {

  shared formal V(*<[K]>) get;
  shared formal V(*<[K,V]>) put;
  shared formal V(*<[K]>) remove;
  shared formal Anything(*<[]>) clear;
  shared formal Integer(*<[]>) size;
  shared formal Boolean(*<[]>) isEmpty;
  shared formal V(*<[K,V]>) putIfAbsent;
  shared formal Boolean(*<[K,V]>) removeIfPresent;
  shared formal Boolean(*<[K,V,V]>) replaceIfPresent;
  shared formal V(*<[K,V]>) replace;
  shared formal Anything(*<[]>) close;
}
/* Generated from io.vertx.core.shareddata.LocalMap<K,V> */

shared abstract class LocalMap_Impl<K,V>(LocalMap_<Object,Object> delegate) satisfies LocalMap<K,V> & Delegating<LocalMap_<Object,Object>> {

  shared actual V(*<[K]>) get => flatten(get_impl);
  shared actual V(*<[K,V]>) put => flatten(put_impl);
  shared actual V(*<[K]>) remove => flatten(remove_impl);
  shared actual Anything(*<[]>) clear => flatten(clear_impl);
  shared actual Integer(*<[]>) size => flatten(size_impl);
  shared actual Boolean(*<[]>) isEmpty => flatten(isEmpty_impl);
  shared actual V(*<[K,V]>) putIfAbsent => flatten(putIfAbsent_impl);
  shared actual Boolean(*<[K,V]>) removeIfPresent => flatten(removeIfPresent_impl);
  shared actual Boolean(*<[K,V,V]>) replaceIfPresent => flatten(replaceIfPresent_impl);
  shared actual V(*<[K,V]>) replace => flatten(replace_impl);
  shared actual Anything(*<[]>) close => flatten(close_impl);

  V get_impl([K] args) {
    assert(is Object arg_0 = args[0]);
    Anything v = delegate.get(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  V put_impl([K,V] args) {
    assert(is Object arg_0 = args[0]);
    assert(is Object arg_1 = args[1]);
    Anything v = delegate.put(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  V remove_impl([K] args) {
    assert(is Object arg_0 = args[0]);
    Anything v = delegate.remove(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything clear_impl([] args) {
    Anything v = delegate.clear();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer size_impl([] args) {
    Anything v = delegate.size();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isEmpty_impl([] args) {
    Anything v = delegate.empty;
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  V putIfAbsent_impl([K,V] args) {
    assert(is Object arg_0 = args[0]);
    assert(is Object arg_1 = args[1]);
    Anything v = delegate.putIfAbsent(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean removeIfPresent_impl([K,V] args) {
    assert(is Object arg_0 = args[0]);
    assert(is Object arg_1 = args[1]);
    Anything v = delegate.removeIfPresent(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean replaceIfPresent_impl([K,V,V] args) {
    assert(is Object arg_0 = args[0]);
    assert(is Object arg_1 = args[1]);
    assert(is Object arg_2 = args[2]);
    Anything v = delegate.replaceIfPresent(arg_0,arg_1,arg_2);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  V replace_impl([K,V] args) {
    assert(is Object arg_0 = args[0]);
    assert(is Object arg_1 = args[1]);
    Anything v = delegate.replace(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything close_impl([] args) {
    Anything v = delegate.close();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
