import io.vertx.core.shareddata {
  Lock_=Lock
}
import io.vertx.lang.ceylon {
  Delegating
}
/* Generated from io.vertx.core.shareddata.Lock */
shared abstract class Lock(Lock_ delegate) satisfies Delegating {
  shared formal Anything(*<[]>) release;
}
