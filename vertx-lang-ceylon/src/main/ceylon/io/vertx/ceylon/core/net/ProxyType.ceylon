import io.vertx.lang.ceylon { Converter }
import io.vertx.core.net { ProxyType_=ProxyType }

" The type of a TCP proxy server.\n"
shared abstract class ProxyType(shared String name) of http | socks4 | socks5 {
}

" HTTP CONNECT ssl proxy\n"
shared object http extends ProxyType("HTTP") {}
" SOCKS4/4a tcp proxy\n"
shared object socks4 extends ProxyType("SOCKS4") {}
" SOCSK5 tcp proxy\n"
shared object socks5 extends ProxyType("SOCKS5") {}

shared object proxyType {

  shared String toString(ProxyType val) {
      switch (val)
      case(http) { return "HTTP"; }
      case(socks4) { return "SOCKS4"; }
      case(socks5) { return "SOCKS5"; }
  }

  shared ProxyType fromString(String val) {
      switch (val)
      case("HTTP") { return http; }
      case("SOCKS4") { return socks4; }
      case("SOCKS5") { return socks5; }
      else {
        throw Exception("Invalid ProxyType value ``val``");
      }
  }

  shared object toJava extends Converter<ProxyType, ProxyType_>() {
    shared actual ProxyType_ convert(ProxyType src) {
      switch (src)
      case(http) { return ProxyType_.\iHTTP; }
      case(socks4) { return ProxyType_.\iSOCKS4; }
      case(socks5) { return ProxyType_.\iSOCKS5; }
    }
  }

  shared object toCeylon extends Converter<ProxyType_, ProxyType>() {
    shared actual ProxyType convert(ProxyType_ src) {
      if (src == ProxyType_.\iHTTP) {
        return http;
      }
      if (src == ProxyType_.\iSOCKS4) {
        return socks4;
      }
      if (src == ProxyType_.\iSOCKS5) {
        return socks5;
      }
      throw Exception("Invalid enum value");
    }
  }
}
