mkdir -p bin
mkdir -p target/test-classes

javac -cp "./lib/junit-4.12.jar:./lib/evosuite-standalone-runtime-1.1.0.jar:bin" -d ./target/test-classes/ ./src/test/fault-revealing-evosuite0/comp5111/assignment/cut/ToolBox_FaultRevealing0_ESTest.java ./src/test/fault-revealing-evosuite0/comp5111/assignment/cut/ToolBox_FaultRevealing0_ESTest_scaffolding.java

java -classpath "./target/classes:./lib/evosuite-standalone-runtime-1.1.0.jar:./lib/junit-4.12.jar:./lib/hamcrest-core-1.3.jar:./lib/soot-4.2.1-jar-with-dependencies.jar" comp5111.assignment.Assignment2 comp5111.assignment.cut.ToolBox_FaultRevealing0_ESTest comp5111.assignment.cut.ToolBox comp5111.assignment.cut.ToolBox\$ArrayTools comp5111.assignment.cut.ToolBox\$CharSequenceTools comp5111.assignment.cut.ToolBox\$CharTools comp5111.assignment.cut.ToolBox\$LocaleTools comp5111.assignment.cut.ToolBox\$RegExTools comp5111.assignment.cut.ToolBox\$StringTools

