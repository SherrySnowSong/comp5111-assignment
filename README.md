# COMP5111 (Spring 2021) Assignment 2

Note that Bonus is also implemented.

## Task 1 Command
I used the newer version of evosuite for slightly better coverage.
```
java -jar ./lib/evosuite-1.0.6.jar -class comp5111.assignment.cut.ToolBox -base_dir ./src/test/evosuite0 -Dsearch_budget=3600 -Dnum_random_tests=50 -Dnum_tests=5 -Dmax_size=1000 -Dstring_length=50 -criterion branch -projectCP $(pwd)/target/classes
```

Note that the classpath for the generated test should be `./src/test/evosuite[0-4]/evosuite-tests`.

## Task 2
```sh
./scripts/compile.sh && ./scripts/run.sh
```
And it should run automatically.

Note that Java 8 should be used.
The code supports higher version, but some tests that set Regex flag would fail.

The code simply uses the line coverage in assignment 1, add the coverage to a
counter for each line after every test execution depending on the result.  When
all the tests finished, it would invoke the suspicious score function to
calculate the suspicious score for every statement, and dump the result CSV.

## Task 3

We consider the family of inputs that have different output when the faults are
present and when they are fixed.  Then, we just use those inputs as test cases,
trigger all 3 faults within 1 test case to reduce the number of additional test
cases, and try to add test cases until all rankings improved.

1 additional test case is added to each of the evosuite generated test suite,
2~4 additional test cases are added to the randoop generated test suites for
improving the ranking for each fault. In total, we added 12 test cases.
(`[1, 1, 1, 3, 2, 4]`)

The fault reports are in `./faults/`.

The shell script for retrieving rankings is in `scripts/rankings.sh`.
This should be run after running `scripts/compile.sh` and `scripts/run.sh`.
```bash
#!/usr/bin/env bash

function get_ranking() {
    grep -r -F "$1" --include="*ochiai*.csv" . | sort | grep -o '[0-9]\+$' | head -n 6 | awk '{ printf "%d, ", $0; sum += $0 } BEGIN { printf "Before refinement: ["} END { printf "\b\b], "; print "Average: " sum / NR }'
    grep -r -F "$1" --include="*ochiai*.csv" . | sort | grep -o '[0-9]\+$' | tail -n 6 | awk '{ printf "%d, ", $0; sum += $0 } BEGIN { printf "After refinement: ["} END { printf "\b\b], "; print "Average: " sum / NR }'
}

LINE="if (i < csLast && j < searchLast || Character.isHighSurrogate(ch)) {"
echo code: \#1428, $LINE
get_ranking "$LINE"
echo
LINE="for (int arrayPos = 1; arrayPos < arrayLen; arrayPos++) {"
echo code: \#1602, $LINE
get_ranking "$LINE"
echo
echo code: \#1824, $LINE
LINE="final int start = chars[0] == '-' || chars[0] == '+' ? 1 : 1;"
get_ranking "$LINE"
```

Result:
```
code: #1428, if (i < csLast && j < searchLast || Character.isHighSurrogate(ch)) {
Before refinement: [10, 13, 5, 28, 32, 27], Average: 19.1667
After refinement: [8, 10, 2, 27, 31, 26], Average: 17.3333

code: #1602, for (int arrayPos = 1; arrayPos < arrayLen; arrayPos++) {
Before refinement: [6, 7, 15, 6, 7, 5], Average: 7.66667
After refinement: [4, 4, 11, 3, 3, 3], Average: 4.66667

code: #1824, final int start = chars[0] == '-' || chars[0] == '+' ? 1 : 1;
Before refinement: [39, 45, 31, 147, 141, 156], Average: 93.1667
After refinement: [39, 41, 26, 50, 50, 48], Average: 42.3333
```

> Note that for fault 1602, another fix at line 1570 is possible:
> ```diff
> -            final int arrayLen = css.length - 1;
> +            final int arrayLen = css.length;
> ```
> But the suspicious score of that is lower.

