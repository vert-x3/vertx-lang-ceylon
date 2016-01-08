import ceylon.test {
  ...
}

import ceylon.test.engine {
  DefaultLoggingListener
}

shared void run() {
  value runner = createTestRunner([`module io.vertx.tests`], [DefaultLoggingListener()]);
  value result = runner.run();
  print(result);
}