import java.lang {
  String_=String
}
import io.vertx.ceylon.core.eventbus {
  DeliveryOptions
}
import io.vertx.ceylon.core {
  MultiMap
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.eventbus {
  Message_=Message
}
/* Generated from io.vertx.core.eventbus.Message<T> */
shared abstract class Message<T>(Message_<Object> delegate) satisfies Delegating {

  String address_impl([] args) {
    throw Exception("implement me");
  }

  shared  String(*<[]>) address = flatten(address_impl);

  MultiMap headers_impl([] args) {
    throw Exception("implement me");
  }

  shared  MultiMap(*<[]>) headers = flatten(headers_impl);

  T body_impl([] args) {
    throw Exception("implement me");
  }

  shared  T(*<[]>) body = flatten(body_impl);

  String replyAddress_impl([] args) {
    throw Exception("implement me");
  }

  shared  String(*<[]>) replyAddress = flatten(replyAddress_impl);

  Anything reply_impl([Object]|[Object,Anything(Throwable|Message<Object>)]|[Object,DeliveryOptions]|[Object,DeliveryOptions,Anything(Throwable|Message<Object>)] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Object]|[Object,Anything(Throwable|Message<Object>)]|[Object,DeliveryOptions]|[Object,DeliveryOptions,Anything(Throwable|Message<Object>)]>) reply = flatten(reply_impl);

  Anything fail_impl([Integer,String] args) {
    throw Exception("implement me");
  }

  shared  Anything(*<[Integer,String]>) fail = flatten(fail_impl);

}
