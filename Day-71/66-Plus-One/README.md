# 66. Plus One

---

## Problem Statement

You are given a large integer represented as an integer array `digits`, where each element represents a digit of the integer.

The digits are ordered from the most significant to the least significant digit.

Increment the large integer by `1` and return the resulting array of digits.

---

## My Approach

I traversed the array from **right to left**, starting from the last digit.

For every digit:

- If the digit is less than `9`, increment it by `1` and return the array.
- If the digit is `9`, change it to `0` and continue moving towards the left.

If all digits are `9`, every digit becomes `0`. In this case, create a new array with one extra position and set the first digit to `1`.

---

## Example

```text
Input:
digits = [1,2,3]

Output:
[1,2,4]