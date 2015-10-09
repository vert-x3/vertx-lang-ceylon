import io.vertx.lang.ceylon { Converter }
import io.vertx.core.http { ClientAuth_=ClientAuth }

shared abstract class ClientAuth(shared String name) of \iNONE | \iREQUEST | \iREQUIRED {
}

shared object \iNONE extends ClientAuth("NONE") {}
shared object \iREQUEST extends ClientAuth("REQUEST") {}
shared object \iREQUIRED extends ClientAuth("REQUIRED") {}

shared object toJavaClientAuth extends Converter<ClientAuth, ClientAuth_>() {
  shared actual ClientAuth_ convert(ClientAuth src) {
    switch (src)    case(\iNONE) { return ClientAuth_.\iNONE; }
    case(\iREQUEST) { return ClientAuth_.\iREQUEST; }
    case(\iREQUIRED) { return ClientAuth_.\iREQUIRED; }
  }
}

shared object toCeylonClientAuth extends Converter<ClientAuth_, ClientAuth>() {
  shared actual ClientAuth convert(ClientAuth_ src) {
    if (src == ClientAuth_.\iNONE) {
      return \iNONE;
    }
    if (src == ClientAuth_.\iREQUEST) {
      return \iREQUEST;
    }
    if (src == ClientAuth_.\iREQUIRED) {
      return \iREQUIRED;
    }
    throw Exception("Invalid enum value");
  }
}
