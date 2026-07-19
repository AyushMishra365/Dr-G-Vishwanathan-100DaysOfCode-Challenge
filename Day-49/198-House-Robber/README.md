<div align="center">

# 198. House Robber

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Topic](https://img.shields.io/badge/Topic-Dynamic%20Programming-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

You are a professional robber planning to rob houses along a street. Adjacent houses cannot be robbed on the same night.

Given an integer array `nums`, return the maximum amount of money you can rob without alerting the police.

---

## My Approach

### Idea

- Use Dynamic Programming.
- Let `dp[i]` represent the maximum money that can be robbed from the first `i + 1` houses.
- For every house, either:
  - Skip it and keep the previous maximum.
  - Rob it and add its value to `dp[i-2]`.
- Store the maximum of these two choices.

---

## Complexity Analysis

```text
Time Complexity : O(n)

Space Complexity: O(n)
```

---

## Concepts Learned

- Dynamic Programming
- Arrays
- State Transition

---

## Performance

```text
Verdict : Accepted

Runtime : 0 ms

Beats : 100.00%

Memory : 42.63 MB

Beats : 75.22%
```

---

## Notes

This is one of the classic Dynamic Programming problems where each decision depends on the best solution to previous subproblems.