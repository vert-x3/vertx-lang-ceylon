import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
/* Generated from io.vertx.core.parsetools.RecordParser */
shared abstract class RecordParser() {
  shared formal Anything(*<[]>) setOutput;
  shared formal Anything(*<[]|[]>) delimitedMode;
  shared formal Anything(*<[]>) fixedSizeMode;
  shared formal Anything(*<[]>) handle;
}
