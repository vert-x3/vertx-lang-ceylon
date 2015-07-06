import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
/* Generated from io.vertx.core.net.PemKeyCertOptions */
shared class PemKeyCertOptions(
  shared String certPath,
  shared Buffer certValue,
  shared String keyPath,
  shared Buffer keyValue) satisfies
  KeyCertOptions {
}
