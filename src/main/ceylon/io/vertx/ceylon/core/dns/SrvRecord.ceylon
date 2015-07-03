import java.lang {
  String_=String
}
/* Generated from io.vertx.core.dns.SrvRecord */
shared abstract class SrvRecord() {
  shared formal Integer(*<[]>) priority;
  shared formal Integer(*<[]>) weight;
  shared formal Integer(*<[]>) port;
  shared formal String(*<[]>) name;
  shared formal String(*<[]>) protocol;
  shared formal String(*<[]>) service;
  shared formal String(*<[]>) target;
}
