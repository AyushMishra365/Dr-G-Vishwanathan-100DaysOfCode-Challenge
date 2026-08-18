<div align="center">

**# 3471. Find the Largest Almost Missing Integer**

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

**## Problem Statement**

You are given an integer array `nums` and an integer `k`.

An integer `x` is **almost missing** from `nums` if `x` appears in exactly one subarray of size `k` within `nums`.

Return the **largest almost missing integer** from `nums`.

If no such integer exists, return `-1`.

A **subarray** is a contiguous sequence of elements within an array.

---

**## My Approach**

**### Idea**

- First, handle the special case where `k` is equal to the length of the array. In this case, there is only one subarray, so the largest element is the answer.
- When `k == 1`, every element forms its own subarray. I count the occurrences of each element and add the elements that appear exactly once to the list of candidates.
- For other values of `k`, I identify possible candidates based on their positions and check whether they occur in exactly one subarray of size `k`.
- Finally, I select the largest valid candidate.
- If no valid candidate exists, return `-1`.

---

**## Complexity Analysis**

```text
Time Complexity : O(n²)
Space Complexity : O(n)