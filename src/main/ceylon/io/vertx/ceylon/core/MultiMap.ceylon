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
shared interface MultiMap  {

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
/* Generated from io.vertx.core.MultiMap */

shared abstract class MultiMap_Impl(MultiMap_ delegate) satisfies MultiMap & Delegating<MultiMap_> {

  shared actual String(*<[String]>) get => flatten(get_impl);
  shared actual List<String>(*<[String]>) getAll => flatten(getAll_impl);
  shared actual Boolean(*<[String]>) contains => flatten(contains_impl);
  shared actual Boolean(*<[]>) isEmpty => flatten(isEmpty_impl);
  shared actual Set<String>(*<[]>) names => flatten(names_impl);
  shared actual MultiMap(*<[String,String]>) add => flatten(add_impl);
  shared actual MultiMap(*<[MultiMap]>) addAll => flatten(addAll_impl);
  shared actual MultiMap(*<[String,String]>) set => flatten(set_impl);
  shared actual MultiMap(*<[MultiMap]>) setAll => flatten(setAll_impl);
  shared actual MultiMap(*<[String]>) remove => flatten(remove_impl);
  shared actual MultiMap(*<[]>) clear => flatten(clear_impl);
  shared actual Integer(*<[]>) size => flatten(size_impl);

  String get_impl([String] args) {
    String arg_0 = args[0];
    Anything v = delegate.get(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  List<String> getAll_impl([String] args) {
    String arg_0 = args[0];
    Anything v = delegate.getAll(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean contains_impl([String] args) {
    String arg_0 = args[0];
    Anything v = delegate.contains(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isEmpty_impl([] args) {
Anything v = delegate.empty;
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Set<String> names_impl([] args) {
    Anything v = delegate.names();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MultiMap add_impl([String,String] args) {
    String arg_0 = args[0];
    String arg_1 = args[1];
    Anything v = delegate.add(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MultiMap addAll_impl([MultiMap] args) {
    assert(is Delegating<MultiMap_> arg_0 = args[0]);
    Anything v = delegate.addAll(arg_0.delegate);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MultiMap set_impl([String,String] args) {
    String arg_0 = args[0];
    String arg_1 = args[1];
    Anything v = delegate.set(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MultiMap setAll_impl([MultiMap] args) {
    assert(is Delegating<MultiMap_> arg_0 = args[0]);
    Anything v = delegate.setAll(arg_0.delegate);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MultiMap remove_impl([String] args) {
    String arg_0 = args[0];
    Anything v = delegate.remove(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MultiMap clear_impl([] args) {
    Anything v = delegate.clear();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer size_impl([] args) {
    Anything v = delegate.size();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
