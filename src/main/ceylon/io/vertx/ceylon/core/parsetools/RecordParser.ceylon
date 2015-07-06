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

  Anything setOutput_impl([Anything(Buffer)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Anything(Buffer)]>) setOutput = flatten(setOutput_impl);

  Anything delimitedMode_impl([String]|[Buffer] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[String]|[Buffer]>) delimitedMode = flatten(delimitedMode_impl);

  Anything fixedSizeMode_impl([Integer] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Integer]>) fixedSizeMode = flatten(fixedSizeMode_impl);

  Anything handle_impl([Buffer] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Buffer]>) handle = flatten(handle_impl);

}
