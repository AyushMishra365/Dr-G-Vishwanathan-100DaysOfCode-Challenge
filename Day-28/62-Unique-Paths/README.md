<div align="center">

# 62. Unique Paths

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Topic](https://img.shields.io/badge/Topic-Combinatorics-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given an `m × n` grid, determine the number of unique paths from the top-left corner to the bottom-right corner when only right and down moves are allowed.

---

## My Approach

### Idea

Instead of dynamic programming, use combinatorics.

The robot must make exactly `(m−1)` downward moves and `(n−1)` rightward moves, giving a total of `m+n−2` moves.

The answer is:

```text
C(m+n−2, min(m−1,n−1))
```

The combination is calculated iteratively to avoid overflow.

---

## Complexity Analysis

```text
Time Complexity : O(min(m,n))

Space Complexity: O(1)
```

---

## Concepts Learned

- Combinatorics
- Binomial Coefficients
- Mathematical Optimization
- Overflow Handling

---

## Performance

```text
Verdict : Accepted

Runtime : 0 ms

Beats : 100.00%

Memory : 41.72 MB

Beats : 95.77%
```

---

## Notes

Although this problem is commonly solved using dynamic programming, the combinatorial solution is more efficient since every valid path simply corresponds to choosing the positions of either the right or downward moves.