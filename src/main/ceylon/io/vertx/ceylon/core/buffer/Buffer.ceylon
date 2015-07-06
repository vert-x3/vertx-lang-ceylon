import java.lang {
  String_=String
}
import io.vertx.lang.ceylon {
  Delegating
}
import io.vertx.core.buffer {
  Buffer_=Buffer
}
/* Generated from io.vertx.core.buffer.Buffer */
shared abstract class Buffer(Buffer_ delegate) satisfies Delegating {

  String toString_impl([String] args) {
    throw Exception("implement me");
  }

  shared  String(*<[String]>) toString = flatten(toString_impl);

  Byte getByte_impl([Integer] args) {
    throw Exception("implement me");
  }

  shared  Byte(*<[Integer]>) getByte = flatten(getByte_impl);

  Integer getInt_impl([Integer] args) {
    throw Exception("implement me");
  }

  shared  Integer(*<[Integer]>) getInt = flatten(getInt_impl);

  Integer getLong_impl([Integer] args) {
    throw Exception("implement me");
  }

  shared  Integer(*<[Integer]>) getLong = flatten(getLong_impl);

  Float getDouble_impl([Integer] args) {
    throw Exception("implement me");
  }

  shared  Float(*<[Integer]>) getDouble = flatten(getDouble_impl);

  Float getFloat_impl([Integer] args) {
    throw Exception("implement me");
  }

  shared  Float(*<[Integer]>) getFloat = flatten(getFloat_impl);

  Integer getShort_impl([Integer] args) {
    throw Exception("implement me");
  }

  shared  Integer(*<[Integer]>) getShort = flatten(getShort_impl);

  Buffer getBuffer_impl([Integer,Integer] args) {
    throw Exception("implement me");
  }

  shared  Buffer(*<[Integer,Integer]>) getBuffer = flatten(getBuffer_impl);

  String getString_impl([Integer,Integer]|[Integer,Integer,String] args) {
    throw Exception("implement me");
  }

  shared  String(*<[Integer,Integer]|[Integer,Integer,String]>) getString = flatten(getString_impl);

  Buffer appendBuffer_impl([Buffer]|[Buffer,Integer,Integer] args) {
    throw Exception("implement me");
  }

  shared  Buffer(*<[Buffer]|[Buffer,Integer,Integer]>) appendBuffer = flatten(appendBuffer_impl);

  Buffer appendByte_impl([Byte] args) {
    throw Exception("implement me");
  }

  shared  Buffer(*<[Byte]>) appendByte = flatten(appendByte_impl);

  Buffer appendInt_impl([Integer] args) {
    throw Exception("implement me");
  }

  shared  Buffer(*<[Integer]>) appendInt = flatten(appendInt_impl);

  Buffer appendLong_impl([Integer] args) {
    throw Exception("implement me");
  }

  shared  Buffer(*<[Integer]>) appendLong = flatten(appendLong_impl);

  Buffer appendShort_impl([Integer] args) {
    throw Exception("implement me");
  }

  shared  Buffer(*<[Integer]>) appendShort = flatten(appendShort_impl);

  Buffer appendFloat_impl([Float] args) {
    throw Exception("implement me");
  }

  shared  Buffer(*<[Float]>) appendFloat = flatten(appendFloat_impl);

  Buffer appendDouble_impl([Float] args) {
    throw Exception("implement me");
  }

  shared  Buffer(*<[Float]>) appendDouble = flatten(appendDouble_impl);

  Buffer appendString_impl([String]|[String,String] args) {
    throw Exception("implement me");
  }

  shared  Buffer(*<[String]|[String,String]>) appendString = flatten(appendString_impl);

  Buffer setByte_impl([Integer,Byte] args) {
    throw Exception("implement me");
  }

  shared  Buffer(*<[Integer,Byte]>) setByte = flatten(setByte_impl);

  Buffer setInt_impl([Integer,Integer] args) {
    throw Exception("implement me");
  }

  shared  Buffer(*<[Integer,Integer]>) setInt = flatten(setInt_impl);

  Buffer setLong_impl([Integer,Integer] args) {
    throw Exception("implement me");
  }

  shared  Buffer(*<[Integer,Integer]>) setLong = flatten(setLong_impl);

  Buffer setDouble_impl([Integer,Float] args) {
    throw Exception("implement me");
  }

  shared  Buffer(*<[Integer,Float]>) setDouble = flatten(setDouble_impl);

  Buffer setFloat_impl([Integer,Float] args) {
    throw Exception("implement me");
  }

  shared  Buffer(*<[Integer,Float]>) setFloat = flatten(setFloat_impl);

  Buffer setShort_impl([Integer,Integer] args) {
    throw Exception("implement me");
  }

  shared  Buffer(*<[Integer,Integer]>) setShort = flatten(setShort_impl);

  Buffer setBuffer_impl([Integer,Buffer]|[Integer,Buffer,Integer,Integer] args) {
    throw Exception("implement me");
  }

  shared  Buffer(*<[Integer,Buffer]|[Integer,Buffer,Integer,Integer]>) setBuffer = flatten(setBuffer_impl);

  Buffer setString_impl([Integer,String]|[Integer,String,String] args) {
    throw Exception("implement me");
  }

  shared  Buffer(*<[Integer,String]|[Integer,String,String]>) setString = flatten(setString_impl);

  Integer length_impl([] args) {
    throw Exception("implement me");
  }

  shared  Integer(*<[]>) length = flatten(length_impl);

  Buffer copy_impl([] args) {
    throw Exception("implement me");
  }

  shared  Buffer(*<[]>) copy = flatten(copy_impl);

  Buffer slice_impl([]|[Integer,Integer] args) {
    throw Exception("implement me");
  }

  shared  Buffer(*<[]|[Integer,Integer]>) slice = flatten(slice_impl);

}
