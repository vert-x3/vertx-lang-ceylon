/* Generated from io.vertx.core.shareddata.LocalMap<K,V> */
shared abstract class LocalMap<K,V>() {
  shared formal Anything(*<[K]>) get;
  shared formal Anything(*<[K,V]>) put;
  shared formal Anything(*<[K]>) remove;
  shared formal Anything(*<[]>) clear;
  shared formal Anything(*<[]>) size;
  shared formal Anything(*<[]>) isEmpty;
  shared formal Anything(*<[K,V]>) putIfAbsent;
  shared formal Anything(*<[K,V]>) removeIfPresent;
  shared formal Anything(*<[K,V,V]>) replaceIfPresent;
  shared formal Anything(*<[K,V]>) replace;
  shared formal Anything(*<[]>) close;
}
