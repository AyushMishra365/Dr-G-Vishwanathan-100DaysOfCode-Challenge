<div align="center">

# 2413. Smallest Even Multiple

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-success)
![Topic](https://img.shields.io/badge/Topic-Math-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given a positive integer `n`, return the smallest positive integer that is a multiple of both `2` and `n`.

---

## My Approach

### Idea

- If `n` is already even, it is automatically a multiple of both `2` and itself.
- Otherwise, return `2 × n`.

---

## Complexity Analysis

```text
Time Complexity : O(1)

Space Complexity: O(1)
```

---

## Concepts Learned

- Least Common Multiple (LCM)
- Modulo Operation
- Conditional Statements

---

## Performance

```text
Verdict : Accepted

Runtime : 0 ms

Beats : 100.00%

Memory : 42.19 MB

Beats : 51.59%
```

---

## Notes

This problem is a direct application of finding the LCM of `2` and `n`. A simple parity check is enough.