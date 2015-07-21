import java.lang {
  String_=String
}
import io.vertx.codegen.testmodel {
  SuperInterface1_=SuperInterface1
}
import io.vertx.core {
  Handler_=Handler,
  AsyncResult_=AsyncResult
}
import io.vertx.lang.ceylon {
  Delegating
}
/* Generated from io.vertx.codegen.testmodel.SuperInterface1 */
shared interface SuperInterface1  {

  shared formal Anything(*<[Byte,Integer,Integer,Integer,Float,Float,Boolean,Character,String]>) superMethodWithBasicParams;
}
/* Generated from io.vertx.codegen.testmodel.SuperInterface1 */

shared abstract class SuperInterface1_Impl(SuperInterface1_ delegate) satisfies SuperInterface1 & Delegating<SuperInterface1_> {

  shared actual Anything(*<[Byte,Integer,Integer,Integer,Float,Float,Boolean,Character,String]>) superMethodWithBasicParams => flatten(superMethodWithBasicParams_impl);

  Anything superMethodWithBasicParams_impl([Byte,Integer,Integer,Integer,Float,Float,Boolean,Character,String] args) {
    Nothing arg_0 = nothing;
    Integer arg_1 = args[1];
    Integer arg_2 = args[2];
    Integer arg_3 = args[3];
    Float arg_4 = args[4];
    Float arg_5 = args[5];
    Boolean arg_6 = args[6];
    Character arg_7 = args[7];
    String arg_8 = args[8];
    Anything v = delegate.superMethodWithBasicParams(arg_0,arg_1,arg_2,arg_3,arg_4,arg_5,arg_6,arg_7,arg_8);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
