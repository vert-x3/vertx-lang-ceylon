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
  shared JsonObject config,
  shared String extraClasspath,
  shared Boolean ha,
  shared Integer instances,
  shared String isolatedClasses,
  shared String isolationGroup,
  shared Boolean multiThreaded,
  shared Boolean worker) {
}
