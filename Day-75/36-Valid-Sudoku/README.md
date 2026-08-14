<div align="center">

**# 36. Valid Sudoku**

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

**## Problem Statement**

Determine if a `9 x 9` Sudoku board is valid.

Only the filled cells need to be validated according to the following rules:

1. Each row must contain the digits `1-9` without repetition.
2. Each column must contain the digits `1-9` without repetition.
3. Each of the nine `3 x 3` sub-boxes must contain the digits `1-9` without repetition.

---

**## My Approach**

**### Idea**

- Validate the Sudoku board using frequency arrays.
- For every row:
  - Create a frequency array of size `9`.
  - Count each filled digit.
  - If any digit appears more than once, return `false`.
- Repeat the same process for every column.
- Finally, check each `3 x 3` sub-box using the same frequency-counting approach.
- If no duplicate is found in any row, column, or sub-box, return `true`.

---

**## Complexity Analysis**

```text
Time Complexity : O(1)