vertx-lang-ceylon
========

## CI

[![Build Status](https://travis-ci.org/vert-x3/vertx-lang-ceylon.svg?branch=master)](https://travis-ci.org/vert-x3/vertx-lang-ceylon)

## Documentation

- [Vert.x Core](https://vertx.ci.cloudbees.com/view/vert.x-3/job/vert.x3-stack/ws/stack-docs/target/html/vertx-core/ceylon/index.html)
- [Vert.x Auth Common](https://vertx.ci.cloudbees.com/view/vert.x-3/job/vert.x3-stack/ws/stack-docs/target/html/vertx-auth-common/ceylon/index.html)
- [Vert.x Auth JDBC](https://vertx.ci.cloudbees.com/view/vert.x-3/job/vert.x3-stack/ws/stack-docs/target/html/vertx-auth-jdbc/ceylon/index.html)
- [Vert.x Auth JWT](https://vertx.ci.cloudbees.com/view/vert.x-3/job/vert.x3-stack/ws/stack-docs/target/html/vertx-auth-jwt/ceylon/index.html)
- [Vert.x Auth OAuth2](https://vertx.ci.cloudbees.com/view/vert.x-3/job/vert.x3-stack/ws/stack-docs/target/html/vertx-auth-oauth2/ceylon/index.html)
- [Vert.x Auth Shiro](https://vertx.ci.cloudbees.com/view/vert.x-3/job/vert.x3-stack/ws/stack-docs/target/html/vertx-auth-shiro/ceylon/index.html)
- [Vert.x SQL Common](https://vertx.ci.cloudbees.com/view/vert.x-3/job/vert.x3-stack/ws/stack-docs/target/html/vertx-sql-common/ceylon/index.html)
- [Vert.x JDBC Client](https://vertx.ci.cloudbees.com/view/vert.x-3/job/vert.x3-stack/ws/stack-docs/target/html/vertx-jdbc-client/ceylon/index.html)
- [Vert.x Web](https://vertx.ci.cloudbees.com/view/vert.x-3/job/vert.x3-stack/ws/stack-docs/target/html/vertx-web/ceylon/index.html)

## Examples

Examples for [Vert.x / Ceylon](https://github.com/vert-x3/vertx-examples/blob/master/ceylon/README.adoc)

## Open issues

- DeliveryOptions headers not available
- make data object member variable
- generated doc does not support overloading : it shows a single method and sometimes the return type can be _unknown_
- link to other modules
- Promise support

## todo list

- generate data object converter in java to have @GenIgnore
- don't share the underlying vertx module
- consider using ceylon.promise for Handler<AsyncResult<T>> ending methods

## Deploy on Herd

    mvn -Dceylon.username=FroMage -Dceylon.password=XXX \
     -Dceylon.out=https://modules.ceylon-lang.org/uploads/YYY/repo/ \
     -pl vertx-lang-ceylon,vertx-lang-ceylon-stack \
     org.ceylon-lang:ceylon-maven-plugin:copy@publish-herd
