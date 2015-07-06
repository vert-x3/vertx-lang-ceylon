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

  String getString_impl([] args) {
    throw Exception("implement me");
  }

  shared  String(*<[]>) getString = flatten(getString_impl);

  RefedInterface1 setString_impl([String] args) {
    throw Exception("implement me");
  }

  shared  RefedInterface1(*<[String]>) setString = flatten(setString_impl);

}
