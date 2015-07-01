import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
/* Generated from io.vertx.core.parsetools.RecordParser */
shared abstract class RecordParser() {
  shared formal Anything(*<[Anything(Buffer)]>) setOutput;
  shared formal Anything(*<[String]|[Buffer]>) delimitedMode;
  shared formal Anything(*<[Integer]>) fixedSizeMode;
  shared formal Anything(*<[Buffer]>) handle;
}
