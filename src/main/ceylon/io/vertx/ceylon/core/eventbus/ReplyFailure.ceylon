import io.vertx.lang.ceylon { Converter }
import io.vertx.core.eventbus { ReplyFailure_=ReplyFailure }

shared abstract class ReplyFailure(shared String name) of \iTIMEOUT | \iNO_HANDLERS | \iRECIPIENT_FAILURE {
}

shared object \iTIMEOUT extends ReplyFailure("io.vertx.codegen.EnumValueInfo@4720462b") {}
shared object \iNO_HANDLERS extends ReplyFailure("io.vertx.codegen.EnumValueInfo@fadde98") {}
shared object \iRECIPIENT_FAILURE extends ReplyFailure("io.vertx.codegen.EnumValueInfo@1620baf1") {}

shared object toJavaReplyFailure satisfies Converter<ReplyFailure, ReplyFailure_> {
  shared actual ReplyFailure_ convert(ReplyFailure src) {
    switch (src)    case(\iTIMEOUT) { return ReplyFailure_.\iTIMEOUT; }
    case(\iNO_HANDLERS) { return ReplyFailure_.\iNO_HANDLERS; }
    case(\iRECIPIENT_FAILURE) { return ReplyFailure_.\iRECIPIENT_FAILURE; }
  }
}

shared object toCeylonReplyFailure satisfies Converter<ReplyFailure_, ReplyFailure> {
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
