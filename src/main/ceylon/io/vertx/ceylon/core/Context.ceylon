import java.lang {
  String_=String
}
import io.vertx.ceylon.core {
  Vertx
}
import ceylon.json {
  JsonObject=Object
}
/* Generated from io.vertx.core.Context */
shared abstract class Context() {
  shared formal Anything(*<[]>) runOnContext;
  shared formal Anything(*<[]>) deploymentID;
  shared formal Anything(*<[]>) config;
  shared formal Anything(*<[]>) processArgs;
  shared formal Anything(*<[]>) isEventLoopContext;
  shared formal Anything(*<[]>) isWorkerContext;
  shared formal Anything(*<[]>) isMultiThreadedWorkerContext;
  shared formal Anything(*<[]>) get;
  shared formal Anything(*<[]>) put;
  shared formal Anything(*<[]>) remove;
  shared formal Anything(*<[]>) owner;
  shared formal Anything(*<[]>) getInstanceCount;
}
