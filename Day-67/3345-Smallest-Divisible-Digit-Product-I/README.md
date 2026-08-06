<div align="center">

# 3345. Smallest Divisible Digit Product I

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given two integers `n` and `t`, find the smallest integer greater than or equal to `n` whose product of digits is divisible by `t`.

Return that integer.

---

## My Approach

### Idea

- Start checking from `n`.
- For each number:
  - Extract every digit.
  - Compute the product of its digits.
  - If any digit is `0`, the product becomes `0`, so stop further multiplication.
- If the digit product is divisible by `t`, return the current number.
- Otherwise, increment the number and repeat.

---

## Complexity Analysis

```text
Time Complexity : O(k × d)
```

- `k` = number of integers checked before finding the answer.
- `d` = number of digits in each integer.

```text
Space Complexity: O(1)
```

---

## Concepts Learned

- Brute Force
- Digit Extraction
- Modulo Arithmetic
- Simulation

---

## Performance

```text
Runtime : 1 ms (Beats 100.00%)

Memory  : 42.60 MB (Beats 50.26%)
```

---

## Notes

This problem is solved by straightforward simulation. Since the constraints are small, checking each number sequentially is sufficient. Digit extraction using modulo (`%`) and integer division (`/`) efficiently computes the product, while treating a digit `0` as an immediate product of `0` avoids unnecessary calculations.