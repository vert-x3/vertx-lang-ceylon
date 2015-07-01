import java.lang {
  String_=String
}
import io.vertx.ceylon.core.net {
  NetSocketStream,
  NetSocket
}
import io.vertx.ceylon.core.metrics {
  Measured
}
/* Generated from io.vertx.core.net.NetServer */
shared abstract class NetServer() satisfies Measured {
  shared formal Anything(*<[]>) connectStream;
  shared formal Anything(*<[]>) connectHandler;
  shared formal Anything(*<[]|[]|[]|[]|[]|[]>) listen;
  shared formal Anything(*<[]|[]>) close;
  shared formal Anything(*<[]>) actualPort;
}
