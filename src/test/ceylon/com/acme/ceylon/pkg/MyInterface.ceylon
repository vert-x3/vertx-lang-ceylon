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
  shared formal SubInterface(*<[]>) sub;
  shared formal TestInterface(*<[]>) method;
}
