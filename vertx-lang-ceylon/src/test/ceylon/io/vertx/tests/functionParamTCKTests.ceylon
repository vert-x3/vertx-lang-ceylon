import io.vertx.ceylon.testmodel {
  FunctionParamTCK, TestDataObject, RefedInterface1, GenericRefedInterface
}
import io.vertx.codegen.testmodel {
  FunctionParamTCKImpl, RefedInterface1Impl
}
import ceylon.test {
  test, assertEquals, assertTrue, assertNull, assertNotNull
}
import ceylon.json {
  JsonObject=Object, JsonArray=Array
}
import ceylon.collection {
  HashSet, ArrayList, HashMap
}

FunctionParamTCK functionParamTCK = FunctionParamTCK(FunctionParamTCKImpl());

shared test void testFunctionBasicParam() {
  value ret = functionParamTCK.methodWithBasicParam(
    (Byte arg) {
      value s = arg.string;
      return "ok0";
    },
    (Integer arg) {
      value s = arg.string;
      return"ok1";
    },
    (Integer arg) {
      value s = arg.string;
      return "ok2";
    },
    (Integer arg) {
      value s = arg.string;
      return "ok3";
    },
    (Float arg) {
      value s = arg.string;
      return "ok4";
    },
    (Float arg) {
      value s = arg.string;
      return "ok5";
    },
    (Boolean arg) {
      value s = arg.string;
      return "ok6";
    },
    (Character arg) {
      value s = arg.string;
      return "ok7";
    },
    (String arg) {
      value s = arg.string;
      return "ok8";
    }
  );
  assertEquals(ret, ArrayList { "ok0", "ok1", "ok2", "ok3", "ok4", "ok5", "ok6", "ok7", "ok8" });
}

shared test void testFunctionJsonParam() {
  value ret = functionParamTCK.methodWithJsonParam(
    (JsonObject arg) {
      assertEquals(arg, JsonObject { "one"->1, "two"->2, "three"->3 });
      return "ok0";
    },
    (JsonArray arg) {
      assertEquals(arg, JsonArray { "one", "two", "three" });
      return"ok1";
    });
  assertEquals(ret, ArrayList { "ok0", "ok1" });
}

shared test void testFunctionVoidParam() {
  assertEquals(functionParamTCK.methodWithVoidParam(() => "ok"), "ok");
}

shared test void testFunctionUserTypeParam() {
  value refed = RefedInterface1(RefedInterface1Impl());
  assertEquals(functionParamTCK.methodWithUserTypeParam(
    refed,
    (RefedInterface1 arg) {
      arg.setString("foobarjuu");
      assertEquals(arg.getString(), "foobarjuu");
      return "ok";
    }), "ok");
}

shared test void testFunctionObjectParam() {
  assertEquals(functionParamTCK.methodWithObjectParam(
    123,
    (Object? arg) {
      assertEquals(arg, 123);
      return "ok";
    }), "ok");
  assertEquals(functionParamTCK.methodWithObjectParam(
    "the-string-arg",
    (Object? arg) {
      assertEquals(arg, "the-string-arg");
      return "ok";
    }), "ok");
}

shared test void testFunctionDataObjectParam() {
  assertEquals(functionParamTCK.methodWithDataObjectParam(
    (TestDataObject arg) {
      assertEquals(arg.foo, "foo_value");
      assertEquals(arg.bar, 3);
      assertFloatEquals(arg.wibble, 0.01);
      return "ok";
    }), "ok");
}

shared test void testFunctionEnumParam() {
  assertEquals(functionParamTCK.methodWithEnumParam(
    (String arg) {
      assertEquals(arg, "TIM");
      return "ok";
    }), "ok");
}

shared test void testFunctionListParam() {
  assertEquals(functionParamTCK.methodWithListParam(
    (List<String> arg) {
      assertEquals(arg, ArrayList { "one", "two", "three" });
      return "ok";
    }), "ok");
}

shared test void testFunctionSetParam() {
  assertEquals(functionParamTCK.methodWithSetParam(
    (Set<String> arg) {
      assertEquals(arg, HashSet { "one", "two", "three" });
      return "ok";
    }), "ok");
}

shared test void testFunctionMapParam() {
  assertEquals(functionParamTCK.methodWithMapParam(
    (Map<String, String> arg) {
      assertEquals(arg, HashMap { "one"->"one", "two"->"two", "three"->"three" });
      return "ok";
    }), "ok");
}

