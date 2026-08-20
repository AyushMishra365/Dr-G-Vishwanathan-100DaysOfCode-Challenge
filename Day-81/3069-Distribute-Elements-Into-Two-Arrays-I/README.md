<div align="center">

**# 3069. Distribute Elements Into Two Arrays I**

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

**## Problem Statement**

You are given a 1-indexed array of distinct integers `nums`.

You need to distribute all the elements of `nums` between two arrays `arr1` and `arr2` using the given rules.

In the first operation, append `nums[1]` to `arr1`.

In the second operation, append `nums[2]` to `arr2`.

Afterwards, for every remaining element:

- If the last element of `arr1` is greater than the last element of `arr2`, append the current element to `arr1`.
- Otherwise, append the current element to `arr2`.

The final `result` array is formed by concatenating `arr1` and `arr2`.

Return the array `result`.

---

**## My Approach**

**### Idea**

- Create two `ArrayList<Integer>` objects to store `arr1` and `arr2`.
- Add the first element of `nums` to `arr1` and the second element to `arr2`.
- Traverse the remaining elements of the array.
- Get the last element of both lists using `get(size - 1)`.
- Compare the last elements of both arrays.
- If the last element of `arr1` is greater, add the current element to `arr1`.
- Otherwise, add it to `arr2`.
- Finally, traverse both lists and store their elements in the result array.

---

**## Complexity Analysis**

```text
Time Complexity : O(n)
Space Complexity : O(n)