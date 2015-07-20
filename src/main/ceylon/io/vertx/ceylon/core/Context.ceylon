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
shared interface Context  {

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
/* Generated from io.vertx.core.Context */

shared abstract class Context_Impl(Context delegate) satisfies Context & Delegating<Context> {

  shared actual Anything(*<[Anything()]>) runOnContext => flatten(runOnContext_impl);
  shared actual String(*<[]>) deploymentID => flatten(deploymentID_impl);
  shared actual JsonObject(*<[]>) config => flatten(config_impl);
  shared actual List<String>(*<[]>) processArgs => flatten(processArgs_impl);
  shared actual Boolean(*<[]>) isEventLoopContext => flatten(isEventLoopContext_impl);
  shared actual Boolean(*<[]>) isWorkerContext => flatten(isWorkerContext_impl);
  shared actual Boolean(*<[]>) isMultiThreadedWorkerContext => flatten(isMultiThreadedWorkerContext_impl);
  shared actual Object(*<[String]>) get => flatten(get_impl);
  shared actual Anything(*<[String,Object]>) put => flatten(put_impl);
  shared actual Boolean(*<[String]>) remove => flatten(remove_impl);
  shared actual Vertx(*<[]>) owner => flatten(owner_impl);
  shared actual Integer(*<[]>) getInstanceCount => flatten(getInstanceCount_impl);

  Anything runOnContext_impl([Anything()] args) {
    Anything v = delegate.runOnContext(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String deploymentID_impl([] args) {
    Anything v = delegate.deploymentID();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  JsonObject config_impl([] args) {
    Anything v = delegate.config();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  List<String> processArgs_impl([] args) {
    Anything v = delegate.processArgs();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isEventLoopContext_impl([] args) {
    Anything v = delegate.isEventLoopContext();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isWorkerContext_impl([] args) {
    Anything v = delegate.isWorkerContext();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isMultiThreadedWorkerContext_impl([] args) {
    Anything v = delegate.isMultiThreadedWorkerContext();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Object get_impl([String] args) {
    Anything v = delegate.get(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything put_impl([String,Object] args) {
    Anything v = delegate.put(args[0],nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean remove_impl([String] args) {
    Anything v = delegate.remove(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Vertx owner_impl([] args) {
    Anything v = delegate.owner();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer getInstanceCount_impl([] args) {
    Anything v = delegate.getInstanceCount();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
