import io.vertx.lang.ceylon { Converter }
import io.vertx.ext.web.handler.sockjs { BridgeEventType_=BridgeEventType }

" Bridge Event Types.\n"
shared abstract class BridgeEventType(shared String name) of socket_created | socket_closed | socket_idle | send | publish | receive | register | unregister {
}

" This event will occur when a new SockJS socket is created.\n"
shared object socket_created extends BridgeEventType("SOCKET_CREATED") {}
" This event will occur when a SockJS socket is closed.\n"
shared object socket_closed extends BridgeEventType("SOCKET_CLOSED") {}
" This event will occur when SockJS socket is on idle for longer period of time than configured. \n"
shared object socket_idle extends BridgeEventType("SOCKET_IDLE") {}
" This event will occur when a message is attempted to be sent from the client to the server.\n"
shared object send extends BridgeEventType("SEND") {}
" This event will occur when a message is attempted to be published from the client to the server.\n"
shared object publish extends BridgeEventType("PUBLISH") {}
" This event will occur when a message is attempted to be delivered from the server to the client.\n"
shared object receive extends BridgeEventType("RECEIVE") {}
" This event will occur when a client attempts to register a handler.\n"
shared object register extends BridgeEventType("REGISTER") {}
" This event will occur when a client attempts to unregister a handler.\n"
shared object unregister extends BridgeEventType("UNREGISTER") {}

shared object bridgeEventType {

  shared String toString(BridgeEventType val) {
      switch (val)
      case(socket_created) { return "SOCKET_CREATED"; }
      case(socket_closed) { return "SOCKET_CLOSED"; }
      case(socket_idle) { return "SOCKET_IDLE"; }
      case(send) { return "SEND"; }
      case(publish) { return "PUBLISH"; }
      case(receive) { return "RECEIVE"; }
      case(register) { return "REGISTER"; }
      case(unregister) { return "UNREGISTER"; }
  }

  shared BridgeEventType fromString(String val) {
      switch (val)
      case("SOCKET_CREATED") { return socket_created; }
      case("SOCKET_CLOSED") { return socket_closed; }
      case("SOCKET_IDLE") { return socket_idle; }
      case("SEND") { return send; }
      case("PUBLISH") { return publish; }
      case("RECEIVE") { return receive; }
      case("REGISTER") { return register; }
      case("UNREGISTER") { return unregister; }
      else {
        throw Exception("Invalid BridgeEventType value ``val``");
      }
  }

  shared object toJava extends Converter<BridgeEventType, BridgeEventType_>() {
    shared actual BridgeEventType_ convert(BridgeEventType src) {
      switch (src)
      case(socket_created) { return BridgeEventType_.\iSOCKET_CREATED; }
      case(socket_closed) { return BridgeEventType_.\iSOCKET_CLOSED; }
      case(socket_idle) { return BridgeEventType_.\iSOCKET_IDLE; }
      case(send) { return BridgeEventType_.\iSEND; }
      case(publish) { return BridgeEventType_.\iPUBLISH; }
      case(receive) { return BridgeEventType_.\iRECEIVE; }
      case(register) { return BridgeEventType_.\iREGISTER; }
      case(unregister) { return BridgeEventType_.\iUNREGISTER; }
    }
  }

  shared object toCeylon extends Converter<BridgeEventType_, BridgeEventType>() {
    shared actual BridgeEventType convert(BridgeEventType_ src) {
      if (src == BridgeEventType_.\iSOCKET_CREATED) {
        return socket_created;
      }
      if (src == BridgeEventType_.\iSOCKET_CLOSED) {
        return socket_closed;
      }
      if (src == BridgeEventType_.\iSOCKET_IDLE) {
        return socket_idle;
      }
      if (src == BridgeEventType_.\iSEND) {
        return send;
      }
      if (src == BridgeEventType_.\iPUBLISH) {
        return publish;
      }
      if (src == BridgeEventType_.\iRECEIVE) {
        return receive;
      }
      if (src == BridgeEventType_.\iREGISTER) {
        return register;
      }
      if (src == BridgeEventType_.\iUNREGISTER) {
        return unregister;
      }
      throw Exception("Invalid enum value");
    }
  }
}
