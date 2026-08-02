<div align="center">

# 1342. Number of Steps to Reduce a Number to Zero

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given an integer `num`, return the number of steps required to reduce it to zero.

- If the current number is even, divide it by 2.
- Otherwise, subtract 1.

---

## My Approach

### Idea

- Solve the problem recursively.
- Keep a counter representing the number of operations performed.
- At each recursive call:
  - If the number is even, divide it by 2.
  - Otherwise, subtract 1.
- Stop when the number becomes zero and return the counter.

---

## Complexity Analysis

```text
Time Complexity : O(log n)

Space Complexity: O(log n)
```

---

## Concepts Learned

- Recursion
- Base Case Handling
- Conditional Logic

---

## Performance

```text
Runtime : 0 ms (Beats 100.00%)

Memory  : 42.34 MB (Beats 19.31%)
```

---

## Notes

Each recursive call reduces the value significantly. Even numbers are halved, while odd numbers become even after one subtraction, making the solution very efficient.