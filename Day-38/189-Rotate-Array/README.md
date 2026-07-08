<div align="center">

# 189. Rotate Array

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Topic](https://img.shields.io/badge/Topic-Arrays-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given an integer array `nums`, rotate the array to the right by `k` steps.

---

## My Approach

### Idea

Instead of shifting the array one step at a time, use the reversal technique. Reverse the entire array first, then reverse the first `k` elements, and finally reverse the remaining elements. This rotates the array in-place with constant extra space.

### Steps

1. Compute `k %= n` to handle large values of `k`.
2. Reverse the entire array.
3. Reverse the first `k` elements.
4. Reverse the remaining `n - k` elements.
5. The array is now rotated to the right.

---

## Complexity Analysis

```text
Time Complexity : O(n)

Space Complexity: O(1)
```

---

## Concepts Learned

- Array Manipulation
- Reversal Technique
- Two Pointers
- In-place Algorithms

---

## Performance

```text
Verdict : Accepted

Runtime : 0 ms

Beats : 100.00%

Memory : 61.43 MB

Beats : 29.49%
```

---

## Notes

The reversal algorithm is one of the standard optimal solutions for array rotation. It avoids using an extra array while still completing the rotation in linear time, making it a common interview technique for array-based problems.