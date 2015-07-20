import java.lang {
  String_=String
}
import io.vertx.codegen.testmodel {
  RefedInterface1_=RefedInterface1
}
import io.vertx.lang.ceylon {
  Delegating
}
/* Generated from io.vertx.codegen.testmodel.RefedInterface1 */
shared interface RefedInterface1  {

  shared formal String(*<[]>) getString;
  shared formal RefedInterface1(*<[String]>) setString;
}
/* Generated from io.vertx.codegen.testmodel.RefedInterface1 */

shared abstract class RefedInterface1_Impl(RefedInterface1 delegate) satisfies RefedInterface1 & Delegating<RefedInterface1> {

  shared actual String(*<[]>) getString => flatten(getString_impl);
  shared actual RefedInterface1(*<[String]>) setString => flatten(setString_impl);

  String getString_impl([] args) {
    Anything v = delegate.getString();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  RefedInterface1 setString_impl([String] args) {
    Anything v = delegate.setString(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
