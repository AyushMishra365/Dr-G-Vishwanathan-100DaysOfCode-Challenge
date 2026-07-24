<div align="center">

# 400. Nth Digit

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Topic](https://img.shields.io/badge/Topic-Math%20%26%20Binary%20Search-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given an integer `n`, return the **nth digit** in the infinite integer sequence:

`1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, ...`

---

## My Approach

### Idea

- Count how many digits exist in each group of numbers:
  - 1-digit numbers
  - 2-digit numbers
  - 3-digit numbers
  - ...
- Keep subtracting the total digits of each group from `n` until the correct group is found.
- Compute the exact number containing the required digit.
- Convert the number to a string and return the desired character.

---

## Complexity Analysis

```text
Time Complexity : O(log n)

Space Complexity: O(1)
```

---

## Concepts Learned

- Mathematical Pattern
- Digit Grouping
- Number Theory
- String Indexing

---

## Performance

```text
Verdict : Accepted

Runtime : 0 ms

Beats : 100.00%

Memory : 42.18 MB

Beats : 40.64%
```

---

## Notes

Instead of generating the infinite sequence, we directly determine the digit's position mathematically by grouping numbers according to their digit lengths. This makes the solution extremely efficient even for very large values of `n`.