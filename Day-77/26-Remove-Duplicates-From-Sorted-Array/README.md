<div align="center">

**# 26. Remove Duplicates from Sorted Array**

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

**## Problem Statement**

Given an integer array `nums` sorted in non-decreasing order, remove the duplicates **in-place** such that each unique element appears only once.

The relative order of the elements should be kept the same.

Return the number of unique elements `k`.

The first `k` elements of `nums` should contain the unique elements in sorted order.

---

**## My Approach**

**### Idea**

- Use two pointers to modify the array in-place.
- Keep one pointer `i` at the position where the next unique element should be placed.
- Traverse the array using pointer `j`.
- If `nums[j]` is different from the previous unique element, place it at `nums[i]` and increment `i`.
- After traversing the entire array, `i` represents the number of unique elements.
- Return `i`.

---

**## Complexity Analysis**

```text
Time Complexity : O(n)