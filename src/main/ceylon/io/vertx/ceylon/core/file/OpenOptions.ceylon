import java.lang {
  String_=String
}
import io.vertx.core {
  Handler_=Handler,
  AsyncResult_=AsyncResult
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.file {
  OpenOptions_=OpenOptions
}
/* Generated from io.vertx.core.file.OpenOptions */
shared class OpenOptions(
  shared Boolean? create = null,
  shared Boolean? createNew = null,
  shared Boolean? deleteOnClose = null,
  shared Boolean? dsync = null,
  shared String? perms = null,
  shared Boolean? read = null,
  shared Boolean? sparse = null,
  shared Boolean? sync = null,
  shared Boolean? truncateExisting = null,
  shared Boolean? write = null) {
}
