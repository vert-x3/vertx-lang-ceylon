import io.vertx.codegen.testmodel {
  GenericRefedInterface_=GenericRefedInterface
}
import io.vertx.lang.ceylon {
  Delegating
}
/* Generated from io.vertx.codegen.testmodel.GenericRefedInterface<T> */
shared interface GenericRefedInterface<T>  {

  shared formal Anything(*<[T]>) setValue;
  shared formal T(*<[]>) getValue;
}
/* Generated from io.vertx.codegen.testmodel.GenericRefedInterface<T> */

shared abstract class GenericRefedInterface_Impl<T>(GenericRefedInterface_<Object> delegate) satisfies GenericRefedInterface<T> & Delegating<GenericRefedInterface_<Object>> {

  shared actual Anything(*<[T]>) setValue => flatten(setValue_impl);
  shared actual T(*<[]>) getValue => flatten(getValue_impl);

  Anything setValue_impl([T] args) {
    Nothing arg_0 = nothing;
    Anything v = delegate.setValue(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  T getValue_impl([] args) {
Anything v = delegate.value;
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
