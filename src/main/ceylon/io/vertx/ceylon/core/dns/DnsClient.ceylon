import java.lang {
  String_=String
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.dns {
  DnsClient_=DnsClient,
  MxRecord_=MxRecord,
  SrvRecord_=SrvRecord
}
import io.vertx.ceylon.core.dns {
  MxRecord,
  SrvRecord
}
/* Generated from io.vertx.core.dns.DnsClient */
shared interface DnsClient  {

  shared formal DnsClient(*<[String,Anything(Throwable|String)]>) lookup;
  shared formal DnsClient(*<[String,Anything(Throwable|String)]>) lookup4;
  shared formal DnsClient(*<[String,Anything(Throwable|String)]>) lookup6;
  shared formal DnsClient(*<[String,Anything(Throwable|List<String>)]>) resolveA;
  shared formal DnsClient(*<[String,Anything(Throwable|List<String>)]>) resolveAAAA;
  shared formal DnsClient(*<[String,Anything(Throwable|List<String>)]>) resolveCNAME;
  shared formal DnsClient(*<[String,Anything(Throwable|List<MxRecord>)]>) resolveMX;
  shared formal DnsClient(*<[String,Anything(Throwable|List<String>)]>) resolveTXT;
  shared formal DnsClient(*<[String,Anything(Throwable|String)]>) resolvePTR;
  shared formal DnsClient(*<[String,Anything(Throwable|List<String>)]>) resolveNS;
  shared formal DnsClient(*<[String,Anything(Throwable|List<SrvRecord>)]>) resolveSRV;
  shared formal DnsClient(*<[String,Anything(Throwable|String)]>) reverseLookup;
}
/* Generated from io.vertx.core.dns.DnsClient */

shared abstract class DnsClient_Impl(DnsClient_ delegate) satisfies DnsClient & Delegating<DnsClient_> {

  shared actual DnsClient(*<[String,Anything(Throwable|String)]>) lookup => flatten(lookup_impl);
  shared actual DnsClient(*<[String,Anything(Throwable|String)]>) lookup4 => flatten(lookup4_impl);
  shared actual DnsClient(*<[String,Anything(Throwable|String)]>) lookup6 => flatten(lookup6_impl);
  shared actual DnsClient(*<[String,Anything(Throwable|List<String>)]>) resolveA => flatten(resolveA_impl);
  shared actual DnsClient(*<[String,Anything(Throwable|List<String>)]>) resolveAAAA => flatten(resolveAAAA_impl);
  shared actual DnsClient(*<[String,Anything(Throwable|List<String>)]>) resolveCNAME => flatten(resolveCNAME_impl);
  shared actual DnsClient(*<[String,Anything(Throwable|List<MxRecord>)]>) resolveMX => flatten(resolveMX_impl);
  shared actual DnsClient(*<[String,Anything(Throwable|List<String>)]>) resolveTXT => flatten(resolveTXT_impl);
  shared actual DnsClient(*<[String,Anything(Throwable|String)]>) resolvePTR => flatten(resolvePTR_impl);
  shared actual DnsClient(*<[String,Anything(Throwable|List<String>)]>) resolveNS => flatten(resolveNS_impl);
  shared actual DnsClient(*<[String,Anything(Throwable|List<SrvRecord>)]>) resolveSRV => flatten(resolveSRV_impl);
  shared actual DnsClient(*<[String,Anything(Throwable|String)]>) reverseLookup => flatten(reverseLookup_impl);

  DnsClient lookup_impl([String,Anything(Throwable|String)] args) {
    String arg_0 = args[0];
    Nothing arg_1 = nothing;
    Anything v = delegate.lookup(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DnsClient lookup4_impl([String,Anything(Throwable|String)] args) {
    String arg_0 = args[0];
    Nothing arg_1 = nothing;
    Anything v = delegate.lookup4(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DnsClient lookup6_impl([String,Anything(Throwable|String)] args) {
    String arg_0 = args[0];
    Nothing arg_1 = nothing;
    Anything v = delegate.lookup6(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DnsClient resolveA_impl([String,Anything(Throwable|List<String>)] args) {
    String arg_0 = args[0];
    Nothing arg_1 = nothing;
    Anything v = delegate.resolveA(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DnsClient resolveAAAA_impl([String,Anything(Throwable|List<String>)] args) {
    String arg_0 = args[0];
    Nothing arg_1 = nothing;
    Anything v = delegate.resolveAAAA(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DnsClient resolveCNAME_impl([String,Anything(Throwable|List<String>)] args) {
    String arg_0 = args[0];
    Nothing arg_1 = nothing;
    Anything v = delegate.resolveCNAME(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DnsClient resolveMX_impl([String,Anything(Throwable|List<MxRecord>)] args) {
    String arg_0 = args[0];
    Nothing arg_1 = nothing;
    Anything v = delegate.resolveMX(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DnsClient resolveTXT_impl([String,Anything(Throwable|List<String>)] args) {
    String arg_0 = args[0];
    Nothing arg_1 = nothing;
    Anything v = delegate.resolveTXT(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DnsClient resolvePTR_impl([String,Anything(Throwable|String)] args) {
    String arg_0 = args[0];
    Nothing arg_1 = nothing;
    Anything v = delegate.resolvePTR(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DnsClient resolveNS_impl([String,Anything(Throwable|List<String>)] args) {
    String arg_0 = args[0];
    Nothing arg_1 = nothing;
    Anything v = delegate.resolveNS(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DnsClient resolveSRV_impl([String,Anything(Throwable|List<SrvRecord>)] args) {
    String arg_0 = args[0];
    Nothing arg_1 = nothing;
    Anything v = delegate.resolveSRV(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  DnsClient reverseLookup_impl([String,Anything(Throwable|String)] args) {
    String arg_0 = args[0];
    Nothing arg_1 = nothing;
    Anything v = delegate.reverseLookup(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
