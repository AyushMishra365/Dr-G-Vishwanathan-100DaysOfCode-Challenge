<div align="center">

# 12. Integer to Roman

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Topic](https://img.shields.io/badge/Topic-Greedy-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given an integer, convert it to its corresponding Roman numeral representation.

Roman numerals follow standard subtraction rules such as IV, IX, XL, XC, CD, and CM.

---

## My Approach

### Idea

Use a greedy algorithm.

Store all Roman numeral values in descending order along with their corresponding symbols. Repeatedly subtract the largest possible value while appending its Roman symbol until the number becomes zero.

### Steps

1. Store values and Roman symbols in descending order.
2. Traverse both arrays simultaneously.
3. While the current value is less than or equal to the remaining number:
   - Append its Roman symbol.
   - Subtract its value.
4. Return the constructed string.

---

## Complexity Analysis

```text
Time Complexity : O(1)

Space Complexity: O(1)
```

---

## Concepts Learned

- Greedy Algorithms
- Lookup Tables
- StringBuilder
- Mathematical Representation

---

## Performance

```text
Verdict : Accepted

Runtime : 3 ms

Beats : 99.86%

Memory : 46.54 MB
```

---

## Notes

Using a greedy approach works because Roman numerals are built from the largest possible symbols first. Including the subtractive combinations (IV, IX, XL, XC, CD, CM) in the lookup table makes the implementation simple and efficient.