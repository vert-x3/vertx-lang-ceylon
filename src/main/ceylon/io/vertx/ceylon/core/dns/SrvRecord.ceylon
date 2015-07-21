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
shared interface SrvRecord  {

  shared formal Integer(*<[]>) priority;
  shared formal Integer(*<[]>) weight;
  shared formal Integer(*<[]>) port;
  shared formal String(*<[]>) name;
  shared formal String(*<[]>) protocol;
  shared formal String(*<[]>) service;
  shared formal String(*<[]>) target;
}
/* Generated from io.vertx.core.dns.SrvRecord */

shared abstract class SrvRecord_Impl(SrvRecord_ delegate) satisfies SrvRecord & Delegating<SrvRecord_> {

  shared actual Integer(*<[]>) priority => flatten(priority_impl);
  shared actual Integer(*<[]>) weight => flatten(weight_impl);
  shared actual Integer(*<[]>) port => flatten(port_impl);
  shared actual String(*<[]>) name => flatten(name_impl);
  shared actual String(*<[]>) protocol => flatten(protocol_impl);
  shared actual String(*<[]>) service => flatten(service_impl);
  shared actual String(*<[]>) target => flatten(target_impl);

  Integer priority_impl([] args) {
    Anything v = delegate.priority();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer weight_impl([] args) {
    Anything v = delegate.weight();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer port_impl([] args) {
    Anything v = delegate.port();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String name_impl([] args) {
    Anything v = delegate.name();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String protocol_impl([] args) {
    Anything v = delegate.protocol();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String service_impl([] args) {
    Anything v = delegate.service();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String target_impl([] args) {
    Anything v = delegate.target();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
