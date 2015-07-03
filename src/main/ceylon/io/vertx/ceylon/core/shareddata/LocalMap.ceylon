/* Generated from io.vertx.core.shareddata.LocalMap<K,V> */
shared abstract class LocalMap<K,V>() {
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
