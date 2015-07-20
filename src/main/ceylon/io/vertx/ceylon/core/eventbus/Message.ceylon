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

  shared  String(*<[]>) address => flatten(address_impl);

  shared  MultiMap(*<[]>) headers => flatten(headers_impl);

  shared  T(*<[]>) body => flatten(body_impl);

  shared  String(*<[]>) replyAddress => flatten(replyAddress_impl);

  shared  Anything(*<[Object]|[Object,Anything(Throwable|Message<Object>)]|[Object,DeliveryOptions]|[Object,DeliveryOptions,Anything(Throwable|Message<Object>)]>) reply => flatten(reply_impl);

  shared  Anything(*<[Integer,String]>) fail => flatten(fail_impl);

  String address_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  MultiMap headers_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  T body_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String replyAddress_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything reply_impl([Object]|[Object,Anything(Throwable|Message<Object>)]|[Object,DeliveryOptions]|[Object,DeliveryOptions,Anything(Throwable|Message<Object>)] args) {
    if (is [Object] args) {
      // Invoke method
    }
    if (is [Object,Anything(Throwable|Message<Object>)] args) {
      // Invoke method
    }
    if (is [Object,DeliveryOptions] args) {
      // Invoke method
    }
    if (is [Object,DeliveryOptions,Anything(Throwable|Message<Object>)] args) {
      // Invoke method
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Anything fail_impl([Integer,String] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
