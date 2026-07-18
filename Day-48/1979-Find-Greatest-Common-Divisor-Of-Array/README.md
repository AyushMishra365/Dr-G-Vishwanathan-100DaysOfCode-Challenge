<div align="center">

# 1979. Find Greatest Common Divisor of Array

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-success)
![Topic](https://img.shields.io/badge/Topic-Math-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given an integer array `nums`, return the greatest common divisor (GCD) of the smallest and largest numbers in the array.

---

## My Approach

### Idea

- Traverse the array once to determine the minimum and maximum elements.
- Compute the GCD by checking every divisor from `1` up to the smaller number.
- Store the largest divisor that divides both numbers.

---

## Complexity Analysis

```text
Time Complexity : O(n + min(minElement, maxElement))

Space Complexity: O(1)
```

---

## Concepts Learned

- Number Theory
- Greatest Common Divisor (GCD)
- Array Traversal

---

## Performance

```text
Verdict : Accepted

Runtime : 0 ms

Beats : 100.00%

Memory : 44.81 MB

Beats : 86.53%
```

---

## Notes

The solution first identifies the smallest and largest elements, then computes their GCD directly. Although the Euclidean Algorithm is faster, this straightforward approach performs well within the given constraints.