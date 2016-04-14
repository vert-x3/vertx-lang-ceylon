import io.vertx.lang.ceylon { Converter }
import io.vertx.core.net { SSLEngine_=SSLEngine }

" The SSL engine implementation to use in a Vert.x server or client.\n"
shared abstract class SSLEngine(shared String name) of jdk | openssl {
}

" Use the engine provided by the JDK.\n"
shared object jdk extends SSLEngine("JDK") {}
" Use an OpenSSL based engine.\n"
shared object openssl extends SSLEngine("OPENSSL") {}

shared object sslEngine {

  shared String toString(SSLEngine val) {
      switch (val)
      case(jdk) { return "JDK"; }
      case(openssl) { return "OPENSSL"; }
  }

  shared SSLEngine fromString(String val) {
      switch (val)
      case("JDK") { return jdk; }
      case("OPENSSL") { return openssl; }
      else {
        throw Exception("Invalid SSLEngine value ``val``");
      }
  }

  shared object toJava extends Converter<SSLEngine, SSLEngine_>() {
    shared actual SSLEngine_ convert(SSLEngine src) {
      switch (src)
      case(jdk) { return SSLEngine_.\iJDK; }
      case(openssl) { return SSLEngine_.\iOPENSSL; }
    }
  }

  shared object toCeylon extends Converter<SSLEngine_, SSLEngine>() {
    shared actual SSLEngine convert(SSLEngine_ src) {
      if (src == SSLEngine_.\iJDK) {
        return jdk;
      }
      if (src == SSLEngine_.\iOPENSSL) {
        return openssl;
      }
      throw Exception("Invalid enum value");
    }
  }
}
