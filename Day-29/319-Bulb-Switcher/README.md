<div align="center">

# 319. Bulb Switcher

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Topic](https://img.shields.io/badge/Topic-Math-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

There are `n` bulbs that are toggled over `n` rounds.

On the `iᵗʰ` round, every `iᵗʰ` bulb is toggled.

Return the number of bulbs that remain on after all rounds.

---

## My Approach

### Idea

A bulb changes state once for every divisor it has.

Numbers generally have divisors in pairs, resulting in an even number of toggles. Only perfect squares have an odd number of divisors because one divisor is repeated.

Therefore, the bulbs that remain on correspond exactly to perfect square positions.

The answer is simply:

```text
⌊√n⌋
```

### Steps

1. Count the number of perfect squares less than or equal to `n`.
2. Return the integer value of `√n`.

---

## Complexity Analysis

```text
Time Complexity : O(1)

Space Complexity: O(1)
```

---

## Concepts Learned

- Number Theory
- Perfect Squares
- Mathematical Observation

---

## Performance

```text
Verdict : Accepted

Runtime : 0 ms

Beats : 100.00%

Memory : 42.19 MB
```

---

## Notes

Although the problem appears to require simulation, a mathematical observation reduces it to a constant-time solution by recognizing that only perfect squares have an odd number of divisors.