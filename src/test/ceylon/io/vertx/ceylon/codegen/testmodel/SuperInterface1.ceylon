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

  shared  Anything(*<[Byte,Integer,Integer,Integer,Float,Float,Boolean,Character,String]>) superMethodWithBasicParams => flatten(superMethodWithBasicParams_impl);

  Anything superMethodWithBasicParams_impl([Byte,Integer,Integer,Integer,Float,Float,Boolean,Character,String] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
