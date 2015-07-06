import java.lang {
  String_=String
}
import io.vertx.codegen.testmodel {
  SuperInterface2_=SuperInterface2
}
import io.vertx.lang.ceylon {
  Delegating
}
/* Generated from io.vertx.codegen.testmodel.SuperInterface2 */
shared interface SuperInterface2 satisfies Delegating {
  shared formal Anything(*<[Byte,Integer,Integer,Integer,Float,Float,Boolean,Character,String]>) otherSuperMethodWithBasicParams;
}
