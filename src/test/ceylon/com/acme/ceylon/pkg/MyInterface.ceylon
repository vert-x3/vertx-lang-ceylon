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
shared abstract class MyInterface(MyInterface_ delegate) satisfies Delegating {

  shared  SubInterface(*<[]>) sub => flatten(sub_impl);

  shared  TestInterface(*<[]>) method => flatten(method_impl);

  SubInterface sub_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  TestInterface method_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
