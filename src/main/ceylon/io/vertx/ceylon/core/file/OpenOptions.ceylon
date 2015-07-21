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
  shared Boolean create,
  shared Boolean createNew,
  shared Boolean dSync,
  shared Boolean deleteOnClose,
  shared String perms,
  shared Boolean read,
  shared Boolean sparse,
  shared Boolean sync,
  shared Boolean truncateExisting,
  shared Boolean write) {
}
