<div align="center">

# 53. Maximum Subarray

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Topic](https://img.shields.io/badge/Topic-Dynamic%20Programming-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given an integer array `nums`, find the contiguous subarray with the largest sum and return its sum.

---

## My Approach

### Idea

Used Kadane's Algorithm by keeping track of the maximum subarray ending at each index. At every step, either extend the previous subarray or start a new one from the current element.

### Steps

1. Initialize the current and overall maximum using the first element.
2. Traverse the array from left to right.
3. Decide whether to extend the current subarray or start fresh.
4. Update the global maximum whenever a larger sum is found.
5. Return the maximum sum.

---

## Complexity Analysis

```text
Time Complexity : O(n)

Space Complexity: O(1)
```

---

## Concepts Learned

- Dynamic Programming
- Kadane's Algorithm
- Greedy Optimization

---

## Performance

```text
Verdict : Accepted

Runtime : 1 ms

Beats : 99.96%

Memory : 77.28 MB

Beats : 48.09%
```

---

## Notes

Kadane's Algorithm is one of the classic dynamic programming techniques. Instead of checking every possible subarray, it computes the answer in a single traversal by maintaining only the current best subarray.