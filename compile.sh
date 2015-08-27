find src/main/ceylon -name *.ceylon | xargs ceylon compile --suppress-warning --javac=-target=8 --source=src/main/ceylon
find src/main/ceylon -name *.java | xargs ceylon compile --suppress-warning --javac=-target=8 --source=src/main/ceylon
