<div align="center">

# 633. Sum of Square Numbers

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Topic](https://img.shields.io/badge/Topic-Two%20Pointers-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given a non-negative integer `c`, determine whether there exist two integers `a` and `b` such that:

`a² + b² = c`

Return `true` if such a pair exists; otherwise return `false`.

---

## My Approach

### Idea

Use the two-pointer technique.

- Start one pointer at `0`.
- Start the other at `√c`.
- Compare the sum of their squares with `c`.
- Move the pointers accordingly until a valid pair is found or the search ends.

### Steps

1. Initialize `start = 0` and `end = √c`.
2. Compute `start² + end²`.
3. If the sum is greater than `c`, decrement `end`.
4. If the sum is smaller, increment `start`.
5. Return `true` if the sum equals `c`; otherwise continue until the pointers cross.

---

## Complexity Analysis

```text
Time Complexity : O(√c)

Space Complexity: O(1)
```

---

## Concepts Learned

- Two Pointer Technique
- Number Theory
- Mathematical Search
- Overflow Prevention

---

## Performance

```text
Verdict : Accepted

Runtime : 3 ms

Beats : 96.44%

Memory : 42.25 MB

Beats : 29.72%
```

---

## Notes

Using two pointers avoids checking every possible pair, reducing the search from quadratic time to approximately √c. Storing intermediate calculations in `long` prevents integer overflow while squaring large values.