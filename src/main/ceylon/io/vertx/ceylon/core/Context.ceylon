import java.lang {
  String_=String
}
import io.vertx.ceylon.core {
  Vertx
}
import io.vertx.core {
  Context_=Context
}
import io.vertx.lang.ceylon {
  Delegating
}
import ceylon.json {
  JsonObject=Object
}
/* Generated from io.vertx.core.Context */
shared abstract class Context(Context_ delegate) satisfies Delegating {
  shared formal Anything(*<[Anything()]>) runOnContext;
  shared formal String(*<[]>) deploymentID;
  shared formal JsonObject(*<[]>) config;
  shared formal List<String>(*<[]>) processArgs;
  shared formal Boolean(*<[]>) isEventLoopContext;
  shared formal Boolean(*<[]>) isWorkerContext;
  shared formal Boolean(*<[]>) isMultiThreadedWorkerContext;
  shared formal Object(*<[String]>) get;
  shared formal Anything(*<[String,Object]>) put;
  shared formal Boolean(*<[String]>) remove;
  shared formal Vertx(*<[]>) owner;
  shared formal Integer(*<[]>) getInstanceCount;
}
