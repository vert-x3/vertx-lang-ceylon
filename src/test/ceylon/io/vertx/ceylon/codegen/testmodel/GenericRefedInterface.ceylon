import io.vertx.codegen.testmodel {
  GenericRefedInterface_=GenericRefedInterface
}
import io.vertx.lang.ceylon {
  Delegating
}
/* Generated from io.vertx.codegen.testmodel.GenericRefedInterface<T> */
shared abstract class GenericRefedInterface<T>(GenericRefedInterface_<Object> delegate) satisfies Delegating {

  Anything setValue_impl([T] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[T]>) setValue = flatten(setValue_impl);

  T getValue_impl([] args) {
    throw Exception("implement me");
  }

  shared  T(*<[]>) getValue = flatten(getValue_impl);

}
