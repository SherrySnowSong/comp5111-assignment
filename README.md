# COMP5111 (Spring 2021) Assignment 1
## Files
- `reports/*.json`: The coverage reports for randoop0-randoop4, for instruction, branch and line coverage. The format will be explained below.
- `scripts/`: Currently only scripts for Windows is provided, but should be simple to port to Linux.
    - `compile.ps1`/`compile.sh`: script for compiling the instrumenter. Just run it by typing `./scripts/compile.ps1` on Windows.
    - `run.ps1`/`compile.sh`: script for generating coverage reports for test suites. The first argument is the test suite name, e.g. `randoop0`.
 	  Run it by typing `./scripts/run.ps1 randoop0` for example.
- `screenshots/*.png`: Screenshots for task 1.2.
- `src/` both the instrumenter code and generated test suites.

Note that `compile.sh` should be run before `run.sh`. The scripts are tested on
Linux, but not on Windows, but hopefully there should not be much problem.

## Coverage Report

For simplicity, the report is just a JSON file with the following structure:

```json
{
  "detailed": {
    "<method>": {<id>: <covered>}
  },
  "coverage": {
    "<class>": {
      "covered": <cover count>,
      "total": <total count>,
      "percentage": <percentage>
    }
  }
}
```

The `detailed` section would list the coverage of individual instructions/branches/line numbers. If `<covered>` is 1, the ID is covered, and not covered otherwise.
- For instructions, the ID corresponds to the ID-th instruction in that method, beginning at 0, excluding `JIdentityInst`.
- For branches, the ID corresponds to the `floor(ID/2)`-th `if` instruction in the method.
  Even index corresponds to the continuing branch, and odd index corresponds to the jumped branch.
- For lines, the ID is the line number of the statement.

And the `coverage` section just list the statistics for each class, including inner class. Note that if total count is 0, the percentage would be 100%.

