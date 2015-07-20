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
shared abstract class RefedInterface1(RefedInterface1_ delegate) satisfies Delegating {

  shared  String(*<[]>) getString => flatten(getString_impl);

  shared  RefedInterface1(*<[String]>) setString => flatten(setString_impl);

  String getString_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  RefedInterface1 setString_impl([String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
