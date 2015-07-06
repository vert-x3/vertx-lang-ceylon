import io.vertx.core.shareddata {
  SharedData_=SharedData
}
import io.vertx.ceylon.core.shareddata {
  AsyncMap,
  Lock,
  LocalMap,
  Counter
}
import java.lang {
  String_=String
}
import io.vertx.lang.ceylon {
  Delegating
}
/* Generated from io.vertx.core.shareddata.SharedData */
shared abstract class SharedData(SharedData_ delegate) satisfies Delegating {

  Anything getClusterWideMap_impl([String,Anything(Throwable|AsyncMap<Object,Object>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[String,Anything(Throwable|AsyncMap<Object,Object>)]>) getClusterWideMap = flatten(getClusterWideMap_impl);

  Anything getLock_impl([String,Anything(Throwable|Lock)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[String,Anything(Throwable|Lock)]>) getLock = flatten(getLock_impl);

  Anything getLockWithTimeout_impl([String,Integer,Anything(Throwable|Lock)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[String,Integer,Anything(Throwable|Lock)]>) getLockWithTimeout = flatten(getLockWithTimeout_impl);

  Anything getCounter_impl([String,Anything(Throwable|Counter)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[String,Anything(Throwable|Counter)]>) getCounter = flatten(getCounter_impl);

  LocalMap<Object,Object> getLocalMap_impl([String] args) {
    throw Exception("implement me");
  }

  shared  LocalMap<Object,Object>(*<[String]>) getLocalMap = flatten(getLocalMap_impl);

}
