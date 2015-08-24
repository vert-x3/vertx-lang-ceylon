import java.lang {
  String_=String
}
import io.vertx.core {
  DeploymentOptions_=DeploymentOptions,
  Handler_=Handler,
  AsyncResult_=AsyncResult
}
import io.vertx.lang.ceylon {
  Delegating
}
import ceylon.json {
  JsonObject=Object
}
import io.vertx.core.json {
  JsonObject_=JsonObject
}
/* Generated from io.vertx.core.DeploymentOptions */
shared class DeploymentOptions(
  shared JsonObject? config = null,
  shared String? extraClasspath = null,
  shared Boolean? ha = null,
  shared Integer? instances = null,
  shared String? isolatedClasses = null,
  shared String? isolationGroup = null,
  shared Boolean? multiThreaded = null,
  shared Boolean? worker = null) {
}
