import java.lang {
  String_=String
}
import io.vertx.core {
  MultiMap_=MultiMap
}
import io.vertx.lang.ceylon {
  Delegating
}
/* Generated from io.vertx.core.MultiMap */
shared abstract class MultiMap(MultiMap_ delegate) satisfies Delegating {

  String get_impl([String] args) {
    throw Exception("implement me");
  }

  shared  String(*<[String]>) get = flatten(get_impl);

  List<String> getAll_impl([String] args) {
    throw Exception("implement me");
  }

  shared  List<String>(*<[String]>) getAll = flatten(getAll_impl);

  Boolean contains_impl([String] args) {
    throw Exception("implement me");
  }

  shared  Boolean(*<[String]>) contains = flatten(contains_impl);

  Boolean isEmpty_impl([] args) {
    throw Exception("implement me");
  }

  shared  Boolean(*<[]>) isEmpty = flatten(isEmpty_impl);

  Set<String> names_impl([] args) {
    throw Exception("implement me");
  }

  shared  Set<String>(*<[]>) names = flatten(names_impl);

  MultiMap add_impl([String,String] args) {
    throw Exception("implement me");
  }

  shared  MultiMap(*<[String,String]>) add = flatten(add_impl);

  MultiMap addAll_impl([MultiMap] args) {
    throw Exception("implement me");
  }

  shared  MultiMap(*<[MultiMap]>) addAll = flatten(addAll_impl);

  MultiMap set_impl([String,String] args) {
    throw Exception("implement me");
  }

  shared  MultiMap(*<[String,String]>) set = flatten(set_impl);

  MultiMap setAll_impl([MultiMap] args) {
    throw Exception("implement me");
  }

  shared  MultiMap(*<[MultiMap]>) setAll = flatten(setAll_impl);

  MultiMap remove_impl([String] args) {
    throw Exception("implement me");
  }

  shared  MultiMap(*<[String]>) remove = flatten(remove_impl);

  MultiMap clear_impl([] args) {
    throw Exception("implement me");
  }

  shared  MultiMap(*<[]>) clear = flatten(clear_impl);

  Integer size_impl([] args) {
    throw Exception("implement me");
  }

  shared  Integer(*<[]>) size = flatten(size_impl);

}
