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

  shared  Integer(*<[]>) priority => flatten(priority_impl);

  shared  Integer(*<[]>) weight => flatten(weight_impl);

  shared  Integer(*<[]>) port => flatten(port_impl);

  shared  String(*<[]>) name => flatten(name_impl);

  shared  String(*<[]>) protocol => flatten(protocol_impl);

  shared  String(*<[]>) service => flatten(service_impl);

  shared  String(*<[]>) target => flatten(target_impl);

  Integer priority_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer weight_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer port_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String name_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String protocol_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String service_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String target_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
