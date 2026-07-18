<div align="center">

# 1952. Three Divisors

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-success)
![Topic](https://img.shields.io/badge/Topic-Math-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given an integer `n`, return `true` if `n` has exactly three positive divisors. Otherwise, return `false`.

---

## My Approach

### Idea

- Since `1` and `n` are always divisors, initialize the divisor count as `2`.
- Check every number from `n-1` down to `2`.
- Increase the count whenever a divisor is found.
- Return `true` only if the total number of divisors is exactly `3`.

---

## Complexity Analysis

```text
Time Complexity : O(n)

Space Complexity: O(1)
```

---

## Concepts Learned

- Number Theory
- Divisors
- Brute Force

---

## Performance

```text
Verdict : Accepted

Runtime : 1 ms

Beats : 77.58%

Memory : 42.39 MB

Beats : 19.23%
```

---

## Notes

A number has exactly three divisors only if it is the square of a prime number. This solution uses straightforward divisor counting.