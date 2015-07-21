import java.lang {
  String_=String
}
import com.acme.pkg.sub {
  SubInterface_=SubInterface
}
import io.vertx.lang.ceylon {
  Delegating
}
/* Generated from com.acme.pkg.sub.SubInterface */
shared interface SubInterface  {

  shared formal String(*<[String]>) reverse;
}
/* Generated from com.acme.pkg.sub.SubInterface */

shared abstract class SubInterface_Impl(SubInterface_ delegate) satisfies SubInterface & Delegating<SubInterface_> {

  shared actual String(*<[String]>) reverse => flatten(reverse_impl);

  String reverse_impl([String] args) {
    String arg_0 = args[0];
    Anything v = delegate.reverse(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
