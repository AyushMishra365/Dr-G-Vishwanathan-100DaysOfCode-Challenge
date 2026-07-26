<div align="center">

# 628. Maximum Product of Three Numbers

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Topic](https://img.shields.io/badge/Topic-Sorting-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given an integer array `nums`, return the maximum product that can be obtained using any three numbers.

---

## My Approach

### Idea

- Sort the array in ascending order.
- There are only two possible candidates for the maximum product:
  - Product of the three largest numbers.
  - Product of the two smallest numbers (negative values) and the largest number.
- Return the larger of the two.

---

## Complexity Analysis

```text
Time Complexity : O(n log n)

Space Complexity: O(1)
```

---

## Concepts Learned

- Sorting
- Greedy Observation
- Handling Negative Numbers

---

## Performance

```text
Verdict : Accepted

Runtime : 15 ms

Beats : 80.39%

Memory : 48.14 MB

Beats : 41.98%
```

---

## Notes

Negative numbers can produce a larger positive product when multiplied together, so checking only the three largest elements is not sufficient.