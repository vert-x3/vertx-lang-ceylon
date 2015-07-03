import com.acme.ceylon.pkg.sub {
  SubInterface
}
import io.vertx.ceylon.codegen.testmodel {
  TestInterface
}
/* Generated from com.acme.pkg.MyInterface */
shared abstract class MyInterface() {
  shared formal SubInterface(*<[]>) sub;
  shared formal TestInterface(*<[]>) method;
}
