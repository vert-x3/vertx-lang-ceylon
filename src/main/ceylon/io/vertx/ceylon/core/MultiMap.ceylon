import java.lang {
  String_=String
}
/* Generated from io.vertx.core.MultiMap */
shared abstract class MultiMap() {
  shared formal String(*<[String]>) get;
  shared formal List<String>(*<[String]>) getAll;
  shared formal Boolean(*<[String]>) contains;
  shared formal Boolean(*<[]>) isEmpty;
  shared formal Set<String>(*<[]>) names;
  shared formal MultiMap(*<[String,String]>) add;
  shared formal MultiMap(*<[MultiMap]>) addAll;
  shared formal MultiMap(*<[String,String]>) set;
  shared formal MultiMap(*<[MultiMap]>) setAll;
  shared formal MultiMap(*<[String]>) remove;
  shared formal MultiMap(*<[]>) clear;
  shared formal Integer(*<[]>) size;
}
