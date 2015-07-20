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

  shared  String(*<[String]>) toString => flatten(toString_impl);

  shared  Byte(*<[Integer]>) getByte => flatten(getByte_impl);

  shared  Integer(*<[Integer]>) getUnsignedByte => flatten(getUnsignedByte_impl);

  shared  Integer(*<[Integer]>) getInt => flatten(getInt_impl);

  shared  Integer(*<[Integer]>) getUnsignedInt => flatten(getUnsignedInt_impl);

  shared  Integer(*<[Integer]>) getLong => flatten(getLong_impl);

  shared  Float(*<[Integer]>) getDouble => flatten(getDouble_impl);

  shared  Float(*<[Integer]>) getFloat => flatten(getFloat_impl);

  shared  Integer(*<[Integer]>) getShort => flatten(getShort_impl);

  shared  Integer(*<[Integer]>) getUnsignedShort => flatten(getUnsignedShort_impl);

  shared  Buffer(*<[Integer,Integer]>) getBuffer => flatten(getBuffer_impl);

  shared  String(*<[Integer,Integer]|[Integer,Integer,String]>) getString => flatten(getString_impl);

  shared  Buffer(*<[Buffer]|[Buffer,Integer,Integer]>) appendBuffer => flatten(appendBuffer_impl);

  shared  Buffer(*<[Byte]>) appendByte => flatten(appendByte_impl);

  shared  Buffer(*<[Integer]>) appendUnsignedByte => flatten(appendUnsignedByte_impl);

  shared  Buffer(*<[Integer]>) appendInt => flatten(appendInt_impl);

  shared  Buffer(*<[Integer]>) appendUnsignedInt => flatten(appendUnsignedInt_impl);

  shared  Buffer(*<[Integer]>) appendLong => flatten(appendLong_impl);

  shared  Buffer(*<[Integer]>) appendShort => flatten(appendShort_impl);

  shared  Buffer(*<[Integer]>) appendUnsignedShort => flatten(appendUnsignedShort_impl);

  shared  Buffer(*<[Float]>) appendFloat => flatten(appendFloat_impl);

  shared  Buffer(*<[Float]>) appendDouble => flatten(appendDouble_impl);

  shared  Buffer(*<[String]|[String,String]>) appendString => flatten(appendString_impl);

  shared  Buffer(*<[Integer,Byte]>) setByte => flatten(setByte_impl);

  shared  Buffer(*<[Integer,Integer]>) setUnsignedByte => flatten(setUnsignedByte_impl);

  shared  Buffer(*<[Integer,Integer]>) setInt => flatten(setInt_impl);

  shared  Buffer(*<[Integer,Integer]>) setUnsignedInt => flatten(setUnsignedInt_impl);

  shared  Buffer(*<[Integer,Integer]>) setLong => flatten(setLong_impl);

  shared  Buffer(*<[Integer,Float]>) setDouble => flatten(setDouble_impl);

  shared  Buffer(*<[Integer,Float]>) setFloat => flatten(setFloat_impl);

  shared  Buffer(*<[Integer,Integer]>) setShort => flatten(setShort_impl);

  shared  Buffer(*<[Integer,Integer]>) setUnsignedShort => flatten(setUnsignedShort_impl);

  shared  Buffer(*<[Integer,Buffer]|[Integer,Buffer,Integer,Integer]>) setBuffer => flatten(setBuffer_impl);

  shared  Buffer(*<[Integer,String]|[Integer,String,String]>) setString => flatten(setString_impl);

  shared  Integer(*<[]>) length => flatten(length_impl);

  shared  Buffer(*<[]>) copy => flatten(copy_impl);

  shared  Buffer(*<[]|[Integer,Integer]>) slice => flatten(slice_impl);

  String toString_impl([String] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Byte getByte_impl([Integer] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer getUnsignedByte_impl([Integer] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer getInt_impl([Integer] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer getUnsignedInt_impl([Integer] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer getLong_impl([Integer] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Float getDouble_impl([Integer] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Float getFloat_impl([Integer] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer getShort_impl([Integer] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer getUnsignedShort_impl([Integer] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer getBuffer_impl([Integer,Integer] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  String getString_impl([Integer,Integer]|[Integer,Integer,String] args) {
    if (is [Integer,Integer] args) {
      // Invoke method
    }
    if (is [Integer,Integer,String] args) {
      // Invoke method
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer appendBuffer_impl([Buffer]|[Buffer,Integer,Integer] args) {
    if (is [Buffer] args) {
      // Invoke method
    }
    if (is [Buffer,Integer,Integer] args) {
      // Invoke method
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer appendByte_impl([Byte] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer appendUnsignedByte_impl([Integer] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer appendInt_impl([Integer] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer appendUnsignedInt_impl([Integer] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer appendLong_impl([Integer] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer appendShort_impl([Integer] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer appendUnsignedShort_impl([Integer] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer appendFloat_impl([Float] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer appendDouble_impl([Float] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer appendString_impl([String]|[String,String] args) {
    if (is [String] args) {
      // Invoke method
    }
    if (is [String,String] args) {
      // Invoke method
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer setByte_impl([Integer,Byte] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer setUnsignedByte_impl([Integer,Integer] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer setInt_impl([Integer,Integer] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer setUnsignedInt_impl([Integer,Integer] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer setLong_impl([Integer,Integer] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer setDouble_impl([Integer,Float] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer setFloat_impl([Integer,Float] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer setShort_impl([Integer,Integer] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer setUnsignedShort_impl([Integer,Integer] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer setBuffer_impl([Integer,Buffer]|[Integer,Buffer,Integer,Integer] args) {
    if (is [Integer,Buffer] args) {
      // Invoke method
    }
    if (is [Integer,Buffer,Integer,Integer] args) {
      // Invoke method
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer setString_impl([Integer,String]|[Integer,String,String] args) {
    if (is [Integer,String] args) {
      // Invoke method
    }
    if (is [Integer,String,String] args) {
      // Invoke method
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Integer length_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer copy_impl([] args) {
    // Invoke method
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

  Buffer slice_impl([]|[Integer,Integer] args) {
    if (is [] args) {
      // Invoke method
    }
    if (is [Integer,Integer] args) {
      // Invoke method
    }
    Object test = this; // Just test we can access this
    throw Exception("implement me");
  }

}
