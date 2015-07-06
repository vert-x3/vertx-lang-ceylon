import java.lang {
  String_=String
}
import io.vertx.codegen.testmodel {
  SuperInterface1_=SuperInterface1
}
import io.vertx.lang.ceylon {
  Delegating
}
/* Generated from io.vertx.codegen.testmodel.SuperInterface1 */
shared abstract class SuperInterface1(SuperInterface1_ delegate) satisfies Delegating {
  shared formal Anything(*<[Byte,Integer,Integer,Integer,Float,Float,Boolean,Character,String]>) superMethodWithBasicParams;
}
