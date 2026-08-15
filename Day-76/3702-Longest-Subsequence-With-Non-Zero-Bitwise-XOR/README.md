<div align="center">

**# 3702. Longest Subsequence With Non-Zero Bitwise XOR**

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

**## Problem Statement**

You are given an integer array `nums`.

Return the length of the **longest subsequence** in `nums` whose bitwise XOR is **non-zero**.

If no such subsequence exists, return `0`.

---

**## My Approach**

**### Idea**

- Calculate the bitwise XOR of all elements in the array.
- If the XOR is non-zero, the entire array can be used as the longest subsequence, so return `nums.length`.
- If the XOR is zero:
  - Check whether the array contains any non-zero element.
  - If a non-zero element exists, removing that element makes the XOR non-zero, so return `nums.length - 1`.
  - If all elements are zero, no subsequence with non-zero XOR exists, so return `0`.

---

**## Complexity Analysis**

```text
Time Complexity : O(n)