<div align="center">

# 70. Climbing Stairs

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Topic](https://img.shields.io/badge/Topic-Dynamic%20Programming-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given `n` stairs, each move allows climbing either 1 or 2 steps.

Return the number of distinct ways to reach the top.

---

## My Approach

### Idea

This follows the Fibonacci pattern.

Each state depends only on the previous two states, so instead of storing an entire DP array, only two variables are maintained.

### Steps

1. Handle small values directly.
2. Maintain the previous two answers.
3. Update them iteratively until reaching `n`.
4. Return the final value.

---

## Complexity Analysis

```text
Time Complexity : O(n)

Space Complexity: O(1)
```

---

## Concepts Learned

- Dynamic Programming
- Fibonacci Pattern
- Space Optimization

---

## Performance

```text
Verdict : Accepted

Runtime : 0 ms

Beats : 100.00%

Memory : 41.96 MB

Beats : 72.12%
```

---

## Notes

This problem demonstrates how DP can often be optimized from O(n) space to O(1) by keeping only the required previous states.