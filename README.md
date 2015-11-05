vertx-lang-ceylon
========

## todo list

- generate data object converter in java to have @GenIgnore
- don't share the underlying vertx module
- fix reified generic problem (Message<String> reply)
- consider converting enum members to lower cases to be more ceylonic
- consider using ceylon.promise for Handler<AsyncResult<T>> ending methods
- verticle factory
- documentation generation

## CI

  [![Build Status](https://vertx.ci.cloudbees.com/buildStatus/icon?job=vert.x3-lang-ceylon)](https://vertx.ci.cloudbees.com/view/vert.x-3/job/vert.x3-lang-ceylon/)

## Build

### Generate the Ceylon/Java sources and copy the jar dependencies in target/jars

```
mvn clean test-compile
```

### Import the jar dependencies in the `modules` Ceylon repository

```
sh import-vertx.sh
```

### Compile the sources

```
sh compile.sh
```

and if you want to run the test suite

```
sh test-compile.sh
```

and if you want to run the examples

```
sh examples-compile.sh
```

### Running the test suite

```
ceylon test io.vertx.tests
```

### Running examples

#### Http server example

```
ceylon run examples.http.server
```

#### Clustered event bus

```
ceylon run examples.eventbus.sender
```

and

```
ceylon run examples.eventbus.receiver
```
