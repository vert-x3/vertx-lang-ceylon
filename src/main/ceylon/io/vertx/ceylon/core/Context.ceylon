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

  shared  Anything(*<[Anything()]>) runOnContext => flatten(runOnContext_impl);

  shared  String(*<[]>) deploymentID => flatten(deploymentID_impl);

  shared  JsonObject(*<[]>) config => flatten(config_impl);

  shared  List<String>(*<[]>) processArgs => flatten(processArgs_impl);

  shared  Boolean(*<[]>) isEventLoopContext => flatten(isEventLoopContext_impl);

  shared  Boolean(*<[]>) isWorkerContext => flatten(isWorkerContext_impl);

  shared  Boolean(*<[]>) isMultiThreadedWorkerContext => flatten(isMultiThreadedWorkerContext_impl);

  shared  Object(*<[String]>) get => flatten(get_impl);

  shared  Anything(*<[String,Object]>) put => flatten(put_impl);

  shared  Boolean(*<[String]>) remove => flatten(remove_impl);

  shared  Vertx(*<[]>) owner => flatten(owner_impl);

  shared  Integer(*<[]>) getInstanceCount => flatten(getInstanceCount_impl);

  Anything runOnContext_impl([Anything()] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String deploymentID_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  JsonObject config_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  List<String> processArgs_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isEventLoopContext_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isWorkerContext_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean isMultiThreadedWorkerContext_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Object get_impl([String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything put_impl([String,Object] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Boolean remove_impl([String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Vertx owner_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer getInstanceCount_impl([] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
