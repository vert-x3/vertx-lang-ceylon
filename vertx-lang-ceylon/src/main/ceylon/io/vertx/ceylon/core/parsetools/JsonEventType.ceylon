import io.vertx.lang.ceylon { Converter }
import io.vertx.core.parsetools { JsonEventType_=JsonEventType }

" The possibles types of [JsonEvent](../parsetools/JsonEvent.type.html) emitted by the [JsonParser](../parsetools/JsonParser.type.html).\n"
shared abstract class JsonEventType(shared String name) of start_object | end_object | start_array | end_array | \ivalue {
}

" Signals the start of a JSON object.\n"
shared object start_object extends JsonEventType("START_OBJECT") {}
" Signals the end of a JSON object.\n"
shared object end_object extends JsonEventType("END_OBJECT") {}
" Signals the start of a JSON array.\n"
shared object start_array extends JsonEventType("START_ARRAY") {}
" Signals the end of a JSON array.\n"
shared object end_array extends JsonEventType("END_ARRAY") {}
" Signals a JSON value.\n"
shared object \ivalue extends JsonEventType("VALUE") {}

shared object jsonEventType {

  shared String toString(JsonEventType val) {
      switch (val)
      case(start_object) { return "START_OBJECT"; }
      case(end_object) { return "END_OBJECT"; }
      case(start_array) { return "START_ARRAY"; }
      case(end_array) { return "END_ARRAY"; }
      case(\ivalue) { return "VALUE"; }
  }

  shared JsonEventType fromString(String val) {
      switch (val)
      case("START_OBJECT") { return start_object; }
      case("END_OBJECT") { return end_object; }
      case("START_ARRAY") { return start_array; }
      case("END_ARRAY") { return end_array; }
      case("VALUE") { return \ivalue; }
      else {
        throw Exception("Invalid JsonEventType value ``val``");
      }
  }

  shared object toJava extends Converter<JsonEventType, JsonEventType_>() {
    shared actual JsonEventType_ convert(JsonEventType src) {
      switch (src)
      case(start_object) { return JsonEventType_.\iSTART_OBJECT; }
      case(end_object) { return JsonEventType_.\iEND_OBJECT; }
      case(start_array) { return JsonEventType_.\iSTART_ARRAY; }
      case(end_array) { return JsonEventType_.\iEND_ARRAY; }
      case(\ivalue) { return JsonEventType_.\iVALUE; }
    }
  }

  shared object toCeylon extends Converter<JsonEventType_, JsonEventType>() {
    shared actual JsonEventType convert(JsonEventType_ src) {
      if (src == JsonEventType_.\iSTART_OBJECT) {
        return start_object;
      }
      if (src == JsonEventType_.\iEND_OBJECT) {
        return end_object;
      }
      if (src == JsonEventType_.\iSTART_ARRAY) {
        return start_array;
      }
      if (src == JsonEventType_.\iEND_ARRAY) {
        return end_array;
      }
      if (src == JsonEventType_.\iVALUE) {
        return \ivalue;
      }
      throw Exception("Invalid enum value");
    }
  }
}
