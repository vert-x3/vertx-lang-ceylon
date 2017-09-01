import io.vertx.lang.ceylon { Converter }
import io.vertx.ext.sql { ResultSetType_=ResultSetType }

" Represents the resultset type hint\n"
shared abstract class ResultSetType(shared String name) of forward_only | scroll_insensitive | scroll_sensitive {
}

shared object forward_only extends ResultSetType("FORWARD_ONLY") {}
shared object scroll_insensitive extends ResultSetType("SCROLL_INSENSITIVE") {}
shared object scroll_sensitive extends ResultSetType("SCROLL_SENSITIVE") {}

shared object resultSetType {

  shared String toString(ResultSetType val) {
      switch (val)
      case(forward_only) { return "FORWARD_ONLY"; }
      case(scroll_insensitive) { return "SCROLL_INSENSITIVE"; }
      case(scroll_sensitive) { return "SCROLL_SENSITIVE"; }
  }

  shared ResultSetType fromString(String val) {
      switch (val)
      case("FORWARD_ONLY") { return forward_only; }
      case("SCROLL_INSENSITIVE") { return scroll_insensitive; }
      case("SCROLL_SENSITIVE") { return scroll_sensitive; }
      else {
        throw Exception("Invalid ResultSetType value ``val``");
      }
  }

  shared object toJava extends Converter<ResultSetType, ResultSetType_>() {
    shared actual ResultSetType_ convert(ResultSetType src) {
      switch (src)
      case(forward_only) { return ResultSetType_.\iFORWARD_ONLY; }
      case(scroll_insensitive) { return ResultSetType_.\iSCROLL_INSENSITIVE; }
      case(scroll_sensitive) { return ResultSetType_.\iSCROLL_SENSITIVE; }
    }
  }

  shared object toCeylon extends Converter<ResultSetType_, ResultSetType>() {
    shared actual ResultSetType convert(ResultSetType_ src) {
      if (src == ResultSetType_.\iFORWARD_ONLY) {
        return forward_only;
      }
      if (src == ResultSetType_.\iSCROLL_INSENSITIVE) {
        return scroll_insensitive;
      }
      if (src == ResultSetType_.\iSCROLL_SENSITIVE) {
        return scroll_sensitive;
      }
      throw Exception("Invalid enum value");
    }
  }
}