shared test void testFunctionGenericParam() {
  assertEquals(functionParamTCK.methodWithGenericParam(
    123,
    (Integer? arg) {
      assertEquals(arg, 123);
      return "ok";
    }), "ok");
  assertEquals(functionParamTCK.methodWithGenericParam(
    "the-string-arg",
    (String? arg) {
      assertEquals(arg, "the-string-arg");
      return "ok";
    }), "ok");
}

shared test void testFunctionGenericUserTypeParam() {
  assertEquals(functionParamTCK.methodWithGenericUserTypeParam(
    123,
    (GenericRefedInterface<Integer?> arg) {
      assertEquals(arg.getValue(), 123);
      return "ok";
    }), "ok");
  assertEquals(functionParamTCK.methodWithGenericUserTypeParam(
    "the-string-arg",
    (GenericRefedInterface<String?> arg) {
      assertEquals(arg.getValue(), "the-string-arg");
      return "ok";
    }), "ok");
}

shared test void testFunctionNullableListParam() {
  assertEquals(functionParamTCK.methodWithNullableListParam(
    (List<String>? arg) {
      if (exists arg) {
        return "fail";
      } else {
        return "ok";
      }
    }), "ok");
}

shared test void testFunctionBasicReturn() {
  assertEquals(functionParamTCK.methodWithBasicReturn(
    (String arg) => 10.byte,
    (String arg) => 1000,
    (String arg) => 100000,
    (String arg) => 10000000000,
    (String arg) => 0.01,
    (String arg) => 0.00001,
    (String arg) => true,
    (String arg) => 'C',
    (String arg) => "the-return"
    ), "ok");
}

shared test void testFunctionJsonReturn() {
  assertEquals(functionParamTCK.methodWithJsonReturn(
    (String arg) => JsonObject { "foo"->"foo_value", "bar"->10, "wibble"->0.1 },
    (String arg) => JsonArray { "one", "two", "three" }
    ), "ok");
}

shared test void testFunctionObjectReturn() {
  assertEquals(functionParamTCK.methodWithObjectReturn(
    (Integer arg) {
      switch (arg)
      case (0) { return "the-string"; }
      case (1) { return 123; }
      case (2) { return true; }
      case (3) { return JsonObject { "foo"->"foo_value" }; }
      case (4) { return JsonArray { "foo", "bar" }; }
      else { throw Exception(); }
    }), "ok");
}

shared test void testFunctionDataObjectReturn() {
  assertEquals(functionParamTCK.methodWithDataObjectReturn(
    (String arg) => TestDataObject { foo="wasabi"; bar=6; wibble=0.01; }), "ok");
}

shared test void testFunctionEnumReturn() {
  assertEquals(functionParamTCK.methodWithEnumReturn(
    (String arg) => "NICK"), "ok");
}

shared test void testFunctionListReturn() {
  assertEquals(functionParamTCK.methodWithListReturn(
    (String arg) => ArrayList { "one", "two", "three" }), "ok");
}

shared test void testFunctionSetReturn() {
  assertEquals(functionParamTCK.methodWithSetReturn(
    (String arg) => HashSet { "one", "two", "three" }), "ok");
}

shared test void testFunctionMapReturn() {
  assertEquals(functionParamTCK.methodWithMapReturn(
    (String arg) => HashMap { "one"->"one", "two"->"two", "three"->"three" }), "ok");
}

shared test void testFunctionGenericReturn() {
  assertEquals(functionParamTCK.methodWithGenericReturn<Object>(
    (Integer arg) {
      switch (arg)
      case (0) { return "the-string"; }
      case (1) { return 123; }
      case (2) { return true; }
      case (3) { return JsonObject { "foo"->"foo_value" }; }
      case (4) { return JsonArray { "foo", "bar" }; }
      else { throw Exception(); }
    }), "ok");
}

shared test void testFunctionGenericUserTypeReturn() {
  assertEquals(functionParamTCK.methodWithGenericUserTypeReturn<String>((GenericRefedInterface<String?> arg) => arg), "ok");
  assertEquals(functionParamTCK.methodWithGenericUserTypeReturn<Integer>((GenericRefedInterface<Integer?> arg) => arg), "ok");
}

shared test void testFunctionNullableListReturn() {
  assertEquals(functionParamTCK.methodWithNullableListReturn((String arg) => null), "ok");
}
