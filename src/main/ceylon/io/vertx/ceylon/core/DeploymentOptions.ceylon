import java.lang {
  String_=String
}
import ceylon.json {
  JsonObject=Object
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
