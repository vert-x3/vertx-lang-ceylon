import io.vertx.lang.ceylon { Converter }
import io.vertx.ext.auth.shiro { ShiroAuthRealmType_=ShiroAuthRealmType }

" The type of the Shiro auth realm\n"
shared abstract class ShiroAuthRealmType(shared String name) of properties | ldap {
}

" The realm is a Shiro properties auth provider\n"
shared object properties extends ShiroAuthRealmType("PROPERTIES") {}
" The realm is a Shiro LDAP auth provider\n"
shared object ldap extends ShiroAuthRealmType("LDAP") {}

shared object shiroAuthRealmType {

  shared String toString(ShiroAuthRealmType val) {
      switch (val)
      case(properties) { return "PROPERTIES"; }
      case(ldap) { return "LDAP"; }
  }

  shared ShiroAuthRealmType fromString(String val) {
      switch (val)
      case("PROPERTIES") { return properties; }
      case("LDAP") { return ldap; }
      else {
        throw Exception("Invalid ShiroAuthRealmType value ``val``");
      }
  }

  shared object toJava extends Converter<ShiroAuthRealmType, ShiroAuthRealmType_>() {
    shared actual ShiroAuthRealmType_ convert(ShiroAuthRealmType src) {
      switch (src)
      case(properties) { return ShiroAuthRealmType_.\iPROPERTIES; }
      case(ldap) { return ShiroAuthRealmType_.\iLDAP; }
    }
  }

  shared object toCeylon extends Converter<ShiroAuthRealmType_, ShiroAuthRealmType>() {
    shared actual ShiroAuthRealmType convert(ShiroAuthRealmType_ src) {
      if (src == ShiroAuthRealmType_.\iPROPERTIES) {
        return properties;
      }
      if (src == ShiroAuthRealmType_.\iLDAP) {
        return ldap;
      }
      throw Exception("Invalid enum value");
    }
  }
}
