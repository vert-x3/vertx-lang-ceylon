import ceylon.test {
  ...
}

import ceylon.test.core {
  DefaultLoggingListener
}

shared void run() {
  value runner = createTestRunner([`module io.vertx.tests`], [DefaultLoggingListener()]);
  value result = runner.run();
  print(result);
}