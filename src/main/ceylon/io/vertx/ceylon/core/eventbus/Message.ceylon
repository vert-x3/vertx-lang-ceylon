import java.lang {
  String_=String
}
import io.vertx.ceylon.core.eventbus {
  DeliveryOptions
}
import io.vertx.ceylon.core {
  MultiMap
}
import io.vertx.core {
  MultiMap_=MultiMap
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.eventbus {
  Message_=Message,
  DeliveryOptions_=DeliveryOptions
}
/* Generated from io.vertx.core.eventbus.Message<T> */
shared interface Message<T>  {

  shared formal String(*<[]>) address;
  shared formal MultiMap(*<[]>) headers;
  shared formal T(*<[]>) body;
  shared formal String(*<[]>) replyAddress;
  shared formal Anything(*<[Object]|[Object,Anything(Throwable|Message<Object>)]|[Object,DeliveryOptions]|[Object,DeliveryOptions,Anything(Throwable|Message<Object>)]>) reply;
  shared formal Anything(*<[Integer,String]>) fail;
}
/* Generated from io.vertx.core.eventbus.Message<T> */

shared abstract class Message_Impl<T>(Message_<Object> delegate) satisfies Message<T> & Delegating<Message_<Object>> {

  shared actual String(*<[]>) address => flatten(address_impl);
  shared actual MultiMap(*<[]>) headers => flatten(headers_impl);
  shared actual T(*<[]>) body => flatten(body_impl);
  shared actual String(*<[]>) replyAddress => flatten(replyAddress_impl);
  shared actual Anything(*<[Object]|[Object,Anything(Throwable|Message<Object>)]|[Object,DeliveryOptions]|[Object,DeliveryOptions,Anything(Throwable|Message<Object>)]>) reply => flatten(reply_impl);
  shared actual Anything(*<[Integer,String]>) fail => flatten(fail_impl);

  String address_impl([] args) {
    Anything v = delegate.address();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MultiMap headers_impl([] args) {
    Anything v = delegate.headers();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  T body_impl([] args) {
    Anything v = delegate.body();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String replyAddress_impl([] args) {
    Anything v = delegate.replyAddress();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything reply_impl([Object]|[Object,Anything(Throwable|Message<Object>)]|[Object,DeliveryOptions]|[Object,DeliveryOptions,Anything(Throwable|Message<Object>)] args) {
    if (is [Object] args) {
    }
    if (is [Object,Anything(Throwable|Message<Object>)] args) {
    }
    if (is [Object,DeliveryOptions] args) {
    }
    if (is [Object,DeliveryOptions,Anything(Throwable|Message<Object>)] args) {
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything fail_impl([Integer,String] args) {
    Integer arg_0 = args[0];
    String arg_1 = args[1];
    Anything v = delegate.fail(arg_0,arg_1);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
