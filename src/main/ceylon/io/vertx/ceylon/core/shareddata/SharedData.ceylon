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

  shared  Anything(*<[String,Anything(Throwable|AsyncMap<Object,Object>)]>) getClusterWideMap => flatten(getClusterWideMap_impl);

  shared  Anything(*<[String,Anything(Throwable|Lock)]>) getLock => flatten(getLock_impl);

  shared  Anything(*<[String,Integer,Anything(Throwable|Lock)]>) getLockWithTimeout => flatten(getLockWithTimeout_impl);

  shared  Anything(*<[String,Anything(Throwable|Counter)]>) getCounter => flatten(getCounter_impl);

  shared  LocalMap<Object,Object>(*<[String]>) getLocalMap => flatten(getLocalMap_impl);

  Anything getClusterWideMap_impl([String,Anything(Throwable|AsyncMap<Object,Object>)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything getLock_impl([String,Anything(Throwable|Lock)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything getLockWithTimeout_impl([String,Integer,Anything(Throwable|Lock)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything getCounter_impl([String,Anything(Throwable|Counter)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  LocalMap<Object,Object> getLocalMap_impl([String] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
