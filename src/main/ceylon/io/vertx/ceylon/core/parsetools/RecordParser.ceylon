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
shared interface RecordParser  {

  shared formal Anything(*<[Anything(Buffer)]>) setOutput;
  shared formal Anything(*<[String]|[Buffer]>) delimitedMode;
  shared formal Anything(*<[Integer]>) fixedSizeMode;
  shared formal Anything(*<[Buffer]>) handle;
}
/* Generated from io.vertx.core.parsetools.RecordParser */

shared abstract class RecordParser_Impl(RecordParser delegate) satisfies RecordParser & Delegating<RecordParser> {

  shared actual Anything(*<[Anything(Buffer)]>) setOutput => flatten(setOutput_impl);
  shared actual Anything(*<[String]|[Buffer]>) delimitedMode => flatten(delimitedMode_impl);
  shared actual Anything(*<[Integer]>) fixedSizeMode => flatten(fixedSizeMode_impl);
  shared actual Anything(*<[Buffer]>) handle => flatten(handle_impl);

  Anything setOutput_impl([Anything(Buffer)] args) {
    Anything v = delegate.setOutput(nothing);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything delimitedMode_impl([String]|[Buffer] args) {
    if (is [String] args) {
      Anything v = delegate.delimitedMode(args[0]);
    }
    if (is [Buffer] args) {
      assert(is Delegating<Buffer> arg_0 = args[0]);
      Anything v = delegate.delimitedMode(arg_0.delegate);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything fixedSizeMode_impl([Integer] args) {
    Anything v = delegate.fixedSizeMode(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything handle_impl([Buffer] args) {
    assert(is Delegating<Buffer> arg_0 = args[0]);
    Anything v = delegate.handle(arg_0.delegate);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
