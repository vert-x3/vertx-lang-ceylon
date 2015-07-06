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
  shared formal String(*<[String]>) reverse;
}
