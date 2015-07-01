import java.lang {
  Boolean_=Boolean,
  Integer_=Integer
}
/* Generated from io.vertx.core.shareddata.AsyncMap<K,V> */
shared abstract class AsyncMap<K,V>() {
  shared formal Anything(*<[]>) get;
  shared formal Anything(*<[]|[]>) put;
  shared formal Anything(*<[]|[]>) putIfAbsent;
  shared formal Anything(*<[]>) remove;
  shared formal Anything(*<[]>) removeIfPresent;
  shared formal Anything(*<[]>) replace;
  shared formal Anything(*<[]>) replaceIfPresent;
  shared formal Anything(*<[]>) clear;
  shared formal Anything(*<[]>) size;
}
