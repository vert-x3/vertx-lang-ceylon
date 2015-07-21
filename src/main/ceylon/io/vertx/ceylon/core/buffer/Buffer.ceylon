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
shared interface Buffer  {

  shared formal String(*<[String]>) toString;
  shared formal Byte(*<[Integer]>) getByte;
  shared formal Integer(*<[Integer]>) getUnsignedByte;
  shared formal Integer(*<[Integer]>) getInt;
  shared formal Integer(*<[Integer]>) getUnsignedInt;
  shared formal Integer(*<[Integer]>) getLong;
  shared formal Float(*<[Integer]>) getDouble;
  shared formal Float(*<[Integer]>) getFloat;
  shared formal Integer(*<[Integer]>) getShort;
  shared formal Integer(*<[Integer]>) getUnsignedShort;
  shared formal Buffer(*<[Integer,Integer]>) getBuffer;
  shared formal String(*<[Integer,Integer]|[Integer,Integer,String]>) getString;
  shared formal Buffer(*<[Buffer]|[Buffer,Integer,Integer]>) appendBuffer;
  shared formal Buffer(*<[Byte]>) appendByte;
  shared formal Buffer(*<[Integer]>) appendUnsignedByte;
  shared formal Buffer(*<[Integer]>) appendInt;
  shared formal Buffer(*<[Integer]>) appendUnsignedInt;
  shared formal Buffer(*<[Integer]>) appendLong;
  shared formal Buffer(*<[Integer]>) appendShort;
  shared formal Buffer(*<[Integer]>) appendUnsignedShort;
  shared formal Buffer(*<[Float]>) appendFloat;
  shared formal Buffer(*<[Float]>) appendDouble;
  shared formal Buffer(*<[String]|[String,String]>) appendString;
  shared formal Buffer(*<[Integer,Byte]>) setByte;
  shared formal Buffer(*<[Integer,Integer]>) setUnsignedByte;
  shared formal Buffer(*<[Integer,Integer]>) setInt;
  shared formal Buffer(*<[Integer,Integer]>) setUnsignedInt;
  shared formal Buffer(*<[Integer,Integer]>) setLong;
  shared formal Buffer(*<[Integer,Float]>) setDouble;
  shared formal Buffer(*<[Integer,Float]>) setFloat;
  shared formal Buffer(*<[Integer,Integer]>) setShort;
  shared formal Buffer(*<[Integer,Integer]>) setUnsignedShort;
  shared formal Buffer(*<[Integer,Buffer]|[Integer,Buffer,Integer,Integer]>) setBuffer;
  shared formal Buffer(*<[Integer,String]|[Integer,String,String]>) setString;
  shared formal Integer(*<[]>) length;
  shared formal Buffer(*<[]>) copy;
  shared formal Buffer(*<[]|[Integer,Integer]>) slice;
}
/* Generated from io.vertx.core.buffer.Buffer */

