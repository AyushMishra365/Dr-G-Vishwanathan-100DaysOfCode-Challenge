<div align="center">

# 1822. Sign of the Product of an Array

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Topic](https://img.shields.io/badge/Topic-Array-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given an integer array `nums`, return the sign of the product of all its elements.

- Return `1` if the product is positive.
- Return `-1` if the product is negative.
- Return `0` if the product is zero.

---

## My Approach

### Idea

The actual product is unnecessary.

- If any element is `0`, the answer is immediately `0`.
- Otherwise, count how many negative numbers are present.
- An even number of negatives gives a positive product, while an odd number gives a negative product.

### Steps

1. Traverse the array.
2. Return `0` if a zero is encountered.
3. Count negative numbers.
4. Return `1` if the count is even; otherwise return `-1`.

---

## Complexity Analysis

```text
Time Complexity : O(n)

Space Complexity: O(1)
```

---

## Concepts Learned

- Array Traversal
- Counting Technique
- Mathematical Observation

---

## Performance

```text
Verdict : Accepted

Runtime : 0 ms

Beats : 100.00%

Memory : 45.26 MB

Beats : 56.72%
```

---

## Notes

This problem demonstrates that understanding the properties of multiplication is often more useful than computing the product itself, leading to a simple and efficient solution.