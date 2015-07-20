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

  shared  Anything(*<[Anything(Buffer)]>) setOutput => flatten(setOutput_impl);

  shared  Anything(*<[String]|[Buffer]>) delimitedMode => flatten(delimitedMode_impl);

  shared  Anything(*<[Integer]>) fixedSizeMode => flatten(fixedSizeMode_impl);

  shared  Anything(*<[Buffer]>) handle => flatten(handle_impl);

  Anything setOutput_impl([Anything(Buffer)] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything delimitedMode_impl([String]|[Buffer] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything fixedSizeMode_impl([Integer] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything handle_impl([Buffer] args) {
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
