import io.vertx.lang.ceylon { Converter }
import io.vertx.ext.sql { FetchDirection_=FetchDirection }

" Represents the fetch direction hint\n"
shared abstract class FetchDirection(shared String name) of forward | reverse | unknown {
}

shared object forward extends FetchDirection("FORWARD") {}
shared object reverse extends FetchDirection("REVERSE") {}
shared object unknown extends FetchDirection("UNKNOWN") {}

shared object fetchDirection {

  shared String toString(FetchDirection val) {
      switch (val)
      case(forward) { return "FORWARD"; }
      case(reverse) { return "REVERSE"; }
      case(unknown) { return "UNKNOWN"; }
  }

  shared FetchDirection fromString(String val) {
      switch (val)
      case("FORWARD") { return forward; }
      case("REVERSE") { return reverse; }
      case("UNKNOWN") { return unknown; }
      else {
        throw Exception("Invalid FetchDirection value ``val``");
      }
  }

  shared object toJava extends Converter<FetchDirection, FetchDirection_>() {
    shared actual FetchDirection_ convert(FetchDirection src) {
      switch (src)
      case(forward) { return FetchDirection_.\iFORWARD; }
      case(reverse) { return FetchDirection_.\iREVERSE; }
      case(unknown) { return FetchDirection_.\iUNKNOWN; }
    }
  }

  shared object toCeylon extends Converter<FetchDirection_, FetchDirection>() {
    shared actual FetchDirection convert(FetchDirection_ src) {
      if (src == FetchDirection_.\iFORWARD) {
        return forward;
      }
      if (src == FetchDirection_.\iREVERSE) {
        return reverse;
      }
      if (src == FetchDirection_.\iUNKNOWN) {
        return unknown;
      }
      throw Exception("Invalid enum value");
    }
  }
}
