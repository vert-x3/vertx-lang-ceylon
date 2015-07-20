import io.vertx.core.shareddata {
  Lock_=Lock
}
import io.vertx.lang.ceylon {
  Delegating
}
/* Generated from io.vertx.core.shareddata.Lock */
shared abstract class Lock(Lock_ delegate) satisfies Delegating {

  shared  Anything(*<[]>) release => flatten(release_impl);

  Anything release_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
