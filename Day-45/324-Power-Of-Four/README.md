<div align="center">

# 342. Power of Four

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-success)
![Topic](https://img.shields.io/badge/Topic-Math-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given an integer `n`, determine whether it is a power of four.

Return `true` if there exists an integer `x` such that:

n = 4^x

Otherwise, return `false`.

---

## My Approach

### Idea

First discard non-positive numbers.

Then repeatedly divide the number by `4` while it is divisible.

If the remaining value is `1`, then the original number is a power of four.

---

## Complexity Analysis

```text
Time Complexity : O(log₄ n)

Space Complexity: O(1)
```

---

## Concepts Learned

- Mathematics
- Number Theory
- Simulation

---

## Performance

```text
Verdict : Accepted

Runtime : 1 ms

Beats : 89.84%

Memory : 42.62 MB

Beats : 33.40%
```

---

## Notes

Although bit manipulation solutions also exist for this problem, the repeated division approach is simple, intuitive, and easy to understand while still being efficient.