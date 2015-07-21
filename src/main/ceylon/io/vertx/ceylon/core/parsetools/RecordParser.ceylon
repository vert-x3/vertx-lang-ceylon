import java.lang {
  String_=String
}
import io.vertx.ceylon.core.buffer {
  Buffer
}
import io.vertx.core {
  Handler_=Handler,
  AsyncResult_=AsyncResult
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.parsetools {
  RecordParser_=RecordParser
}
import io.vertx.core.buffer {
  Buffer_=Buffer
}
/* Generated from io.vertx.core.parsetools.RecordParser */
shared interface RecordParser  {

  shared formal Anything(*<[Anything(Buffer)]>) setOutput;
  shared formal Anything(*<[String]|[Buffer]>) delimitedMode;
  shared formal Anything(*<[Integer]>) fixedSizeMode;
  shared formal Anything(*<[Buffer]>) handle;
}
/* Generated from io.vertx.core.parsetools.RecordParser */

shared abstract class RecordParser_Impl(RecordParser_ delegate) satisfies RecordParser & Delegating<RecordParser_> {

  shared actual Anything(*<[Anything(Buffer)]>) setOutput => flatten(setOutput_impl);
  shared actual Anything(*<[String]|[Buffer]>) delimitedMode => flatten(delimitedMode_impl);
  shared actual Anything(*<[Integer]>) fixedSizeMode => flatten(fixedSizeMode_impl);
  shared actual Anything(*<[Buffer]>) handle => flatten(handle_impl);

  Anything setOutput_impl([Anything(Buffer)] args) {
    Handler_<Buffer_> arg_0 = nothing;
    Anything v = delegate.setOutput(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything delimitedMode_impl([String]|[Buffer] args) {
    if (is [String] args) {
      String arg_0 = args[0];
      Anything v = delegate.delimitedMode(arg_0);
    }
    if (is [Buffer] args) {
      assert(is Delegating<Buffer_> arg_0 = args[0]);
      Anything v = delegate.delimitedMode(arg_0.delegate);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything fixedSizeMode_impl([Integer] args) {
    Integer arg_0 = args[0];
    Anything v = delegate.fixedSizeMode(arg_0);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything handle_impl([Buffer] args) {
    assert(is Delegating<Buffer_> arg_0 = args[0]);
    Anything v = delegate.handle(arg_0.delegate);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
