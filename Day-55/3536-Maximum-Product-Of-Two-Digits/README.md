<div align="center">

# 3536. Maximum Product of Two Digits

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Topic](https://img.shields.io/badge/Topic-Math-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given a positive integer `n`, return the maximum product that can be formed using any two digits of `n`.

The same digit may be used twice only if it appears multiple times in the number.

---

## My Approach

### Idea

- Traverse every digit using modulo and division.
- Maintain the largest and second-largest digits seen so far.
- Return their product.

---

## Complexity Analysis

```text
Time Complexity : O(d)

Space Complexity: O(1)
```

where `d` is the number of digits.

---

## Concepts Learned

- Digit Extraction
- Greedy Tracking
- Math

---

## Performance

```text
Verdict : Accepted

Runtime : 1 ms

Beats : 100.00%

Memory : 42.72 MB

Beats : 38.93%
```

---

## Notes

A single traversal is enough to find the two largest digits, eliminating the need to store or sort all digits.