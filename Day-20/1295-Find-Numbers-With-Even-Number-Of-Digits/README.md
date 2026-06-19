<div align="center">

# 1295. Find Numbers with Even Number of Digits

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Topic](https://img.shields.io/badge/Topic-Math-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given an array of integers, determine how many numbers contain an even number of digits.

---

## My Approach

### Key Observation

Instead of converting numbers to strings:

- Repeatedly divide the number by 10.
- Count how many digits it contains.
- Check whether the digit count is even.

This avoids additional string operations and keeps the solution simple.

---

## Complexity Analysis

```text
Time Complexity : O(n × d)

Space Complexity: O(1)
```

where **d** is the number of digits.

---

## Concepts Learned

- Mathematics
- Digit Counting
- Arrays

---

## Problem Link

https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
