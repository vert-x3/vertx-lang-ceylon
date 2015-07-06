import io.vertx.codegen.testmodel {
  GenericRefedInterface_=GenericRefedInterface
}
import io.vertx.lang.ceylon {
  Delegating
}
/* Generated from io.vertx.codegen.testmodel.GenericRefedInterface<T> */
shared abstract class GenericRefedInterface<T>(GenericRefedInterface_<Object> delegate) satisfies Delegating {
  shared formal Anything(*<[T]>) setValue;
  shared formal T(*<[]>) getValue;
}
