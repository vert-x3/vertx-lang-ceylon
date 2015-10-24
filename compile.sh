ceylon compile --suppress-warning --javac=-target=8 --source=src/main/ceylon io.vertx.lang.ceylon
find src/main/ceylon/io/vertx/ceylon -name *.ceylon | xargs ceylon compile --suppress-warning --javac=-target=8 --source=src/main/ceylon
find src/main/ceylon/io/vertx/ceylon -name *.java | xargs ceylon compile --suppress-warning --javac=-target=8 --source=src/main/ceylon
