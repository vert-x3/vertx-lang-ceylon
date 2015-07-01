import java.lang {
  String_=String
}
/* Generated from io.vertx.core.MultiMap */
shared abstract class MultiMap() {
  shared formal Anything(*<[String]>) get;
  shared formal Anything(*<[String]>) getAll;
  shared formal Anything(*<[String]>) contains;
  shared formal Anything(*<[]>) isEmpty;
  shared formal Anything(*<[]>) names;
  shared formal Anything(*<[String,String]>) add;
  shared formal Anything(*<[MultiMap]>) addAll;
  shared formal Anything(*<[String,String]>) set;
  shared formal Anything(*<[MultiMap]>) setAll;
  shared formal Anything(*<[String]>) remove;
  shared formal Anything(*<[]>) clear;
  shared formal Anything(*<[]>) size;
}
