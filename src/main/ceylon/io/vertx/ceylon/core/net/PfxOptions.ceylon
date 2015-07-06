import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
/* Generated from io.vertx.core.net.PfxOptions */
shared class PfxOptions(
  shared String password,
  shared String path,
  shared Buffer \ivalue) satisfies
  KeyCertOptions &
  TrustOptions {
}
