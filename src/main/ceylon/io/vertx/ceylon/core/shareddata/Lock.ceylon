import io.vertx.core.shareddata {
  Lock_=Lock
}
import io.vertx.core {
  Handler_=Handler,
  AsyncResult_=AsyncResult
}
import io.vertx.lang.ceylon {
  Delegating
}
/* Generated from io.vertx.core.shareddata.Lock */
shared interface Lock  {

  shared formal Anything(*<[]>) release;
}
/* Generated from io.vertx.core.shareddata.Lock */

shared abstract class Lock_Impl(Lock_ delegate) satisfies Lock & Delegating<Lock_> {

  shared actual Anything(*<[]>) release => flatten(release_impl);

  Anything release_impl([] args) {
    Anything v = delegate.release();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
