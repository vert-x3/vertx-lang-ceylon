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
shared abstract class MxRecord(MxRecord_ delegate) satisfies Delegating {

  shared  Integer(*<[]>) priority => flatten(priority_impl);

  shared  String(*<[]>) name => flatten(name_impl);

  Integer priority_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String name_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
