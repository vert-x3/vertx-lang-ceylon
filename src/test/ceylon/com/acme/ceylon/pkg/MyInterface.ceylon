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

  SubInterface sub_impl([] args) {
    throw Exception("implement me");
  }

  shared  SubInterface(*<[]>) sub = flatten(sub_impl);

  TestInterface method_impl([] args) {
    throw Exception("implement me");
  }

  shared  TestInterface(*<[]>) method = flatten(method_impl);

}
