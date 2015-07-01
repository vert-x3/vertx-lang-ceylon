import java.lang {
  Boolean_=Boolean,
  Integer_=Integer
}
/* Generated from io.vertx.core.shareddata.AsyncMap<K,V> */
shared abstract class AsyncMap<K,V>() {
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
