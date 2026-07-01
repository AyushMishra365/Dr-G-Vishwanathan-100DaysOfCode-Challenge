<div align="center">

# 343. Integer Break

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Topic](https://img.shields.io/badge/Topic-Greedy-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given an integer `n`, break it into the sum of at least two positive integers such that their product is maximized.

Return the maximum product obtainable.

---

## My Approach

### Idea

The optimal strategy is based on a mathematical observation:

- Breaking numbers into **3's** gives the maximum product.
- If the remaining value becomes **4**, keep it as `2 × 2` instead of `3 × 1`.
- Handle `n = 2` and `n = 3` as special cases.

### Steps

1. Return predefined answers for `2` and `3`.
2. Repeatedly multiply the answer by `3` while `n > 4`.
3. Multiply the remaining value with the accumulated product.
4. Return the final result.

---

## Complexity Analysis

```text
Time Complexity : O(n/3)

Space Complexity: O(1)
```

---

## Concepts Learned

- Greedy Algorithm
- Mathematical Optimization
- Integer Factorization

---

## Performance

```text
Verdict : Accepted

Runtime : 0 ms

Beats : 100.00%

Memory : 42.10 MB

Beats : 37.87%
```

---

## Notes

The key insight is that dividing the integer into as many **3's** as possible maximizes the product. This mathematical observation avoids dynamic programming entirely and produces a very efficient solution.