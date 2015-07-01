import java.lang {
  String_=String
}
import io.vertx.ceylon.core.eventbus {
  DeliveryOptions,
  Message,
  MessageConsumer,
  MessageProducer
}
import io.vertx.ceylon.core.metrics {
  Measured
}
/* Generated from io.vertx.core.eventbus.EventBus */
shared abstract class EventBus() satisfies Measured {
  shared formal Anything(*<[]|[]|[]|[]>) send;
  shared formal Anything(*<[]|[]>) publish;
  shared formal Anything(*<[]|[]>) consumer;
  shared formal Anything(*<[]|[]>) localConsumer;
  shared formal Anything(*<[]|[]>) sender;
  shared formal Anything(*<[]|[]>) publisher;
  shared formal Anything(*<[]>) close;
}
