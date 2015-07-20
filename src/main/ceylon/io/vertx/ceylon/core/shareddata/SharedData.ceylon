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
shared interface SharedData  {

  shared formal Anything(*<[String,Anything(Throwable|AsyncMap<Object,Object>)]>) getClusterWideMap;
  shared formal Anything(*<[String,Anything(Throwable|Lock)]>) getLock;
  shared formal Anything(*<[String,Integer,Anything(Throwable|Lock)]>) getLockWithTimeout;
  shared formal Anything(*<[String,Anything(Throwable|Counter)]>) getCounter;
  shared formal LocalMap<Object,Object>(*<[String]>) getLocalMap;
}
/* Generated from io.vertx.core.shareddata.SharedData */

shared abstract class SharedData_Impl(SharedData delegate) satisfies SharedData & Delegating<SharedData> {

  shared actual Anything(*<[String,Anything(Throwable|AsyncMap<Object,Object>)]>) getClusterWideMap => flatten(getClusterWideMap_impl);
  shared actual Anything(*<[String,Anything(Throwable|Lock)]>) getLock => flatten(getLock_impl);
  shared actual Anything(*<[String,Integer,Anything(Throwable|Lock)]>) getLockWithTimeout => flatten(getLockWithTimeout_impl);
  shared actual Anything(*<[String,Anything(Throwable|Counter)]>) getCounter => flatten(getCounter_impl);
  shared actual LocalMap<Object,Object>(*<[String]>) getLocalMap => flatten(getLocalMap_impl);

  Anything getClusterWideMap_impl([String,Anything(Throwable|AsyncMap<Object,Object>)] args) {
    Anything v = delegate.getClusterWideMap(args[0],nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything getLock_impl([String,Anything(Throwable|Lock)] args) {
    Anything v = delegate.getLock(args[0],nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything getLockWithTimeout_impl([String,Integer,Anything(Throwable|Lock)] args) {
    Anything v = delegate.getLockWithTimeout(args[0],args[1],nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything getCounter_impl([String,Anything(Throwable|Counter)] args) {
    Anything v = delegate.getCounter(args[0],nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  LocalMap<Object,Object> getLocalMap_impl([String] args) {
    Anything v = delegate.getLocalMap(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
