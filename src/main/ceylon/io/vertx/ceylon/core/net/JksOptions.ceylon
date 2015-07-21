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
  JksOptions_=JksOptions
}
import io.vertx.core.buffer {
  Buffer_=Buffer
}
/* Generated from io.vertx.core.net.JksOptions */
shared class JksOptions(
  shared String password,
  shared String path,
  shared Buffer \ivalue) satisfies
  KeyCertOptions &
  TrustOptions {
}
