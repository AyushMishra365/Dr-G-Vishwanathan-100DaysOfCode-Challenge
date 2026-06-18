<div align="center">

# 160A. Twins

![Platform](https://img.shields.io/badge/Platform-Codeforces-blue)
![Difficulty](https://img.shields.io/badge/Difficulty-900-success)
![Topic](https://img.shields.io/badge/Topic-Greedy-purple)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given a collection of coins, determine the minimum number of coins needed such that the chosen coins have a total value strictly greater than the sum of the remaining coins.

---

## My Approach

### Key Observation

To maximize the sum quickly while minimizing the number of coins:

- Sort the coins.
- Pick the largest coins first.
- Stop as soon as your collected sum becomes greater than the remaining sum.

This greedy strategy guarantees the minimum number of coins.

---

## Complexity Analysis

```text
Time Complexity : O(n log n)

Space Complexity: O(1)
```

---

## Concepts Learned

- Greedy
- Sorting
- Arrays

---

## Problem Link

https://codeforces.com/problemset/problem/160/A