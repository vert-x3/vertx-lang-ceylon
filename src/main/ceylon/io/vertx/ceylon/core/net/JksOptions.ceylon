import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
/* Generated from io.vertx.core.net.JksOptions */
shared class JksOptions(
  shared String password,
  shared String path,
  shared Buffer \ivalue) satisfies
  KeyCertOptions &
  TrustOptions {
}
