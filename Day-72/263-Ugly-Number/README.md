<div align="center">

**# 263. Ugly Number**

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

**## Problem Statement**

An ugly number is a **positive integer** which does not have a prime factor other than `2`, `3`, and `5`.

Given an integer `n`, return `true` if `n` is an ugly number.

---

**## My Approach**

**### Idea**

- If `n <= 0`, return `false` because an ugly number must be positive.
- Store the allowed prime factors:

```text
[2, 3, 5]