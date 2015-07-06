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

  Anything runOnContext_impl([Anything()] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything()]>) runOnContext = flatten(runOnContext_impl);

  String deploymentID_impl([] args) {
    throw Exception("implement me");
  }

  shared  String(*<[]>) deploymentID = flatten(deploymentID_impl);

  JsonObject config_impl([] args) {
    throw Exception("implement me");
  }

  shared  JsonObject(*<[]>) config = flatten(config_impl);

  List<String> processArgs_impl([] args) {
    throw Exception("implement me");
  }

  shared  List<String>(*<[]>) processArgs = flatten(processArgs_impl);

  Boolean isEventLoopContext_impl([] args) {
    throw Exception("implement me");
  }

  shared  Boolean(*<[]>) isEventLoopContext = flatten(isEventLoopContext_impl);

  Boolean isWorkerContext_impl([] args) {
    throw Exception("implement me");
  }

  shared  Boolean(*<[]>) isWorkerContext = flatten(isWorkerContext_impl);

  Boolean isMultiThreadedWorkerContext_impl([] args) {
    throw Exception("implement me");
  }

  shared  Boolean(*<[]>) isMultiThreadedWorkerContext = flatten(isMultiThreadedWorkerContext_impl);

  Object get_impl([String] args) {
    throw Exception("implement me");
  }

  shared  Object(*<[String]>) get = flatten(get_impl);

  Anything put_impl([String,Object] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[String,Object]>) put = flatten(put_impl);

  Boolean remove_impl([String] args) {
    throw Exception("implement me");
  }

  shared  Boolean(*<[String]>) remove = flatten(remove_impl);

  Vertx owner_impl([] args) {
    throw Exception("implement me");
  }

  shared  Vertx(*<[]>) owner = flatten(owner_impl);

  Integer getInstanceCount_impl([] args) {
    throw Exception("implement me");
  }

  shared  Integer(*<[]>) getInstanceCount = flatten(getInstanceCount_impl);

}
