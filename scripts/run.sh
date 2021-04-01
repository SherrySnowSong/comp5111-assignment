CLASSES="comp5111.assignment.cut.ToolBox comp5111.assignment.cut.ToolBox\\\$ArrayTools comp5111.assignment.cut.ToolBox\\\$CharSequenceTools comp5111.assignment.cut.ToolBox\\\$CharTools comp5111.assignment.cut.ToolBox\\\$LocaleTools comp5111.assignment.cut.ToolBox\\\$RegExTools comp5111.assignment.cut.ToolBox\\\$StringTools"

BUILD_CMD="javac -cp \"./lib/junit-4.12.jar:./lib/evosuite-standalone-runtime-1.1.0.jar:bin\" -d ./target/test-classes/"
RUN_CMD="java -classpath \"./target/classes:./lib/evosuite-standalone-runtime-1.1.0.jar:./lib/junit-4.12.jar:./lib/hamcrest-core-1.3.jar:./lib/soot-4.2.1-jar-with-dependencies.jar\" comp5111.assignment.Assignment2"

function get_report() {
    rm -r target/test-classes
    rm -r sootOutput
    mkdir -p target/test-classes
    eval $BUILD_CMD $1/comp5111/assignment/cut/$3.java $1/comp5111/assignment/cut/$4.java
    eval $RUN_CMD $1/spectrum_fl_jaccard_$2.csv Jaccard comp5111.assignment.cut.$3 $CLASSES
    eval $RUN_CMD $1/spectrum_fl_tarantula_$2.csv Tarantula comp5111.assignment.cut.$3 $CLASSES
    eval $RUN_CMD $1/spectrum_fl_ample_$2.csv AMPLE comp5111.assignment.cut.$3 $CLASSES
    eval $RUN_CMD $1/spectrum_fl_ochiai_$2.csv Ochiai comp5111.assignment.cut.$3 $CLASSES
}

get_report ./src/test/fault-revealing-evosuite0 evosuite0 ToolBox_FaultRevealing0_ESTest ToolBox_FaultRevealing0_ESTest_scaffolding
get_report ./src/test/fault-revealing-evosuite1 evosuite1 ToolBox_FaultRevealing1_ESTest ToolBox_FaultRevealing1_ESTest_scaffolding
get_report ./src/test/fault-revealing-evosuite2 evosuite2 ToolBox_FaultRevealing2_ESTest ToolBox_FaultRevealing2_ESTest_scaffolding

get_report ./src/test/fault-revealing-randoop0 randoop0 Regression_15_Test Regression_15_Test0
get_report ./src/test/fault-revealing-randoop1 randoop1 Regression_4_Test Regression_4_Test0
get_report ./src/test/fault-revealing-randoop2 randoop2 Regression_1_Test Regression_1_Test0

get_report ./src/test/refined-evosuite0 refined_evosuite0 ToolBox_FaultRevealing0_ESTest ToolBox_FaultRevealing0_ESTest_scaffolding
get_report ./src/test/refined-evosuite1 refined_evosuite1 ToolBox_FaultRevealing1_ESTest ToolBox_FaultRevealing1_ESTest_scaffolding
get_report ./src/test/refined-evosuite2 refined_evosuite2 ToolBox_FaultRevealing2_ESTest ToolBox_FaultRevealing2_ESTest_scaffolding

get_report ./src/test/refined-randoop0 refined_randoop0 Regression_15_Test Regression_15_Test0
get_report ./src/test/refined-randoop1 refined_randoop1 Regression_4_Test Regression_4_Test0
get_report ./src/test/refined-randoop2 refined_randoop2 Regression_1_Test Regression_1_Test0


