import java.lang {
  String_=String
}
/* Generated from io.vertx.core.buffer.Buffer */
shared abstract class Buffer() {
  shared formal String(*<[String]>) toString;
  shared formal Byte(*<[Integer]>) getByte;
  shared formal Integer(*<[Integer]>) getInt;
  shared formal Integer(*<[Integer]>) getLong;
  shared formal Float(*<[Integer]>) getDouble;
  shared formal Float(*<[Integer]>) getFloat;
  shared formal Integer(*<[Integer]>) getShort;
  shared formal Buffer(*<[Integer,Integer]>) getBuffer;
  shared formal String(*<[Integer,Integer]|[Integer,Integer,String]>) getString;
  shared formal Buffer(*<[Buffer]|[Buffer,Integer,Integer]>) appendBuffer;
  shared formal Buffer(*<[Byte]>) appendByte;
  shared formal Buffer(*<[Integer]>) appendInt;
  shared formal Buffer(*<[Integer]>) appendLong;
  shared formal Buffer(*<[Integer]>) appendShort;
  shared formal Buffer(*<[Float]>) appendFloat;
  shared formal Buffer(*<[Float]>) appendDouble;
  shared formal Buffer(*<[String]|[String,String]>) appendString;
  shared formal Buffer(*<[Integer,Byte]>) setByte;
  shared formal Buffer(*<[Integer,Integer]>) setInt;
  shared formal Buffer(*<[Integer,Integer]>) setLong;
  shared formal Buffer(*<[Integer,Float]>) setDouble;
  shared formal Buffer(*<[Integer,Float]>) setFloat;
  shared formal Buffer(*<[Integer,Integer]>) setShort;
  shared formal Buffer(*<[Integer,Buffer]|[Integer,Buffer,Integer,Integer]>) setBuffer;
  shared formal Buffer(*<[Integer,String]|[Integer,String,String]>) setString;
  shared formal Integer(*<[]>) length;
  shared formal Buffer(*<[]>) copy;
  shared formal Buffer(*<[]|[Integer,Integer]>) slice;
}
