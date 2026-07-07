<div align="center">

# 3754. Sum and Multiply

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Construct the required number after ignoring zero digits, calculate the sum of the remaining digits, and return the product of the constructed number and the digit sum.

---

## My Approach

### Idea

Traverse each digit once. Ignore zeros while simultaneously building the required number and maintaining the sum of its digits.

### Steps

1. Initialize the constructed number and digit sum.
2. Traverse every digit.
3. Skip zeros.
4. Append non-zero digits to the number.
5. Add the digit to the running sum.
6. Return their product.

---

## Complexity Analysis

```text
Time Complexity : O(d)

Space Complexity: O(1)
```

where **d** is the number of digits.

---

## Concepts Learned

- Digit Manipulation
- Mathematical Simulation
- Integer Construction

---

## Notes

The problem only requires a single traversal of the digits, making the implementation straightforward and efficient.