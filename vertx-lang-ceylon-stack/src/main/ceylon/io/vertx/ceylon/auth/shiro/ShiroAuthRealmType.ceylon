import io.vertx.lang.ceylon { Converter }
import io.vertx.ext.auth.shiro { ShiroAuthRealmType_=ShiroAuthRealmType }

" The type of the Shiro auth realm\n"
shared abstract class ShiroAuthRealmType(shared String name) of \iPROPERTIES | \iLDAP {
}

" The realm is a Shiro properties auth provider\n"
shared object \iPROPERTIES extends ShiroAuthRealmType("PROPERTIES") {}
" The realm is a Shiro LDAP auth provider\n"
shared object \iLDAP extends ShiroAuthRealmType("LDAP") {}

shared object shiroAuthRealmType {

  shared String toString(ShiroAuthRealmType val) {
      switch (val)
      case(\iPROPERTIES) { return "PROPERTIES"; }
      case(\iLDAP) { return "LDAP"; }
  }

  shared ShiroAuthRealmType fromString(String val) {
      switch (val)
      case("PROPERTIES") { return \iPROPERTIES; }
      case("LDAP") { return \iLDAP; }
      else {
        throw Exception("Invalid ShiroAuthRealmType value ``val``");
      }
  }

  shared object toJava extends Converter<ShiroAuthRealmType, ShiroAuthRealmType_>() {
    shared actual ShiroAuthRealmType_ convert(ShiroAuthRealmType src) {
      switch (src)
      case(\iPROPERTIES) { return ShiroAuthRealmType_.\iPROPERTIES; }
      case(\iLDAP) { return ShiroAuthRealmType_.\iLDAP; }
    }
  }

  shared object toCeylon extends Converter<ShiroAuthRealmType_, ShiroAuthRealmType>() {
    shared actual ShiroAuthRealmType convert(ShiroAuthRealmType_ src) {
      if (src == ShiroAuthRealmType_.\iPROPERTIES) {
        return \iPROPERTIES;
      }
      if (src == ShiroAuthRealmType_.\iLDAP) {
        return \iLDAP;
      }
      throw Exception("Invalid enum value");
    }
  }
}
