<div align="center">

**# 3918. Sum of Primes Between Number and Its Reverse**

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

**## Problem Statement**

You are given an integer `n`.

Let `r` be the integer formed by reversing the digits of `n`.

Return the sum of all prime numbers between `min(n, r)` and `max(n, r)`, inclusive.

---

**## My Approach**

**### Idea**

- Store the original value of `n`.
- Reverse the digits of `n` using `% 10` to extract each digit and `/ 10` to remove the last digit.
- Find the minimum and maximum values between the original number and its reverse.
- Traverse all numbers from the minimum value to the maximum value.
- For each number, check whether it is prime.
- In the prime-checking method:
  - Return `false` for numbers less than `2`.
  - Check divisibility from `2` up to `√n`.
  - If any number divides `n`, it is not prime.
- Add every prime number found in the range to the final sum.

---

**## Complexity Analysis**

```text
Time Complexity : O((max - min) × √max)
Space Complexity : O(1)