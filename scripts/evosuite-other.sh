java -jar ./lib/evosuite-1.0.6.jar -class comp5111.assignment.cut.ToolBox -base_dir ./src/test/evosuite2 -Dsearch_budget=3600 -Dnum_random_tests=50 -Dnum_tests=5 -Dmax_size=1000 -Dstring_length=50 -criterion branch -projectCP $(pwd)/target/classes
java -jar ./lib/evosuite-1.0.6.jar -class comp5111.assignment.cut.ToolBox -base_dir ./src/test/evosuite3 -Dsearch_budget=3600 -Dnum_random_tests=50 -Dnum_tests=5 -Dmax_size=1000 -Dstring_length=50 -criterion branch -projectCP $(pwd)/target/classes
java -jar ./lib/evosuite-1.0.6.jar -class comp5111.assignment.cut.ToolBox -base_dir ./src/test/evosuite4 -Dsearch_budget=3600 -Dnum_random_tests=50 -Dnum_tests=5 -Dmax_size=1000 -Dstring_length=50 -criterion branch -projectCP $(pwd)/target/classes

