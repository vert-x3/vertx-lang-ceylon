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

  Integer priority_impl([] args) {
    throw Exception("implement me");
  }

  shared  Integer(*<[]>) priority = flatten(priority_impl);

  String name_impl([] args) {
    throw Exception("implement me");
  }

  shared  String(*<[]>) name = flatten(name_impl);

}
