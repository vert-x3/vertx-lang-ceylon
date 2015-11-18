import io.vertx.lang.ceylon { Converter }
import io.vertx.ext.web.handler.sockjs { BridgeEventType_=BridgeEventType }

" Bridge Event Types.\n"
shared abstract class BridgeEventType(shared String name) of \iSOCKET_CREATED | \iSOCKET_CLOSED | \iSEND | \iPUBLISH | \iRECEIVE | \iREGISTER | \iUNREGISTER {
}

shared object \iSOCKET_CREATED extends BridgeEventType("SOCKET_CREATED") {}
shared object \iSOCKET_CLOSED extends BridgeEventType("SOCKET_CLOSED") {}
shared object \iSEND extends BridgeEventType("SEND") {}
shared object \iPUBLISH extends BridgeEventType("PUBLISH") {}
shared object \iRECEIVE extends BridgeEventType("RECEIVE") {}
shared object \iREGISTER extends BridgeEventType("REGISTER") {}
shared object \iUNREGISTER extends BridgeEventType("UNREGISTER") {}

shared object bridgeEventType {

  shared String toString(BridgeEventType val) {
      switch (val)
      case(\iSOCKET_CREATED) { return "SOCKET_CREATED"; }
      case(\iSOCKET_CLOSED) { return "SOCKET_CLOSED"; }
      case(\iSEND) { return "SEND"; }
      case(\iPUBLISH) { return "PUBLISH"; }
      case(\iRECEIVE) { return "RECEIVE"; }
      case(\iREGISTER) { return "REGISTER"; }
      case(\iUNREGISTER) { return "UNREGISTER"; }
  }

  shared BridgeEventType fromString(String val) {
      switch (val)
      case("SOCKET_CREATED") { return \iSOCKET_CREATED; }
      case("SOCKET_CLOSED") { return \iSOCKET_CLOSED; }
      case("SEND") { return \iSEND; }
      case("PUBLISH") { return \iPUBLISH; }
      case("RECEIVE") { return \iRECEIVE; }
      case("REGISTER") { return \iREGISTER; }
      case("UNREGISTER") { return \iUNREGISTER; }
      else {
        throw Exception("Invalid BridgeEventType value ``val``");
      }
  }

  shared object toJava extends Converter<BridgeEventType, BridgeEventType_>() {
    shared actual BridgeEventType_ convert(BridgeEventType src) {
      switch (src)
      case(\iSOCKET_CREATED) { return BridgeEventType_.\iSOCKET_CREATED; }
      case(\iSOCKET_CLOSED) { return BridgeEventType_.\iSOCKET_CLOSED; }
      case(\iSEND) { return BridgeEventType_.\iSEND; }
      case(\iPUBLISH) { return BridgeEventType_.\iPUBLISH; }
      case(\iRECEIVE) { return BridgeEventType_.\iRECEIVE; }
      case(\iREGISTER) { return BridgeEventType_.\iREGISTER; }
      case(\iUNREGISTER) { return BridgeEventType_.\iUNREGISTER; }
    }
  }

  shared object toCeylon extends Converter<BridgeEventType_, BridgeEventType>() {
    shared actual BridgeEventType convert(BridgeEventType_ src) {
      if (src == BridgeEventType_.\iSOCKET_CREATED) {
        return \iSOCKET_CREATED;
      }
      if (src == BridgeEventType_.\iSOCKET_CLOSED) {
        return \iSOCKET_CLOSED;
      }
      if (src == BridgeEventType_.\iSEND) {
        return \iSEND;
      }
      if (src == BridgeEventType_.\iPUBLISH) {
        return \iPUBLISH;
      }
      if (src == BridgeEventType_.\iRECEIVE) {
        return \iRECEIVE;
      }
      if (src == BridgeEventType_.\iREGISTER) {
        return \iREGISTER;
      }
      if (src == BridgeEventType_.\iUNREGISTER) {
        return \iUNREGISTER;
      }
      throw Exception("Invalid enum value");
    }
  }
}
