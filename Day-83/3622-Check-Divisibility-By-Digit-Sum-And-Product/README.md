<div align="center">

**# 3622. Check Divisibility by Digit Sum and Product**

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

**## Problem Statement**

You are given a positive integer `n`.

Determine whether `n` is divisible by the sum of the following two values:

- The digit sum of `n`.
- The digit product of `n`.

Return `true` if `n` is divisible by their sum; otherwise, return `false`.

---

**## My Approach**

**### Idea**

- Store the original value of `n` because the number will be modified while extracting its digits.
- Initialize `sum` as `0` and `product` as `1`.
- Traverse each digit using `% 10`.
- Add the extracted digit to `sum`.
- Multiply the extracted digit with `product`.
- Remove the last digit using `/ 10`.
- After processing all digits, calculate `sum + product`.
- Check whether the original number is divisible by this value.
- Return `true` if the remainder is `0`; otherwise, return `false`.

---

**## Complexity Analysis**

```text
Time Complexity : O(log n)
Space Complexity : O(1)