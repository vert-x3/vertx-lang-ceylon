import io.vertx.lang.ceylon { Converter }
import io.vertx.codegen.testmodel { TestGenEnum_=TestGenEnum }

" @author <a href=\"http://tfox.org\">Tim Fox</a>\n"
shared abstract class TestGenEnum(shared String name) of \iLAURA | \iBOB | \iMIKE | \iLELAND {
}

shared object \iLAURA extends TestGenEnum("LAURA") {}
shared object \iBOB extends TestGenEnum("BOB") {}
shared object \iMIKE extends TestGenEnum("MIKE") {}
shared object \iLELAND extends TestGenEnum("LELAND") {}

shared object testGenEnum {

  shared String toString(TestGenEnum val) {
      switch (val)
      case(\iLAURA) { return "LAURA"; }
      case(\iBOB) { return "BOB"; }
      case(\iMIKE) { return "MIKE"; }
      case(\iLELAND) { return "LELAND"; }
  }

  shared TestGenEnum fromString(String val) {
      switch (val)
      case("LAURA") { return \iLAURA; }
      case("BOB") { return \iBOB; }
      case("MIKE") { return \iMIKE; }
      case("LELAND") { return \iLELAND; }
      else {
        throw Exception("Invalid TestGenEnum value ``val``");
      }
  }

  shared object toJava extends Converter<TestGenEnum, TestGenEnum_>() {
    shared actual TestGenEnum_ convert(TestGenEnum src) {
      switch (src)
      case(\iLAURA) { return TestGenEnum_.\iLAURA; }
      case(\iBOB) { return TestGenEnum_.\iBOB; }
      case(\iMIKE) { return TestGenEnum_.\iMIKE; }
      case(\iLELAND) { return TestGenEnum_.\iLELAND; }
    }
  }

  shared object toCeylon extends Converter<TestGenEnum_, TestGenEnum>() {
    shared actual TestGenEnum convert(TestGenEnum_ src) {
      if (src == TestGenEnum_.\iLAURA) {
        return \iLAURA;
      }
      if (src == TestGenEnum_.\iBOB) {
        return \iBOB;
      }
      if (src == TestGenEnum_.\iMIKE) {
        return \iMIKE;
      }
      if (src == TestGenEnum_.\iLELAND) {
        return \iLELAND;
      }
      throw Exception("Invalid enum value");
    }
  }
}
