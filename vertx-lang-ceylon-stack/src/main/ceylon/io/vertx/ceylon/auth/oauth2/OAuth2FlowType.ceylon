import io.vertx.lang.ceylon { Converter }
import io.vertx.ext.auth.oauth2 { OAuth2FlowType_=OAuth2FlowType }

" OAuth2 Flows\n"
shared abstract class OAuth2FlowType(shared String name) of auth_code | client | password | auth_jwt {
}

shared object auth_code extends OAuth2FlowType("AUTH_CODE") {}
shared object client extends OAuth2FlowType("CLIENT") {}
shared object password extends OAuth2FlowType("PASSWORD") {}
" RFC7523\n"
shared object auth_jwt extends OAuth2FlowType("AUTH_JWT") {}

shared object oAuth2FlowType {

  shared String toString(OAuth2FlowType val) {
      switch (val)
      case(auth_code) { return "AUTH_CODE"; }
      case(client) { return "CLIENT"; }
      case(password) { return "PASSWORD"; }
      case(auth_jwt) { return "AUTH_JWT"; }
  }

  shared OAuth2FlowType fromString(String val) {
      switch (val)
      case("AUTH_CODE") { return auth_code; }
      case("CLIENT") { return client; }
      case("PASSWORD") { return password; }
      case("AUTH_JWT") { return auth_jwt; }
      else {
        throw Exception("Invalid OAuth2FlowType value ``val``");
      }
  }

  shared object toJava extends Converter<OAuth2FlowType, OAuth2FlowType_>() {
    shared actual OAuth2FlowType_ convert(OAuth2FlowType src) {
      switch (src)
      case(auth_code) { return OAuth2FlowType_.\iAUTH_CODE; }
      case(client) { return OAuth2FlowType_.\iCLIENT; }
      case(password) { return OAuth2FlowType_.\iPASSWORD; }
      case(auth_jwt) { return OAuth2FlowType_.\iAUTH_JWT; }
    }
  }

  shared object toCeylon extends Converter<OAuth2FlowType_, OAuth2FlowType>() {
    shared actual OAuth2FlowType convert(OAuth2FlowType_ src) {
      if (src == OAuth2FlowType_.\iAUTH_CODE) {
        return auth_code;
      }
      if (src == OAuth2FlowType_.\iCLIENT) {
        return client;
      }
      if (src == OAuth2FlowType_.\iPASSWORD) {
        return password;
      }
      if (src == OAuth2FlowType_.\iAUTH_JWT) {
        return auth_jwt;
      }
      throw Exception("Invalid enum value");
    }
  }
}
