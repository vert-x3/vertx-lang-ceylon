import java.lang {
  Void_=Void,
  String_=String
}
import java.util {
  List_=List
}
import io.vertx.ceylon.core {
  Vertx
}
import io.vertx.core {
  Context_=Context,
  Handler_=Handler,
  AsyncResult_=AsyncResult,
  Vertx_=Vertx
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

shared abstract class Context_Impl(Context_ delegate) satisfies Context & Delegating<Context_> {

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
    Handler_<Void_> arg_0 = nothing;
    Anything v = delegate.runOnContext(arg_0);
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
    Anything v = delegate.eventLoopContext;
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isWorkerContext_impl([] args) {
    Anything v = delegate.workerContext;
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isMultiThreadedWorkerContext_impl([] args) {
    Anything v = delegate.multiThreadedWorkerContext;
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Object get_impl([String] args) {
    String arg_0 = args[0];
    Anything v = delegate.get(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything put_impl([String,Object] args) {
    String arg_0 = args[0];
    Object arg_1 = args[1];
    Anything v = delegate.put(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean remove_impl([String] args) {
    String arg_0 = args[0];
    Anything v = delegate.remove(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Vertx owner_impl([] args) {
    Anything v = delegate.owner();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer getInstanceCount_impl([] args) {
    Anything v = delegate.instanceCount;
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
