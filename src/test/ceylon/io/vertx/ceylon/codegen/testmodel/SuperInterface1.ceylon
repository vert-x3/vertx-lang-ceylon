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
shared interface SuperInterface1  {

  shared formal Anything(*<[Byte,Integer,Integer,Integer,Float,Float,Boolean,Character,String]>) superMethodWithBasicParams;
}
/* Generated from io.vertx.codegen.testmodel.SuperInterface1 */

shared abstract class SuperInterface1_Impl(SuperInterface1 delegate) satisfies SuperInterface1 & Delegating<SuperInterface1> {

  shared actual Anything(*<[Byte,Integer,Integer,Integer,Float,Float,Boolean,Character,String]>) superMethodWithBasicParams => flatten(superMethodWithBasicParams_impl);

  Anything superMethodWithBasicParams_impl([Byte,Integer,Integer,Integer,Float,Float,Boolean,Character,String] args) {
    Anything v = delegate.superMethodWithBasicParams(args[0],args[1],args[2],args[3],args[4],args[5],args[6],args[7],args[8]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
