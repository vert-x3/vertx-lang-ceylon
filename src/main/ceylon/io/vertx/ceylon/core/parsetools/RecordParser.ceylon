import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.parsetools {
  RecordParser_=RecordParser
}
/* Generated from io.vertx.core.parsetools.RecordParser */
shared abstract class RecordParser(RecordParser_ delegate) satisfies Delegating {
  shared formal Anything(*<[Anything(Buffer)]>) setOutput;
  shared formal Anything(*<[String]|[Buffer]>) delimitedMode;
  shared formal Anything(*<[Integer]>) fixedSizeMode;
  shared formal Anything(*<[Buffer]>) handle;
}
