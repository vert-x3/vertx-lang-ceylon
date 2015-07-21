import io.vertx.core.shareddata {
  SharedData_=SharedData,
  AsyncMap_=AsyncMap,
  Lock_=Lock,
  LocalMap_=LocalMap,
  Counter_=Counter
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
import io.vertx.core {
  Handler_=Handler,
  AsyncResult_=AsyncResult
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

shared abstract class SharedData_Impl(SharedData_ delegate) satisfies SharedData & Delegating<SharedData_> {

  shared actual Anything(*<[String,Anything(Throwable|AsyncMap<Object,Object>)]>) getClusterWideMap => flatten(getClusterWideMap_impl);
  shared actual Anything(*<[String,Anything(Throwable|Lock)]>) getLock => flatten(getLock_impl);
  shared actual Anything(*<[String,Integer,Anything(Throwable|Lock)]>) getLockWithTimeout => flatten(getLockWithTimeout_impl);
  shared actual Anything(*<[String,Anything(Throwable|Counter)]>) getCounter => flatten(getCounter_impl);
  shared actual LocalMap<Object,Object>(*<[String]>) getLocalMap => flatten(getLocalMap_impl);

  Anything getClusterWideMap_impl([String,Anything(Throwable|AsyncMap<Object,Object>)] args) {
    String arg_0 = args[0];
    Handler_<AsyncResult_<AsyncMap_<Object,Object>>> arg_1 = nothing;
    Anything v = delegate.getClusterWideMap(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything getLock_impl([String,Anything(Throwable|Lock)] args) {
    String arg_0 = args[0];
    Handler_<AsyncResult_<Lock_>> arg_1 = nothing;
    Anything v = delegate.getLock(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything getLockWithTimeout_impl([String,Integer,Anything(Throwable|Lock)] args) {
    String arg_0 = args[0];
    Integer arg_1 = args[1];
    Handler_<AsyncResult_<Lock_>> arg_2 = nothing;
    Anything v = delegate.getLockWithTimeout(arg_0,arg_1,arg_2);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything getCounter_impl([String,Anything(Throwable|Counter)] args) {
    String arg_0 = args[0];
    Handler_<AsyncResult_<Counter_>> arg_1 = nothing;
    Anything v = delegate.getCounter(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  LocalMap<Object,Object> getLocalMap_impl([String] args) {
    String arg_0 = args[0];
    Anything v = delegate.getLocalMap(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
