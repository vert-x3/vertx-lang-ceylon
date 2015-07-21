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

shared abstract class RefedInterface1_Impl(RefedInterface1_ delegate) satisfies RefedInterface1 & Delegating<RefedInterface1_> {

  shared actual String(*<[]>) getString => flatten(getString_impl);
  shared actual RefedInterface1(*<[String]>) setString => flatten(setString_impl);

  String getString_impl([] args) {
Anything v = delegate.string;
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  RefedInterface1 setString_impl([String] args) {
    String arg_0 = args[0];
    Anything v = delegate.setString(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
