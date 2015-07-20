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

  shared  String(*<[String]>) get => flatten(get_impl);

  shared  List<String>(*<[String]>) getAll => flatten(getAll_impl);

  shared  Boolean(*<[String]>) contains => flatten(contains_impl);

  shared  Boolean(*<[]>) isEmpty => flatten(isEmpty_impl);

  shared  Set<String>(*<[]>) names => flatten(names_impl);

  shared  MultiMap(*<[String,String]>) add => flatten(add_impl);

  shared  MultiMap(*<[MultiMap]>) addAll => flatten(addAll_impl);

  shared  MultiMap(*<[String,String]>) set => flatten(set_impl);

  shared  MultiMap(*<[MultiMap]>) setAll => flatten(setAll_impl);

  shared  MultiMap(*<[String]>) remove => flatten(remove_impl);

  shared  MultiMap(*<[]>) clear => flatten(clear_impl);

  shared  Integer(*<[]>) size => flatten(size_impl);

  String get_impl([String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  List<String> getAll_impl([String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean contains_impl([String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isEmpty_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Set<String> names_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MultiMap add_impl([String,String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MultiMap addAll_impl([MultiMap] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MultiMap set_impl([String,String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MultiMap setAll_impl([MultiMap] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MultiMap remove_impl([String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MultiMap clear_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer size_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
