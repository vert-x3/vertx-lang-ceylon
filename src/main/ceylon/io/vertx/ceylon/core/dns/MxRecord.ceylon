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
  shared formal Integer(*<[]>) priority;
  shared formal String(*<[]>) name;
}
