import io.vertx.codegen.testmodel {
  GenericRefedInterface_=GenericRefedInterface
}
import io.vertx.lang.ceylon {
  Delegating
}
/* Generated from io.vertx.codegen.testmodel.GenericRefedInterface<T> */
shared abstract class GenericRefedInterface<T>(GenericRefedInterface_<Object> delegate) satisfies Delegating {

  shared  Anything(*<[T]>) setValue => flatten(setValue_impl);

  shared  T(*<[]>) getValue => flatten(getValue_impl);

  Anything setValue_impl([T] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  T getValue_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
