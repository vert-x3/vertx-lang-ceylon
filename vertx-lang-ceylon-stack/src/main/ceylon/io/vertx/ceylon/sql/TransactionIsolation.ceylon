import io.vertx.lang.ceylon { Converter }
import io.vertx.ext.sql { TransactionIsolation_=TransactionIsolation }

" Represents a Transaction Isolation Level\n"
shared abstract class TransactionIsolation(shared String name) of read_uncommitted | read_committed | repeatable_read | serializable | none {
}

" Implements dirty read, or isolation level 0 locking, which means that no shared locks are issued and no exclusive\n locks are honored. When this option is set, it is possible to read uncommitted or dirty data; values in the data\n can be changed and rows can appear or disappear in the data set before the end of the transaction. This is the\n least restrictive of the four isolation levels.\n"
shared object read_uncommitted extends TransactionIsolation("READ_UNCOMMITTED") {}
" Specifies that shared locks are held while the data is being read to avoid dirty reads, but the data can be changed\n before the end of the transaction, resulting in nonrepeatable reads or phantom data.\n"
shared object read_committed extends TransactionIsolation("READ_COMMITTED") {}
" Locks are placed on all data that is used in a query, preventing other users from updating the data, but new\n phantom rows can be inserted into the data set by another user and are included in later reads in the current\n transaction. Because concurrency is lower than the default isolation level, use this option only when necessary.\n"
shared object repeatable_read extends TransactionIsolation("REPEATABLE_READ") {}
" Places a range lock on the data set, preventing other users from updating or inserting rows into the data set until\n the transaction is complete. This is the most restrictive of the four isolation levels. Because concurrency is\n lower, use this option only when necessary.\n"
shared object serializable extends TransactionIsolation("SERIALIZABLE") {}
" For engines that support it, none isolation means that each statement would essentially be its own transaction.\n"
shared object none extends TransactionIsolation("NONE") {}

shared object transactionIsolation {

  shared String toString(TransactionIsolation val) {
      switch (val)
      case(read_uncommitted) { return "READ_UNCOMMITTED"; }
      case(read_committed) { return "READ_COMMITTED"; }
      case(repeatable_read) { return "REPEATABLE_READ"; }
      case(serializable) { return "SERIALIZABLE"; }
      case(none) { return "NONE"; }
  }

  shared TransactionIsolation fromString(String val) {
      switch (val)
      case("READ_UNCOMMITTED") { return read_uncommitted; }
      case("READ_COMMITTED") { return read_committed; }
      case("REPEATABLE_READ") { return repeatable_read; }
      case("SERIALIZABLE") { return serializable; }
      case("NONE") { return none; }
      else {
        throw Exception("Invalid TransactionIsolation value ``val``");
      }
  }

  shared object toJava extends Converter<TransactionIsolation, TransactionIsolation_>() {
    shared actual TransactionIsolation_ convert(TransactionIsolation src) {
      switch (src)
      case(read_uncommitted) { return TransactionIsolation_.\iREAD_UNCOMMITTED; }
      case(read_committed) { return TransactionIsolation_.\iREAD_COMMITTED; }
      case(repeatable_read) { return TransactionIsolation_.\iREPEATABLE_READ; }
      case(serializable) { return TransactionIsolation_.\iSERIALIZABLE; }
      case(none) { return TransactionIsolation_.\iNONE; }
    }
  }

  shared object toCeylon extends Converter<TransactionIsolation_, TransactionIsolation>() {
    shared actual TransactionIsolation convert(TransactionIsolation_ src) {
      if (src == TransactionIsolation_.\iREAD_UNCOMMITTED) {
        return read_uncommitted;
      }
      if (src == TransactionIsolation_.\iREAD_COMMITTED) {
        return read_committed;
      }
      if (src == TransactionIsolation_.\iREPEATABLE_READ) {
        return repeatable_read;
      }
      if (src == TransactionIsolation_.\iSERIALIZABLE) {
        return serializable;
      }
      if (src == TransactionIsolation_.\iNONE) {
        return none;
      }
      throw Exception("Invalid enum value");
    }
  }
}
