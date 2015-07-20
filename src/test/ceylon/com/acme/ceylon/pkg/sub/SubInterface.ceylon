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
shared abstract class SubInterface(SubInterface_ delegate) satisfies Delegating {

  shared  String(*<[String]>) reverse => flatten(reverse_impl);

  String reverse_impl([String] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
