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
  shared formal String(*<[]>) getString;
  shared formal RefedInterface1(*<[String]>) setString;
}
