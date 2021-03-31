rm -r target
rm -r bin
mkdir -p target/classes
mkdir -p bin

javac -cp "./target/classes:lib/junit-4.12.jar:lib/hamcrest-core-1.3.jar:lib/soot-4.2.1-jar-with-dependencies.jar" -d ./target/classes ./src/main/java/comp5111/assignment/Assignment2.java ./src/main/java/comp5111/assignment/CoverageChecker.java ./src/main/java/comp5111/assignment/CoverageStats.java ./src/main/java/comp5111/assignment/GenericCoverageTransformer.java

javac -d ./bin ./src/main/java/comp5111/assignment/CoverageChecker.java ./src/main/java/comp5111/assignment/cut/ToolBox.java

