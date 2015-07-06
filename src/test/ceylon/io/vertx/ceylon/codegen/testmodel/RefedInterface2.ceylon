import java.lang {
  String_=String
}
import io.vertx.codegen.testmodel {
  RefedInterface2_=RefedInterface2
}
import io.vertx.lang.ceylon {
  Delegating
}
/* Generated from io.vertx.codegen.testmodel.RefedInterface2 */
shared interface RefedInterface2 satisfies Delegating {
  shared formal String(*<[]>) getString;
  shared formal RefedInterface2(*<[String]>) setString;
}
