<div align="center">

# 728. Self Dividing Numbers

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-success)
![Topic](https://img.shields.io/badge/Topic-Math-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

A self-dividing number is divisible by every digit it contains and cannot contain the digit `0`.

Given two integers `left` and `right`, return all self-dividing numbers in the inclusive range.

---

## My Approach

### Idea

Iterate through every number in the given range.

For each number:

- Extract every digit.
- If any digit is `0`, return false.
- If the original number is not divisible by any extracted digit, return false.
- Otherwise, include it in the answer list.

---

## Complexity Analysis

```text
Time Complexity : O((right - left + 1) × d)

Space Complexity: O(1)
```

where `d` is the number of digits.

---

## Concepts Learned

- Number Theory
- Digit Extraction
- Divisibility
- Simulation

---

## Performance

```text
Verdict : Accepted

Runtime : 2 ms

Beats : 98.82%

Memory : 41.94 MB

Beats : 99.51%
```

---

## Notes

Checking each digit independently makes the implementation simple while naturally handling the restriction that self-dividing numbers cannot contain zero.