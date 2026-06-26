<div align="center">

# 279. Perfect Squares

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Topic](https://img.shields.io/badge/Topic-Dynamic_Programming-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given an integer `n`, return the least number of perfect square numbers whose sum is equal to `n`.

A perfect square is an integer that is the square of another integer.

---

## My Approach

### Idea

Use Bottom-Up Dynamic Programming.

Let `dp[i]` represent the minimum number of perfect squares required to form the value `i`.

For every number from `1` to `n`, try subtracting every possible perfect square less than or equal to it and choose the minimum answer.

### Steps

1. Create a DP array of size `n + 1`.
2. Initialize every value with a large number except `dp[0] = 0`.
3. For every number `i`, iterate through all perfect squares `j*j ≤ i`.
4. Update:

```text
dp[i] = min(dp[i], dp[i - j²] + 1)
```

5. Return `dp[n]`.

---

## Complexity Analysis

```text
Time Complexity : O(n√n)

Space Complexity: O(n)
```

---

## Concepts Learned

- Dynamic Programming
- State Transition
- Bottom-Up DP
- Perfect Squares
- Mathematical Optimization

---

## Performance

```text
Verdict : Accepted

Runtime : 34 ms

Beats : 56.00%

Memory : 44.37 MB
```

---

## Notes

This is a classic dynamic programming problem. Instead of checking every possible combination of perfect squares recursively, the DP approach computes the optimal answer for all smaller numbers first and reuses those results to efficiently determine the minimum count for `n`.