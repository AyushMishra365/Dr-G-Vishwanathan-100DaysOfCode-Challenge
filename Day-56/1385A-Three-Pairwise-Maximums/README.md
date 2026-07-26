<div align="center">

# 1385A. Three Pairwise Maximums

![Platform](https://img.shields.io/badge/Platform-Codeforces-blue)
![Difficulty](https://img.shields.io/badge/Difficulty-1100-orange)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given three integers representing the pairwise maximums of three unknown positive integers, determine whether such integers exist. If they do, construct one valid triplet.

---

## My Approach

### Idea

- Sort the three given values.
- If the two largest values are different, no valid construction is possible.
- Otherwise:
  - Print **YES**.
  - Construct the answer as:
    - smallest value
    - smallest value
    - largest value

This satisfies all required pairwise maximum conditions.

---

## Complexity Analysis

```text
Time Complexity : O(1)

Space Complexity: O(1)
```

---

## Concepts Learned

- Constructive Algorithms
- Sorting
- Case Analysis

---

## Notes

The key observation is that the largest value must appear at least twice among the pairwise maximums. Otherwise, no valid triplet can exist.