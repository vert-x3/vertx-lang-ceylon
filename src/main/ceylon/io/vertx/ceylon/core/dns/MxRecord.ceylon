import java.lang {
  String_=String
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.dns {
  MxRecord_=MxRecord
}
/* Generated from io.vertx.core.dns.MxRecord */
shared interface MxRecord  {

  shared formal Integer(*<[]>) priority;
  shared formal String(*<[]>) name;
}
/* Generated from io.vertx.core.dns.MxRecord */

shared abstract class MxRecord_Impl(MxRecord_ delegate) satisfies MxRecord & Delegating<MxRecord_> {

  shared actual Integer(*<[]>) priority => flatten(priority_impl);
  shared actual String(*<[]>) name => flatten(name_impl);

  Integer priority_impl([] args) {
    Anything v = delegate.priority();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String name_impl([] args) {
    Anything v = delegate.name();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
