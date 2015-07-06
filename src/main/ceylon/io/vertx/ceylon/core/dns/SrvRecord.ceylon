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
  shared formal Integer(*<[]>) priority;
  shared formal Integer(*<[]>) weight;
  shared formal Integer(*<[]>) port;
  shared formal String(*<[]>) name;
  shared formal String(*<[]>) protocol;
  shared formal String(*<[]>) service;
  shared formal String(*<[]>) target;
}
