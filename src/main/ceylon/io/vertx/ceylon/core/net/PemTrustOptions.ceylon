import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.core {
  Handler_=Handler,
  AsyncResult_=AsyncResult
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.net {
  PemTrustOptions_=PemTrustOptions
}
import io.vertx.core.buffer {
  Buffer_=Buffer
}
/* Generated from io.vertx.core.net.PemTrustOptions */
shared class PemTrustOptions(
  shared String certPaths,
  shared Buffer certValues) satisfies
  TrustOptions {
}
