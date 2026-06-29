<div align="center">

# 168. Excel Sheet Column Title

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-green)
![Topic](https://img.shields.io/badge/Topic-Math-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given an integer representing an Excel column number, return its corresponding column title.

Examples:

- 1 → A
- 26 → Z
- 27 → AA
- 28 → AB

---

## My Approach

### Idea

Treat the problem as a modified base-26 conversion.

Unlike the normal base-26 system, Excel columns are **1-indexed** instead of **0-indexed**. Therefore, subtract one before taking the remainder.

### Steps

1. While the number is greater than zero:
   - Decrement the number by one.
   - Compute the remainder using `% 26`.
   - Convert the remainder into its corresponding character.
   - Append the character to the result.
   - Divide the number by 26.
2. Reverse the constructed string.
3. Return the final column title.

---

## Complexity Analysis

```text
Time Complexity : O(log26 n)

Space Complexity: O(log26 n)
```

---

## Concepts Learned

- Base Conversion
- Modulo Arithmetic
- StringBuilder
- Mathematical Simulation

---

## Performance

```text
Verdict : Accepted

Runtime : 0 ms

Beats : 100.00%

Memory : 42.31 MB

Beats : 76.97%
```

---

## Notes

The crucial observation is that Excel columns do not contain a zero digit. Subtracting one before taking the modulo aligns the numbering system with standard base-26 conversion, making the implementation clean and efficient.