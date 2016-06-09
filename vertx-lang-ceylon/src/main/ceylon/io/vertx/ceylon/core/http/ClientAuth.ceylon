import io.vertx.lang.ceylon { Converter }
import io.vertx.core.http { ClientAuth_=ClientAuth }

" Configures the engine to require/request client authentication.\n <p/>\n Created by manishk on 10/2/2015.\n"
shared abstract class ClientAuth(shared String name) of none | request | required {
}

" No client authentication is requested or required.\n"
shared object none extends ClientAuth("NONE") {}
" Accept authentication if presented by client. If this option is set and the client chooses\n not to provide authentication information about itself, the negotiations will continue.\n"
shared object request extends ClientAuth("REQUEST") {}
" Require client to present authentication, if not presented then negotiations will be declined.\n"
shared object required extends ClientAuth("REQUIRED") {}

shared object clientAuth {

  shared String toString(ClientAuth val) {
      switch (val)
      case(none) { return "NONE"; }
      case(request) { return "REQUEST"; }
      case(required) { return "REQUIRED"; }
  }

  shared ClientAuth fromString(String val) {
      switch (val)
      case("NONE") { return none; }
      case("REQUEST") { return request; }
      case("REQUIRED") { return required; }
      else {
        throw Exception("Invalid ClientAuth value ``val``");
      }
  }

  shared object toJava extends Converter<ClientAuth, ClientAuth_>() {
    shared actual ClientAuth_ convert(ClientAuth src) {
      switch (src)
      case(none) { return ClientAuth_.\iNONE; }
      case(request) { return ClientAuth_.\iREQUEST; }
      case(required) { return ClientAuth_.\iREQUIRED; }
    }
  }

  shared object toCeylon extends Converter<ClientAuth_, ClientAuth>() {
    shared actual ClientAuth convert(ClientAuth_ src) {
      if (src == ClientAuth_.\iNONE) {
        return none;
      }
      if (src == ClientAuth_.\iREQUEST) {
        return request;
      }
      if (src == ClientAuth_.\iREQUIRED) {
        return required;
      }
      throw Exception("Invalid enum value");
    }
  }
}
