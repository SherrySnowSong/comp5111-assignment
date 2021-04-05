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

We consider the family of inputs that have different output
when the faults are present and when they are fixed.
Then, we just use those inputs as test cases, increase them
until the ranking of the faulty statements are relatively
high.

The fault reports are in `./faults/`.

### Fault 1428
Code:
```java
if (i < csLast && j < searchLast || Character.isHighSurrogate(ch)) {
```

Ranking before adding manual tests: `[10, 13, 5, 28, 32, 27]`, average: 19.2

Ranking after adding manual tests: `[5, 5, 2, 20, 5, 6]`, average: 7.2

### Fault 1602
> Note that another fix at line 1570 is possible:
> ```diff
> -            final int arrayLen = css.length - 1;
> +            final int arrayLen = css.length;
> ```
> But the suspicious score of that is lower.

Code:
```java
for (int arrayPos = 1; arrayPos < arrayLen; arrayPos++) {
```

Ranking before adding manual tests: `[6, 7, 15, 6, 7, 5]`, average: 7.7

Ranking after adding manual tests: `[5, 5, 9, 15, 17, 6]`, average: 9.5

The ranking is slightly increased as we optimized other statements' ranking a
lot, and it is difficult to keep the suspicious score for every statements

### Fault 1824
Code:
```java
final int start = chars[0] == '-' || chars[0] == '+' ? 1 : 1;
```

Ranking before adding manual tests: `[39, 45, 31, 147, 141, 156]`, average: 93.2

Ranking after adding manual tests: `[14, 14, 22, 7, 6, 16]`, average: 13.2


