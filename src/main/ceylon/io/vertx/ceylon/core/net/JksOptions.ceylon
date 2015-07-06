import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.net {
  JksOptions_=JksOptions
}
/* Generated from io.vertx.core.net.JksOptions */
shared class JksOptions(
  shared String password,
  shared String path,
  shared Buffer \ivalue) satisfies
  KeyCertOptions &
  TrustOptions {
}
