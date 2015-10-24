vertx-lang-ceylon
========

## todo list

- consider converting enum members to lower cases to be more ceylonic
- consider using ceylon.promise for Handler<AsyncResult<T>> ending methods
- verticle factory
- documentation generation

## Build

### Import the Vert.x dependencies in the `modules` Ceylon repository

```
sh import-vertx.sh
```

NOTE: you need to have these jars in your maven repository because Ceylon _import-jar_ needs a jar file.

### Generate the Ceylon/Java sources

```
mvn clean test-compile
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
