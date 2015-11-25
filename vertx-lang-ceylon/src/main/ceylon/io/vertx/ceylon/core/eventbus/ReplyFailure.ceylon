import io.vertx.lang.ceylon { Converter }
import io.vertx.core.eventbus { ReplyFailure_=ReplyFailure }

" Represents the type of reply failure\n"
shared abstract class ReplyFailure(shared String name) of timeout | no_handlers | recipient_failure {
}

" The message send failed because no reply was received before the timeout time.\n"
shared object timeout extends ReplyFailure("TIMEOUT") {}
" The message send failed because no handlers were available to handle the message.\n"
shared object no_handlers extends ReplyFailure("NO_HANDLERS") {}
" The message send failed because the recipient actively sent back a failure (rejected the message)\n"
shared object recipient_failure extends ReplyFailure("RECIPIENT_FAILURE") {}

shared object replyFailure {

  shared String toString(ReplyFailure val) {
      switch (val)
      case(timeout) { return "TIMEOUT"; }
      case(no_handlers) { return "NO_HANDLERS"; }
      case(recipient_failure) { return "RECIPIENT_FAILURE"; }
  }

  shared ReplyFailure fromString(String val) {
      switch (val)
      case("TIMEOUT") { return timeout; }
      case("NO_HANDLERS") { return no_handlers; }
      case("RECIPIENT_FAILURE") { return recipient_failure; }
      else {
        throw Exception("Invalid ReplyFailure value ``val``");
      }
  }

  shared object toJava extends Converter<ReplyFailure, ReplyFailure_>() {
    shared actual ReplyFailure_ convert(ReplyFailure src) {
      switch (src)
      case(timeout) { return ReplyFailure_.\iTIMEOUT; }
      case(no_handlers) { return ReplyFailure_.\iNO_HANDLERS; }
      case(recipient_failure) { return ReplyFailure_.\iRECIPIENT_FAILURE; }
    }
  }

  shared object toCeylon extends Converter<ReplyFailure_, ReplyFailure>() {
    shared actual ReplyFailure convert(ReplyFailure_ src) {
      if (src == ReplyFailure_.\iTIMEOUT) {
        return timeout;
      }
      if (src == ReplyFailure_.\iNO_HANDLERS) {
        return no_handlers;
      }
      if (src == ReplyFailure_.\iRECIPIENT_FAILURE) {
        return recipient_failure;
      }
      throw Exception("Invalid enum value");
    }
  }
}
