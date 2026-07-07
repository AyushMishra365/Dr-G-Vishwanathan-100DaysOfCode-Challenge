<div align="center">

# 507. Perfect Number

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Topic](https://img.shields.io/badge/Topic-Math-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Determine whether a given positive integer is a perfect number. A perfect number is equal to the sum of all its positive divisors excluding itself.

---

## My Approach

### Idea

Instead of checking every number up to `n`, iterate only up to `√n`. Whenever a divisor is found, add both the divisor and its paired divisor. Finally compare the total with the original number.

### Steps

1. Handle the edge case where `num = 1`.
2. Initialize the divisor sum with `1`.
3. Iterate from `2` to `√num`.
4. Whenever a divisor is found:
   - Add the divisor.
   - Add its paired divisor if it is different.
5. Return whether the sum equals the original number.

---

## Complexity Analysis

```text
Time Complexity : O(√n)

Space Complexity: O(1)
```

---

## Concepts Learned

- Number Theory
- Divisor Pair Optimization
- Square Root Traversal

---

## Performance

```text
Verdict : Accepted

Runtime : 2 ms

Beats : 83.61%

Memory : 42.12 MB

Beats : 45.27%
```

---

## Notes

Every divisor greater than √n has a corresponding divisor smaller than √n. Using divisor pairs avoids unnecessary iterations and makes the solution much more efficient.