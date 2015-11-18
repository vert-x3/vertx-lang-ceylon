import io.vertx.lang.ceylon { Converter }
import io.vertx.core.http { ClientAuth_=ClientAuth }

" Configures the engine to require/request client authentication. Following are the options :\n <p>\n NONE - No client authentication is requested or required.\n <p>\n REQUEST - Accept authentication if presented by client. If this option is set and the client chooses\n      not to provide authentication information about itself, the negotiations will continue.\n <p>\n REQUIRED - Require client to present authentication, if not presented then negotiations will be declined.\n <p>\n Created by manishk on 10/2/2015.\n"
shared abstract class ClientAuth(shared String name) of \iNONE | \iREQUEST | \iREQUIRED {
}

shared object \iNONE extends ClientAuth("NONE") {}
shared object \iREQUEST extends ClientAuth("REQUEST") {}
shared object \iREQUIRED extends ClientAuth("REQUIRED") {}

shared object clientAuth {

  shared String toString(ClientAuth val) {
      switch (val)
      case(\iNONE) { return "NONE"; }
      case(\iREQUEST) { return "REQUEST"; }
      case(\iREQUIRED) { return "REQUIRED"; }
  }

  shared ClientAuth fromString(String val) {
      switch (val)
      case("NONE") { return \iNONE; }
      case("REQUEST") { return \iREQUEST; }
      case("REQUIRED") { return \iREQUIRED; }
      else {
        throw Exception("Invalid ClientAuth value ``val``");
      }
  }

  shared object toJava extends Converter<ClientAuth, ClientAuth_>() {
    shared actual ClientAuth_ convert(ClientAuth src) {
      switch (src)
      case(\iNONE) { return ClientAuth_.\iNONE; }
      case(\iREQUEST) { return ClientAuth_.\iREQUEST; }
      case(\iREQUIRED) { return ClientAuth_.\iREQUIRED; }
    }
  }

  shared object toCeylon extends Converter<ClientAuth_, ClientAuth>() {
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
}
