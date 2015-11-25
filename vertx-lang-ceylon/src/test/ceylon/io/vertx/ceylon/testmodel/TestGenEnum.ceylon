import io.vertx.lang.ceylon { Converter }
import io.vertx.codegen.testmodel { TestGenEnum_=TestGenEnum }

" @author <a href=\"http://tfox.org\">Tim Fox</a>\n"
shared abstract class TestGenEnum(shared String name) of laura | bob | mike | leland {
}

shared object laura extends TestGenEnum("LAURA") {}
shared object bob extends TestGenEnum("BOB") {}
shared object mike extends TestGenEnum("MIKE") {}
shared object leland extends TestGenEnum("LELAND") {}

shared object testGenEnum {

  shared String toString(TestGenEnum val) {
      switch (val)
      case(laura) { return "LAURA"; }
      case(bob) { return "BOB"; }
      case(mike) { return "MIKE"; }
      case(leland) { return "LELAND"; }
  }

  shared TestGenEnum fromString(String val) {
      switch (val)
      case("LAURA") { return laura; }
      case("BOB") { return bob; }
      case("MIKE") { return mike; }
      case("LELAND") { return leland; }
      else {
        throw Exception("Invalid TestGenEnum value ``val``");
      }
  }

  shared object toJava extends Converter<TestGenEnum, TestGenEnum_>() {
    shared actual TestGenEnum_ convert(TestGenEnum src) {
      switch (src)
      case(laura) { return TestGenEnum_.\iLAURA; }
      case(bob) { return TestGenEnum_.\iBOB; }
      case(mike) { return TestGenEnum_.\iMIKE; }
      case(leland) { return TestGenEnum_.\iLELAND; }
    }
  }

  shared object toCeylon extends Converter<TestGenEnum_, TestGenEnum>() {
    shared actual TestGenEnum convert(TestGenEnum_ src) {
      if (src == TestGenEnum_.\iLAURA) {
        return laura;
      }
      if (src == TestGenEnum_.\iBOB) {
        return bob;
      }
      if (src == TestGenEnum_.\iMIKE) {
        return mike;
      }
      if (src == TestGenEnum_.\iLELAND) {
        return leland;
      }
      throw Exception("Invalid enum value");
    }
  }
}
