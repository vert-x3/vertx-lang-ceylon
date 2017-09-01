import io.vertx.lang.ceylon { Converter }
import io.vertx.ext.sql { ResultSetConcurrency_=ResultSetConcurrency }

" Represents the resultset concurrency hint\n"
shared abstract class ResultSetConcurrency(shared String name) of read_only | updatable {
}

shared object read_only extends ResultSetConcurrency("READ_ONLY") {}
shared object updatable extends ResultSetConcurrency("UPDATABLE") {}

shared object resultSetConcurrency {

  shared String toString(ResultSetConcurrency val) {
      switch (val)
      case(read_only) { return "READ_ONLY"; }
      case(updatable) { return "UPDATABLE"; }
  }

  shared ResultSetConcurrency fromString(String val) {
      switch (val)
      case("READ_ONLY") { return read_only; }
      case("UPDATABLE") { return updatable; }
      else {
        throw Exception("Invalid ResultSetConcurrency value ``val``");
      }
  }

  shared object toJava extends Converter<ResultSetConcurrency, ResultSetConcurrency_>() {
    shared actual ResultSetConcurrency_ convert(ResultSetConcurrency src) {
      switch (src)
      case(read_only) { return ResultSetConcurrency_.\iREAD_ONLY; }
      case(updatable) { return ResultSetConcurrency_.\iUPDATABLE; }
    }
  }

  shared object toCeylon extends Converter<ResultSetConcurrency_, ResultSetConcurrency>() {
    shared actual ResultSetConcurrency convert(ResultSetConcurrency_ src) {
      if (src == ResultSetConcurrency_.\iREAD_ONLY) {
        return read_only;
      }
      if (src == ResultSetConcurrency_.\iUPDATABLE) {
        return updatable;
      }
      throw Exception("Invalid enum value");
    }
  }
}