shared abstract class Buffer_Impl(Buffer delegate) satisfies Buffer & Delegating<Buffer> {

  shared actual String(*<[String]>) toString => flatten(toString_impl);
  shared actual Byte(*<[Integer]>) getByte => flatten(getByte_impl);
  shared actual Integer(*<[Integer]>) getUnsignedByte => flatten(getUnsignedByte_impl);
  shared actual Integer(*<[Integer]>) getInt => flatten(getInt_impl);
  shared actual Integer(*<[Integer]>) getUnsignedInt => flatten(getUnsignedInt_impl);
  shared actual Integer(*<[Integer]>) getLong => flatten(getLong_impl);
  shared actual Float(*<[Integer]>) getDouble => flatten(getDouble_impl);
  shared actual Float(*<[Integer]>) getFloat => flatten(getFloat_impl);
  shared actual Integer(*<[Integer]>) getShort => flatten(getShort_impl);
  shared actual Integer(*<[Integer]>) getUnsignedShort => flatten(getUnsignedShort_impl);
  shared actual Buffer(*<[Integer,Integer]>) getBuffer => flatten(getBuffer_impl);
  shared actual String(*<[Integer,Integer]|[Integer,Integer,String]>) getString => flatten(getString_impl);
  shared actual Buffer(*<[Buffer]|[Buffer,Integer,Integer]>) appendBuffer => flatten(appendBuffer_impl);
  shared actual Buffer(*<[Byte]>) appendByte => flatten(appendByte_impl);
  shared actual Buffer(*<[Integer]>) appendUnsignedByte => flatten(appendUnsignedByte_impl);
  shared actual Buffer(*<[Integer]>) appendInt => flatten(appendInt_impl);
  shared actual Buffer(*<[Integer]>) appendUnsignedInt => flatten(appendUnsignedInt_impl);
  shared actual Buffer(*<[Integer]>) appendLong => flatten(appendLong_impl);
  shared actual Buffer(*<[Integer]>) appendShort => flatten(appendShort_impl);
  shared actual Buffer(*<[Integer]>) appendUnsignedShort => flatten(appendUnsignedShort_impl);
  shared actual Buffer(*<[Float]>) appendFloat => flatten(appendFloat_impl);
  shared actual Buffer(*<[Float]>) appendDouble => flatten(appendDouble_impl);
  shared actual Buffer(*<[String]|[String,String]>) appendString => flatten(appendString_impl);
  shared actual Buffer(*<[Integer,Byte]>) setByte => flatten(setByte_impl);
  shared actual Buffer(*<[Integer,Integer]>) setUnsignedByte => flatten(setUnsignedByte_impl);
  shared actual Buffer(*<[Integer,Integer]>) setInt => flatten(setInt_impl);
  shared actual Buffer(*<[Integer,Integer]>) setUnsignedInt => flatten(setUnsignedInt_impl);
  shared actual Buffer(*<[Integer,Integer]>) setLong => flatten(setLong_impl);
  shared actual Buffer(*<[Integer,Float]>) setDouble => flatten(setDouble_impl);
  shared actual Buffer(*<[Integer,Float]>) setFloat => flatten(setFloat_impl);
  shared actual Buffer(*<[Integer,Integer]>) setShort => flatten(setShort_impl);
  shared actual Buffer(*<[Integer,Integer]>) setUnsignedShort => flatten(setUnsignedShort_impl);
  shared actual Buffer(*<[Integer,Buffer]|[Integer,Buffer,Integer,Integer]>) setBuffer => flatten(setBuffer_impl);
  shared actual Buffer(*<[Integer,String]|[Integer,String,String]>) setString => flatten(setString_impl);
  shared actual Integer(*<[]>) length => flatten(length_impl);
  shared actual Buffer(*<[]>) copy => flatten(copy_impl);
  shared actual Buffer(*<[]|[Integer,Integer]>) slice => flatten(slice_impl);

  String toString_impl([String] args) {
    Anything v = delegate.toString(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Byte getByte_impl([Integer] args) {
    Anything v = delegate.getByte(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer getUnsignedByte_impl([Integer] args) {
    Anything v = delegate.getUnsignedByte(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer getInt_impl([Integer] args) {
    Anything v = delegate.getInt(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer getUnsignedInt_impl([Integer] args) {
    Anything v = delegate.getUnsignedInt(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer getLong_impl([Integer] args) {
    Anything v = delegate.getLong(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Float getDouble_impl([Integer] args) {
    Anything v = delegate.getDouble(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Float getFloat_impl([Integer] args) {
    Anything v = delegate.getFloat(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer getShort_impl([Integer] args) {
    Anything v = delegate.getShort(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer getUnsignedShort_impl([Integer] args) {
    Anything v = delegate.getUnsignedShort(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer getBuffer_impl([Integer,Integer] args) {
    Anything v = delegate.getBuffer(args[0],args[1]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String getString_impl([Integer,Integer]|[Integer,Integer,String] args) {
    if (is [Integer,Integer] args) {
      Anything v = delegate.getString(args[0],args[1]);
    }
    if (is [Integer,Integer,String] args) {
      Anything v = delegate.getString(args[0],args[1],args[2]);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer appendBuffer_impl([Buffer]|[Buffer,Integer,Integer] args) {
    if (is [Buffer] args) {
      assert(is Delegating<Buffer> arg_0 = args[0]);
      Anything v = delegate.appendBuffer(arg_0.delegate);
    }
    if (is [Buffer,Integer,Integer] args) {
      assert(is Delegating<Buffer> arg_0 = args[0]);
      Anything v = delegate.appendBuffer(arg_0.delegate,args[1],args[2]);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer appendByte_impl([Byte] args) {
    Anything v = delegate.appendByte(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer appendUnsignedByte_impl([Integer] args) {
    Anything v = delegate.appendUnsignedByte(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer appendInt_impl([Integer] args) {
    Anything v = delegate.appendInt(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer appendUnsignedInt_impl([Integer] args) {
    Anything v = delegate.appendUnsignedInt(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer appendLong_impl([Integer] args) {
    Anything v = delegate.appendLong(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer appendShort_impl([Integer] args) {
    Anything v = delegate.appendShort(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer appendUnsignedShort_impl([Integer] args) {
    Anything v = delegate.appendUnsignedShort(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer appendFloat_impl([Float] args) {
    Anything v = delegate.appendFloat(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer appendDouble_impl([Float] args) {
    Anything v = delegate.appendDouble(args[0]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer appendString_impl([String]|[String,String] args) {
    if (is [String] args) {
      Anything v = delegate.appendString(args[0]);
    }
    if (is [String,String] args) {
      Anything v = delegate.appendString(args[0],args[1]);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer setByte_impl([Integer,Byte] args) {
    Anything v = delegate.setByte(args[0],args[1]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer setUnsignedByte_impl([Integer,Integer] args) {
    Anything v = delegate.setUnsignedByte(args[0],args[1]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer setInt_impl([Integer,Integer] args) {
    Anything v = delegate.setInt(args[0],args[1]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer setUnsignedInt_impl([Integer,Integer] args) {
    Anything v = delegate.setUnsignedInt(args[0],args[1]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer setLong_impl([Integer,Integer] args) {
    Anything v = delegate.setLong(args[0],args[1]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer setDouble_impl([Integer,Float] args) {
    Anything v = delegate.setDouble(args[0],args[1]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer setFloat_impl([Integer,Float] args) {
    Anything v = delegate.setFloat(args[0],args[1]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer setShort_impl([Integer,Integer] args) {
    Anything v = delegate.setShort(args[0],args[1]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer setUnsignedShort_impl([Integer,Integer] args) {
    Anything v = delegate.setUnsignedShort(args[0],args[1]);
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer setBuffer_impl([Integer,Buffer]|[Integer,Buffer,Integer,Integer] args) {
    if (is [Integer,Buffer] args) {
      assert(is Delegating<Buffer> arg_1 = args[1]);
      Anything v = delegate.setBuffer(args[0],arg_1.delegate);
    }
    if (is [Integer,Buffer,Integer,Integer] args) {
      assert(is Delegating<Buffer> arg_1 = args[1]);
      Anything v = delegate.setBuffer(args[0],arg_1.delegate,args[2],args[3]);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer setString_impl([Integer,String]|[Integer,String,String] args) {
    if (is [Integer,String] args) {
      Anything v = delegate.setString(args[0],args[1]);
    }
    if (is [Integer,String,String] args) {
      Anything v = delegate.setString(args[0],args[1],args[2]);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer length_impl([] args) {
    Anything v = delegate.length();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer copy_impl([] args) {
    Anything v = delegate.copy();
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer slice_impl([]|[Integer,Integer] args) {
    if (is [] args) {
      Anything v = delegate.slice();
    }
    if (is [Integer,Integer] args) {
      Anything v = delegate.slice(args[0],args[1]);
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
