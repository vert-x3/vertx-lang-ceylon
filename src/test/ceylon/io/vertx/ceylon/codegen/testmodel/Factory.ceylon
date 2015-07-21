import io.vertx.codegen.testmodel {
  Factory_=Factory,
  RefedInterface1_=RefedInterface1,
  ConcreteHandlerUserType_=ConcreteHandlerUserType,
  AbstractHandlerUserType_=AbstractHandlerUserType,
  ConcreteHandlerUserTypeExtension_=ConcreteHandlerUserTypeExtension
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.ceylon.codegen.testmodel {
  RefedInterface1,
  ConcreteHandlerUserType,
  AbstractHandlerUserType,
  ConcreteHandlerUserTypeExtension
}
/* Generated from io.vertx.codegen.testmodel.Factory */
shared interface Factory  {

}
/* Generated from io.vertx.codegen.testmodel.Factory */

shared abstract class Factory_Impl(Factory_ delegate) satisfies Factory & Delegating<Factory_> {


}
