import io.vertx.ceylon.core.shareddata {
  AsyncMap,
  Lock,
  LocalMap,
  Counter
}
import java.lang {
  String_=String
}
/* Generated from io.vertx.core.shareddata.SharedData */
shared abstract class SharedData() {
  shared formal Anything(*<[]>) getClusterWideMap;
  shared formal Anything(*<[]>) getLock;
  shared formal Anything(*<[]>) getLockWithTimeout;
  shared formal Anything(*<[]>) getCounter;
  shared formal Anything(*<[]>) getLocalMap;
}
