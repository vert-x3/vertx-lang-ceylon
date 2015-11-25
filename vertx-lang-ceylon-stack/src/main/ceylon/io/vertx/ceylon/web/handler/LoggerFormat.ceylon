import io.vertx.lang.ceylon { Converter }
import io.vertx.ext.web.handler { LoggerFormat_=LoggerFormat }

" The possible out of the box formats.\n"
shared abstract class LoggerFormat(shared String name) of default | short | tiny {
}

" <i>remote-client</i> - - [<i>timestamp</i>] \"<i>method</i> <i>uri</i> <i>version</i>\" <i>status</i> <i>content-length</i> \"<i>referrer</i>\" \"<i>user-agent</i>\"\n"
shared object default extends LoggerFormat("DEFAULT") {}
" <i>remote-client</i> - <i>method</i> <i>uri</i> <i>version</i> <i>status</i> <i>content-length</i> <i>duration</i> ms\n"
shared object short extends LoggerFormat("SHORT") {}
" <i>method</i> <i>uri</i> <i>status</i> - <i>content-length</i> <i>duration</i>\n"
shared object tiny extends LoggerFormat("TINY") {}

shared object loggerFormat {

  shared String toString(LoggerFormat val) {
      switch (val)
      case(default) { return "DEFAULT"; }
      case(short) { return "SHORT"; }
      case(tiny) { return "TINY"; }
  }

  shared LoggerFormat fromString(String val) {
      switch (val)
      case("DEFAULT") { return default; }
      case("SHORT") { return short; }
      case("TINY") { return tiny; }
      else {
        throw Exception("Invalid LoggerFormat value ``val``");
      }
  }

  shared object toJava extends Converter<LoggerFormat, LoggerFormat_>() {
    shared actual LoggerFormat_ convert(LoggerFormat src) {
      switch (src)
      case(default) { return LoggerFormat_.\iDEFAULT; }
      case(short) { return LoggerFormat_.\iSHORT; }
      case(tiny) { return LoggerFormat_.\iTINY; }
    }
  }

  shared object toCeylon extends Converter<LoggerFormat_, LoggerFormat>() {
    shared actual LoggerFormat convert(LoggerFormat_ src) {
      if (src == LoggerFormat_.\iDEFAULT) {
        return default;
      }
      if (src == LoggerFormat_.\iSHORT) {
        return short;
      }
      if (src == LoggerFormat_.\iTINY) {
        return tiny;
      }
      throw Exception("Invalid enum value");
    }
  }
}
