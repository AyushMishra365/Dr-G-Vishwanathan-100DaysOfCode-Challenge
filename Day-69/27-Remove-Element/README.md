<div align="center">

# 27. Remove Element

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given an integer array `nums` and an integer `val`, remove all occurrences of `val` in `nums` **in-place**.

The order of the remaining elements may be changed.

Return the number of elements in `nums` which are not equal to `val`.

---

## My Approach

I used an index variable to keep track of the position where the next element that is not equal to `val` should be placed.

- Traverse the entire array.
- If `nums[i]` is not equal to `val`, place it at `nums[index]`.
- Increment `index`.
- At the end, `index` represents the number of elements that are not equal to `val`.

The remaining elements after `index` are irrelevant according to the problem statement.

---

## Example

```text
Input:
nums = [3,2,2,3]
val = 3

Output:
2

Modified array:
[2,2,_,_]