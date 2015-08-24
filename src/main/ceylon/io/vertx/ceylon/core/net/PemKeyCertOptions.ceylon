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
  PemKeyCertOptions_=PemKeyCertOptions
}
import io.vertx.core.buffer {
  Buffer_=Buffer
}
/* Generated from io.vertx.core.net.PemKeyCertOptions */
shared class PemKeyCertOptions(
  shared String? certPath = null,
  shared Buffer? certValue = null,
  shared String? keyPath = null,
  shared Buffer? keyValue = null) satisfies
  KeyCertOptions {
}
