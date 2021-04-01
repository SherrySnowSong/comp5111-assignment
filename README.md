# COMP5111 (Spring 2021) Assignment 2

Note that Bonus is also implemented.

## Running the code
```sh
./scripts/compile.sh && ./scripts/run.sh
```
And it should run automatically.

Note that Java 8 should be used.
The code supports higher version, but some tests that set Regex flag would fail.

## Task 1 Command
I used the newer version of evosuite for slightly better coverage.
```
java -jar ./lib/evosuite-1.0.6.jar -class comp5111.assignment.cut.ToolBox -base_dir ./src/test/evosuite0 -Dsearch_budget=1200 -Dmax_size=1000 -Dstring_length=50 -criterion branch -projectCP $(pwd)/target/classes
```

## Task 3 Strategy
We consider the family of inputs that have different output
when the faults are present and when they are fixed.
Then, we just use those inputs as test cases, increase them
until the ranking of the faulty statements are relatively
high.

### Fault 1428
Code:
```java
if (i < csLast && j < searchLast || Character.isHighSurrogate(ch)) {
```

Ranking before adding manual tests: `[10, 13, 5, 28, 32, 27]`, average: 19.2

Ranking after adding manual tests: `[5, 5, 2, 20, 5, 6]`, average: 7.2

### Fault 1602
Code:
```java
for (int arrayPos = 1; arrayPos < arrayLen; arrayPos++) {
```

Ranking before adding manual tests: `[6, 7, 15, 6, 7, 5]`, average: 7.7

Ranking after adding manual tests: `[5, 5, 9, 15, 17, 6]`, average: 9.5

### Fault 1824
Code:
```java
final int start = chars[0] == '-' || chars[0] == '+' ? 1 : 1;
```

Ranking before adding manual tests: `[39, 45, 31, 147, 141, 156]`, average: 93.2

Ranking after adding manual tests: `[14, 14, 22, 7, 6, 16]`, average: 13.2


