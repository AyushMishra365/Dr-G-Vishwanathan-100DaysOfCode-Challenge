<div align="center">

# 88. Merge Sorted Array

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Topic](https://img.shields.io/badge/Topic-Arrays-blue)

</div>

---

## Problem Statement

You are given two integer arrays `nums1` and `nums2`, sorted in non-decreasing order, and two integers `m` and `n`, representing the number of elements in `nums1` and `nums2` respectively.

Merge `nums1` and `nums2` into a single array sorted in non-decreasing order.

The final sorted array should not be returned by the function, but instead be stored inside the array `nums1`.

---

## Example 1

### Input

```text
nums1 = [1,2,3,0,0,0]
m = 3

nums2 = [2,5,6]
n = 3
```

### Output

```text
[1,2,2,3,5,6]
```

### Explanation

```text
The arrays we are merging are [1,2,3] and [2,5,6].
The result of the merge is [1,2,2,3,5,6].
```

---

## Example 2

### Input

```text
nums1 = [1]
m = 1

nums2 = []
n = 0
```

### Output

```text
[1]
```

---

## Constraints

```text
nums1.length == m + n
nums2.length == n

0 <= m, n <= 200

-10⁹ <= nums1[i], nums2[i] <= 10⁹
```

---

## Problem Link

https://leetcode.com/problems/merge-sorted-array/

