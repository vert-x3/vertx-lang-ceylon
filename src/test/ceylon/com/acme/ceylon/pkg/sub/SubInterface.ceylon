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

  String reverse_impl([String] args) {
    throw Exception("implement me");
  }

  shared  String(*<[String]>) reverse = flatten(reverse_impl);

}
