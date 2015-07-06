import java.lang {
  String_=String
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.dns {
  SrvRecord_=SrvRecord
}
/* Generated from io.vertx.core.dns.SrvRecord */
shared abstract class SrvRecord(SrvRecord_ delegate) satisfies Delegating {

  Integer priority_impl([] args) {
    throw Exception("implement me");
  }

  shared  Integer(*<[]>) priority = flatten(priority_impl);

  Integer weight_impl([] args) {
    throw Exception("implement me");
  }

  shared  Integer(*<[]>) weight = flatten(weight_impl);

  Integer port_impl([] args) {
    throw Exception("implement me");
  }

  shared  Integer(*<[]>) port = flatten(port_impl);

  String name_impl([] args) {
    throw Exception("implement me");
  }

  shared  String(*<[]>) name = flatten(name_impl);

  String protocol_impl([] args) {
    throw Exception("implement me");
  }

  shared  String(*<[]>) protocol = flatten(protocol_impl);

  String service_impl([] args) {
    throw Exception("implement me");
  }

  shared  String(*<[]>) service = flatten(service_impl);

  String target_impl([] args) {
    throw Exception("implement me");
  }

  shared  String(*<[]>) target = flatten(target_impl);

}
