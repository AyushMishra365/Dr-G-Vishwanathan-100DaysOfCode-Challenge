<div align="center">

# 202. Happy Number

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-success)
![Topic](https://img.shields.io/badge/Topic-Math%20%26%20Simulation-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

A **happy number** is defined by repeatedly replacing a number with the sum of the squares of its digits.

- If the process eventually reaches **1**, the number is happy.
- If the process enters a cycle that never reaches **1**, the number is not happy.

Return `true` if the given number is happy, otherwise return `false`.

---

## My Approach

### Idea

First reduce large numbers by repeatedly computing the square-digit sum until the value becomes at most **810** (the largest possible square-digit sum for a 32-bit integer).

Then use a boolean array to record every visited value.

- If the sequence reaches **1**, return `true`.
- If a value appears again, a cycle has been detected, so return `false`.

### Steps

1. Reduce the number until it becomes ≤ 810.
2. Create a boolean array to mark visited values.
3. Keep generating the next square-digit sum.
4. If a value repeats, return `false`.
5. If the value becomes `1`, return `true`.

---

## Complexity Analysis

```text
Time Complexity : O(log n)

Space Complexity: O(1)
```

Only a fixed number of states (0–810) are ever stored, so the auxiliary space remains constant.

---

## Concepts Learned

- Mathematics
- Digit Manipulation
- Simulation
- Cycle Detection

---

## Performance

```text
Verdict : Accepted

Runtime : 1 ms

Beats : 78.24%

Memory : 42.62 MB

Beats : 21.79%
```

---

## Notes

Instead of using a HashSet, this solution leverages the mathematical fact that every number eventually reduces to at most **810**. This allows cycle detection with a simple boolean array, making the implementation both fast and memory-efficient.