#!/usr/bin/env bash
randoop="$@"

mkdir -p bin
mkdir -p target/test-classes

javac -cp "./lib/junit-4.12.jar:bin" -d ./target/test-classes/ ./src/test/$randoop/comp5111/assignment/cut/RegressionTest*.java

java -classpath "./target/classes:./lib/junit-4.12.jar:./lib/hamcrest-core-1.3.jar:./lib/soot-4.2.1-jar-with-dependencies.jar" comp5111.assignment.Assignment1 0 comp5111.assignment.cut.ToolBox comp5111.assignment.cut.ToolBox\$ArrayTools comp5111.assignment.cut.ToolBox\$CharSequenceTools comp5111.assignment.cut.ToolBox\$CharTools comp5111.assignment.cut.ToolBox\$LocaleTools comp5111.assignment.cut.ToolBox\$RegExTools comp5111.assignment.cut.ToolBox\$StringTools

mv report.json reports/$randoop-inst.json

java -classpath "./target/classes:./lib/junit-4.12.jar:./lib/hamcrest-core-1.3.jar:./lib/soot-4.2.1-jar-with-dependencies.jar" comp5111.assignment.Assignment1 1 comp5111.assignment.cut.ToolBox comp5111.assignment.cut.ToolBox\$ArrayTools comp5111.assignment.cut.ToolBox\$CharSequenceTools comp5111.assignment.cut.ToolBox\$CharTools comp5111.assignment.cut.ToolBox\$LocaleTools comp5111.assignment.cut.ToolBox\$RegExTools comp5111.assignment.cut.ToolBox\$StringTools

mv report.json reports/$randoop-branch.json

java -classpath "./target/classes:./lib/junit-4.12.jar:./lib/hamcrest-core-1.3.jar:./lib/soot-4.2.1-jar-with-dependencies.jar" comp5111.assignment.Assignment1 2 comp5111.assignment.cut.ToolBox comp5111.assignment.cut.ToolBox\$ArrayTools comp5111.assignment.cut.ToolBox\$CharSequenceTools comp5111.assignment.cut.ToolBox\$CharTools comp5111.assignment.cut.ToolBox\$LocaleTools comp5111.assignment.cut.ToolBox\$RegExTools comp5111.assignment.cut.ToolBox\$StringTools

mv report.json reports/$randoop-line.json

