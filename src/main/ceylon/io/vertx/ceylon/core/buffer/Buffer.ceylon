import java.lang {
  String_=String
}
/* Generated from io.vertx.core.buffer.Buffer */
shared abstract class Buffer() {
  shared formal Anything(*<[String]>) toString;
  shared formal Anything(*<[Integer]>) getByte;
  shared formal Anything(*<[Integer]>) getInt;
  shared formal Anything(*<[Integer]>) getLong;
  shared formal Anything(*<[Integer]>) getDouble;
  shared formal Anything(*<[Integer]>) getFloat;
  shared formal Anything(*<[Integer]>) getShort;
  shared formal Anything(*<[Integer,Integer]>) getBuffer;
  shared formal Anything(*<[Integer,Integer]|[Integer,Integer,String]>) getString;
  shared formal Anything(*<[Buffer]|[Buffer,Integer,Integer]>) appendBuffer;
  shared formal Anything(*<[Byte]>) appendByte;
  shared formal Anything(*<[Integer]>) appendInt;
  shared formal Anything(*<[Integer]>) appendLong;
  shared formal Anything(*<[Integer]>) appendShort;
  shared formal Anything(*<[Float]>) appendFloat;
  shared formal Anything(*<[Float]>) appendDouble;
  shared formal Anything(*<[String]|[String,String]>) appendString;
  shared formal Anything(*<[Integer,Byte]>) setByte;
  shared formal Anything(*<[Integer,Integer]>) setInt;
  shared formal Anything(*<[Integer,Integer]>) setLong;
  shared formal Anything(*<[Integer,Float]>) setDouble;
  shared formal Anything(*<[Integer,Float]>) setFloat;
  shared formal Anything(*<[Integer,Integer]>) setShort;
  shared formal Anything(*<[Integer,Buffer]|[Integer,Buffer,Integer,Integer]>) setBuffer;
  shared formal Anything(*<[Integer,String]|[Integer,String,String]>) setString;
  shared formal Anything(*<[]>) length;
  shared formal Anything(*<[]>) copy;
  shared formal Anything(*<[]|[Integer,Integer]>) slice;
}
