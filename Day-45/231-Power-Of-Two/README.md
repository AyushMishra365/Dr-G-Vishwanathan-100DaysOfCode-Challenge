<div align="center">

# 231. Power of Two

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-success)
![Topic](https://img.shields.io/badge/Topic-Bit%20Manipulation-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given an integer `n`, determine whether it is a power of two.

Return `true` if there exists an integer `x` such that:

n = 2^x

Otherwise, return `false`.

---

## My Approach

### Idea

A power of two has exactly one bit set in its binary representation.

Using the expression:

`n & (n - 1)`

removes the lowest set bit.

- If the result becomes `0`, there was only one set bit.
- Also ensure `n > 0`.

---

## Complexity Analysis

```text
Time Complexity : O(1)

Space Complexity: O(1)
```

---

## Concepts Learned

- Bit Manipulation
- Binary Representation
- Number Properties

---

## Performance

```text
Verdict : Accepted

Runtime : 0 ms

Beats : 100.00%

Memory : 42.32 MB

Beats : 87.31%
```

---

## Notes

This is one of the most common bit manipulation tricks and is frequently used in competitive programming and interviews.