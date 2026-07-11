<div align="center">

# 43. Multiply Strings

![Platform](https://img.shields.io/badge/Platform-LeetCode-orange)
![Difficulty](https://img.shields.io/badge/Difficulty-Medium-yellow)
![Topic](https://img.shields.io/badge/Topic-Strings-blue)
![Status](https://img.shields.io/badge/Status-Solved-success)

</div>

---

## Problem Statement

Given two non-negative integers represented as strings, return their product as a string.

The solution must not use any built-in BigInteger library or convert the entire strings into integers.

---

## My Approach

### Idea

Simulate the multiplication process exactly as it is done by hand.

Each digit of `num1` is multiplied with every digit of `num2`. The resulting product contributes to two positions in the result array:

- One position stores the current digit.
- The previous position stores the carry.

After processing all digit pairs, skip leading zeroes and build the final answer.

### Steps

1. Handle the special case where either number is `"0"`.
2. Create a result array of size `n + m`.
3. Traverse both strings from right to left.
4. Multiply every pair of digits.
5. Add the product to the appropriate positions in the result array.
6. Propagate carry values.
7. Construct the final string while ignoring leading zeroes.

---

## Complexity Analysis

```text
Time Complexity : O(n × m)

Space Complexity: O(n + m)
```

where

- `n` = length of `num1`
- `m` = length of `num2`

---

## Concepts Learned

- String Manipulation
- Simulation
- Arrays
- Carry Handling
- Mathematical Algorithms

---

## Performance

```text
Verdict : Accepted

Runtime : 2 ms

Beats : 99.86%

Memory : 43.77 MB

Beats : 37.70%
```

---

## Notes

The key observation is that the product of digits at positions `i` and `j` contributes to indices `i + j` and `i + j + 1` in the result array. This allows multiplication of very large numbers without integer overflow or using built-in big integer libraries.