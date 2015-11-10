import io.vertx.lang.ceylon { Converter }
import io.vertx.core.eventbus { ReplyFailure_=ReplyFailure }

shared abstract class ReplyFailure(shared String name) of \iTIMEOUT | \iNO_HANDLERS | \iRECIPIENT_FAILURE {
}

shared object \iTIMEOUT extends ReplyFailure("TIMEOUT") {}
shared object \iNO_HANDLERS extends ReplyFailure("NO_HANDLERS") {}
shared object \iRECIPIENT_FAILURE extends ReplyFailure("RECIPIENT_FAILURE") {}

shared object replyFailure {

  shared String toString(ReplyFailure val) {
      switch (val)
      case(\iTIMEOUT) { return "TIMEOUT"; }
      case(\iNO_HANDLERS) { return "NO_HANDLERS"; }
      case(\iRECIPIENT_FAILURE) { return "RECIPIENT_FAILURE"; }
  }

  shared ReplyFailure fromString(String val) {
      switch (val)
      case("TIMEOUT") { return \iTIMEOUT; }
      case("NO_HANDLERS") { return \iNO_HANDLERS; }
      case("RECIPIENT_FAILURE") { return \iRECIPIENT_FAILURE; }
      else {
        throw Exception("Invalid ReplyFailure value ``val``");
      }
  }

  shared object toJava extends Converter<ReplyFailure, ReplyFailure_>() {
    shared actual ReplyFailure_ convert(ReplyFailure src) {
      switch (src)
      case(\iTIMEOUT) { return ReplyFailure_.\iTIMEOUT; }
      case(\iNO_HANDLERS) { return ReplyFailure_.\iNO_HANDLERS; }
      case(\iRECIPIENT_FAILURE) { return ReplyFailure_.\iRECIPIENT_FAILURE; }
    }
  }

  shared object toCeylon extends Converter<ReplyFailure_, ReplyFailure>() {
    shared actual ReplyFailure convert(ReplyFailure_ src) {
      if (src == ReplyFailure_.\iTIMEOUT) {
        return \iTIMEOUT;
      }
      if (src == ReplyFailure_.\iNO_HANDLERS) {
        return \iNO_HANDLERS;
      }
      if (src == ReplyFailure_.\iRECIPIENT_FAILURE) {
        return \iRECIPIENT_FAILURE;
      }
      throw Exception("Invalid enum value");
    }
  }
}
