import com.acme.pkg.sub {
  SubInterface_=SubInterface
}
import io.vertx.codegen.testmodel {
  TestInterface_=TestInterface
}
import io.vertx.core {
  Handler_=Handler,
  AsyncResult_=AsyncResult
}
import io.vertx.lang.ceylon {
  Delegating
}
import com.acme.pkg {
  MyInterface_=MyInterface
}
import com.acme.ceylon.pkg.sub {
  SubInterface
}
import io.vertx.ceylon.codegen.testmodel {
  TestInterface
}
/* Generated from com.acme.pkg.MyInterface */
shared interface MyInterface  {

  shared formal SubInterface(*<[]>) sub;
  shared formal TestInterface(*<[]>) method;
}
/* Generated from com.acme.pkg.MyInterface */

shared abstract class MyInterface_Impl(MyInterface_ delegate) satisfies MyInterface & Delegating<MyInterface_> {

  shared actual SubInterface(*<[]>) sub => flatten(sub_impl);
  shared actual TestInterface(*<[]>) method => flatten(method_impl);

  SubInterface sub_impl([] args) {
    Anything v = delegate.sub();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  TestInterface method_impl([] args) {
    Anything v = delegate.method();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
