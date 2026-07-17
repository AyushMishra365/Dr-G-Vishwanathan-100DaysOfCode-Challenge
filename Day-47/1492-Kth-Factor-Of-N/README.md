<div align="center">

# 1492. The kth Factor of n

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Topic](https://img.shields.io/badge/Topic-Math-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given two positive integers `n` and `k`, return the kth factor of `n` in ascending order. If `n` has fewer than `k` factors, return `-1`.

---

## My Approach

### Idea

Traverse every integer from `1` to `n`.

- If the current number divides `n`, increment the factor count.
- As soon as the count becomes `k`, return that factor.
- If the loop finishes before reaching `k`, return `-1`.

---

## Complexity Analysis

```text
Time Complexity : O(n)

Space Complexity: O(1)
```

---

## Concepts Learned

- Number Theory
- Factor Enumeration
- Simulation

---

## Performance

```text
Verdict : Accepted

Runtime : 0 ms

Beats : 100.00%

Memory : 41.69 MB

Beats : 98.95%
```

---

## Notes

Although iterating from `1` to `n` is sufficient for the given constraints, this problem also introduces opportunities for optimization using the square root property of factors.